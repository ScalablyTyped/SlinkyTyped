package typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod

import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import typingsSlinky.babylonjs.arcRotateCameraMod.ArcRotateCamera
import typingsSlinky.babylonjs.cameraInputsManagerMod.ICameraInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/Inputs/arcRotateCameraVRDeviceOrientationInput", "ArcRotateCameraVRDeviceOrientationInput")
@js.native
/**
  * Instantiate a new ArcRotateCameraVRDeviceOrientationInput.
  */
class ArcRotateCameraVRDeviceOrientationInput () extends ICameraInput[ArcRotateCamera] {
  
  var _alpha: js.Any = js.native
  
  var _deviceOrientationHandler: js.Any = js.native
  
  var _dirty: js.Any = js.native
  
  var _gamma: js.Any = js.native
  
  /** @hidden */
  def _onOrientationEvent(evt: DeviceOrientationEvent): Unit = js.native
  
  /**
    * Defines a correction factor applied on the alpha value retrieved from the orientation events.
    */
  var alphaCorrection: Double = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraVRDeviceOrientationInput: ArcRotateCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraVRDeviceOrientationInput(): Unit = js.native
  
  /**
    * Defines a correction factor applied on the gamma value retrieved from the orientation events.
    */
  var gammaCorrection: Double = js.native
}
