package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.webVRCameraMod.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebVRFreeCamera")
@js.native
class WebVRFreeCamera protected ()
  extends typingsSlinky.babylonjs.legacyMod.WebVRFreeCamera {
  /**
    * Instantiates a WebVRFreeCamera.
    * @param name The name of the WebVRFreeCamera
    * @param position The starting anchor position for the camera
    * @param scene The scene the camera belongs to
    * @param webVROptions a set of customizable options for the webVRCamera
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    webVROptions: WebVROptions
  ) = this()
}

