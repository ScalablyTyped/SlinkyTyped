package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureAtlasPage extends js.Object {
  var baseTexture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any = js.native
  var height: Double = js.native
  var magFilter: TextureFilter = js.native
  var minFilter: TextureFilter = js.native
  var name: String = js.native
  var uWrap: TextureWrap = js.native
  var vWrap: TextureWrap = js.native
  var width: Double = js.native
  def setFilters(): Unit = js.native
}

object TextureAtlasPage {
  @scala.inline
  def apply(
    baseTexture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any,
    height: Double,
    magFilter: TextureFilter,
    minFilter: TextureFilter,
    name: String,
    setFilters: () => Unit,
    uWrap: TextureWrap,
    vWrap: TextureWrap,
    width: Double
  ): TextureAtlasPage = {
    val __obj = js.Dynamic.literal(baseTexture = baseTexture.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFilters = js.Any.fromFunction0(setFilters), uWrap = uWrap.asInstanceOf[js.Any], vWrap = vWrap.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasPage]
  }
  @scala.inline
  implicit class TextureAtlasPageOps[Self <: TextureAtlasPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseTexture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagFilter(value: TextureFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinFilter(value: TextureFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFilters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUWrap(value: TextureWrap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVWrap(value: TextureWrap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

