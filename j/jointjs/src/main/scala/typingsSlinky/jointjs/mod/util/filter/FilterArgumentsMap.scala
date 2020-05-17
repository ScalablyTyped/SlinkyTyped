package typingsSlinky.jointjs.mod.util.filter

import typingsSlinky.jointjs.anon.Amount
import typingsSlinky.jointjs.anon.Angle
import typingsSlinky.jointjs.anon.Blur
import typingsSlinky.jointjs.anon.Dx
import typingsSlinky.jointjs.anon.Margin
import typingsSlinky.jointjs.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterArgumentsMap extends js.Object {
  var blur: Y = js.native
  var brightness: Amount = js.native
  var contrast: Amount = js.native
  var dropShadow: Dx = js.native
  var grayscale: Amount = js.native
  var highlight: Blur = js.native
  var hueRotate: Angle = js.native
  var invert: Amount = js.native
  var outline: Margin = js.native
  var saturate: Amount = js.native
  var sepia: Amount = js.native
}

object FilterArgumentsMap {
  @scala.inline
  def apply(
    blur: Y,
    brightness: Amount,
    contrast: Amount,
    dropShadow: Dx,
    grayscale: Amount,
    highlight: Blur,
    hueRotate: Angle,
    invert: Amount,
    outline: Margin,
    saturate: Amount,
    sepia: Amount
  ): FilterArgumentsMap = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], grayscale = grayscale.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], hueRotate = hueRotate.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], saturate = saturate.asInstanceOf[js.Any], sepia = sepia.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterArgumentsMap]
  }
  @scala.inline
  implicit class FilterArgumentsMapOps[Self <: FilterArgumentsMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: Y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrast(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropShadow(value: Dx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrayscale(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlight(value: Blur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHueRotate(value: Angle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hueRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvert(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutline(value: Margin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturate(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSepia(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sepia")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

