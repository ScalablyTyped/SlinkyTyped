package typingsSlinky.bingmaps.Microsoft.Maps.Search

import typingsSlinky.bingmaps.Microsoft.Maps.IAddress
import typingsSlinky.bingmaps.Microsoft.Maps.Location
import typingsSlinky.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaceResult extends js.Object {
  /** The geocoded address of the place result. */
  var address: IAddress = js.native
  /** The location rectangle that defines the boundaries of the best map view of the place result. */
  var bestView: LocationRect = js.native
  /** The classification of the geographic entity returned, such as PopulatedPlace. */
  var entityType: String = js.native
  /** The geocoded location of the best result. */
  var location: Location = js.native
  /** The geocoded locations. */
  var locations: js.Array[IGeocodeLocation] = js.native
  /** The match code of the best result. */
  var matchCode: String | MatchCode = js.native
  /** The match confidence of the best result. */
  var matchConfidence: String | MatchConfidence = js.native
  /** The name of the place result, if one exists. */
  var name: String = js.native
}

object IPlaceResult {
  @scala.inline
  def apply(
    address: IAddress,
    bestView: LocationRect,
    entityType: String,
    location: Location,
    locations: js.Array[IGeocodeLocation],
    matchCode: String | MatchCode,
    matchConfidence: String | MatchConfidence,
    name: String
  ): IPlaceResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bestView = bestView.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], matchCode = matchCode.asInstanceOf[js.Any], matchConfidence = matchConfidence.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaceResult]
  }
  @scala.inline
  implicit class IPlaceResultOps[Self <: IPlaceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: IAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBestView(value: LocationRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[IGeocodeLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchCode(value: String | MatchCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchConfidence(value: String | MatchConfidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

