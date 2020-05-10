package typingsSlinky.babylonjs.xRIndexMod

import typingsSlinky.babylonjs.XRInputSource
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.webXRInputSourceMod.IWebXRControllerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/index", "WebXRInputSource")
@js.native
class WebXRInputSource protected ()
  extends typingsSlinky.babylonjs.webXRInputSourceMod.WebXRInputSource {
  /**
    * Creates the controller
    * @see https://doc.babylonjs.com/how_to/webxr
    * @param _scene the scene which the controller should be associated to
    * @param inputSource the underlying input source for the controller
    * @param _options options for this controller creation
    */
  def this(_scene: Scene, /** The underlying input source for the controller  */
  inputSource: XRInputSource) = this()
  def this(
    _scene: Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource,
    _options: IWebXRControllerOptions
  ) = this()
}

