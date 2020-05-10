package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  // The street address of the location.
  var address: js.UndefOr[PhysicalAddress] = js.native
  // The geographic coordinates and elevation of the location.
  var coordinates: js.UndefOr[OutlookGeoCoordinates] = js.native
  // The name associated with the location.
  var displayName: js.UndefOr[String] = js.native
  // Optional email address of the location.
  var locationEmailAddress: js.UndefOr[String] = js.native
  /**
    * The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates,
    * streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
    */
  var locationType: js.UndefOr[LocationType] = js.native
  // Optional URI representing the location.
  var locationUri: js.UndefOr[String] = js.native
  // For internal use only.
  var uniqueId: js.UndefOr[String] = js.native
  // For internal use only.
  var uniqueIdType: js.UndefOr[LocationUniqueIdType] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: PhysicalAddress): Self = {
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
    def withCoordinates(value: OutlookGeoCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationType(value: LocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueIdType(value: LocationUniqueIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueIdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueIdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueIdType")(js.undefined)
        ret
    }
  }
  
}

