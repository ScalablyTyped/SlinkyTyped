package typingsSlinky.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod

import typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a free camera inputs manager
  */
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
  def addDeviceOrientation(): typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
  
  /**
    * Adds gamepad input support to the FreeCameraInputsManager.
    * @returns the FreeCameraInputsManager
    */
  def addGamepad(): typingsSlinky.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
  
  /**
    * Add virtual joystick input support to the input manager.
    * @returns the current input manager
    */
  def addVirtualJoystick(): typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
}
object FreeCameraInputsManager {
  
  @scala.inline
  def apply(
    addDeviceOrientation: () => typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
    addGamepad: () => typingsSlinky.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
    addVirtualJoystick: () => typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
  ): FreeCameraInputsManager = {
    val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addGamepad = js.Any.fromFunction0(addGamepad), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick))
    __obj.asInstanceOf[FreeCameraInputsManager]
  }
  
  @scala.inline
  implicit class FreeCameraInputsManagerOps[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddDeviceOrientation(
      value: () => typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    ): Self = this.set("addDeviceOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddGamepad(
      value: () => typingsSlinky.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    ): Self = this.set("addGamepad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddVirtualJoystick(
      value: () => typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    ): Self = this.set("addVirtualJoystick", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_deviceOrientationInput(value: Nullable[FreeCameraDeviceOrientationInput]): Self = this.set("_deviceOrientationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_deviceOrientationInputNull: Self = this.set("_deviceOrientationInput", null)
  }
}
