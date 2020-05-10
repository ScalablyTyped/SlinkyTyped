package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferCertificateRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  /**
    * The AWS account.
    */
  var targetAwsAccount: AwsAccountId = js.native
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
}

object TransferCertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId, targetAwsAccount: AwsAccountId): TransferCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], targetAwsAccount = targetAwsAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCertificateRequest]
  }
  @scala.inline
  implicit class TransferCertificateRequestOps[Self <: TransferCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetAwsAccount(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetAwsAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransferMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferMessage")(js.undefined)
        ret
    }
  }
  
}

