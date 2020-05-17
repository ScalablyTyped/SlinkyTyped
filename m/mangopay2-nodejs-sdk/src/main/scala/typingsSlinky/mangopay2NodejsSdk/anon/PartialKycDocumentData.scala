package typingsSlinky.mangopay2NodejsSdk.anon

import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import typingsSlinky.mangopay2NodejsSdk.mod.kycDocument.KYCDocumentRefusedReasonType
import typingsSlinky.mangopay2NodejsSdk.mod.kycDocument.KycDocumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.kycDocument.KycDocumentData> */
@js.native
trait PartialKycDocumentData extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.native
  var Id: js.UndefOr[String] = js.native
  var ProcessedDate: js.UndefOr[Timestamp] = js.native
  var RefusedReasonMessage: js.UndefOr[String] = js.native
  var RefusedReasonType: js.UndefOr[KYCDocumentRefusedReasonType] = js.native
  var Status: js.UndefOr[DocumentStatus] = js.native
  var Tag: js.UndefOr[String] = js.native
  var Type: js.UndefOr[KycDocumentType] = js.native
  var UserId: js.UndefOr[String] = js.native
}

object PartialKycDocumentData {
  @scala.inline
  def apply(): PartialKycDocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialKycDocumentData]
  }
  @scala.inline
  implicit class PartialKycDocumentDataOps[Self <: PartialKycDocumentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessedDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRefusedReasonMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefusedReasonMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefusedReasonMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefusedReasonMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withRefusedReasonType(value: KYCDocumentRefusedReasonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefusedReasonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefusedReasonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefusedReasonType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DocumentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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
    @scala.inline
    def withType(value: KycDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(js.undefined)
        ret
    }
  }
  
}

