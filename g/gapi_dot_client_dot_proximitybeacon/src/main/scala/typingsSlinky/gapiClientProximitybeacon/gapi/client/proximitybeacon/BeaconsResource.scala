package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientProximitybeacon.AnonBeaconName
import typingsSlinky.gapiClientProximitybeacon.AnonBearertoken
import typingsSlinky.gapiClientProximitybeacon.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeaconsResource extends js.Object {
  var attachments: AttachmentsResource = js.native
  var diagnostics: DiagnosticsResource = js.native
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
  def activate(request: AnonBeaconName): Request_[js.Object] = js.native
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
  def deactivate(request: AnonBeaconName): Request_[js.Object] = js.native
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
  def decommission(request: AnonBeaconName): Request_[js.Object] = js.native
  /**
    * Deletes the specified beacon including all diagnostics data for the beacon
    * as well as any attachments on the beacon (including those belonging to
    * other projects). This operation cannot be undone.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def delete(request: AnonBeaconName): Request_[js.Object] = js.native
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
  def get(request: AnonBeaconName): Request_[Beacon] = js.native
  /**
    * Searches the beacon registry for beacons that match the given search
    * criteria. Only those beacons that the client has permission to list
    * will be returned.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;viewer&#42;&#42;, &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42;
    * permissions in the Google Developers Console project.
    */
  def list(request: AnonBearertoken): Request_[ListBeaconsResponse] = js.native
  /**
    * Registers a previously unregistered beacon given its `advertisedId`.
    * These IDs are unique within the system. An ID can be registered only once.
    *
    * Authenticate using an [OAuth access token](https://developers.google.com/identity/protocols/OAuth2)
    * from a signed-in user with &#42;&#42;Is owner&#42;&#42; or &#42;&#42;Can edit&#42;&#42; permissions in the
    * Google Developers Console project.
    */
  def register(request: AnonCallback): Request_[Beacon] = js.native
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
  def update(request: AnonBeaconName): Request_[Beacon] = js.native
}

object BeaconsResource {
  @scala.inline
  def apply(
    activate: AnonBeaconName => Request_[js.Object],
    attachments: AttachmentsResource,
    deactivate: AnonBeaconName => Request_[js.Object],
    decommission: AnonBeaconName => Request_[js.Object],
    delete: AnonBeaconName => Request_[js.Object],
    diagnostics: DiagnosticsResource,
    get: AnonBeaconName => Request_[Beacon],
    list: AnonBearertoken => Request_[ListBeaconsResponse],
    register: AnonCallback => Request_[Beacon],
    update: AnonBeaconName => Request_[Beacon]
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
    def withActivate(value: AnonBeaconName => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttachments(value: AttachmentsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeactivate(value: AnonBeaconName => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecommission(value: AnonBeaconName => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decommission")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonBeaconName => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiagnostics(value: DiagnosticsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: AnonBeaconName => Request_[Beacon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListBeaconsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: AnonCallback => Request_[Beacon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonBeaconName => Request_[Beacon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

