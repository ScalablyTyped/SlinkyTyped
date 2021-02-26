package typingsSlinky.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a set of log entries that are not to be stored in Logging. If
  * your project receives a large volume of logs, you might be able to use
  * exclusions to reduce your chargeable logs. Exclusions are processed after
  * log sinks, so you can export log entries before they are excluded. Audit
  * log entries and log entries from Amazon Web Services are never excluded.
  */
@js.native
trait SchemaLogExclusion extends StObject {
  
  /**
    * Output only. The creation timestamp of the exclusion.This field may not
    * be present for older exclusions.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. A description of this exclusion.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional. If set to True, then this exclusion is disabled and it does not
    * exclude any log entries. You can update an exclusion to change the value
    * of this field.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. An advanced logs filter that matches the log entries to be
    * excluded. By using the sample function, you can exclude less than 100% of
    * the matching log entries. For example, the following filter matches 99%
    * of low-severity log entries from load
    * balancers:&quot;resource.type=http_load_balancer severity&lt;ERROR
    * sample(insertId, 0.99)&quot;
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Required. A client-assigned identifier, such as
    * &quot;load-balancer-exclusion&quot;. Identifiers are limited to 100
    * characters and can include only letters, digits, underscores, hyphens,
    * and periods.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The last update timestamp of the exclusion.This field may
    * not be present for older exclusions.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaLogExclusion {
  
  @scala.inline
  def apply(): SchemaLogExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogExclusion]
  }
  
  @scala.inline
  implicit class SchemaLogExclusionMutableBuilder[Self <: SchemaLogExclusion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
