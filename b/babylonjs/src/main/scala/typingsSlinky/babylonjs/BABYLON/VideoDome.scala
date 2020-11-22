package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoDome extends TextureDome[VideoTexture] {
  
  /* protected */ def _initTexture(urlsOrElement: HTMLVideoElement, scene: Scene, options: js.Any): VideoTexture = js.native
  
  /**
    * Get the video mode of this dome
    */
  def videoMode: Double = js.native
  /**
    * Set the video mode of this dome.
    * @see textureMode
    */
  def videoMode_=(value: Double): Unit = js.native
  
  /**
    * Get the video texture associated with this video dome
    */
  def videoTexture: VideoTexture = js.native
}
