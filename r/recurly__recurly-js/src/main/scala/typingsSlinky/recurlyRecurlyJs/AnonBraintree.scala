package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBraintree extends js.Object {
  var braintree: js.UndefOr[AnonDeviceData] = js.native
  var kount: js.UndefOr[AnonDataCollector] = js.native
  var litle: js.UndefOr[AnonSessionId] = js.native
}

object AnonBraintree {
  @scala.inline
  def apply(): AnonBraintree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBraintree]
  }
  @scala.inline
  implicit class AnonBraintreeOps[Self <: AnonBraintree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBraintree(value: AnonDeviceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braintree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBraintree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("braintree")(js.undefined)
        ret
    }
    @scala.inline
    def withKount(value: AnonDataCollector): Self = {
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
    def withLitle(value: AnonSessionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("litle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("litle")(js.undefined)
        ret
    }
  }
  
}

