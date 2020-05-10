package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.mod.Client_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKount extends js.Object {
  var client: Client_ = js.native
  var kount: Boolean = js.native
  var paypal: Boolean = js.native
}

object AnonKount {
  @scala.inline
  def apply(client: Client_, kount: Boolean, paypal: Boolean): AnonKount = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], kount = kount.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKount]
  }
  @scala.inline
  implicit class AnonKountOps[Self <: AnonKount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: Client_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaypal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paypal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

