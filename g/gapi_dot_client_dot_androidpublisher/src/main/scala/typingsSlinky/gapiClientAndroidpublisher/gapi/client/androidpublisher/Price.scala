package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Price extends js.Object {
  /** 3 letter Currency code, as defined by ISO 4217. */
  var currency: js.UndefOr[String] = js.native
  /** The price in millionths of the currency base unit represented as a string. */
  var priceMicros: js.UndefOr[String] = js.native
}

object Price {
  @scala.inline
  def apply(): Price = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Price]
  }
  @scala.inline
  implicit class PriceOps[Self <: Price] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceMicros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceMicros")(js.undefined)
        ret
    }
  }
  
}

