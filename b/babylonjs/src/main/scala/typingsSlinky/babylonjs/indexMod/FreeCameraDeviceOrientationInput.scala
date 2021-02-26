package typingsSlinky.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "FreeCameraDeviceOrientationInput")
@js.native
/**
  * Instantiates a new input
  * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
class FreeCameraDeviceOrientationInput ()
  extends typingsSlinky.babylonjs.babylonjsMod.FreeCameraDeviceOrientationInput
/* static members */
object FreeCameraDeviceOrientationInput {
  
  /**
    * Can be used to detect if a device orientation sensor is available on a device
    * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
    * @returns a promise that will resolve on orientation change
    */
  @JSImport("babylonjs/index", "FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
  @js.native
  def WaitForOrientationChangeAsync(): js.Promise[_] = js.native
  @JSImport("babylonjs/index", "FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
  @js.native
  def WaitForOrientationChangeAsync(timeout: Double): js.Promise[_] = js.native
}
