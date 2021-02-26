package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployment extends StObject {
  
  /**
    * Specifies whether a deployment was automatically released.
    */
  var AutoDeployed: js.UndefOr[boolean] = js.native
  
  /**
    * The date and time when the Deployment resource was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier for the deployment.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  
  /**
    * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
    */
  var DeploymentStatus: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.DeploymentStatus] = js.native
  
  /**
    * May contain additional feedback on the status of an API deployment.
    */
  var DeploymentStatusMessage: js.UndefOr[string] = js.native
  
  /**
    * The description for the deployment.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDeployed(value: boolean): Self = StObject.set(x, "AutoDeployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeployedUndefined: Self = StObject.set(x, "AutoDeployed", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: Id): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatusMessage(value: string): Self = StObject.set(x, "DeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "DeploymentStatusMessage", js.undefined)
    
    @scala.inline
    def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
