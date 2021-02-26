package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimumEngineVersionPerAllowedValue extends StObject {
  
  /**
    * The allowed value for an option setting.
    */
  var AllowedValue: js.UndefOr[String] = js.native
  
  /**
    * The minimum DB engine version required for the allowed value.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
}
object MinimumEngineVersionPerAllowedValue {
  
  @scala.inline
  def apply(): MinimumEngineVersionPerAllowedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumEngineVersionPerAllowedValue]
  }
  
  @scala.inline
  implicit class MinimumEngineVersionPerAllowedValueMutableBuilder[Self <: MinimumEngineVersionPerAllowedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValue(value: String): Self = StObject.set(x, "AllowedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValueUndefined: Self = StObject.set(x, "AllowedValue", js.undefined)
    
    @scala.inline
    def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
  }
}
