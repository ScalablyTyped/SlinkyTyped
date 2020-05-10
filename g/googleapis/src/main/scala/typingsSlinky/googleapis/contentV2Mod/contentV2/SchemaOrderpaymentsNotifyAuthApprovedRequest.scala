package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyAuthApprovedRequest extends js.Object {
  /**
    * Authorized amount for pre-tax charge on user&#39;s credit card.
    */
  var authAmountPretax: js.UndefOr[SchemaPrice] = js.native
  /**
    * Authorized amount for tax charge on user&#39;s credit card.
    */
  var authAmountTax: js.UndefOr[SchemaPrice] = js.native
}

object SchemaOrderpaymentsNotifyAuthApprovedRequest {
  @scala.inline
  def apply(): SchemaOrderpaymentsNotifyAuthApprovedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthApprovedRequest]
  }
  @scala.inline
  implicit class SchemaOrderpaymentsNotifyAuthApprovedRequestOps[Self <: SchemaOrderpaymentsNotifyAuthApprovedRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthAmountPretax(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountPretax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthAmountPretax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountPretax")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthAmountTax(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthAmountTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authAmountTax")(js.undefined)
        ret
    }
  }
  
}

