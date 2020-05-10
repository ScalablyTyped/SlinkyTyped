package typingsSlinky.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dataCollectorOptions extends js.Object {
  var kount: js.UndefOr[Boolean] = js.native
  var paypal: js.UndefOr[Boolean] = js.native
}

object dataCollectorOptions {
  @scala.inline
  def apply(): dataCollectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dataCollectorOptions]
  }
  @scala.inline
  implicit class dataCollectorOptionsOps[Self <: dataCollectorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kount")(js.undefined)
        ret
    }
    @scala.inline
    def withPaypal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaypal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(js.undefined)
        ret
    }
  }
  
}

