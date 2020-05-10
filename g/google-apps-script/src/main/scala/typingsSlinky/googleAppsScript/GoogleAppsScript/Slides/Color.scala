package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An opaque color
  */
@js.native
trait Color extends js.Object {
  def asRgbColor(): RgbColor = js.native
  def asThemeColor(): ThemeColor = js.native
  def getColorType(): ColorType = js.native
}

object Color {
  @scala.inline
  def apply(asRgbColor: () => RgbColor, asThemeColor: () => ThemeColor, getColorType: () => ColorType): Color = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), getColorType = js.Any.fromFunction0(getColorType))
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsRgbColor(value: () => RgbColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asRgbColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsThemeColor(value: () => ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asThemeColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColorType(value: () => ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

