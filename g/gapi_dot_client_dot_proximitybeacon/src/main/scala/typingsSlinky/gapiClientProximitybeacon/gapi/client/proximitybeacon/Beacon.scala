package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Beacon extends js.Object {
  /**
    * The identifier of a beacon as advertised by it. This field must be
    * populated when registering. It may be empty when updating a beacon
    * record because it is ignored in updates.
    *
    * When registering a beacon that broadcasts Eddystone-EID, this field
    * should contain a "stable" Eddystone-UID that identifies the beacon and
    * links it to its attachments. The stable Eddystone-UID is only used for
    * administering the beacon.
    */
  var advertisedId: js.UndefOr[AdvertisedId] = js.native
  /**
    * Resource name of this beacon. A beacon name has the format
    * "beacons/N!beaconId" where the beaconId is the base16 ID broadcast by
    * the beacon and N is a code for the beacon's type. Possible values are
    * `3` for Eddystone, `1` for iBeacon, or `5` for AltBeacon.
    *
    * This field must be left empty when registering. After reading a beacon,
    * clients can use the name for future operations.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * Free text used to identify and describe the beacon. Maximum length 140
    * characters.
    * Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Write-only registration parameters for beacons using Eddystone-EID
    * (remotely resolved ephemeral ID) format. This information will not be
    * populated in API responses. When submitting this data, the `advertised_id`
    * field must contain an ID of type Eddystone-UID. Any other ID type will
    * result in an error.
    */
  var ephemeralIdRegistration: js.UndefOr[EphemeralIdRegistration] = js.native
  /**
    * Expected location stability. This is set when the beacon is registered or
    * updated, not automatically detected in any way.
    * Optional.
    */
  var expectedStability: js.UndefOr[String] = js.native
  /**
    * The indoor level information for this beacon, if known. As returned by the
    * Google Maps API.
    * Optional.
    */
  var indoorLevel: js.UndefOr[IndoorLevel] = js.native
  /**
    * The location of the beacon, expressed as a latitude and longitude pair.
    * This location is given when the beacon is registered or updated. It does
    * not necessarily indicate the actual current location of the beacon.
    * Optional.
    */
  var latLng: js.UndefOr[LatLng] = js.native
  /**
    * The [Google Places API](/places/place-id) Place ID of the place where
    * the beacon is deployed. This is given when the beacon is registered or
    * updated, not automatically detected in any way.
    * Optional.
    */
  var placeId: js.UndefOr[String] = js.native
  /**
    * Properties of the beacon device, for example battery type or firmware
    * version.
    * Optional.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
  /**
    * Some beacons may require a user to provide an authorization key before
    * changing any of its configuration (e.g. broadcast frames, transmit power).
    * This field provides a place to store and control access to that key.
    * This field is populated in responses to `GET /v1beta1/beacons/3!beaconId`
    * from users with write access to the given beacon. That is to say: If the
    * user is authorized to write the beacon's confidential data in the service,
    * the service considers them authorized to configure the beacon. Note
    * that this key grants nothing on the service, only on the beacon itself.
    */
  var provisioningKey: js.UndefOr[String] = js.native
  /**
    * Current status of the beacon.
    * Required.
    */
  var status: js.UndefOr[String] = js.native
}

object Beacon {
  @scala.inline
  def apply(): Beacon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beacon]
  }
  @scala.inline
  implicit class BeaconOps[Self <: Beacon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisedId(value: AdvertisedId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertisedId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisedId")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEphemeralIdRegistration(value: EphemeralIdRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralIdRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralIdRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralIdRegistration")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedStability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedStability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedStability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedStability")(js.undefined)
        ret
    }
    @scala.inline
    def withIndoorLevel(value: IndoorLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoorLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndoorLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indoorLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLng(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

