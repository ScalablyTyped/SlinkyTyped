package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterJobDefinitionRequest extends StObject {
  
  /**
    * The name and revision (name:revision) or full Amazon Resource Name (ARN) of the job definition to deregister.
    */
  var jobDefinition: String = js.native
}
object DeregisterJobDefinitionRequest {
  
  @scala.inline
  def apply(jobDefinition: String): DeregisterJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterJobDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeregisterJobDefinitionRequestMutableBuilder[Self <: DeregisterJobDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobDefinition(value: String): Self = StObject.set(x, "jobDefinition", value.asInstanceOf[js.Any])
  }
}
