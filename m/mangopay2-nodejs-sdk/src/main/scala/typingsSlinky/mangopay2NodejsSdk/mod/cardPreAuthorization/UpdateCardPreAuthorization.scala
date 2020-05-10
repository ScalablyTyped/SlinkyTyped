package typingsSlinky.mangopay2NodejsSdk.mod.cardPreAuthorization

import typingsSlinky.mangopay2NodejsSdk.mod.PaymentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag', 'PaymentStatus' | 'Id'> */
@js.native
trait UpdateCardPreAuthorization extends js.Object {
  var Id: String = js.native
  var PaymentStatus: typingsSlinky.mangopay2NodejsSdk.mod.PaymentStatus = js.native
  var Tag: js.UndefOr[String] = js.native
}

object UpdateCardPreAuthorization {
  @scala.inline
  def apply(Id: String, PaymentStatus: PaymentStatus): UpdateCardPreAuthorization = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PaymentStatus = PaymentStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCardPreAuthorization]
  }
  @scala.inline
  implicit class UpdateCardPreAuthorizationOps[Self <: UpdateCardPreAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentStatus(value: PaymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

