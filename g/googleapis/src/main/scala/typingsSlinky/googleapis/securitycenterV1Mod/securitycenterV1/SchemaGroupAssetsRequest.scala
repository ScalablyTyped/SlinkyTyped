package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for grouping by assets.
  */
@js.native
trait SchemaGroupAssetsRequest extends StObject {
  
  /**
    * When compare_duration is set, the GroupResult&#39;s
    * &quot;state_change&quot; property is updated to indicate whether the
    * asset was added, removed, or remained present during the compare_duration
    * period of time that precedes the read_time. This is the time between
    * (read_time - compare_duration) and read_time.  The state change value is
    * derived based on the presence of the asset at the two points in time.
    * Intermediate state changes between the two times don&#39;t affect the
    * result. For example, the results aren&#39;t affected if the asset is
    * removed and re-created again.  Possible &quot;state_change&quot; values
    * when compare_duration is specified:  * &quot;ADDED&quot;:   indicates
    * that the asset was not present at the start of compare_duration, but
    * present at reference_time. * &quot;REMOVED&quot;: indicates that the
    * asset was present at the start of                compare_duration, but
    * not present at reference_time. * &quot;ACTIVE&quot;:  indicates that the
    * asset was present at both the                start and the end of the
    * time period defined by                compare_duration and
    * reference_time.  If compare_duration is not specified, then the only
    * possible state_change is &quot;UNUSED&quot;, which will be the
    * state_change set for all assets present at read_time.  If this field is
    * set then `state_change` must be a specified field in `group_by`.
    */
  var compareDuration: js.UndefOr[String] = js.native
  
  /**
    * Expression that defines the filter to apply across assets. The expression
    * is a list of zero or more restrictions combined via logical operators
    * `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence
    * than `AND`.  Restrictions have the form `&lt;field&gt; &lt;operator&gt;
    * &lt;value&gt;` and may have a `-` character in front of them to indicate
    * negation. The fields map to those defined in the Asset resource. Examples
    * include:  * name * security_center_properties.resource_name *
    * resource_properties.a_property * security_marks.marks.marka  The
    * supported operators are:  * `=` for all value types. * `&gt;`, `&lt;`,
    * `&gt;=`, `&lt;=` for integer values. * `:`, meaning substring matching,
    * for strings.  The supported value types are:  * string literals in
    * quotes. * integer literals without quotes. * boolean literals `true` and
    * `false` without quotes.  The following field and operator combinations
    * are supported: name | `=` update_time | `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
    * iam_policy.policy_blob | &#39;=&#39;, &#39;:&#39; resource_properties |
    * &#39;=&#39;, &#39;:&#39;, `&gt;`, `&lt;`, `&gt;=`, `&lt;=` security_marks
    * | &#39;=&#39;, &#39;:&#39; security_center_properties.resource_name |
    * &#39;=&#39;, &#39;:&#39; security_center_properties.resource_type |
    * &#39;=&#39;, &#39;:&#39; security_center_properties.resource_parent |
    * &#39;=&#39;, &#39;:&#39; security_center_properties.resource_project |
    * &#39;=&#39;, &#39;:&#39; security_center_properties.resource_owners |
    * &#39;=&#39;, &#39;:&#39;  For example, `resource_properties.size = 100`
    * is a valid filter string.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Expression that defines what assets fields to use for grouping. The
    * string value should follow SQL syntax: comma separated list of fields.
    * For example:
    * &quot;security_center_properties.resource_project,security_center_properties.project&quot;.
    * The following fields are supported when compare_duration is not set:  *
    * security_center_properties.resource_project *
    * security_center_properties.resource_type *
    * security_center_properties.resource_parent  The following fields are
    * supported when compare_duration is set:  *
    * security_center_properties.resource_type
    */
  var groupBy: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The value returned by the last `GroupAssetsResponse`; indicates that this
    * is a continuation of a prior `GroupAssets` call, and that the system
    * should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Time used as a reference point when filtering assets. The filter is
    * limited to assets existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API&#39;s version of NOW.
    */
  var readTime: js.UndefOr[String] = js.native
}
object SchemaGroupAssetsRequest {
  
  @scala.inline
  def apply(): SchemaGroupAssetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupAssetsRequest]
  }
  
  @scala.inline
  implicit class SchemaGroupAssetsRequestMutableBuilder[Self <: SchemaGroupAssetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompareDuration(value: String): Self = StObject.set(x, "compareDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompareDurationUndefined: Self = StObject.set(x, "compareDuration", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
