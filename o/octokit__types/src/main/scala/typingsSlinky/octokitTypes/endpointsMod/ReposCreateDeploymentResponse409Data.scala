package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateDeploymentResponse409Data extends StObject {
  
  var message: String = js.native
}
object ReposCreateDeploymentResponse409Data {
  
  @scala.inline
  def apply(message: String): ReposCreateDeploymentResponse409Data = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentResponse409Data]
  }
  
  @scala.inline
  implicit class ReposCreateDeploymentResponse409DataMutableBuilder[Self <: ReposCreateDeploymentResponse409Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
