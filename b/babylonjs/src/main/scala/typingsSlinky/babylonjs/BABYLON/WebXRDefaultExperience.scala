package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXRDefaultExperience extends js.Object {
  /**
    * Base experience
    */
  var baseExperience: WebXRExperienceHelper = js.native
  /**
    * Enables ui for entering/exiting xr
    */
  var enterExitUI: WebXREnterExitUI = js.native
  /**
    * Input experience extension
    */
  var input: WebXRInput = js.native
  /**
    * Enables laser pointer and selection
    */
  var pointerSelection: WebXRControllerPointerSelection = js.native
  /**
    * Default target xr should render to
    */
  var renderTarget: WebXRRenderTarget = js.native
  /**
    * Enables teleportation
    */
  var teleportation: WebXRMotionControllerTeleportation = js.native
  /**
    * DIsposes of the experience helper
    */
  def dispose(): Unit = js.native
}

object WebXRDefaultExperience {
  @scala.inline
  def apply(
    baseExperience: WebXRExperienceHelper,
    dispose: () => Unit,
    enterExitUI: WebXREnterExitUI,
    input: WebXRInput,
    pointerSelection: WebXRControllerPointerSelection,
    renderTarget: WebXRRenderTarget,
    teleportation: WebXRMotionControllerTeleportation
  ): WebXRDefaultExperience = {
    val __obj = js.Dynamic.literal(baseExperience = baseExperience.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enterExitUI = enterExitUI.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], pointerSelection = pointerSelection.asInstanceOf[js.Any], renderTarget = renderTarget.asInstanceOf[js.Any], teleportation = teleportation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRDefaultExperience]
  }
  @scala.inline
  implicit class WebXRDefaultExperienceOps[Self <: WebXRDefaultExperience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseExperience(value: WebXRExperienceHelper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseExperience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnterExitUI(value: WebXREnterExitUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterExitUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: WebXRInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerSelection(value: WebXRControllerPointerSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTarget(value: WebXRRenderTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeleportation(value: WebXRMotionControllerTeleportation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teleportation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

