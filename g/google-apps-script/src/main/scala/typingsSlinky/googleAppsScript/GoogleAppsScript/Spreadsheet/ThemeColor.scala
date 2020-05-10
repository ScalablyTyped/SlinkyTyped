package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation for a theme color.
  */
@js.native
trait ThemeColor extends js.Object {
  def getColorType(): ColorType = js.native
  def getThemeColorType(): ThemeColorType = js.native
}

object ThemeColor {
  @scala.inline
  def apply(getColorType: () => ColorType, getThemeColorType: () => ThemeColorType): ThemeColor = {
    val __obj = js.Dynamic.literal(getColorType = js.Any.fromFunction0(getColorType), getThemeColorType = js.Any.fromFunction0(getThemeColorType))
    __obj.asInstanceOf[ThemeColor]
  }
  @scala.inline
  implicit class ThemeColorOps[Self <: ThemeColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColorType(value: () => ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThemeColorType(value: () => ThemeColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThemeColorType")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

