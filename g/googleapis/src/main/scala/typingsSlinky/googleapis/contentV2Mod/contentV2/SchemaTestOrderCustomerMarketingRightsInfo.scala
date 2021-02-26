package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTestOrderCustomerMarketingRightsInfo extends StObject {
  
  /**
    * Last know user use selection regards marketing preferences. In certain
    * cases selection might not be known, so this field would be empty.
    */
  var explicitMarketingPreference: js.UndefOr[String] = js.native
  
  /**
    * Timestamp when last time marketing preference was updated. Could be
    * empty, if user wasn&#39;t offered a selection yet.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
}
object SchemaTestOrderCustomerMarketingRightsInfo {
  
  @scala.inline
  def apply(): SchemaTestOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderCustomerMarketingRightsInfo]
  }
  
  @scala.inline
  implicit class SchemaTestOrderCustomerMarketingRightsInfoMutableBuilder[Self <: SchemaTestOrderCustomerMarketingRightsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitMarketingPreference(value: String): Self = StObject.set(x, "explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitMarketingPreferenceUndefined: Self = StObject.set(x, "explicitMarketingPreference", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
  }
}
