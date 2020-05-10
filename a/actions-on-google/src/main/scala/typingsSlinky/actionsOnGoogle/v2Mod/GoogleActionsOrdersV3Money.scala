package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3Money extends js.Object {
  /**
    * Amount in micros.
    * For example, this field should be set as 1990000 for $1.99.
    */
  var amountInMicros: js.UndefOr[String] = js.native
  /**
    * The 3-letter currency code defined in ISO 4217.
    */
  var currencyCode: js.UndefOr[String] = js.native
}

object GoogleActionsOrdersV3Money {
  @scala.inline
  def apply(): GoogleActionsOrdersV3Money = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Money]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3MoneyOps[Self <: GoogleActionsOrdersV3Money] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmountInMicros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountInMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountInMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountInMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyCode")(js.undefined)
        ret
    }
  }
  
}

