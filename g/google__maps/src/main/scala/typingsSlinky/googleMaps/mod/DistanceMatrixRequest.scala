package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationsVarargs(value: LatLng*): Self = this.set("destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: js.Array[LatLng]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsVarargs(value: LatLng*): Self = this.set("origins", js.Array(value :_*))
    
    @scala.inline
    def setOrigins(value: js.Array[LatLng]): Self = this.set("origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrival_timeDate(value: js.Date): Self = this.set("arrival_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrival_time(value: js.Date | Double): Self = this.set("arrival_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrival_time: Self = this.set("arrival_time", js.undefined)
    
    @scala.inline
    def setAvoidVarargs(value: TravelRestriction*): Self = this.set("avoid", js.Array(value :_*))
    
    @scala.inline
    def setAvoid(value: js.Array[TravelRestriction]): Self = this.set("avoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoid: Self = this.set("avoid", js.undefined)
    
    @scala.inline
    def setDeparture_timeDate(value: js.Date): Self = this.set("departure_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeparture_time(value: js.Date | Double): Self = this.set("departure_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeparture_time: Self = this.set("departure_time", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMode(value: TravelMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setTraffic_model(value: TrafficModel): Self = this.set("traffic_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraffic_model: Self = this.set("traffic_model", js.undefined)
    
    @scala.inline
    def setTransit_modeVarargs(value: TransitMode*): Self = this.set("transit_mode", js.Array(value :_*))
    
    @scala.inline
    def setTransit_mode(value: js.Array[TransitMode]): Self = this.set("transit_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransit_mode: Self = this.set("transit_mode", js.undefined)
    
    @scala.inline
    def setTransit_routing_preference(value: TransitRoutingPreference): Self = this.set("transit_routing_preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransit_routing_preference: Self = this.set("transit_routing_preference", js.undefined)
    
    @scala.inline
    def setUnits(value: UnitSystem): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
