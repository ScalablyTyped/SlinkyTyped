package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMatrixRequest extends js.Object {
  /**
    * Specifies the desired time of arrival for transit requests, in seconds since midnight, January 1, 1970 UTC.
    * You can specify either `departure_time` or `arrival_time`, but not both.
    * Note that `arrival_time` must be specified as an integer.
    */
  var arrival_time: js.UndefOr[js.Date | Double] = js.native
  /**
    * Introduces restrictions to the route. Valid values are specified in the Restrictions section of this document.
    * Only one restriction can be specified.
    */
  var avoid: js.UndefOr[js.Array[TravelRestriction]] = js.native
  /**
    * The desired time of departure. You can specify the time as an integer in seconds since midnight, January 1, 1970 UTC.
    * Alternatively, you can specify a value of now, which sets the departure time to the current time (correct to the nearest second).
    *
    * The departure time may be specified in two cases:
    *
    *  - For requests where the travel mode is transit: You can optionally specify one of `departure_time` or `arrival_time`.
    *    If neither time is specified, the `departure_time` defaults to now (that is, the departure time defaults to the current time).
    *
    *  - For requests where the travel mode is driving: You can specify the `departure_time` to receive a route and trip duration
    *    (response field: `duration_in_traffic`) that take traffic conditions into account.
    *    This option is only available if the request contains a valid API key, or a valid
    *    Google Maps APIs Premium Plan client ID and signature.
    *    The `departure_time` must be set to the current time or some time in the future. It cannot be in the past.
    *
    *    **Note:** Distance Matrix requests specifying `departure_time` when `mode=driving` are limited
    *    to a maximum of 100 elements per request. The number of origins times the number of destinations defines the number of elements.
    */
  var departure_time: js.UndefOr[js.Date | Double] = js.native
  /**
    * One or more locations to use as the finishing point for calculating travel distance and time.
    * The options for the destinations parameter are the same as for the origins parameter, described above.
    */
  var destinations: js.Array[LatLng] = js.native
  /**
    * The language in which to return results.
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
  var language: js.UndefOr[String] = js.native
  /**
    * Specifies the mode of transport to use when calculating distance.
    * Valid values and other request details are specified in the Travel Modes section of this document.
    *
    * @default TravelMode.driving
    */
  var mode: js.UndefOr[TravelMode] = js.native
  /**
    * The starting point for calculating travel distance and time.
    * You can supply one or more locations separated by the pipe character (`|`), in the form of an address, latitude/longitude coordinates,
    * or a place ID:
    *  - If you pass an address, the service geocodes the string and converts it to a latitude/longitude coordinate to calculate distance.
    *    This coordinate may be different from that returned by the Geocoding API, for example a building entrance rather than its center.
    *
    *    `origins=Bobcaygeon+ON|24+Sussex+Drive+Ottawa+ON`
    *
    *  - If you pass latitude/longitude coordinates, they are used unchanged to calculate distance.
    *    Ensure that no space exists between the latitude and longitude values.
    *
    *    `origins=41.43206,-81.38992|-33.86748,151.20699`
    *
    *  - If you supply a place ID, you must prefix it with `place_id:`.
    *    You can only specify a place ID if the request includes an API key or a Google Maps APIs Premium Plan client ID.
    *    You can retrieve place IDs from the Geocoding API and the Places SDK (including Place Autocomplete).
    *
    *    `origins=place_id:ChIJ3S-JXmauEmsRUcIaWtf4MzE`
    *
    *  - Alternatively, you can supply an encoded set of coordinates using the
    *    [Encoded Polyline Algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm).
    *    This is particularly useful if you have a large number of origin points, because the URL is significantly shorter when using
    *    an encoded polyline.
    *
    *     - Encoded polylines must be prefixed with `enc:` and followed by a colon (`:`). For example: `origins=enc:gfo}EtohhU:`
    *     - You can also include multiple encoded polylines, separated by the pipe character (`|`).
    *       For example: `origins=enc:wc~oAwquwMdlTxiKtqLyiK:|enc:c~vnAamswMvlTor@tjGi}L:|enc:udymA{~bxM:`
    */
  var origins: js.Array[LatLng] = js.native
  /**
    * The region code, specified as a [ccTLD](https://en.wikipedia.org/wiki/CcTLD) (country code top-level domain) two-character value.
    * Most ccTLD codes are identical to ISO 3166-1 codes, with some exceptions.
    * This parameter will only influence, not fully restrict, results from the geocoder.
    * If more relevant results exist outside of the specified region, they may be included.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Specifies the assumptions to use when calculating time in traffic.
    * This setting affects the value returned in the `duration_in_traffic` field in the response,
    * which contains the predicted time in traffic based on historical averages.
    * The `traffic_model` parameter may only be specified for requests where the travel mode is `driving`,
    * and where the request includes a `departure_time`, and only if the request includes an API key or
    * a Google Maps APIs Premium Plan client ID.
    *
    * @default TrafficModel.best_guess
    */
  var traffic_model: js.UndefOr[TrafficModel] = js.native
  /** Specifies one or more preferred modes of transit. This parameter may only be specified for requests where the `mode` is `transit`. */
  var transit_mode: js.UndefOr[js.Array[TransitMode]] = js.native
  /**
    * Specifies preferences for transit requests. Using this parameter, you can bias the options returned,
    * rather than accepting the default best route chosen by the API.
    * This parameter may only be specified for requests where the `mode` is `transit`.
    */
  var transit_routing_preference: js.UndefOr[TransitRoutingPreference] = js.native
  /** Specifies the unit system to use when expressing distance as text. */
  var units: js.UndefOr[UnitSystem] = js.native
}

object DistanceMatrixRequest {
  @scala.inline
  def apply(destinations: js.Array[LatLng], origins: js.Array[LatLng]): DistanceMatrixRequest = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixRequest]
  }
  @scala.inline
  implicit class DistanceMatrixRequestOps[Self <: DistanceMatrixRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinations(value: js.Array[LatLng]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigins(value: js.Array[LatLng]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
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
    def withDeparture_time(value: js.Date | Double): Self = {
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
    def withLanguage(value: String): Self = {
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
  }
  
}

