package typingsSlinky.mangopay2NodejsSdk.mod.kycDocument

import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KycDocumentData extends EntityBaseData {
  /**
    * The date when the document was processed by MANGOPAY
    */
  var ProcessedDate: Timestamp = js.native
  /**
    * The message accompanying a refusal
    */
  var RefusedReasonMessage: String = js.native
  /**
    * The type of reason for refusal
    */
  var RefusedReasonType: KYCDocumentRefusedReasonType = js.native
  /**
    * The status of this KYC/Dispute document
    */
  var Status: DocumentStatus = js.native
  /**
    * Gives the type of the KYC document
    */
  var Type: KycDocumentType = js.native
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
}

object KycDocumentData {
  @scala.inline
  def apply(
    CreationDate: Double,
    Id: String,
    ProcessedDate: Timestamp,
    RefusedReasonMessage: String,
    RefusedReasonType: KYCDocumentRefusedReasonType,
    Status: DocumentStatus,
    Tag: String,
    Type: KycDocumentType,
    UserId: String
  ): KycDocumentData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonType = RefusedReasonType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KycDocumentData]
  }
  @scala.inline
  implicit class KycDocumentDataOps[Self <: KycDocumentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcessedDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProcessedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefusedReasonMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefusedReasonMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefusedReasonType(value: KYCDocumentRefusedReasonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefusedReasonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: DocumentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: KycDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

