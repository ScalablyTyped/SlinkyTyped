package typingsSlinky.babylonjs.sceneLoaderMod

import org.scalajs.dom.raw.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Loading/sceneLoader", "SceneLoaderProgressEvent")
@js.native
class SceneLoaderProgressEvent protected () extends js.Object {
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
  
  /** defines if data length to load can be evaluated */
  val lengthComputable: Boolean = js.native
  
  /** defines the loaded data length */
  val loaded: Double = js.native
  
  /** defines the data length to load */
  val total: Double = js.native
}
/* static members */
@JSImport("babylonjs/Loading/sceneLoader", "SceneLoaderProgressEvent")
@js.native
object SceneLoaderProgressEvent extends js.Object {
  
  /**
    * Creates a new SceneLoaderProgressEvent from a ProgressEvent
    * @param event defines the source event
    * @returns a new SceneLoaderProgressEvent
    */
  def FromProgressEvent(event: ProgressEvent): SceneLoaderProgressEvent = js.native
}
