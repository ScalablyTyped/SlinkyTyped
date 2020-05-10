package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseRequest extends js.Object {
  /**
    * The number of instances.
    */
  var InstanceCount: Integer = js.native
  /**
    * The purchase token.
    */
  var PurchaseToken: String = js.native
}

object PurchaseRequest {
  @scala.inline
  def apply(InstanceCount: Integer, PurchaseToken: String): PurchaseRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], PurchaseToken = PurchaseToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseRequest]
  }
  @scala.inline
  implicit class PurchaseRequestOps[Self <: PurchaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurchaseToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchaseToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

