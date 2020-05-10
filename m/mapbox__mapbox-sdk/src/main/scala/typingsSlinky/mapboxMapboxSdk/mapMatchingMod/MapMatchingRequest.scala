package typingsSlinky.mapboxMapboxSdk.mapMatchingMod

import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsAnnotation
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsGeometry
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsOverview
import typingsSlinky.mapboxMapboxSdk.directionsMod.DirectionsProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMatchingRequest extends js.Object {
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
  implicit class MapMatchingRequestOps[Self <: MapMatchingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[MapMatchingPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(value: DirectionsAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometries(value: DirectionsGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(js.undefined)
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
    def withOverview(value: DirectionsOverview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: DirectionsProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withTidy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTidy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tidy")(js.undefined)
        ret
    }
  }
  
}

