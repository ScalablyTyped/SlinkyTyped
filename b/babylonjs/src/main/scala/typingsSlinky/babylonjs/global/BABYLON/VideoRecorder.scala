package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.VideoRecorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends typingsSlinky.babylonjs.BABYLON.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: typingsSlinky.babylonjs.BABYLON.Engine) = this()
  def this(engine: typingsSlinky.babylonjs.BABYLON.Engine, options: Nullable[VideoRecorderOptions]) = this()
}
/* static members */
@JSGlobal("BABYLON.VideoRecorder")
@js.native
object VideoRecorder extends js.Object {
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  def IsSupported(engine: typingsSlinky.babylonjs.BABYLON.Engine): Boolean = js.native
  
  val _defaultOptions: js.Any = js.native
}
