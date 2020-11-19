package typingsSlinky.phaser.spine.canvas

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.phaser.spine.Texture
import typingsSlinky.phaser.spine.TextureFilter
import typingsSlinky.phaser.spine.TextureWrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasTexture extends Texture
object CanvasTexture {
  
  @scala.inline
  def apply(
    _image: HTMLImageElement,
    dispose: () => Unit,
    getImage: () => HTMLImageElement,
    setFilters: (TextureFilter, TextureFilter) => Unit,
    setWraps: (TextureWrap, TextureWrap) => Unit
  ): CanvasTexture = {
    val __obj = js.Dynamic.literal(_image = _image.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getImage = js.Any.fromFunction0(getImage), setFilters = js.Any.fromFunction2(setFilters), setWraps = js.Any.fromFunction2(setWraps))
    __obj.asInstanceOf[CanvasTexture]
  }
}
