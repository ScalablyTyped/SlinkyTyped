package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentParsingFlags extends js.Object {
  var charsLeftOver: Double = js.native
  var empty: Boolean = js.native
   // null
  var invalidFormat: Boolean = js.native
  var invalidMonth: String | Unit = js.native
  var iso: Boolean = js.native
  var meridiem: String | Unit = js.native
  var nullInput: Boolean = js.native
  var overflow: Double = js.native
  var parsedDateParts: js.Array[_] = js.native
  var unusedInput: js.Array[String] = js.native
  var unusedTokens: js.Array[String] = js.native
  var userInvalidated: Boolean = js.native
}

object MomentParsingFlags {
  @scala.inline
  def apply(
    charsLeftOver: Double,
    empty: Boolean,
    invalidFormat: Boolean,
    invalidMonth: String | Unit,
    iso: Boolean,
    meridiem: String | Unit,
    nullInput: Boolean,
    overflow: Double,
    parsedDateParts: js.Array[_],
    unusedInput: js.Array[String],
    unusedTokens: js.Array[String],
    userInvalidated: Boolean
  ): MomentParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], invalidFormat = invalidFormat.asInstanceOf[js.Any], invalidMonth = invalidMonth.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], nullInput = nullInput.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], parsedDateParts = parsedDateParts.asInstanceOf[js.Any], unusedInput = unusedInput.asInstanceOf[js.Any], unusedTokens = unusedTokens.asInstanceOf[js.Any], userInvalidated = userInvalidated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentParsingFlags]
  }
  @scala.inline
  implicit class MomentParsingFlagsOps[Self <: MomentParsingFlags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharsLeftOver(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsLeftOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidMonth(value: String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeridiem(value: String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsedDateParts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedDateParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnusedInput(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnusedTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInvalidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInvalidated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

