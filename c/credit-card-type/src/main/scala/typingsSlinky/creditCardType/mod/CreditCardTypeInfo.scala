package typingsSlinky.creditCardType.mod

import typingsSlinky.creditCardType.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditCardTypeInfo extends js.Object {
  var code: js.UndefOr[AnonName] = js.native
  var exactPattern: js.UndefOr[js.RegExp] = js.native
  var gaps: js.UndefOr[js.Array[Double]] = js.native
  var lengths: js.UndefOr[js.Array[Double]] = js.native
  var niceType: js.UndefOr[String] = js.native
  var prefixPattern: js.UndefOr[js.RegExp] = js.native
  var `type`: js.UndefOr[CardBrand] = js.native
}

object CreditCardTypeInfo {
  @scala.inline
  def apply(): CreditCardTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditCardTypeInfo]
  }
  @scala.inline
  implicit class CreditCardTypeInfoOps[Self <: CreditCardTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withExactPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withGaps(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gaps")(js.undefined)
        ret
    }
    @scala.inline
    def withLengths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLengths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lengths")(js.undefined)
        ret
    }
    @scala.inline
    def withNiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("niceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("niceType")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CardBrand): Self = {
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

