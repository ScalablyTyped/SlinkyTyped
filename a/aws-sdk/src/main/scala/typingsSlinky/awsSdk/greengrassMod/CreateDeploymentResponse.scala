package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentResponse extends StObject {
  
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.native
  
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.native
}
object CreateDeploymentResponse {
  
  @scala.inline
  def apply(): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
  
  @scala.inline
  implicit class CreateDeploymentResponseMutableBuilder[Self <: CreateDeploymentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentArn(value: string): Self = StObject.set(x, "DeploymentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentArnUndefined: Self = StObject.set(x, "DeploymentArn", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
  }
}
