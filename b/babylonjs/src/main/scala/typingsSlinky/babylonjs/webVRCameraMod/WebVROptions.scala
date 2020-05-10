package typingsSlinky.babylonjs.webVRCameraMod

import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebVROptions extends js.Object {
  /**
    * Should the native controller meshes be initialized. (default: true)
    */
  var controllerMeshes: js.UndefOr[Boolean] = js.native
  /**
    * If you'd like to provide your own button to the VRHelper. (default: standard babylon vr button)
    */
  var customVRButton: js.UndefOr[HTMLButtonElement] = js.native
  /**
    * To change the default offset from the ground to account for user's height in meters. Will be scaled by positionScale. (default: 1.7)
    */
  var defaultHeight: js.UndefOr[Double] = js.native
  /**
    * Creating a default HemiLight only on controllers. (default: true)
    */
  var defaultLightingOnControllers: js.UndefOr[Boolean] = js.native
  /**
    * If there are more than one VRDisplays, this will choose the display matching this name. (default: pick first vrDisplay)
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Sets the scale of the vrDevice in babylon space. (default: 1)
    */
  var positionScale: js.UndefOr[Double] = js.native
  /**
    * To change the length of the ray for gaze/controllers. Will be scaled by positionScale. (default: 100)
    */
  var rayLength: js.UndefOr[Double] = js.native
  /**
    * Sets if the webVR camera should be tracked to the vrDevice. (default: true)
    */
  var trackPosition: js.UndefOr[Boolean] = js.native
  /**
    * If you don't want to use the default VR button of the helper. (default: false)
    */
  var useCustomVRButton: js.UndefOr[Boolean] = js.native
  /**
    * If multiview should be used if availible (default: false)
    */
  var useMultiview: js.UndefOr[Boolean] = js.native
}

object WebVROptions {
  @scala.inline
  def apply(): WebVROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebVROptions]
  }
  @scala.inline
  implicit class WebVROptionsOps[Self <: WebVROptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControllerMeshes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerMeshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerMeshes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerMeshes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomVRButton(value: HTMLButtonElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customVRButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomVRButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customVRButton")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLightingOnControllers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLightingOnControllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLightingOnControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLightingOnControllers")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionScale")(js.undefined)
        ret
    }
    @scala.inline
    def withRayLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rayLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRayLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rayLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCustomVRButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomVRButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomVRButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomVRButton")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMultiview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMultiview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMultiview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMultiview")(js.undefined)
        ret
    }
  }
  
}

