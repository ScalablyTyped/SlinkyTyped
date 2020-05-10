package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingCertificate extends js.Object {
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate creation date.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the transfer was initiated.
    */
  var transferDate: js.UndefOr[js.Date] = js.native
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
  /**
    * The AWS account to which the transfer was made.
    */
  var transferredTo: js.UndefOr[AwsAccountId] = js.native
}

object OutgoingCertificate {
  @scala.inline
  def apply(): OutgoingCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingCertificate]
  }
  @scala.inline
  implicit class OutgoingCertificateOps[Self <: OutgoingCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: CertificateArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateId(value: CertificateId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferDate")(js.undefined)
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
    @scala.inline
    def withTransferredTo(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferredTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferredTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferredTo")(js.undefined)
        ret
    }
  }
  
}

