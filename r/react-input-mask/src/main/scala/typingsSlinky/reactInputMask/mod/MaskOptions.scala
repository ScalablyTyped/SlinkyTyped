package typingsSlinky.reactInputMask.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskOptions extends js.Object {
  var alwaysShowMask: Boolean = js.native
  var formatChars: Record[String, String] = js.native
  var mask: String | (js.Array[String | js.RegExp]) = js.native
  var maskChar: String = js.native
  var permanents: js.Array[Double] = js.native
}

object MaskOptions {
  @scala.inline
  def apply(
    alwaysShowMask: Boolean,
    formatChars: Record[String, String],
    mask: String | (js.Array[String | js.RegExp]),
    maskChar: String,
    permanents: js.Array[Double]
  ): MaskOptions = {
    val __obj = js.Dynamic.literal(alwaysShowMask = alwaysShowMask.asInstanceOf[js.Any], formatChars = formatChars.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskChar = maskChar.asInstanceOf[js.Any], permanents = permanents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskOptions]
  }
  @scala.inline
  implicit class MaskOptionsOps[Self <: MaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysShowMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysShowMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatChars(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: String | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermanents(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

