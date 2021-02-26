package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `QuotaLimit` defines a specific limit that applies over a specified
  * duration for a limit type. There can be at most one limit for a duration
  * and limit type combination defined within a `QuotaGroup`.
  */
@js.native
trait SchemaQuotaLimit extends StObject {
  
  /**
    * Default number of tokens that can be consumed during the specified
    * duration. This is the number of tokens assigned when a client application
    * developer activates the service for his/her project.  Specifying a value
    * of 0 will block all requests. This can be used if you are provisioning
    * quota to selected consumers and blocking others. Similarly, a value of -1
    * will indicate an unlimited quota. No other negative values are allowed.
    * Used by group-based quotas only.
    */
  var defaultLimit: js.UndefOr[String] = js.native
  
  /**
    * Optional. User-visible, extended description for this quota limit. Should
    * be used only when more context is needed to understand this limit than
    * provided by the limit&#39;s display name (see: `display_name`).
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * User-visible display name for this limit. Optional. If not set, the UI
    * will provide a default display name based on the quota configuration.
    * This field can be used to override the default display name generated
    * from the configuration.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Duration of this limit in textual notation. Example: &quot;100s&quot;,
    * &quot;24h&quot;, &quot;1d&quot;. For duration longer than a day, only
    * multiple of days is supported. We support only &quot;100s&quot; and
    * &quot;1d&quot; for now. Additional support will be added in the future.
    * &quot;0&quot; indicates indefinite duration.  Used by group-based quotas
    * only.
    */
  var duration: js.UndefOr[String] = js.native
  
  /**
    * Free tier value displayed in the Developers Console for this limit. The
    * free tier is the number of tokens that will be subtracted from the billed
    * amount when billing is enabled. This field can only be set on a limit
    * with duration &quot;1d&quot;, in a billable group; it is invalid on any
    * other limit. If this field is not set, it defaults to 0, indicating that
    * there is no free tier for this service.  Used by group-based quotas only.
    */
  var freeTier: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of tokens that can be consumed during the specified
    * duration. Client application developers can override the default limit up
    * to this maximum. If specified, this value cannot be set to a value less
    * than the default limit. If not specified, it is set to the default limit.
    * To allow clients to apply overrides with no upper bound, set this to -1,
    * indicating unlimited maximum quota.  Used by group-based quotas only.
    */
  var maxLimit: js.UndefOr[String] = js.native
  
  /**
    * The name of the metric this quota limit applies to. The quota limits with
    * the same metric will be checked together during runtime. The metric must
    * be defined within the service config.
    */
  var metric: js.UndefOr[String] = js.native
  
  /**
    * Name of the quota limit.  The name must be provided, and it must be
    * unique within the service. The name can only include alphanumeric
    * characters as well as &#39;-&#39;.  The maximum length of the limit name
    * is 64 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specify the unit of the quota limit. It uses the same syntax as
    * Metric.unit. The supported unit kinds are determined by the quota backend
    * system.  Here are some examples: * &quot;1/min/{project}&quot; for quota
    * per minute per project.  Note: the order of unit components is
    * insignificant. The &quot;1&quot; at the beginning is required to follow
    * the metric unit syntax.
    */
  var unit: js.UndefOr[String] = js.native
  
  /**
    * Tiered limit values. You must specify this as a key:value pair, with an
    * integer value that is the maximum number of requests allowed for the
    * specified unit. Currently only STANDARD is supported.
    */
  var values: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaQuotaLimit {
  
  @scala.inline
  def apply(): SchemaQuotaLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaLimit]
  }
  
  @scala.inline
  implicit class SchemaQuotaLimitMutableBuilder[Self <: SchemaQuotaLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLimit(value: String): Self = StObject.set(x, "defaultLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLimitUndefined: Self = StObject.set(x, "defaultLimit", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFreeTier(value: String): Self = StObject.set(x, "freeTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeTierUndefined: Self = StObject.set(x, "freeTier", js.undefined)
    
    @scala.inline
    def setMaxLimit(value: String): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValues(value: StringDictionary[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
