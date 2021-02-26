package typingsSlinky.mapboxMapboxSdk

import typingsSlinky.mapboxGl.mod.LngLatLike
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsGeometry
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsOverview
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsProfile
import typingsSlinky.mapboxMapboxSdk.directionsMod.Leg
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typingsSlinky.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMatchingMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/map-matching", JSImport.Default)
  @js.native
  def default(config: SdkConfig): MapMatchingService = js.native
  @JSImport("@mapbox/mapbox-sdk/services/map-matching", JSImport.Default)
  @js.native
  def default(config: typingsSlinky.mapboxMapboxSdk.mod.default): MapMatchingService = js.native
  
  @js.native
  trait MapMatchingPoint extends Point {
    
    /**
      * Whether this coordinate is waypoint or not. The first and last coordinates will always be waypoints.
      */
    var isWaypoint: js.UndefOr[Boolean] = js.native
    
    /**
      * A number in meters indicating the assumed precision of the used tracking device.
      */
    var radius: js.UndefOr[Double] = js.native
    
    /**
      * Datetime corresponding to the coordinate.
      */
    var timestamp: js.UndefOr[String | Double | js.Date] = js.native
    
    /**
      * Custom name for the waypoint used for the arrival instruction in banners and voice instructions.
      * Will be ignored unless isWaypoint is true.
      */
    var waypointName: js.UndefOr[Boolean] = js.native
  }
  object MapMatchingPoint {
    
    @scala.inline
    def apply(coordinates: LngLatLike): MapMatchingPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMatchingPoint]
    }
    
    @scala.inline
    implicit class MapMatchingPointMutableBuilder[Self <: MapMatchingPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsWaypoint(value: Boolean): Self = StObject.set(x, "isWaypoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWaypointUndefined: Self = StObject.set(x, "isWaypoint", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setTimestamp(value: String | Double | js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampDate(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setWaypointName(value: Boolean): Self = StObject.set(x, "waypointName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypointNameUndefined: Self = StObject.set(x, "waypointName", js.undefined)
    }
  }
  
  @js.native
  trait MapMatchingRequest extends StObject {
    
    /**
      * Specify additional metadata that should be returned.
      */
    var annotations: js.UndefOr[DirectionsAnnotation] = js.native
    
    /**
      * Format of the returned geometry. (optional, default "polyline")
      */
    var geometries: js.UndefOr[DirectionsGeometry] = js.native
    
    /**
      * Language of returned turn-by-turn text instructions. See supported languages. (optional, default "en")
      */
    var language: js.UndefOr[String] = js.native
    
    /**
      * Type of returned overview geometry. (optional, default "simplified"
      */
    var overview: js.UndefOr[DirectionsOverview] = js.native
    
    /**
      * An ordered array of MapMatchingPoints, between 2 and 100 (inclusive).
      */
    var points: js.Array[MapMatchingPoint] = js.native
    
    /**
      * A directions profile ID. (optional, default driving)
      */
    var profile: js.UndefOr[DirectionsProfile] = js.native
    
    /**
      * Whether to return steps and turn-by-turn instructions. (optional, default false)
      */
    var steps: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not to transparently remove clusters and re-sample traces for improved map matching results. (optional, default false)
      */
    var tidy: js.UndefOr[Boolean] = js.native
  }
  object MapMatchingRequest {
    
    @scala.inline
    def apply(points: js.Array[MapMatchingPoint]): MapMatchingRequest = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMatchingRequest]
    }
    
    @scala.inline
    implicit class MapMatchingRequestMutableBuilder[Self <: MapMatchingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: DirectionsAnnotation): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      @scala.inline
      def setGeometries(value: DirectionsGeometry): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOverview(value: DirectionsOverview): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[MapMatchingPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: MapMatchingPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setProfile(value: DirectionsProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setTidy(value: Boolean): Self = StObject.set(x, "tidy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidyUndefined: Self = StObject.set(x, "tidy", js.undefined)
    }
  }
  
  @js.native
  trait MapMatchingResponse extends StObject {
    
    /**
      * A string depicting the state of the response; see below for options
      */
    var code: String = js.native
    
    /**
      * An array of Match objects.
      */
    var matchings: js.Array[Matching] = js.native
    
    /**
      * An array of Tracepoint objects representing the location an input point was matched with.
      * Array of Waypoint objects representing all input points of the trace in the order they were matched.
      * If a trace point is omitted by map matching because it is an outlier, the entry will be null.
      */
    var tracepoints: js.Array[Tracepoint] = js.native
  }
  object MapMatchingResponse {
    
    @scala.inline
    def apply(code: String, matchings: js.Array[Matching], tracepoints: js.Array[Tracepoint]): MapMatchingResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], matchings = matchings.asInstanceOf[js.Any], tracepoints = tracepoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMatchingResponse]
    }
    
    @scala.inline
    implicit class MapMatchingResponseMutableBuilder[Self <: MapMatchingResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchings(value: js.Array[Matching]): Self = StObject.set(x, "matchings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchingsVarargs(value: Matching*): Self = StObject.set(x, "matchings", js.Array(value :_*))
      
      @scala.inline
      def setTracepoints(value: js.Array[Tracepoint]): Self = StObject.set(x, "tracepoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracepointsVarargs(value: Tracepoint*): Self = StObject.set(x, "tracepoints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MapMatchingService extends StObject {
    
    def getMatch(request: MapMatchingRequest): MapiRequest = js.native
  }
  object MapMatchingService {
    
    @scala.inline
    def apply(getMatch: MapMatchingRequest => MapiRequest): MapMatchingService = {
      val __obj = js.Dynamic.literal(getMatch = js.Any.fromFunction1(getMatch))
      __obj.asInstanceOf[MapMatchingService]
    }
    
    @scala.inline
    implicit class MapMatchingServiceMutableBuilder[Self <: MapMatchingService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMatch(value: MapMatchingRequest => MapiRequest): Self = StObject.set(x, "getMatch", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Matching extends StObject {
    
    /**
      * a number between 0 (low) and 1 (high) indicating level of confidence in the returned match
      */
    var confidence: Double = js.native
    
    var distance: Double = js.native
    
    var duration: Double = js.native
    
    var geometry: String = js.native
    
    var legs: js.Array[Leg] = js.native
    
    var weight: Double = js.native
    
    var weight_name: String = js.native
  }
  object Matching {
    
    @scala.inline
    def apply(
      confidence: Double,
      distance: Double,
      duration: Double,
      geometry: String,
      legs: js.Array[Leg],
      weight: Double,
      weight_name: String
    ): Matching = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matching]
    }
    
    @scala.inline
    implicit class MatchingMutableBuilder[Self <: Matching] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: String): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegs(value: js.Array[Leg]): Self = StObject.set(x, "legs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegsVarargs(value: Leg*): Self = StObject.set(x, "legs", js.Array(value :_*))
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight_name(value: String): Self = StObject.set(x, "weight_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Point extends StObject {
    
    /**
      * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
      */
    var approach: js.UndefOr[DirectionsApproach] = js.native
    
    var coordinates: LngLatLike = js.native
  }
  object Point {
    
    @scala.inline
    def apply(coordinates: LngLatLike): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproach(value: DirectionsApproach): Self = StObject.set(x, "approach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApproachUndefined: Self = StObject.set(x, "approach", js.undefined)
      
      @scala.inline
      def setCoordinates(value: LngLatLike): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tracepoint extends StObject {
    
    /**
      * Number of probable alternative matchings for this trace point. A value of zero indicates that this point was matched unambiguously.
      * Split the trace at these points for incremental map matching.
      */
    var alternatives_count: Double = js.native
    
    var location: js.Array[Double] = js.native
    
    /**
      * Index to the match object in matchings the sub-trace was matched to.
      */
    var matchings_index: Double = js.native
    
    var name: String = js.native
    
    /**
      * Index of the waypoint inside the matched route.
      */
    var waypoint_index: Double = js.native
  }
  object Tracepoint {
    
    @scala.inline
    def apply(
      alternatives_count: Double,
      location: js.Array[Double],
      matchings_index: Double,
      name: String,
      waypoint_index: Double
    ): Tracepoint = {
      val __obj = js.Dynamic.literal(alternatives_count = alternatives_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchings_index = matchings_index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], waypoint_index = waypoint_index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracepoint]
    }
    
    @scala.inline
    implicit class TracepointMutableBuilder[Self <: Tracepoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternatives_count(value: Double): Self = StObject.set(x, "alternatives_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
      
      @scala.inline
      def setMatchings_index(value: Double): Self = StObject.set(x, "matchings_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaypoint_index(value: Double): Self = StObject.set(x, "waypoint_index", value.asInstanceOf[js.Any])
    }
  }
}
