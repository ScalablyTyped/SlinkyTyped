package typingsSlinky.googleAppsScript.GoogleAppsScript.Base

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color defined by red, green, blue color channels.
  */
@js.native
trait RgbColor extends js.Object {
  def asHexString(): String = js.native
  def getBlue(): Integer = js.native
  def getColorType(): ColorType = js.native
  def getGreen(): Integer = js.native
  def getRed(): Integer = js.native
}

object RgbColor {
  @scala.inline
  def apply(
    asHexString: () => String,
    getBlue: () => Integer,
    getColorType: () => ColorType,
    getGreen: () => Integer,
    getRed: () => Integer
  ): RgbColor = {
    val __obj = js.Dynamic.literal(asHexString = js.Any.fromFunction0(asHexString), getBlue = js.Any.fromFunction0(getBlue), getColorType = js.Any.fromFunction0(getColorType), getGreen = js.Any.fromFunction0(getGreen), getRed = js.Any.fromFunction0(getRed))
    __obj.asInstanceOf[RgbColor]
  }
  @scala.inline
  implicit class RgbColorOps[Self <: RgbColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsHexString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asHexString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBlue(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColorType(value: () => ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGreen(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRed(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRed")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

