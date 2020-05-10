package typingsSlinky.jqueryPayment.JQueryPayment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardInfo extends js.Object {
  /**
    * Array of valid card CVC lengths.
    */
  var cvcLength: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Regex used to format the card number. Each match is joined with a space.
    */
  var format: js.UndefOr[js.RegExp] = js.native
  /**
    * Array of valid card number lengths.
    */
  var length: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Boolean indicating whether a valid card number should satisfy the Luhn check.
    */
  var luhn: js.UndefOr[Boolean] = js.native
  /**
    * Regex used to identify the card type. For the best experience, this should be
    * the shortest pattern that can guarantee the card is of a particular type.
    */
  var pattern: js.UndefOr[js.RegExp] = js.native
  /**
    * Array of prefixes used to identify the card type.
    */
  var patterns: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Card type
    */
  var `type`: js.UndefOr[String] = js.native
}

object CardInfo {
  @scala.inline
  def apply(): CardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardInfo]
  }
  @scala.inline
  implicit class CardInfoOps[Self <: CardInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCvcLength(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvcLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCvcLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cvcLength")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLuhn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luhn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLuhn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luhn")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPatterns(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

