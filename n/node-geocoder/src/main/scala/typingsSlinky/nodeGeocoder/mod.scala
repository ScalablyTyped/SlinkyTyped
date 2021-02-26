package typingsSlinky.nodeGeocoder

import typingsSlinky.nodeGeocoder.anon.Confidence
import typingsSlinky.nodeGeocoder.anon.Level1long
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.agol
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.google
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.here
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.http
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.https
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.opendatafrance
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.openstreetmap
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.request
import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.smartyStreet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-geocoder", JSImport.Namespace)
  @js.native
  def apply(options: Options): Geocoder = js.native
  
  @JSImport("node-geocoder", "Geocoder")
  @js.native
  class Geocoder () extends StObject {
    
    def batchGeocode(queries: js.Array[Query | String]): js.Promise[js.Array[BatchResult]] = js.native
    def batchGeocode(
      queries: js.Array[Query | String],
      cb: js.Function2[/* err */ js.Any, /* data */ js.Array[BatchResult], Unit]
    ): js.Promise[js.Array[BatchResult]] = js.native
    
    def geocode(query: String): js.Promise[js.Array[Entry]] = js.native
    def geocode(query: String, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
    def geocode(query: Query): js.Promise[js.Array[Entry]] = js.native
    def geocode(query: Query, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
    
    def reverse(loc: Location): js.Promise[js.Array[Entry]] = js.native
    def reverse(loc: Location, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
  }
  
  @js.native
  trait AgolOptions extends StObject {
    
    var client_id: js.UndefOr[String] = js.native
    
    var client_secret: js.UndefOr[String] = js.native
    
    var provider: agol = js.native
  }
  object AgolOptions {
    
    @scala.inline
    def apply(provider: agol): AgolOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgolOptions]
    }
    
    @scala.inline
    implicit class AgolOptionsMutableBuilder[Self <: AgolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      @scala.inline
      def setProvider(value: agol): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseOptions extends StObject {
    
    var formatter: js.UndefOr[js.Any] = js.native
    
    var formatterPattern: js.UndefOr[String] = js.native
    
    var httpAdapter: js.UndefOr[https | http | request] = js.native
    
    var provider: String = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(provider: String): BaseOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatter(value: js.Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterPattern(value: String): Self = StObject.set(x, "formatterPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterPatternUndefined: Self = StObject.set(x, "formatterPattern", js.undefined)
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setHttpAdapter(value: https | http | request): Self = StObject.set(x, "httpAdapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAdapterUndefined: Self = StObject.set(x, "httpAdapter", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait BatchResult extends StObject {
    
    var error: js.Any = js.native
    
    var value: js.Array[Entry] = js.native
  }
  object BatchResult {
    
    @scala.inline
    def apply(error: js.Any, value: js.Array[Entry]): BatchResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchResult]
    }
    
    @scala.inline
    implicit class BatchResultMutableBuilder[Self <: BatchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Array[Entry]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Entry*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Entry extends StObject {
    
    var administrativeLevels: js.UndefOr[Level1long] = js.native
    
    var building: js.UndefOr[String] = js.native
    
    var city: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var countryCode: js.UndefOr[String] = js.native
    
    var county: js.UndefOr[String] = js.native
    
    var district: js.UndefOr[String] = js.native
    
    var extra: js.UndefOr[Confidence] = js.native
    
    var formattedAddress: js.UndefOr[String] = js.native
    
    var latitude: js.UndefOr[Double] = js.native
    
    var longitude: js.UndefOr[Double] = js.native
    
    var provider: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var stateCode: js.UndefOr[String] = js.native
    
    var streetName: js.UndefOr[String] = js.native
    
    var streetNumber: js.UndefOr[String] = js.native
    
    var zipcode: js.UndefOr[String] = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(): Entry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdministrativeLevels(value: Level1long): Self = StObject.set(x, "administrativeLevels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdministrativeLevelsUndefined: Self = StObject.set(x, "administrativeLevels", js.undefined)
      
      @scala.inline
      def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildingUndefined: Self = StObject.set(x, "building", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
      
      @scala.inline
      def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
      
      @scala.inline
      def setExtra(value: Confidence): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedAddressUndefined: Self = StObject.set(x, "formattedAddress", js.undefined)
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateCode(value: String): Self = StObject.set(x, "stateCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateCodeUndefined: Self = StObject.set(x, "stateCode", js.undefined)
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStreetName(value: String): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetNameUndefined: Self = StObject.set(x, "streetName", js.undefined)
      
      @scala.inline
      def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreetNumberUndefined: Self = StObject.set(x, "streetNumber", js.undefined)
      
      @scala.inline
      def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipcodeUndefined: Self = StObject.set(x, "zipcode", js.undefined)
    }
  }
  
  @js.native
  trait GenericOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var provider: Providers = js.native
  }
  object GenericOptions {
    
    @scala.inline
    def apply(provider: Providers): GenericOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericOptions]
    }
    
    @scala.inline
    implicit class GenericOptionsMutableBuilder[Self <: GenericOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setProvider(value: Providers): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GoogleOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var channel: js.UndefOr[String] = js.native
    
    var clientId: js.UndefOr[String] = js.native
    
    var excludePartialMatches: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var provider: google = js.native
    
    var region: js.UndefOr[String] = js.native
  }
  object GoogleOptions {
    
    @scala.inline
    def apply(provider: google): GoogleOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleOptions]
    }
    
    @scala.inline
    implicit class GoogleOptionsMutableBuilder[Self <: GoogleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setExcludePartialMatches(value: Boolean): Self = StObject.set(x, "excludePartialMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePartialMatchesUndefined: Self = StObject.set(x, "excludePartialMatches", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setProvider(value: google): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  @js.native
  trait HereOptions extends StObject {
    
    var appCode: String = js.native
    
    var appId: String = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var politicalView: js.UndefOr[String] = js.native
    
    var production: js.UndefOr[Boolean] = js.native
    
    var provider: here = js.native
    
    var state: js.UndefOr[String] = js.native
  }
  object HereOptions {
    
    @scala.inline
    def apply(appCode: String, appId: String, provider: here): HereOptions = {
      val __obj = js.Dynamic.literal(appCode = appCode.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[HereOptions]
    }
    
    @scala.inline
    implicit class HereOptionsMutableBuilder[Self <: HereOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppCode(value: String): Self = StObject.set(x, "appCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setPoliticalView(value: String): Self = StObject.set(x, "politicalView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoliticalViewUndefined: Self = StObject.set(x, "politicalView", js.undefined)
      
      @scala.inline
      def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      @scala.inline
      def setProvider(value: here): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait Location extends StObject {
    
    var lat: Double = js.native
    
    var lon: Double = js.native
  }
  object Location {
    
    @scala.inline
    def apply(lat: Double, lon: Double): Location = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenDataFranceOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var provider: opendatafrance = js.native
  }
  object OpenDataFranceOptions {
    
    @scala.inline
    def apply(provider: opendatafrance): OpenDataFranceOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenDataFranceOptions]
    }
    
    @scala.inline
    implicit class OpenDataFranceOptionsMutableBuilder[Self <: OpenDataFranceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setProvider(value: opendatafrance): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OpenStreetMapOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var osmServer: js.UndefOr[String] = js.native
    
    var provider: openstreetmap = js.native
  }
  object OpenStreetMapOptions {
    
    @scala.inline
    def apply(provider: openstreetmap): OpenStreetMapOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenStreetMapOptions]
    }
    
    @scala.inline
    implicit class OpenStreetMapOptionsMutableBuilder[Self <: OpenStreetMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOsmServer(value: String): Self = StObject.set(x, "osmServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsmServerUndefined: Self = StObject.set(x, "osmServer", js.undefined)
      
      @scala.inline
      def setProvider(value: openstreetmap): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = BaseOptions with (GenericOptions | HereOptions | OpenStreetMapOptions | OpenDataFranceOptions | AgolOptions | SmartyStreetsOptions | GoogleOptions)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.freegeoip
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.datasciencetoolkit
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.locationiq
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.mapquest
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.openmapquest
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.tomtom
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.nominatimmapquest
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.opencage
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.geocodio
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.yandex
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.teleport
    - typingsSlinky.nodeGeocoder.nodeGeocoderStrings.pickpoint
  */
  trait Providers extends StObject
  object Providers {
    
    @scala.inline
    def datasciencetoolkit: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.datasciencetoolkit = "datasciencetoolkit".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.datasciencetoolkit]
    
    @scala.inline
    def freegeoip: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.freegeoip = "freegeoip".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.freegeoip]
    
    @scala.inline
    def geocodio: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.geocodio = "geocodio".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.geocodio]
    
    @scala.inline
    def locationiq: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.locationiq = "locationiq".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.locationiq]
    
    @scala.inline
    def mapquest: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.mapquest = "mapquest".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.mapquest]
    
    @scala.inline
    def nominatimmapquest: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.nominatimmapquest = "nominatimmapquest".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.nominatimmapquest]
    
    @scala.inline
    def opencage: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.opencage = "opencage".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.opencage]
    
    @scala.inline
    def openmapquest: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.openmapquest = "openmapquest".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.openmapquest]
    
    @scala.inline
    def pickpoint: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.pickpoint = "pickpoint".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.pickpoint]
    
    @scala.inline
    def teleport: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.teleport = "teleport".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.teleport]
    
    @scala.inline
    def tomtom: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.tomtom = "tomtom".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.tomtom]
    
    @scala.inline
    def yandex: typingsSlinky.nodeGeocoder.nodeGeocoderStrings.yandex = "yandex".asInstanceOf[typingsSlinky.nodeGeocoder.nodeGeocoderStrings.yandex]
  }
  
  @js.native
  trait Query extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var countryCode: js.UndefOr[String] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var minConfidence: js.UndefOr[Double] = js.native
    
    var zipcode: js.UndefOr[String] = js.native
  }
  object Query {
    
    @scala.inline
    def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMinConfidence(value: Double): Self = StObject.set(x, "minConfidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinConfidenceUndefined: Self = StObject.set(x, "minConfidence", js.undefined)
      
      @scala.inline
      def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZipcodeUndefined: Self = StObject.set(x, "zipcode", js.undefined)
    }
  }
  
  @js.native
  trait SmartyStreetsOptions extends StObject {
    
    var auth_id: String = js.native
    
    var auth_token: String = js.native
    
    var provider: smartyStreet = js.native
  }
  object SmartyStreetsOptions {
    
    @scala.inline
    def apply(auth_id: String, auth_token: String, provider: smartyStreet): SmartyStreetsOptions = {
      val __obj = js.Dynamic.literal(auth_id = auth_id.asInstanceOf[js.Any], auth_token = auth_token.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmartyStreetsOptions]
    }
    
    @scala.inline
    implicit class SmartyStreetsOptionsMutableBuilder[Self <: SmartyStreetsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_id(value: String): Self = StObject.set(x, "auth_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: smartyStreet): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
