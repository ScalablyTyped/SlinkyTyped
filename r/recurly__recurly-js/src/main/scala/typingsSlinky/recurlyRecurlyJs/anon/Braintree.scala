package typingsSlinky.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Braintree extends js.Object {
  var braintree: js.UndefOr[DeviceData] = js.native
  var kount: js.UndefOr[DataCollector] = js.native
  var litle: js.UndefOr[SessionId] = js.native
}

object Braintree {
  @scala.inline
  def apply(): Braintree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Braintree]
  }
  @scala.inline
  implicit class BraintreeOps[Self <: Braintree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBraintree(value: DeviceData): Self = {
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
    def withKount(value: DataCollector): Self = {
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
    def withLitle(value: SessionId): Self = {
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

