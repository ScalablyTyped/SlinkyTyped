package typingsSlinky.babylonjs.babylonjsMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcRotateCameraInputsManager extends js.Object {
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addVRDeviceOrientation(): typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = js.native
}

object ArcRotateCameraInputsManager {
  @scala.inline
  def apply(
    addVRDeviceOrientation: () => typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
  ): ArcRotateCameraInputsManager = {
    val __obj = js.Dynamic.literal(addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
    __obj.asInstanceOf[ArcRotateCameraInputsManager]
  }
  @scala.inline
  implicit class ArcRotateCameraInputsManagerOps[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddVRDeviceOrientation(
      value: () => typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addVRDeviceOrientation")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

