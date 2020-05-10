package typingsSlinky.googleMaps.mod

import typingsSlinky.googleMaps.googleMapsStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsRequest extends js.Object {
  /**
    * If set to `true`, specifies that the Directions service may provide more than one route alternative in the response.
    * Note that providing route alternatives may increase the response time from the server.
    */
  var alternatives: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the desired time of arrival for transit directions, in seconds since midnight, January 1, 1970 UTC.
    * You can specify either `departure_time` or `arrival_time`, but not both.
    * Note that `arrival_time` must be specified as an integer.
    */
  var arrival_time: js.UndefOr[js.Date | Double] = js.native
  /** Indicates that the calculated route(s) should avoid the indicated features. */
  var avoid: js.UndefOr[js.Array[TravelRestriction]] = js.native
  /**
    * Specifies the desired time of departure. You can specify the time as an integer in seconds since midnight, January 1, 1970 UTC.
    * Alternatively, you can specify a value of `now`, which sets the departure time to the current time (correct to the nearest second).
    *
    * The departure time may be specified in two cases:
    *  - For requests where the travel mode is transit: You can optionally specify one of `departure_time` or `arrival_time`.
    *    If neither time is specified, the `departure_time` defaults to now (that is, the departure time defaults to the current time).
    *  - For requests where the travel mode is driving: You can specify the `departure_time` to receive a route and trip duration
    *    (response field: `duration_in_traffic`) that take traffic conditions into account.
    *    This option is only available if the request contains a valid API key, or a valid Google Maps APIs Premium Plan client ID
    *    and signature. The `departure_time` must be set to the current time or some time in the future. It cannot be in the past.
    */
  var departure_time: js.UndefOr[js.Date | Double | now] = js.native
  /**
    * The address, textual latitude/longitude value, or place ID to which you wish to calculate directions.
    * The options for the `destination` parameter are the same as for the `origin` parameter, described above
    */
  var destination: LatLng = js.native
  /**
    * The language in which to return results.
    *
    *  - If `language` is not supplied, the API attempts to use the preferred language as specified in the `Accept-Language` header,
    *    or the native language of the domain from which the request is sent.
    *  - The API does its best to provide a street address that is readable for both the user and locals. To achieve that goal,
    *    it returns street addresses in the local language, transliterated to a script readable by the user if necessary,
    *    observing the preferred language. All other addresses are returned in the preferred language.
    *    Address components are all returned in the same language, which is chosen from the first component.
    *  - If a name is not available in the preferred language, the API uses the closest match.
    *  - The preferred language has a small influence on the set of results that the API chooses to return,
    *    and the order in which they are returned. The geocoder interprets abbreviations differently depending on language,
    *    such as the abbreviations for street types, or synonyms that may be valid in one language but not in another.
    *    For example, utca and tér are synonyms for street in Hungarian.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * Specifies the mode of transport to use when calculating directions
    *
    * @default TravelMode.driving
    */
  var mode: js.UndefOr[TravelMode] = js.native
  /** Wherever to optimize the provided route by rearranging the waypoints in a more efficient order. */
  var optimize: js.UndefOr[Boolean] = js.native
  /**
    * The address, textual latitude/longitude value, or place ID from which you wish to calculate directions.
    *  - If you pass an address, the Directions service geocodes the string and converts it to a latitude/longitude coordinate
    *    to calculate directions. This coordinate may be different from that returned by the Geocoding API, for example a building
    *    entrance rather than its center.
    *
    *    `origin=24+Sussex+Drive+Ottawa+ON`
    *
    *  - If you pass coordinates, they are used unchanged to calculate directions. Ensure that no space exists between the latitude
    *    and longitude values.
    *
    *    `origin=41.43206,-81.38992`
    *
    *  - Place IDs must be prefixed with `place_id:`. The place ID may only be specified if the request includes an API key or a
    *    Google Maps APIs Premium Plan client ID. You can retrieve place IDs from the Geocoding API and the Places SDK
    *    (including Place Autocomplete). For an example using place IDs from Place Autocomplete, see [Place Autocomplete and
    *    Directions](https://developers.google.com/maps/documentation/javascript/examples/places-autocomplete-directions).
    *
    *    `origin=place_id:ChIJ3S-JXmauEmsRUcIaWtf4MzE`
    */
  var origin: LatLng = js.native
  /** Specifies the region code, specified as a ccTLD ("top-level domain") two-character value. */
  var region: js.UndefOr[String] = js.native
  /**
    * Specifies the assumptions to use when calculating time in traffic.
    * This setting affects the value returned in the `duration_in_traffic` field in the response, which contains the predicted time
    * in traffic based on historical averages. The `traffic_model` parameter may only be specified for driving directions
    * where the request includes a `departure_time`, and only if the request includes an API key or a Google Maps APIs Premium Plan client ID.
    *
    * The default value of `best_guess` will give the most useful predictions for the vast majority of use cases.
    * It is possible the `best_guess` travel time prediction may be *shorter* than `optimistic`, or alternatively,
    * *longer* than `pessimistic`, due to the way the `best_guess` prediction model integrates live traffic information.
    *
    * @default TrafficModel.best_guess
    */
  var traffic_model: js.UndefOr[TrafficModel] = js.native
  /**
    * Specifies one or more preferred modes of transit.
    * This parameter may only be specified for transit directions, and only if the request includes an API key or
    * a Google Maps APIs Premium Plan client ID.
    */
  var transit_mode: js.UndefOr[js.Array[TransitMode]] = js.native
  /**
    * Specifies preferences for transit routes.
    * Using this parameter, you can bias the options returned, rather than accepting the default best route chosen by the API.
    * This parameter may only be specified for transit directions, and only if the request includes an API key or
    * a Google Maps APIs Premium Plan client ID.
    */
  var transit_routing_preference: js.UndefOr[TransitRoutingPreference] = js.native
  /** Specifies the unit system to use when displaying results. */
  var units: js.UndefOr[UnitSystem] = js.native
  /**
    * Specifies an array of waypoints.
    * Waypoints alter a route by routing it through the specified location(s).
    * A waypoint is specified as a latitude/longitude coordinate, an encoded polyline, a place ID, or an address which will be geocoded.
    * Encoded polylines must be prefixed with `enc:` and followed by a colon (`:`). Place IDs must be prefixed with `place_id:`.
    * The place ID may only be specified if the request includes an API key or a Google Maps APIs Premium Plan client ID.
    * Waypoints are only supported for driving, walking and bicycling directions.
    */
  var waypoints: js.UndefOr[js.Array[LatLng]] = js.native
}

object DirectionsRequest {
  @scala.inline
  def apply(destination: LatLng, origin: LatLng): DirectionsRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
  @scala.inline
  implicit class DirectionsRequestOps[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternatives(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternatives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(js.undefined)
        ret
    }
    @scala.inline
    def withArrival_timeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrival_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrival_time(value: js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrival_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrival_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrival_time")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoid(value: js.Array[TravelRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid")(js.undefined)
        ret
    }
    @scala.inline
    def withDeparture_timeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departure_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeparture_time(value: js.Date | Double | now): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departure_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeparture_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("departure_time")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: TravelMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withTraffic_model(value: TrafficModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffic_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraffic_model: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffic_model")(js.undefined)
        ret
    }
    @scala.inline
    def withTransit_mode(value: js.Array[TransitMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransit_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withTransit_routing_preference(value: TransitRoutingPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit_routing_preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransit_routing_preference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit_routing_preference")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: UnitSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[LatLng]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(js.undefined)
        ret
    }
  }
  
}

