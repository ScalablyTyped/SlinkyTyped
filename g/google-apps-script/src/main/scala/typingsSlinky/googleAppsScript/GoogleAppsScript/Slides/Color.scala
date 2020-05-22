package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.RgbColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An opaque color
  */
trait Color extends js.Object {
  def asRgbColor(): RgbColor
  def asThemeColor(): ThemeColor
  def getColorType(): ColorType
}

object Color {
  @scala.inline
  def apply(asRgbColor: () => RgbColor, asThemeColor: () => ThemeColor, getColorType: () => ColorType): Color = {
    val __obj = js.Dynamic.literal(asRgbColor = js.Any.fromFunction0(asRgbColor), asThemeColor = js.Any.fromFunction0(asThemeColor), getColorType = js.Any.fromFunction0(getColorType))
    __obj.asInstanceOf[Color]
  }
}

