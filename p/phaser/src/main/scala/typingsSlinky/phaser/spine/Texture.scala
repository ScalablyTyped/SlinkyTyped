package typingsSlinky.phaser.spine

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Texture extends js.Object {
  var _image: HTMLImageElement = js.native
  def dispose(): Unit = js.native
  def getImage(): HTMLImageElement = js.native
  def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): Unit = js.native
  def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): Unit = js.native
}

object Texture {
  @scala.inline
  def apply(
    _image: HTMLImageElement,
    dispose: () => Unit,
    getImage: () => HTMLImageElement,
    setFilters: (TextureFilter, TextureFilter) => Unit,
    setWraps: (TextureWrap, TextureWrap) => Unit
  ): Texture = {
    val __obj = js.Dynamic.literal(_image = _image.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getImage = js.Any.fromFunction0(getImage), setFilters = js.Any.fromFunction2(setFilters), setWraps = js.Any.fromFunction2(setWraps))
    __obj.asInstanceOf[Texture]
  }
  @scala.inline
  implicit class TextureOps[Self <: Texture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_image(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImage(value: () => HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFilters(value: (TextureFilter, TextureFilter) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetWraps(value: (TextureWrap, TextureWrap) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWraps")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

