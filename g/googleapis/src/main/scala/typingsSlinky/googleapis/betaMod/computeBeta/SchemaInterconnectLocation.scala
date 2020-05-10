package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an InterconnectLocations resource. The InterconnectLocations
  * resource describes the locations where you can connect to Google&#39;s
  * networks. For more information, see  Colocation Facilities.
  */
@js.native
trait SchemaInterconnectLocation extends js.Object {
  /**
    * [Output Only] The postal address of the Point of Presence, each line in
    * the address is separated by a newline character.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * [Output Only] Availability zone for this InterconnectLocation. Within a
    * metropolitan area (metro), maintenance will not be simultaneously
    * scheduled in more than one availability zone. Example: &quot;zone1&quot;
    * or &quot;zone2&quot;.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * [Output Only] Metropolitan area designator that indicates which city an
    * interconnect is located. For example: &quot;Chicago, IL&quot;,
    * &quot;Amsterdam, Netherlands&quot;.
    */
  var city: js.UndefOr[String] = js.native
  /**
    * [Output Only] Continent for this location.
    */
  var continent: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The name of the provider for this facility (e.g., EQUINIX).
    */
  var facilityProvider: js.UndefOr[String] = js.native
  /**
    * [Output Only] A provider-assigned Identifier for this facility (e.g.,
    * Ashburn-DC1).
    */
  var facilityProviderFacilityId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#interconnectLocation
    * for interconnect locations.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The peeringdb identifier for this facility (corresponding
    * with a netfac type in peeringdb).
    */
  var peeringdbFacilityId: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of InterconnectLocation.RegionInfo objects, that
    * describe parameters pertaining to the relation between this
    * InterconnectLocation and various Google Cloud regions.
    */
  var regionInfos: js.UndefOr[js.Array[SchemaInterconnectLocationRegionInfo]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The status of this InterconnectLocation. If the status is
    * AVAILABLE, new Interconnects may be provisioned in this
    * InterconnectLocation. Otherwise, no new Interconnects may be provisioned.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaInterconnectLocation {
  @scala.inline
  def apply(): SchemaInterconnectLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectLocation]
  }
  @scala.inline
  implicit class SchemaInterconnectLocationOps[Self <: SchemaInterconnectLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withContinent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
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
    def withFacilityProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilityProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacilityProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilityProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withFacilityProviderFacilityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilityProviderFacilityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacilityProviderFacilityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilityProviderFacilityId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPeeringdbFacilityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peeringdbFacilityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeeringdbFacilityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peeringdbFacilityId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionInfos(value: js.Array[SchemaInterconnectLocationRegionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
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

