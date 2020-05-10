package typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for ColorBuilder. To create a new builder, use SpreadsheetApp.newColor().
  */
@js.native
trait ColorBuilder extends js.Object {
  def asRgbColor(): RgbColor = js.native
  def asThemeColor(): ThemeColor = js.native
  def build(): Color = js.native
  def getColorType(): ColorType = js.native
  def setRgbColor(cssString: String): ColorBuilder = js.native
  def setThemeColor(themeColorType: ThemeColorType): ColorBuilder = js.native
}

object ColorBuilder {
  @scala.inline
  def apply(
    asRgbColor: () => RgbColor,
    asThemeColor: () => ThemeColor,
    build: () => Color,
    getColorType: () => ColorType,
    setRgbColor: String => ColorBuilder,
    setThemeColor: ThemeColorType => ColorBuilder
  ): ColorBuilder = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), build = js.Any.fromFunction0(build), getColorType = js.Any.fromFunction0(getColorType), setRgbColor = js.Any.fromFunction1(setRgbColor), setThemeColor = js.Any.fromFunction1(setThemeColor))
    __obj.asInstanceOf[ColorBuilder]
  }
  @scala.inline
  implicit class ColorBuilderOps[Self <: ColorBuilder] (val x: Self) extends AnyVal {
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
    def withBuild(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColorType(value: () => ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetRgbColor(value: String => ColorBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRgbColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetThemeColor(value: ThemeColorType => ColorBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setThemeColor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

