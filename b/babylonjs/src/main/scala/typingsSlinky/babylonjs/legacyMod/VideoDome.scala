package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.HTMLVideoElement
import typingsSlinky.babylonjs.anon.AutoPlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "VideoDome")
@js.native
class VideoDome protected ()
  extends typingsSlinky.babylonjs.indexMod.VideoDome {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes, VideoTexture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param urlsOrVideo defines the url(s) or the video element to use
    * @param options An object containing optional or exposed sub element properties
    */
  def this(
    name: String,
    urlsOrVideo: String,
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    urlsOrVideo: js.Array[String],
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    urlsOrVideo: HTMLVideoElement,
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "VideoDome")
@js.native
object VideoDome extends js.Object {
  
  /**
    * Define the video source as a Monoscopic panoramic 360 video.
    */
  val MODE_MONOSCOPIC: Double = js.native
  
  /**
    * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
    */
  val MODE_SIDEBYSIDE: Double = js.native
  
  /**
    * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
    */
  val MODE_TOPBOTTOM: Double = js.native
}
