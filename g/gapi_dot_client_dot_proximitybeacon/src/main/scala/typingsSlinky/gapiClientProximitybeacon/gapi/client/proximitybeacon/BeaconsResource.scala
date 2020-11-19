package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientProximitybeacon.anon.BeaconName
import typingsSlinky.gapiClientProximitybeacon.anon.Bearertoken
import typingsSlinky.gapiClientProximitybeacon.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeaconsResource extends js.Object {
  
  /**
    * Activates a beacon. A beacon that is active will return information
    * and attachment data when queried via `beaconinfo.getforobserved`.
    * Calling this method on an already active beacon will do nothing (but
    * will return a successful response code).
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def activate(request: BeaconName): Request[js.Object] = js.native
  
  var attachments: AttachmentsResource = js.native
  
  /**
    * Deactivates a beacon. Once deactivated, the API will not return
    * information nor attachment data for the beacon when queried via
    * `beaconinfo.getforobserved`. Calling this method on an already inactive
    * beacon will do nothing (but will return a successful response code).
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def deactivate(request: BeaconName): Request[js.Object] = js.native
  
  /**
    * Decommissions the specified beacon in the service. This beacon will no
    * longer be returned from `beaconinfo.getforobserved`. This operation is
    * permanent -- you will not be able to re-register a beacon with this ID
    * again.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def decommission(request: BeaconName): Request[js.Object] = js.native
  
  /**
    * Deletes the specified beacon including all diagnostics data for the beacon
    * as well as any attachments on the beacon (including those belonging to
    * other projects). This operation cannot be undone.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def delete(request: BeaconName): Request[js.Object] = js.native
  
  var diagnostics: DiagnosticsResource = js.native
  
  /**
    * Returns detailed information about the specified beacon.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    *
    * Requests may supply an Eddystone-EID beacon name in the form:
    * `beacons/4!beaconId` where the `beaconId` is the base16 ephemeral ID
    * broadcast by the beacon. The returned `Beacon` object will contain the
    * beacon's stable Eddystone-UID. Clients not authorized to resolve the
    * beacon's ephemeral Eddystone-EID broadcast will receive an error.
    */
  def get(request: BeaconName): Request[Beacon] = js.native
  
  /**
    * Searches the beacon registry for beacons that match the given search
    * criteria. Only those beacons that the client has permission to list
    * will be returned.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: Bearertoken): Request[ListBeaconsResponse] = js.native
  
  /**
    * Registers a previously unregistered beacon given its `advertisedId`.
    * These IDs are unique within the system. An ID can be registered only once.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def register(request: Callback): Request[Beacon] = js.native
  
  /**
    * Updates the information about the specified beacon. &#42;&#42;Any field that you do
    * not populate in the submitted beacon will be permanently erased&#42;&#42;, so you
    * should follow the "read, modify, write" pattern to avoid inadvertently
    * destroying data.
    *
    * Changes to the beacon status via this method will be  silently ignored.
    * To update beacon status, use the separate methods on this API for
    * activation, deactivation, and decommissioning.
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def update(request: BeaconName): Request[Beacon] = js.native
}
object BeaconsResource {
  
  @scala.inline
  def apply(
    activate: BeaconName => Request[js.Object],
    attachments: AttachmentsResource,
    deactivate: BeaconName => Request[js.Object],
    decommission: BeaconName => Request[js.Object],
    delete: BeaconName => Request[js.Object],
    diagnostics: DiagnosticsResource,
    get: BeaconName => Request[Beacon],
    list: Bearertoken => Request[ListBeaconsResponse],
    register: Callback => Request[Beacon],
    update: BeaconName => Request[Beacon]
  ): BeaconsResource = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), attachments = attachments.asInstanceOf[js.Any], deactivate = js.Any.fromFunction1(deactivate), decommission = js.Any.fromFunction1(decommission), delete = js.Any.fromFunction1(delete), diagnostics = diagnostics.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), register = js.Any.fromFunction1(register), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BeaconsResource]
  }
  
  @scala.inline
  implicit class BeaconsResourceOps[Self <: BeaconsResource] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: BeaconName => Request[js.Object]): Self = this.set("activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachments(value: AttachmentsResource): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivate(value: BeaconName => Request[js.Object]): Self = this.set("deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecommission(value: BeaconName => Request[js.Object]): Self = this.set("decommission", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: BeaconName => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiagnostics(value: DiagnosticsResource): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: BeaconName => Request[Beacon]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Bearertoken => Request[ListBeaconsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegister(value: Callback => Request[Beacon]): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: BeaconName => Request[Beacon]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
