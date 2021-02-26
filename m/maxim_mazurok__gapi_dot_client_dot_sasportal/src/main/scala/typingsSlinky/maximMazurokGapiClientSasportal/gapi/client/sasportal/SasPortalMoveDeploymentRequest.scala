package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalMoveDeploymentRequest extends StObject {
  
  /** Required. The name of the new parent resource Node or Customer to reparent the deployment under. */
  var destination: js.UndefOr[String] = js.native
}
object SasPortalMoveDeploymentRequest {
  
  @scala.inline
  def apply(): SasPortalMoveDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalMoveDeploymentRequest]
  }
  
  @scala.inline
  implicit class SasPortalMoveDeploymentRequestMutableBuilder[Self <: SasPortalMoveDeploymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
