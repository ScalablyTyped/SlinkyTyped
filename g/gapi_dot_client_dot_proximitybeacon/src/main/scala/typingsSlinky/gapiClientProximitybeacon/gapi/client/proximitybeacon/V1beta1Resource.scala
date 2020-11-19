package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientProximitybeacon.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1beta1Resource extends js.Object {
  
  /**
    * Gets the Proximity Beacon API's current public key and associated
    * parameters used to initiate the Diffie-Hellman key exchange required to
    * register a beacon that broadcasts the Eddystone-EID format. This key
    * changes periodically; clients may cache it and re-use the same public key
    * to provision and register multiple beacons. However, clients should be
    * prepared to refresh this key when they encounter an error registering an
    * Eddystone-EID beacon.
    */
  def getEidparams(request: Accesstoken): Request[EphemeralIdRegistrationParams] = js.native
}
object V1beta1Resource {
  
  @scala.inline
  def apply(getEidparams: Accesstoken => Request[EphemeralIdRegistrationParams]): V1beta1Resource = {
    val __obj = js.Dynamic.literal(getEidparams = js.Any.fromFunction1(getEidparams))
    __obj.asInstanceOf[V1beta1Resource]
  }
  
  @scala.inline
  implicit class V1beta1ResourceOps[Self <: V1beta1Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetEidparams(value: Accesstoken => Request[EphemeralIdRegistrationParams]): Self = this.set("getEidparams", js.Any.fromFunction1(value))
  }
}
