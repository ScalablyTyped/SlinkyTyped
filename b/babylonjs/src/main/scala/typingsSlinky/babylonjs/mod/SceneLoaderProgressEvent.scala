package typingsSlinky.babylonjs.mod

import org.scalajs.dom.raw.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "SceneLoaderProgressEvent")
@js.native
class SceneLoaderProgressEvent protected ()
  extends typingsSlinky.babylonjs.legacyMod.SceneLoaderProgressEvent {
  /**
    * Create a new progress event
    * @param lengthComputable defines if data length to load can be evaluated
    * @param loaded defines the loaded data length
    * @param total defines the data length to load
    */
  def this(
    /** defines if data length to load can be evaluated */
  lengthComputable: Boolean,
    /** defines the loaded data length */
  loaded: Double,
    /** defines the data length to load */
  total: Double
  ) = this()
}

/* static members */
@JSImport("babylonjs", "SceneLoaderProgressEvent")
@js.native
object SceneLoaderProgressEvent extends js.Object {
  /**
    * Creates a new SceneLoaderProgressEvent from a ProgressEvent
    * @param event defines the source event
    * @returns a new SceneLoaderProgressEvent
    */
  def FromProgressEvent(event: ProgressEvent): typingsSlinky.babylonjs.sceneLoaderMod.SceneLoaderProgressEvent = js.native
}

