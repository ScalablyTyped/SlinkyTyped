package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsAssetsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * When compare_duration is set, the ListAssetsResult's "state_change"
    * attribute is updated to indicate whether the asset was added, removed, or
    * remained present during the compare_duration period of time that precedes
    * the read_time. This is the time between (read_time - compare_duration)
    * and read_time.  The state_change value is derived based on the presence
    * of the asset at the two points in time. Intermediate state changes
    * between the two times don't affect the result. For example, the results
    * aren't affected if the asset is removed and re-created again.  Possible
    * "state_change" values when compare_duration is specified:  * "ADDED":
    * indicates that the asset was not present at the start of
    * compare_duration, but present at read_time. * "REMOVED": indicates that
    * the asset was present at the start of                compare_duration,
    * but not present at read_time. * "ACTIVE":  indicates that the asset was
    * present at both the                start and the end of the time period
    * defined by                compare_duration and read_time.  If
    * compare_duration is not specified, then the only possible state_change is
    * "UNUSED",  which will be the state_change set for all assets present at
    * read_time.
    */
  var compareDuration: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A field mask to specify the ListAssetsResult fields to be
    * listed in the response. An empty field mask will list all fields.
    */
  var fieldMask: js.UndefOr[String] = js.native
  
  /**
    * Expression that defines the filter to apply across assets. The expression
    * is a list of zero or more restrictions combined via logical operators
    * `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence
    * than `AND`.  Restrictions have the form `<field> <operator> <value>` and
    * may have a `-` character in front of them to indicate negation. The
    * fields map to those defined in the Asset resource. Examples include:  *
    * name * security_center_properties.resource_name *
    * resource_properties.a_property * security_marks.marks.marka  The
    * supported operators are:  * `=` for all value types. * `>`, `<`, `>=`,
    * `<=` for integer values. * `:`, meaning substring matching, for strings.
    * The supported value types are:  * string literals in quotes. * integer
    * literals without quotes. * boolean literals `true` and `false` without
    * quotes.  The following are the allowed field and operator combinations:
    * name | `=` update_time | `>`, `<`, `>=`, `<=` iam_policy.policy_blob |
    * '=', ':' resource_properties | '=', ':', `>`, `<`, `>=`, `<=`
    * security_marks | '=', ':' security_center_properties.resource_name | '=',
    * ':' security_center_properties.resource_type | '=', ':'
    * security_center_properties.resource_parent | '=', ':'
    * security_center_properties.resource_project | '=', ':'
    * security_center_properties.resource_owners | '=', ':'  For example,
    * `resource_properties.size = 100` is a valid filter string.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Expression that defines what fields and order to use for sorting. The
    * string value should follow SQL syntax: comma separated list of fields.
    * For example: "name,resource_properties.a_property". The default sorting
    * order is ascending. To specify descending order for a field, a suffix "
    * desc" should be appended to the field name. For example: "name
    * desc,resource_properties.a_property". Redundant space characters in the
    * syntax are insignificant. "name desc,resource_properties.a_property" and
    * " name     desc  ,   resource_properties.a_property  " are equivalent.
    * The following fields are supported: name update_time resource_properties
    * security_marks security_center_properties.resource_name
    * security_center_properties.resource_parent
    * security_center_properties.resource_project
    * security_center_properties.resource_type
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The value returned by the last `ListAssetsResponse`; indicates that this
    * is a continuation of a prior `ListAssets` call, and that the system
    * should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Name of the organization assets should belong to. Its format is
    * "organizations/[organization_id]".
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Time used as a reference point when filtering assets. The filter is
    * limited to assets existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API's version of NOW.
    */
  var readTime: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsAssetsList {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsAssetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsAssetsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsAssetsListOps[Self <: ParamsResourceOrganizationsAssetsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCompareDuration(value: String): Self = this.set("compareDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompareDuration: Self = this.set("compareDuration", js.undefined)
    
    @scala.inline
    def setFieldMask(value: String): Self = this.set("fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMask: Self = this.set("fieldMask", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
  }
}
