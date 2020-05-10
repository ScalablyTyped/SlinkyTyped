package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentParsingFlagsOpt extends js.Object {
  var charsLeftOver: js.UndefOr[Double] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var invalidFormat: js.UndefOr[Boolean] = js.native
  var invalidMonth: js.UndefOr[String] = js.native
  var iso: js.UndefOr[Boolean] = js.native
  var meridiem: js.UndefOr[String] = js.native
  var nullInput: js.UndefOr[Boolean] = js.native
  var overflow: js.UndefOr[Double] = js.native
  var parsedDateParts: js.UndefOr[js.Array[_]] = js.native
  var unusedInput: js.UndefOr[js.Array[String]] = js.native
  var unusedTokens: js.UndefOr[js.Array[String]] = js.native
  var userInvalidated: js.UndefOr[Boolean] = js.native
}

object MomentParsingFlagsOpt {
  @scala.inline
  def apply(): MomentParsingFlagsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MomentParsingFlagsOpt]
  }
  @scala.inline
  implicit class MomentParsingFlagsOptOps[Self <: MomentParsingFlagsOpt] (val x: Self) extends AnyVal {
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
    def withoutCharsLeftOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsLeftOver")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withIso(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridiem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridiem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiem")(js.undefined)
        ret
    }
    @scala.inline
    def withNullInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withParsedDateParts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedDateParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsedDateParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedDateParts")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedInput(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedInput")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInvalidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInvalidated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInvalidated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInvalidated")(js.undefined)
        ret
    }
  }
  
}

