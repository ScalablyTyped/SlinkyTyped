package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferDomainResponse extends js.Object {
  /**
    * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
    */
  var OperationId: typingsSlinky.awsSdk.route53domainsMod.OperationId = js.native
}

object TransferDomainResponse {
  @scala.inline
  def apply(OperationId: OperationId): TransferDomainResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDomainResponse]
  }
  @scala.inline
  implicit class TransferDomainResponseOps[Self <: TransferDomainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationId(value: OperationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

