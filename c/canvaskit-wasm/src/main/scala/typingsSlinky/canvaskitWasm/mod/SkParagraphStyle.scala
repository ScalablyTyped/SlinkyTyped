package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkParagraphStyle extends js.Object {
  var disableHinting: Boolean = js.native
  var heightMultiplier: Double = js.native
  var maxLines: Double = js.native
  var textAlign: SkTextAlign = js.native
  var textDirection: SkTextDirection = js.native
  var textStyle: SkTextStyle = js.native
}

object SkParagraphStyle {
  @scala.inline
  def apply(
    disableHinting: Boolean,
    heightMultiplier: Double,
    maxLines: Double,
    textAlign: SkTextAlign,
    textDirection: SkTextDirection,
    textStyle: SkTextStyle
  ): SkParagraphStyle = {
    val __obj = js.Dynamic.literal(disableHinting = disableHinting.asInstanceOf[js.Any], heightMultiplier = heightMultiplier.asInstanceOf[js.Any], maxLines = maxLines.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkParagraphStyle]
  }
  @scala.inline
  implicit class SkParagraphStyleOps[Self <: SkParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableHinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: SkTextAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDirection(value: SkTextDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextStyle(value: SkTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

