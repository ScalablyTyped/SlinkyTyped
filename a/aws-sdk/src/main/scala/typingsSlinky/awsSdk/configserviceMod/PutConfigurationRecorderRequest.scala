package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConfigurationRecorderRequest extends StObject {
  
  /**
    * The configuration recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorder: typingsSlinky.awsSdk.configserviceMod.ConfigurationRecorder = js.native
}
object PutConfigurationRecorderRequest {
  
  @scala.inline
  def apply(ConfigurationRecorder: ConfigurationRecorder): PutConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorder = ConfigurationRecorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationRecorderRequest]
  }
  
  @scala.inline
  implicit class PutConfigurationRecorderRequestMutableBuilder[Self <: PutConfigurationRecorderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationRecorder(value: ConfigurationRecorder): Self = StObject.set(x, "ConfigurationRecorder", value.asInstanceOf[js.Any])
  }
}
