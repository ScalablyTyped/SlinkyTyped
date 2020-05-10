package typingsSlinky.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a free camera inputs manager
  */
@js.native
trait FreeCameraInputsManager extends js.Object {
  /**
    * Adds gamepad input support to the FreeCameraInputsManager.
    * @returns the FreeCameraInputsManager
    */
  def addGamepad(): FreeCameraInputsManager = js.native
}

object FreeCameraInputsManager {
  @scala.inline
  def apply(addGamepad: () => FreeCameraInputsManager): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addGamepad = js.Any.fromFunction0(addGamepad))
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
  @scala.inline
  implicit class FreeCameraInputsManagerOps[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddGamepad(value: () => FreeCameraInputsManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addGamepad")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

