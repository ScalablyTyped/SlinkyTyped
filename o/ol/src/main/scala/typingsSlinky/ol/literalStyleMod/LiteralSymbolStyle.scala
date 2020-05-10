package typingsSlinky.ol.literalStyleMod

import typingsSlinky.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiteralSymbolStyle extends js.Object {
  var color: js.UndefOr[Color | js.Array[ExpressionValue] | String] = js.native
  var offset: js.UndefOr[js.Array[ExpressionValue]] = js.native
  var opacity: js.UndefOr[ExpressionValue] = js.native
  var rotateWithView: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[ExpressionValue] = js.native
  var size: ExpressionValue | js.Array[ExpressionValue] = js.native
  var src: js.UndefOr[String] = js.native
  var symbolType: SymbolType = js.native
  var textureCoord: js.UndefOr[js.Array[ExpressionValue]] = js.native
}

object LiteralSymbolStyle {
  @scala.inline
  def apply(size: ExpressionValue | js.Array[ExpressionValue], symbolType: SymbolType): LiteralSymbolStyle = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralSymbolStyle]
  }
  @scala.inline
  implicit class LiteralSymbolStyleOps[Self <: LiteralSymbolStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: ExpressionValue | js.Array[ExpressionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolType(value: SymbolType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color | js.Array[ExpressionValue] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Array[ExpressionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: ExpressionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateWithView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateWithView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateWithView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateWithView")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: ExpressionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withTextureCoord(value: js.Array[ExpressionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCoord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextureCoord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureCoord")(js.undefined)
        ret
    }
  }
  
}

