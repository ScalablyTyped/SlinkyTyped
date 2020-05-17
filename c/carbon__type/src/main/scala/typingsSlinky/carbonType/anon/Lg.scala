package typingsSlinky.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lg extends js.Object {
  var fontFamily: String = js.native
  var fontSize: String = js.native
  var fontWeight: Double = js.native
  var letterSpacing: Double = js.native
  var lg: LineHeight = js.native
  var lineHeight: String = js.native
  var max: LineHeight = js.native
}

object Lg {
  @scala.inline
  def apply(
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lg: LineHeight,
    lineHeight: String,
    max: LineHeight
  ): Lg = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
  @scala.inline
  implicit class LgOps[Self <: Lg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLg(value: LineHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: LineHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

