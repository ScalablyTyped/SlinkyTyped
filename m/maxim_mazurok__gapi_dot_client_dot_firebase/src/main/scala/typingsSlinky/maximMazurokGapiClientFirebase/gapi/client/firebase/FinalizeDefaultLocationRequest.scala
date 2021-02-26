package typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalizeDefaultLocationRequest extends StObject {
  
  /** The ID of the Project's default GCP resource location. The location must be one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations). */
  var locationId: js.UndefOr[String] = js.native
}
object FinalizeDefaultLocationRequest {
  
  @scala.inline
  def apply(): FinalizeDefaultLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinalizeDefaultLocationRequest]
  }
  
  @scala.inline
  implicit class FinalizeDefaultLocationRequestMutableBuilder[Self <: FinalizeDefaultLocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
