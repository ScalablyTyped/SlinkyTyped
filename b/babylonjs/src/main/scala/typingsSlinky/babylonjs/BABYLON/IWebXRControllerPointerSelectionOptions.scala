package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRControllerPointerSelectionOptions extends js.Object {
  /**
    * if provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.native
  /**
    * Disable the pointer up event when the xr controller in screen and gaze mode is disposed (meaning - when the user removed the finger from the screen)
    * If not disabled, the last picked point will be used to execute a pointer up event
    * If disabled, pointer up event will be triggered right after the pointer down event.
    * Used in screen and gaze target ray mode only
    */
  var disablePointerUpOnTouchOut: Boolean = js.native
  /**
    * For gaze mode (time to select instead of press)
    */
  var forceGazeMode: Boolean = js.native
  /**
    * Factor to be applied to the pointer-moved function in the gaze mode. How sensitive should the gaze mode be when checking if the pointer moved
    * to start a new countdown to the pointer down event.
    * Defaults to 1.
    */
  var gazeModePointerMovedFactor: js.UndefOr[Double] = js.native
  /**
    * Different button type to use instead of the main component
    */
  var overrideButtonId: js.UndefOr[String] = js.native
  /**
    *  use this rendering group id for the meshes (optional)
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
  /**
    * The amount of time in milliseconds it takes between pick found something to a pointer down event.
    * Used in gaze modes. Tracked pointer uses the trigger, screen uses touch events
    * 3000 means 3 seconds between pointing at something and selecting it
    */
  var timeToSelect: js.UndefOr[Double] = js.native
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.native
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput = js.native
}

object IWebXRControllerPointerSelectionOptions {
  @scala.inline
  def apply(disablePointerUpOnTouchOut: Boolean, forceGazeMode: Boolean, xrInput: WebXRInput): IWebXRControllerPointerSelectionOptions = {
    val __obj = js.Dynamic.literal(disablePointerUpOnTouchOut = disablePointerUpOnTouchOut.asInstanceOf[js.Any], forceGazeMode = forceGazeMode.asInstanceOf[js.Any], xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPointerSelectionOptions]
  }
  @scala.inline
  implicit class IWebXRControllerPointerSelectionOptionsOps[Self <: IWebXRControllerPointerSelectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisablePointerUpOnTouchOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePointerUpOnTouchOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceGazeMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceGazeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrInput(value: WebXRInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomUtilityLayerScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUtilityLayerScene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUtilityLayerScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUtilityLayerScene")(js.undefined)
        ret
    }
    @scala.inline
    def withGazeModePointerMovedFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gazeModePointerMovedFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGazeModePointerMovedFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gazeModePointerMovedFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideButtonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideButtonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideButtonId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideButtonId")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeToSelect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeToSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeToSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withUseUtilityLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUtilityLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseUtilityLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useUtilityLayer")(js.undefined)
        ret
    }
  }
  
}

