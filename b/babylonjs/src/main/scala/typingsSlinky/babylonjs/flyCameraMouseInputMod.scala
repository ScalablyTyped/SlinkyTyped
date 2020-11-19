package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraInputsManagerMod.ICameraInput
import typingsSlinky.babylonjs.flyCameraMod.FlyCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/Inputs/flyCameraMouseInput", JSImport.Namespace)
@js.native
object flyCameraMouseInputMod extends js.Object {
  
  @js.native
  /**
    * Listen to mouse events to control the camera.
    * @param touchEnabled Define if touch is enabled. (Default is true.)
    * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  class FlyCameraMouseInput () extends ICameraInput[FlyCamera] {
    def this(touchEnabled: Boolean) = this()
    
    var _mousemoveCallback: js.Any = js.native
    
    var _observer: js.Any = js.native
    
    var _onMouseMove: js.Any = js.native
    
    var _pointerInput: js.Any = js.native
    
    var _rollObserver: js.Any = js.native
    
    /**
      * Detect if any button is being pressed while mouse is moved.
      * -1 = Mouse locked.
      * 0 = Left button.
      * 1 = Middle Button.
      * 2 = Right Button.
      */
    var activeButton: Double = js.native
    
    /**
      * Defines the pointer's angular sensibility, to control the camera rotation speed.
      * Higher values reduce its sensitivity.
      */
    var angularSensibility: Double = js.native
    
    /**
      * Defines the buttons associated with the input to handle camera rotation.
      */
    var buttons: js.Array[Double] = js.native
    
    /**
      * Assign buttons for Pitch control.
      */
    var buttonsPitch: js.Array[Double] = js.native
    
    /**
      * Assign buttons for Roll control.
      */
    var buttonsRoll: js.Array[Double] = js.native
    
    /**
      * Assign buttons for Yaw control.
      */
    var buttonsYaw: js.Array[Double] = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FlyCameraMouseInput: FlyCamera = js.native
    
    var element: js.Any = js.native
    
    var noPreventDefault: js.Any = js.native
    
    var previousPosition: js.Any = js.native
    
    /**
      * Rotate camera by mouse offset.
      */
    var rotateCamera: js.Any = js.native
    
    /**
      * Defines if touch is enabled. (Default is true.)
      */
    var touchEnabled: Boolean = js.native
  }
}
