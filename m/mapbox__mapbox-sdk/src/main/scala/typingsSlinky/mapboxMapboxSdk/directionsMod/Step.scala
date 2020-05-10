package typingsSlinky.mapboxMapboxSdk.directionsMod

import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
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
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBannerInstructions(value: js.Array[BannerInstruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriving_side(value: DirectionsSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driving_side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: LineString | MultiLineString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersections(value: js.Array[Intersection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManeuver(value: Maneuver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maneuver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: DirectionsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceInstructions(value: js.Array[VoiceInstruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(js.undefined)
        ret
    }
    @scala.inline
    def withExits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exits")(js.undefined)
        ret
    }
    @scala.inline
    def withPronunciation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPronunciation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
  }
  
}

