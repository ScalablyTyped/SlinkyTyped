package typingsSlinky.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsSourcesFindingsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional.  A field mask to specify the Finding fields to be listed in the
    * response. An empty field mask will list all fields.
    */
  var fieldMask: js.UndefOr[String] = js.native
  
  /**
    * Expression that defines the filter to apply across findings. The
    * expression is a list of one or more restrictions combined via logical
    * operators `AND` and `OR`. Parentheses are not supported, and `OR` has
    * higher precedence than `AND`.  Restrictions have the form `<field>
    * <operator> <value>` and may have a `-` character in front of them to
    * indicate negation. Examples include:   * name  *
    * source_properties.a_property  * security_marks.marks.marka  The supported
    * operators are:  * `=` for all value types. * `>`, `<`, `>=`, `<=` for
    * integer values. * `:`, meaning substring matching, for strings.  The
    * supported value types are:  * string literals in quotes. * integer
    * literals without quotes. * boolean literals `true` and `false` without
    * quotes.  For example, `source_properties.size = 100` is a valid filter
    * string.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Expression that defines what fields and order to use for sorting. The
    * string value should follow SQL syntax: comma separated list of fields.
    * For example: "name,resource_properties.a_property". The default sorting
    * order is ascending. To specify descending order for a field, a suffix "
    * desc" should be appended to the field name. For example: "name
    * desc,source_properties.a_property". Redundant space characters in the
    * syntax are insignificant. "name desc,source_properties.a_property" and "
    * name     desc  ,   source_properties.a_property  " are equivalent.
    */
  var orderBy: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The value returned by the last `ListFindingsResponse`; indicates that
    * this is a continuation of a prior `ListFindings` call, and that the
    * system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Name of the source the findings belong to. Its format is
    * "organizations/[organization_id]/sources/[source_id]". To list across all
    * sources provide a source_id of `-`. For example:
    * organizations/123/sources/-
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Time used as a reference point when filtering findings. The filter is
    * limited to findings existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API's version of NOW.
    */
  var readTime: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsSourcesFindingsList {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsSourcesFindingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsSourcesFindingsList]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsSourcesFindingsListOps[Self <: ParamsResourceOrganizationsSourcesFindingsList] (val x: Self) extends AnyVal {
    
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
