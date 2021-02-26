package typingsSlinky.babylonjs.materialsIndexMod

import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.HTMLVideoElement
import typingsSlinky.babylonjs.htmlElementTextureMod.IHtmlElementTextureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "HtmlElementTexture")
@js.native
class HtmlElementTexture protected ()
  extends typingsSlinky.babylonjs.texturesIndexMod.HtmlElementTexture {
  def this(name: String, element: HTMLCanvasElement, options: IHtmlElementTextureOptions) = this()
  /**
    * Instantiates a HtmlElementTexture from the following parameters.
    *
    * @param name Defines the name of the texture
    * @param element Defines the video or canvas the texture is filled with
    * @param options Defines the other none mandatory texture creation options
    */
  def this(name: String, element: HTMLVideoElement, options: IHtmlElementTextureOptions) = this()
}
/* static members */
object HtmlElementTexture {
  
  @JSImport("babylonjs/Materials/index", "HtmlElementTexture.DefaultOptions")
  @js.native
  val DefaultOptions: js.Any = js.native
}
