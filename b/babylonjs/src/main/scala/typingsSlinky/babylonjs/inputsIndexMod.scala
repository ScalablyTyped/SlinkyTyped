package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputsIndexMod {
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraGamepadInput")
  @js.native
  class ArcRotateCameraGamepadInput ()
    extends typingsSlinky.babylonjs.arcRotateCameraGamepadInputMod.ArcRotateCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraKeyboardMoveInput")
  @js.native
  class ArcRotateCameraKeyboardMoveInput ()
    extends typingsSlinky.babylonjs.arcRotateCameraKeyboardMoveInputMod.ArcRotateCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraMouseWheelInput")
  @js.native
  class ArcRotateCameraMouseWheelInput ()
    extends typingsSlinky.babylonjs.arcRotateCameraMouseWheelInputMod.ArcRotateCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput")
  @js.native
  class ArcRotateCameraPointersInput ()
    extends typingsSlinky.babylonjs.arcRotateCameraPointersInputMod.ArcRotateCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraVRDeviceOrientationInput")
  @js.native
  /**
    * Instantiate a new ArcRotateCameraVRDeviceOrientationInput.
    */
  class ArcRotateCameraVRDeviceOrientationInput ()
    extends typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.ArcRotateCameraVRDeviceOrientationInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraKeyboardInput")
  @js.native
  class FlyCameraKeyboardInput ()
    extends typingsSlinky.babylonjs.flyCameraKeyboardInputMod.FlyCameraKeyboardInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraMouseInput")
  @js.native
  /**
    * Listen to mouse events to control the camera.
    * @param touchEnabled Define if touch is enabled. (Default is true.)
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  class FlyCameraMouseInput ()
    extends typingsSlinky.babylonjs.flyCameraMouseInputMod.FlyCameraMouseInput {
    def this(touchEnabled: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraKeyboardMoveInput")
  @js.native
  class FollowCameraKeyboardMoveInput ()
    extends typingsSlinky.babylonjs.followCameraKeyboardMoveInputMod.FollowCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraMouseWheelInput")
  @js.native
  class FollowCameraMouseWheelInput ()
    extends typingsSlinky.babylonjs.followCameraMouseWheelInputMod.FollowCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraPointersInput")
  @js.native
  class FollowCameraPointersInput ()
    extends typingsSlinky.babylonjs.followCameraPointersInputMod.FollowCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput")
  @js.native
  /**
    * Instantiates a new input
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  class FreeCameraDeviceOrientationInput ()
    extends typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
  /* static members */
  object FreeCameraDeviceOrientationInput {
    
    /**
      * Can be used to detect if a device orientation sensor is available on a device
      * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
      * @returns a promise that will resolve on orientation change
      */
    @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
    @js.native
    def WaitForOrientationChangeAsync(): js.Promise[_] = js.native
    @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
    @js.native
    def WaitForOrientationChangeAsync(timeout: Double): js.Promise[_] = js.native
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraGamepadInput")
  @js.native
  class FreeCameraGamepadInput ()
    extends typingsSlinky.babylonjs.freeCameraGamepadInputMod.FreeCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraKeyboardMoveInput")
  @js.native
  class FreeCameraKeyboardMoveInput ()
    extends typingsSlinky.babylonjs.freeCameraKeyboardMoveInputMod.FreeCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseInput")
  @js.native
  /**
    * Manage the mouse inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param touchEnabled Defines if touch is enabled or not
    */
  class FreeCameraMouseInput ()
    extends typingsSlinky.babylonjs.freeCameraMouseInputMod.FreeCameraMouseInput {
    def this(/**
      * Define if touch is enabled in the mouse input
      */
    touchEnabled: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseWheelInput")
  @js.native
  class FreeCameraMouseWheelInput ()
    extends typingsSlinky.babylonjs.freeCameraMouseWheelInputMod.FreeCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraTouchInput")
  @js.native
  /**
    * Manage the touch inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param allowMouse Defines if mouse events can be treated as touch events
    */
  class FreeCameraTouchInput ()
    extends typingsSlinky.babylonjs.freeCameraTouchInputMod.FreeCameraTouchInput {
    def this(/**
      * Define if mouse events can be treated as touch events
      */
    allowMouse: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraVirtualJoystickInput")
  @js.native
  class FreeCameraVirtualJoystickInput ()
    extends typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.FreeCameraVirtualJoystickInput
  
  /* augmented module */
  object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
    
    @js.native
    trait ArcRotateCameraInputsManager extends StObject {
      
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
      implicit class ArcRotateCameraInputsManagerMutableBuilder[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddVRDeviceOrientation(
          value: () => typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
        ): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
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
        * Add virtual joystick input support to the input manager.
        * @returns the current input manager
        */
      def addVirtualJoystick(): typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    }
    object FreeCameraInputsManager {
      
      @scala.inline
      def apply(
        addDeviceOrientation: () => typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
        addVirtualJoystick: () => typingsSlinky.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick))
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      @scala.inline
      implicit class FreeCameraInputsManagerMutableBuilder[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddDeviceOrientation(
          value: () => typingsSlinky.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
        ): Self = StObject.set(x, "addDeviceOrientation", js.Any.fromFunction0(value))
        
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
}
