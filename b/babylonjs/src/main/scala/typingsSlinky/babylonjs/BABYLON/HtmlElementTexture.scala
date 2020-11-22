package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlElementTexture extends BaseTexture {
  
  var _createInternalTexture: js.Any = js.native
  
  var _generateMipMaps: js.Any = js.native
  
  var _isVideo: js.Any = js.native
  
  var _samplingMode: js.Any = js.native
  
  var _textureMatrix: js.Any = js.native
  
  /**
    * The texture URL.
    */
  var element: HTMLVideoElement | HTMLCanvasElement = js.native
  
  /**
    * Updates the content of the texture.
    * @param invertY Defines wether the texture should be inverted on Y (false by default on video and true on canvas)
    */
  def update(): Unit = js.native
  def update(invertY: Nullable[Boolean]): Unit = js.native
}
