package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionPayFetchCapabilitiesPayload extends js.Object {
  var isDebit: Boolean = js.native
  var isUnionPay: Boolean = js.native
  var unionPay: UnionPayProperties = js.native
}

object UnionPayFetchCapabilitiesPayload {
  @scala.inline
  def apply(isDebit: Boolean, isUnionPay: Boolean, unionPay: UnionPayProperties): UnionPayFetchCapabilitiesPayload = {
    val __obj = js.Dynamic.literal(isDebit = isDebit.asInstanceOf[js.Any], isUnionPay = isUnionPay.asInstanceOf[js.Any], unionPay = unionPay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPayFetchCapabilitiesPayload]
  }
  @scala.inline
  implicit class UnionPayFetchCapabilitiesPayloadOps[Self <: UnionPayFetchCapabilitiesPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDebit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDebit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUnionPay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnionPay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnionPay(value: UnionPayProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unionPay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

