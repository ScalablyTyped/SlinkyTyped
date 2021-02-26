package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteConfigurationSetRequest extends StObject {
  
  /**
    * The name of the configuration set to delete.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.sesMod.ConfigurationSetName = js.native
}
object DeleteConfigurationSetRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
  
  @scala.inline
  implicit class DeleteConfigurationSetRequestMutableBuilder[Self <: DeleteConfigurationSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
  }
}
