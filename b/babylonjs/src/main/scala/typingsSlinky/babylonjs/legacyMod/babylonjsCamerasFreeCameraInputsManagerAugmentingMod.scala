package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
  
  /**
    * Interface representing a free camera inputs manager
    */
  @js.native
  trait FreeCameraInputsManager extends StObject {
    
    /**
      * @hidden
      */
    var _deviceOrientationInput: Nullable[
        typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
      ] = js.native
    
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
    ): typingsSlinky.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = {
      val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addGamepad = js.Any.fromFunction0(addGamepad), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick))
      __obj.asInstanceOf[typingsSlinky.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager]
    }
    
    @scala.inline
    implicit class FreeCameraInputsManagerMutableBuilder[Self <: typingsSlinky.babylonjs.legacyMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDeviceOrientation(
        value: () => typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addDeviceOrientation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddGamepad(
        value: () => typingsSlinky.babylonjs.gamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addGamepad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddVirtualJoystick(
        value: () => typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): Self = StObject.set(x, "addVirtualJoystick", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_deviceOrientationInput(
        value: Nullable[
              typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
            ]
      ): Self = StObject.set(x, "_deviceOrientationInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_deviceOrientationInputNull: Self = StObject.set(x, "_deviceOrientationInput", null)
    }
  }
}
