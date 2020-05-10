package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkTextStyle extends js.Object {
  var backgroundColor: SkColor = js.native
  var color: SkColor = js.native
  var decoration: SkDecoration = js.native
  var decorationThickness: Double = js.native
  var fontFamilies: js.Array[String] = js.native
  var fontSize: Double = js.native
  var fontStyle: FontStyle = js.native
  var foregroundColor: SkColor = js.native
}

object SkTextStyle {
  @scala.inline
  def apply(
    backgroundColor: SkColor,
    color: SkColor,
    decoration: SkDecoration,
    decorationThickness: Double,
    fontFamilies: js.Array[String],
    fontSize: Double,
    fontStyle: FontStyle,
    foregroundColor: SkColor
  ): SkTextStyle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any], decorationThickness = decorationThickness.asInstanceOf[js.Any], fontFamilies = fontFamilies.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkTextStyle]
  }
  @scala.inline
  implicit class SkTextStyleOps[Self <: SkTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: SkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: SkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoration(value: SkDecoration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecorationThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorationThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamilies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamilies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundColor(value: SkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

