package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacesService extends js.Object {
  def findPlaceFromPhoneNumber(
    request: FindPlaceFromPhoneNumberRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
  ): Unit = js.native
  def findPlaceFromQuery(
    request: FindPlaceFromQueryRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
  ): Unit = js.native
  def getDetails(
    request: PlaceDetailsRequest,
    callback: js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, Unit]
  ): Unit = js.native
  def nearbySearch(
    request: PlaceSearchRequest,
    callback: js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]
  ): Unit = js.native
  /**
    * @deprecated Radar search is deprecated as of June 30, 2018. After that
    *     time, this feature will no longer be available.
    */
  def radarSearch(
    request: RadarSearchRequest,
    callback: js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]
  ): Unit = js.native
  def textSearch(
    request: TextSearchRequest,
    callback: js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]
  ): Unit = js.native
}

object PlacesService {
  @scala.inline
  def apply(
    findPlaceFromPhoneNumber: (FindPlaceFromPhoneNumberRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit,
    findPlaceFromQuery: (FindPlaceFromQueryRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit,
    getDetails: (PlaceDetailsRequest, js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, Unit]) => Unit,
    nearbySearch: (PlaceSearchRequest, js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]) => Unit,
    radarSearch: (RadarSearchRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit,
    textSearch: (TextSearchRequest, js.Function3[
      /* results */ js.Array[PlaceResult], 
      /* status */ PlacesServiceStatus, 
      /* pagination */ PlaceSearchPagination, 
      Unit
    ]) => Unit
  ): PlacesService = {
    val __obj = js.Dynamic.literal(findPlaceFromPhoneNumber = js.Any.fromFunction2(findPlaceFromPhoneNumber), findPlaceFromQuery = js.Any.fromFunction2(findPlaceFromQuery), getDetails = js.Any.fromFunction2(getDetails), nearbySearch = js.Any.fromFunction2(nearbySearch), radarSearch = js.Any.fromFunction2(radarSearch), textSearch = js.Any.fromFunction2(textSearch))
    __obj.asInstanceOf[PlacesService]
  }
  @scala.inline
  implicit class PlacesServiceOps[Self <: PlacesService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindPlaceFromPhoneNumber(
      value: (FindPlaceFromPhoneNumberRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPlaceFromPhoneNumber")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFindPlaceFromQuery(
      value: (FindPlaceFromQueryRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findPlaceFromQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDetails(
      value: (PlaceDetailsRequest, js.Function2[/* result */ PlaceResult, /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetails")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNearbySearch(
      value: (PlaceSearchRequest, js.Function3[
          /* results */ js.Array[PlaceResult], 
          /* status */ PlacesServiceStatus, 
          /* pagination */ PlaceSearchPagination, 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearbySearch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRadarSearch(
      value: (RadarSearchRequest, js.Function2[/* results */ js.Array[PlaceResult], /* status */ PlacesServiceStatus, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radarSearch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTextSearch(
      value: (TextSearchRequest, js.Function3[
          /* results */ js.Array[PlaceResult], 
          /* status */ PlacesServiceStatus, 
          /* pagination */ PlaceSearchPagination, 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSearch")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

