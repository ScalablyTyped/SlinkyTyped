package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.HTMLVideoElement
import typingsSlinky.babylonjs.anon.AutoPlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TextureDome")
@js.native
abstract class TextureDome[T /* <: typingsSlinky.babylonjs.BABYLON.Texture */] protected ()
  extends typingsSlinky.babylonjs.BABYLON.TextureDome[T] {
  /**
    * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
    * @param name Element's name, child elements will append suffixes for their own names.
    * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
    * @param options An object containing optional or exposed sub element properties
    */
  def this(
    name: String,
    textureUrlOrElement: String,
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: String,
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: js.Array[String],
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
  def this(
    name: String,
    textureUrlOrElement: HTMLVideoElement,
    options: AutoPlay,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
}
/* static members */
object TextureDome {
  
  /**
    * Define the source as a Monoscopic panoramic 360/180.
    */
  @JSGlobal("BABYLON.TextureDome.MODE_MONOSCOPIC")
  @js.native
  val MODE_MONOSCOPIC: Double = js.native
  
  /**
    * Define the source as a Stereoscopic Side by Side panoramic 360/180.
    */
  @JSGlobal("BABYLON.TextureDome.MODE_SIDEBYSIDE")
  @js.native
  val MODE_SIDEBYSIDE: Double = js.native
  
  /**
    * Define the source as a Stereoscopic TopBottom/OverUnder panoramic 360/180.
    */
  @JSGlobal("BABYLON.TextureDome.MODE_TOPBOTTOM")
  @js.native
  val MODE_TOPBOTTOM: Double = js.native
}
