package typingsSlinky.mapboxMapboxSdk

import typingsSlinky.mapboxGl.mod.LngLatLike
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typingsSlinky.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geocodingMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/geocoding", JSImport.Default)
  @js.native
  def default(config: SdkConfig): GeocodeService = js.native
  @JSImport("@mapbox/mapbox-sdk/services/geocoding", JSImport.Default)
  @js.native
  def default(config: typingsSlinky.mapboxMapboxSdk.mod.default): GeocodeService = js.native
  
  @js.native
  trait BoundingBox extends StObject {
    
    var maxLatitude: Double = js.native
    
    var maxLongitude: Double = js.native
    
    var minLatitude: Double = js.native
    
    var minLongitude: Double = js.native
  }
  object BoundingBox {
    
    @scala.inline
    def apply(maxLatitude: Double, maxLongitude: Double, minLatitude: Double, minLongitude: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(maxLatitude = maxLatitude.asInstanceOf[js.Any], maxLongitude = maxLongitude.asInstanceOf[js.Any], minLatitude = minLatitude.asInstanceOf[js.Any], minLongitude = minLongitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit class BoundingBoxMutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxLatitude(value: Double): Self = StObject.set(x, "maxLatitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLongitude(value: Double): Self = StObject.set(x, "maxLongitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLatitude(value: Double): Self = StObject.set(x, "minLatitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLongitude(value: Double): Self = StObject.set(x, "minLongitude", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeocodeFeature extends StObject {
    
    /**
      * A string of the house number for the returned  address feature. Note that unlike the
      * address property for  poi features, this property is outside the  properties object.
      */
    var address: js.UndefOr[String] = js.native
    
    /**
      * An array bounding box in the form [ minX,minY,maxX,maxY ] .
      */
    var bbox: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * An array in the form [ longitude,latitude ] at the center of the specified  bbox .
      */
    var center: js.Array[Double] = js.native
    
    /**
      * An array representing the hierarchy of encompassing parent features. Each parent feature may include any of the above properties
      */
    var context: js.Array[GeocodeFeature] = js.native
    
    /**
      * An object describing the spatial geometry of the returned feature
      */
    var geometry: Geometry = js.native
    
    /**
      * A string feature id in the form  {type}.{id} where  {type} is the lowest hierarchy feature in the  place_type field.
      * The  {id} suffix of the feature id is unstable and may change within versions.
      */
    var id: String = js.native
    
    /**
      * A string of the IETF language tag of the query's primary language.
      * Can be used to identity text and place_name properties on this object
      * in the format text_{language}, place_name_{language} and language_{language}
      */
    var language: String = js.native
    
    /**
      * A string analogous to the  place_name field that more closely matches the query than results in the specified language.
      * For example, querying "Köln, Germany" with language set to English might return a feature with the place_name "Cologne, Germany"
      * and a  matching_place_name of "Köln, North Rhine-Westphalia, Germany".
      */
    var matching_place_name: String = js.native
    
    /**
      * A string analogous to the  text field that more closely matches the query than results in the specified language.
      * For example, querying "Köln, Germany" with language set to English might return a feature with the
      * text "Cologne" and the  matching_text "Köln".
      */
    var matching_text: String = js.native
    
    /**
      * A string representing the feature in the requested language, if specified, and its full result hierarchy.
      */
    var place_name: String = js.native
    
    /**
      * An array of feature types describing the feature. Options are  country ,  region ,  postcode ,  district ,  place , locality ,  neighborhood ,
      * address ,  poi , and  poi.landmark . Most features have only one type, but if the feature has multiple types,
      * all applicable types will be listed in the array. (For example, Vatican City is a  country , region , and  place .)
      */
    var place_type: js.Array[String] = js.native
    
    /**
      * An object describing the feature. The property object is unstable and only Carmen GeoJSON properties are guaranteed.
      * Your implementation should check for the presence of these values in a response before it attempts to use them.
      */
    var properties: GeocodeProperties = js.native
    
    /**
      * A numerical score from 0 (least relevant) to 0.99 (most relevant) measuring how well each returned feature matches the query.
      * You can use the  relevance property to remove results that don't fully match the query.
      */
    var relevance: Double = js.native
    
    /**
      * A string representing the feature in the requested language, if specified.
      */
    var text: String = js.native
    
    /**
      * "Feature" , a GeoJSON type from the GeoJSON specification.
      */
    var `type`: String = js.native
  }
  object GeocodeFeature {
    
    @scala.inline
    def apply(
      center: js.Array[Double],
      context: js.Array[GeocodeFeature],
      geometry: Geometry,
      id: String,
      language: String,
      matching_place_name: String,
      matching_text: String,
      place_name: String,
      place_type: js.Array[String],
      properties: GeocodeProperties,
      relevance: Double,
      text: String,
      `type`: String
    ): GeocodeFeature = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeFeature]
    }
    
    @scala.inline
    implicit class GeocodeFeatureMutableBuilder[Self <: GeocodeFeature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value :_*))
      
      @scala.inline
      def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: js.Array[GeocodeFeature]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextVarargs(value: GeocodeFeature*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      @scala.inline
      def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatching_place_name(value: String): Self = StObject.set(x, "matching_place_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatching_text(value: String): Self = StObject.set(x, "matching_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlace_name(value: String): Self = StObject.set(x, "place_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlace_type(value: js.Array[String]): Self = StObject.set(x, "place_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlace_typeVarargs(value: String*): Self = StObject.set(x, "place_type", js.Array(value :_*))
      
      @scala.inline
      def setProperties(value: GeocodeProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent`
  */
  trait GeocodeMode extends StObject
  object GeocodeMode {
    
    @scala.inline
    def mapboxDotplaces: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces = "mapbox.places".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces]
    
    @scala.inline
    def `mapboxDotplaces-permanent`: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent` = "mapbox.places-permanent".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent`]
  }
  
  @js.native
  trait GeocodeProperties extends GeocodeFeature {
    
    /**
      * A string of comma-separated categories for the returned  poi feature.
      */
    var category: js.UndefOr[String] = js.native
    
    /**
      * A boolean value indicating whether a  poi feature is a landmark. Landmarks are
      * particularly notable or long-lived features like schools, parks, museums and places of worship.
      */
    var landmark: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of a suggested Maki icon to visualize a  poi feature based on its  category .
      */
    var maki: js.UndefOr[String] = js.native
    
    /**
      * The ISO 3166-1 country and ISO 3166-2 region code for the returned feature.
      */
    var short_code: String = js.native
    
    /**
      * A formatted string of the telephone number for the returned  poi feature.
      */
    var tel: js.UndefOr[String] = js.native
    
    /**
      * The Wikidata identifier for the returned feature.
      */
    var wikidata: js.UndefOr[String] = js.native
  }
  object GeocodeProperties {
    
    @scala.inline
    def apply(
      center: js.Array[Double],
      context: js.Array[GeocodeFeature],
      geometry: Geometry,
      id: String,
      language: String,
      matching_place_name: String,
      matching_text: String,
      place_name: String,
      place_type: js.Array[String],
      properties: GeocodeProperties,
      relevance: Double,
      short_code: String,
      text: String,
      `type`: String
    ): GeocodeProperties = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], matching_place_name = matching_place_name.asInstanceOf[js.Any], matching_text = matching_text.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], short_code = short_code.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeProperties]
    }
    
    @scala.inline
    implicit class GeocodePropertiesMutableBuilder[Self <: GeocodeProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setLandmark(value: Boolean): Self = StObject.set(x, "landmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLandmarkUndefined: Self = StObject.set(x, "landmark", js.undefined)
      
      @scala.inline
      def setMaki(value: String): Self = StObject.set(x, "maki", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMakiUndefined: Self = StObject.set(x, "maki", js.undefined)
      
      @scala.inline
      def setShort_code(value: String): Self = StObject.set(x, "short_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTel(value: String): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelUndefined: Self = StObject.set(x, "tel", js.undefined)
      
      @scala.inline
      def setWikidata(value: String): Self = StObject.set(x, "wikidata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWikidataUndefined: Self = StObject.set(x, "wikidata", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.country
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.region
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.district
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.place
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.address
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi
    - typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark
  */
  trait GeocodeQueryType extends StObject
  object GeocodeQueryType {
    
    @scala.inline
    def address: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.address = "address".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.address]
    
    @scala.inline
    def country: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.country = "country".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.country]
    
    @scala.inline
    def district: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.district = "district".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.district]
    
    @scala.inline
    def locality: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality = "locality".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.locality]
    
    @scala.inline
    def neighborhood: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood = "neighborhood".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.neighborhood]
    
    @scala.inline
    def place: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.place = "place".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.place]
    
    @scala.inline
    def poi: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi = "poi".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.poi]
    
    @scala.inline
    def poiDotlandmark: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark = "poi.landmark".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.poiDotlandmark]
    
    @scala.inline
    def postcode: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode = "postcode".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.postcode]
    
    @scala.inline
    def region: typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.region = "region".asInstanceOf[typingsSlinky.mapboxMapboxSdk.mapboxMapboxSdkStrings.region]
  }
  
  @js.native
  trait GeocodeRequest extends StObject {
    
    /**
      * Forward geocoding only. Return autocomplete results or not. Options are  true or  false and the default is  true .
      */
    var autocomplete: js.UndefOr[Boolean] = js.native
    
    /**
      * Forward geocoding only. Limit results to a bounding box. Options are in the format  minX,minY,maxX,maxY .
      */
    var bbox: js.UndefOr[BoundingBox] = js.native
    
    /**
      * Limit results to one or more countries. Options are ISO 3166 alpha 2 country codes
      */
    var countries: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Specify the language to use for response text and, for forward geocoding, query result weighting.
      * Options are IETF language tags comprised of a mandatory ISO 639-1 language code and optionally one or more
      * IETF subtags for country or script.
      */
    var language: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Limit the number of results returned. The default is  5 for forward geocoding and  1 for reverse geocoding.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * Either  mapbox.places for ephemeral geocoding, or  mapbox.places-permanent for storing results and batch geocoding.
      */
    var mode: GeocodeMode = js.native
    
    /**
      * Bias local results based on a provided location. Options are  longitude,latitude coordinates.
      */
    var proximity: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * A location. This will be a place name for forward geocoding or a coordinate pair (longitude, latitude) for reverse geocoding.
      */
    var query: String | LngLatLike = js.native
    
    /**
      * Filter results by one or more feature types
      */
    var types: js.UndefOr[js.Array[GeocodeQueryType]] = js.native
  }
  object GeocodeRequest {
    
    @scala.inline
    def apply(mode: GeocodeMode, query: String | LngLatLike): GeocodeRequest = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeRequest]
    }
    
    @scala.inline
    implicit class GeocodeRequestMutableBuilder[Self <: GeocodeRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setBbox(value: BoundingBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      @scala.inline
      def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
      
      @scala.inline
      def setLanguage(value: js.Array[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLanguageVarargs(value: String*): Self = StObject.set(x, "language", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMode(value: GeocodeMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProximity(value: js.Array[Double]): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
      
      @scala.inline
      def setProximityVarargs(value: Double*): Self = StObject.set(x, "proximity", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: String | LngLatLike): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[GeocodeQueryType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: GeocodeQueryType*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GeocodeResponse extends StObject {
    
    /**
      * A string attributing the results of the Mapbox Geocoding API to Mapbox and links to Mapbox's terms of service and data sources.
      */
    var attribution: String = js.native
    
    /**
      * An array of feature objects.
      */
    var features: js.Array[GeocodeFeature] = js.native
    
    /**
      * An array of space and punctuation-separated strings from the original query.
      */
    var query: js.Array[String] = js.native
    
    /**
      * "Feature Collection" , a GeoJSON type from the GeoJSON specification.
      */
    var `type`: String = js.native
  }
  object GeocodeResponse {
    
    @scala.inline
    def apply(attribution: String, features: js.Array[GeocodeFeature], query: js.Array[String], `type`: String): GeocodeResponse = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeResponse]
    }
    
    @scala.inline
    implicit class GeocodeResponseMutableBuilder[Self <: GeocodeResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatures(value: js.Array[GeocodeFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesVarargs(value: GeocodeFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeocodeService extends StObject {
    
    def forwardGeocode(request: GeocodeRequest): MapiRequest = js.native
    
    def reverseGeocode(request: GeocodeRequest): MapiRequest = js.native
  }
  object GeocodeService {
    
    @scala.inline
    def apply(forwardGeocode: GeocodeRequest => MapiRequest, reverseGeocode: GeocodeRequest => MapiRequest): GeocodeService = {
      val __obj = js.Dynamic.literal(forwardGeocode = js.Any.fromFunction1(forwardGeocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
      __obj.asInstanceOf[GeocodeService]
    }
    
    @scala.inline
    implicit class GeocodeServiceMutableBuilder[Self <: GeocodeService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardGeocode(value: GeocodeRequest => MapiRequest): Self = StObject.set(x, "forwardGeocode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReverseGeocode(value: GeocodeRequest => MapiRequest): Self = StObject.set(x, "reverseGeocode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Geometry extends StObject {
    
    /**
      * An array in the format [ longitude,latitude ] at the center of the specified  bbox .
      */
    var coordinates: js.Array[Double] = js.native
    
    /**
      * A boolean value indicating if an  address is interpolated along a road network. This field is only present when the feature is interpolated.
      */
    var interpolated: Boolean = js.native
    
    /**
      * Point, a GeoJSON type from the GeoJSON specification .
      */
    var `type`: String = js.native
  }
  object Geometry {
    
    @scala.inline
    def apply(coordinates: js.Array[Double], interpolated: Boolean, `type`: String): Geometry = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], interpolated = interpolated.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Geometry]
    }
    
    @scala.inline
    implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setInterpolated(value: Boolean): Self = StObject.set(x, "interpolated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
