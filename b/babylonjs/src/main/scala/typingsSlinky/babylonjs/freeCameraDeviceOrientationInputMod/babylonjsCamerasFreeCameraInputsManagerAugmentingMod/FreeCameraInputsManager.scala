package typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeCameraInputsManager extends js.Object {
  /**
    * @hidden
    */
  var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = js.native
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addDeviceOrientation(): FreeCameraInputsManager = js.native
}

object FreeCameraInputsManager {
  @scala.inline
  def apply(addDeviceOrientation: () => FreeCameraInputsManager): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation))
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
  @scala.inline
  implicit class FreeCameraInputsManagerOps[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDeviceOrientation(value: () => FreeCameraInputsManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDeviceOrientation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_deviceOrientationInput(value: Nullable[FreeCameraDeviceOrientationInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deviceOrientationInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_deviceOrientationInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deviceOrientationInput")(null)
        ret
    }
  }
  
}

