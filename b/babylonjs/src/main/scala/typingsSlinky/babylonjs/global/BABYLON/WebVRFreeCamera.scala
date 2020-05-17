package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.WebVROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebVRFreeCamera")
@js.native
class WebVRFreeCamera protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebVRFreeCamera {
  /**
    * Instantiates a WebVRFreeCamera.
    * @param name The name of the WebVRFreeCamera
    * @param position The starting anchor position for the camera
    * @param scene The scene the camera belongs to
    * @param webVROptions a set of customizable options for the webVRCamera
    */
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    position: typingsSlinky.babylonjs.BABYLON.Vector3,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    webVROptions: WebVROptions
  ) = this()
}

