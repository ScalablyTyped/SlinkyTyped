package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMerchantCardList_
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String = js.native
}

object OpenMerchantCardList_ {
  @scala.inline
  def apply(partnerId: String): OpenMerchantCardList_ = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantCardList_]
  }
  @scala.inline
  implicit class OpenMerchantCardList_Ops[Self <: OpenMerchantCardList_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partnerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

