package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigIdResponse extends StObject {
  
  /**
    * ARN of a Config.
    */
  var configArn: js.UndefOr[ConfigArn] = js.native
  
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.native
  
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
}
object ConfigIdResponse {
  
  @scala.inline
  def apply(): ConfigIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigIdResponse]
  }
  
  @scala.inline
  implicit class ConfigIdResponseMutableBuilder[Self <: ConfigIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigArn(value: ConfigArn): Self = StObject.set(x, "configArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigArnUndefined: Self = StObject.set(x, "configArn", js.undefined)
    
    @scala.inline
    def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
  }
}
