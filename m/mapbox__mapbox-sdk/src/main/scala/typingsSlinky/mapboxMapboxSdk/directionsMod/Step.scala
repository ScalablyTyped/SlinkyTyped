package typingsSlinky.mapboxMapboxSdk.directionsMod

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends StObject {
  
  var bannerInstructions: js.Array[BannerInstruction] = js.native
  
  /**
    * String with the destinations of the way along which the travel proceeds. Optionally included, if data is available.
    */
  var destinations: js.UndefOr[String] = js.native
  
  /**
    * Number indicating the distance traveled in meters from the maneuver to the next RouteStep.
    */
  var distance: Double = js.native
  
  /**
    * The legal driving side at the location for this step. Either left or right.
    */
  var driving_side: DirectionsSide = js.native
  
  /**
    * Number indicating the estimated time traveled time in seconds from the maneuver to the next RouteStep.
    */
  var duration: Double = js.native
  
  /**
    * String with the exit numbers or names of the way. Optionally included, if data is available.
    */
  var exits: js.UndefOr[String] = js.native
  
  /**
    * Depending on the geometries parameter this is a GeoJSON LineString or a
    * Polyline string representing the full route geometry from this RouteStep to the next RouteStep
    */
  var geometry: LineString | MultiLineString = js.native
  
  /**
    * Array of objects representing all intersections along the step.
    */
  var intersections: js.Array[Intersection] = js.native
  
  /**
    * One StepManeuver object
    */
  var maneuver: Maneuver = js.native
  
  /**
    * String indicating the mode of transportation. Possible values:
    */
  var mode: DirectionsMode = js.native
  
  /**
    * String with the name of the way along which the travel proceeds
    */
  var name: String = js.native
  
  /**
    * A string containing an IPA phonetic transcription indicating how to pronounce the name in the name property.
    * This property is omitted if pronunciation data is unavailable for the step.
    */
  var pronunciation: js.UndefOr[String] = js.native
  
  /**
    * Any road designations associated with the road or path leading from this step’s maneuver to the next step’s maneuver.
    * Optionally included, if data is available. If multiple road designations are associated with the road, they are separated by semicolons.
    * A road designation typically consists of an alphabetic network code (identifying the road type or numbering system), a space or hyphen,
    * and a route number. You should not assume that the network code is globally unique: for example, a network code of “NH” may appear on a
    * “National Highway” or “New Hampshire”. Moreover, a route number may not even uniquely identify a road within a given network.
    */
  var ref: js.UndefOr[String] = js.native
  
  var voiceInstructions: js.Array[VoiceInstruction] = js.native
  
  var weight: Double = js.native
}
object Step {
  
  @scala.inline
  def apply(
    bannerInstructions: js.Array[BannerInstruction],
    distance: Double,
    driving_side: DirectionsSide,
    duration: Double,
    geometry: LineString | MultiLineString,
    intersections: js.Array[Intersection],
    maneuver: Maneuver,
    mode: DirectionsMode,
    name: String,
    voiceInstructions: js.Array[VoiceInstruction],
    weight: Double
  ): Step = {
    val __obj = js.Dynamic.literal(bannerInstructions = bannerInstructions.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], driving_side = driving_side.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], maneuver = maneuver.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceInstructions = voiceInstructions.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBannerInstructions(value: js.Array[BannerInstruction]): Self = StObject.set(x, "bannerInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerInstructionsVarargs(value: BannerInstruction*): Self = StObject.set(x, "bannerInstructions", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: String): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriving_side(value: DirectionsSide): Self = StObject.set(x, "driving_side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExits(value: String): Self = StObject.set(x, "exits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitsUndefined: Self = StObject.set(x, "exits", js.undefined)
    
    @scala.inline
    def setGeometry(value: LineString | MultiLineString): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersections(value: js.Array[Intersection]): Self = StObject.set(x, "intersections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionsVarargs(value: Intersection*): Self = StObject.set(x, "intersections", js.Array(value :_*))
    
    @scala.inline
    def setManeuver(value: Maneuver): Self = StObject.set(x, "maneuver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: DirectionsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPronunciation(value: String): Self = StObject.set(x, "pronunciation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPronunciationUndefined: Self = StObject.set(x, "pronunciation", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setVoiceInstructions(value: js.Array[VoiceInstruction]): Self = StObject.set(x, "voiceInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceInstructionsVarargs(value: VoiceInstruction*): Self = StObject.set(x, "voiceInstructions", js.Array(value :_*))
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
