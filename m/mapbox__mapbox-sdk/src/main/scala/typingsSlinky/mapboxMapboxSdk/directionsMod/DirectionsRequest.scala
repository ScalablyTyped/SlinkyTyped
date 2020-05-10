package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsRequest extends js.Object {
  /**
    * Whether to try to return alternative routes. An alternative is classified as a route that is significantly
    * different than the fastest route, but also still reasonably fast. Such a route does not exist in all circumstances.
    * Currently up to two alternatives can be returned. Can be  true or  false (default).
    */
  var alternatives: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to return additional metadata along the route. Possible values are:  duration ,  distance ,  speed , and congestion .
    * Several annotations can be used by including them as a comma-separated list. See the RouteLeg object for more details on
    * what is included with annotations.
    */
  var annotations: js.UndefOr[js.Array[DirectionsAnnotation]] = js.native
  /**
    * Whether or not to return banner objects associated with the  routeSteps .
    * Should be used in conjunction with  steps . Can be  true or  false . The default is  false .
    */
  var bannerInstructions: js.UndefOr[Boolean] = js.native
  /**
    * Sets the allowed direction of travel when departing intermediate waypoints. If  true , the route will continue in the same
    * direction of travel. If  false , the route may continue in the opposite direction of travel. Defaults to  true for mapbox/driving and
    * false for  mapbox/walking and  mapbox/cycling .
    */
  var continueStraight: js.UndefOr[Boolean] = js.native
  /**
    * Exclude certain road types from routing. Valid values depend on the profile in use.
    * The default is to not exclude anything from the profile selected.
    */
  var exclude: js.UndefOr[js.Array[DirectionsProfile]] = js.native
  /**
    * Format of the returned geometry. Allowed values are:  geojson (as LineString ),
    * polyline with precision 5,  polyline6 (a polyline with precision 6). The default value is  polyline .
    */
  var geometries: js.UndefOr[DirectionsGeometry] = js.native
  /**
    * Language of returned turn-by-turn text instructions. See supported languages . The default is  en for English.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Type of returned overview geometry. Can be  full (the most detailed geometry available),
    * simplified (a simplified version of the full geometry), or  false (no overview geometry). The default is  simplified .
    */
  var overview: js.UndefOr[DirectionsOverview] = js.native
  /**
    * Routing profile; either  mapbox/driving-traffic ,  mapbox/driving ,  mapbox/walking , or  mapbox/cycling
    */
  var profile: DirectionsProfile = js.native
  /**
    * Emit instructions at roundabout exits. Can be  true or  false . The default is  false .
    */
  var roundaboutExits: js.UndefOr[Boolean] = js.native
  /**
    * Whether to return steps and turn-by-turn instructions. Can be  true or  false . The default is  false .
    */
  var steps: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to return SSML marked-up text for voice guidance along the route. Should be used in conjunction with steps .
    * Can be  true or  false . The default is  false .
    */
  var voiceInstructions: js.UndefOr[Boolean] = js.native
  /**
    * Which type of units to return in the text for voice instructions. Can be  imperial or  metric . Default is  imperial .
    */
  var voiceUnits: js.UndefOr[DirectionsUnits] = js.native
  var waypoints: js.Array[DirectionsRequestWaypoint] = js.native
}

object DirectionsRequest {
  @scala.inline
  def apply(profile: DirectionsProfile, waypoints: js.Array[DirectionsRequestWaypoint]): DirectionsRequest = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequest]
  }
  @scala.inline
  implicit class DirectionsRequestOps[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfile(value: DirectionsProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[DirectionsRequestWaypoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
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
    def withAnnotations(value: js.Array[DirectionsAnnotation]): Self = {
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
    def withBannerInstructions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBannerInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bannerInstructions")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueStraight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueStraight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueStraight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueStraight")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[DirectionsProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
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
    def withRoundaboutExits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundaboutExits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundaboutExits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundaboutExits")(js.undefined)
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
    def withVoiceInstructions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceInstructions")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceUnits(value: DirectionsUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceUnits")(js.undefined)
        ret
    }
  }
  
}

