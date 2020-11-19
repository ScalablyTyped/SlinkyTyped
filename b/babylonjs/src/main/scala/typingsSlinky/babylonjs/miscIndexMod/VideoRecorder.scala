package typingsSlinky.babylonjs.miscIndexMod

import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.videoRecorderMod.VideoRecorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends typingsSlinky.babylonjs.videoRecorderMod.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: Engine) = this()
  def this(engine: Engine, options: Nullable[VideoRecorderOptions]) = this()
}
/* static members */
@JSImport("babylonjs/Misc/index", "VideoRecorder")
@js.native
object VideoRecorder extends js.Object {
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  def IsSupported(engine: Engine): Boolean = js.native
  
  val _defaultOptions: js.Any = js.native
}
