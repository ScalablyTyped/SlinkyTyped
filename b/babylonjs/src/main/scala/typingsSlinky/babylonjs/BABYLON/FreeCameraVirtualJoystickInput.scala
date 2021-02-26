package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraVirtualJoystickInput extends ICameraInput[FreeCamera] {
  
  var _leftjoystick: js.Any = js.native
  
  var _rightjoystick: js.Any = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraVirtualJoystickInput: FreeCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraVirtualJoystickInput(): Unit = js.native
  
  /**
    * Gets the left stick of the virtual joystick.
    * @returns The virtual Joystick
    */
  def getLeftJoystick(): VirtualJoystick = js.native
  
  /**
    * Gets the right stick of the virtual joystick.
    * @returns The virtual Joystick
    */
  def getRightJoystick(): VirtualJoystick = js.native
}
