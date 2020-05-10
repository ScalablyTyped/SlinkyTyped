package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmountInMicros extends js.Object {
  var amountInMicros: js.UndefOr[Double] = js.native
  var currencyCode: js.UndefOr[String] = js.native
}

object AnonAmountInMicros {
  @scala.inline
  def apply(): AnonAmountInMicros = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAmountInMicros]
  }
  @scala.inline
  implicit class AnonAmountInMicrosOps[Self <: AnonAmountInMicros] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmountInMicros(value: Double): Self = {
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

