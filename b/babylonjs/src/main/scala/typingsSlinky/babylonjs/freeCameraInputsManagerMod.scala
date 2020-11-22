package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraInputsManagerMod.CameraInputsManager
import typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
import typingsSlinky.babylonjs.freeCameraMod.FreeCamera
import typingsSlinky.babylonjs.freeCameraMouseInputMod.FreeCameraMouseInput
import typingsSlinky.babylonjs.freeCameraMouseWheelInputMod.FreeCameraMouseWheelInput
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/freeCameraInputsManager", JSImport.Namespace)
@js.native
object freeCameraInputsManagerMod extends js.Object {
  
  /**
    * Interface representing a free camera inputs manager
    */
  @js.native
  class FreeCameraInputsManager protected () extends CameraInputsManager[FreeCamera] {
    /**
      * Instantiates a new FreeCameraInputsManager.
      * @param camera Defines the camera the inputs belong to
      */
    def this(camera: FreeCamera) = this()
    
    /**
      * @hidden
      */
    var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = js.native
    
    /**
      * @hidden
      */
    var _mouseInput: Nullable[FreeCameraMouseInput] = js.native
    
    /**
      * @hidden
      */
    var _mouseWheelInput: Nullable[FreeCameraMouseWheelInput] = js.native
    
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
      * Add keyboard input support to the input manager.
      * @returns the current input manager
      */
    def addKeyboard(): FreeCameraInputsManager = js.native
    
    /**
      * Add mouse input support to the input manager.
      * @param touchEnabled if the FreeCameraMouseInput should support touch (default: true)
      * @returns the current input manager
      */
    def addMouse(): FreeCameraInputsManager = js.native
    def addMouse(touchEnabled: Boolean): FreeCameraInputsManager = js.native
    
    /**
      * Add mouse wheel input support to the input manager.
      * @returns the current input manager
      */
    def addMouseWheel(): FreeCameraInputsManager = js.native
    
    /**
      * Add touch input support to the input manager.
      * @returns the current input manager
      */
    def addTouch(): FreeCameraInputsManager = js.native
    
    /**
      * Add virtual joystick input support to the input manager.
      * @returns the current input manager
      */
    def addVirtualJoystick(): typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    
    /**
      * Removes the mouse input support from the manager
      * @returns the current input manager
      */
    def removeMouse(): FreeCameraInputsManager = js.native
    
    /**
      * Removes the mouse wheel input support from the manager
      * @returns the current input manager
      */
    def removeMouseWheel(): FreeCameraInputsManager = js.native
  }
}
