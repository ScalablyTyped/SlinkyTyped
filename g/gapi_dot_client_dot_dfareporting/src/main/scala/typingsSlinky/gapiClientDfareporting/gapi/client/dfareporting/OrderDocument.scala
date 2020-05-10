package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderDocument extends js.Object {
  /** Account ID of this order document. */
  var accountId: js.UndefOr[String] = js.native
  /** Advertiser ID of this order document. */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * The amended order document ID of this order document. An order document can be created by optionally amending another order document so that the change
    * history can be preserved.
    */
  var amendedOrderDocumentId: js.UndefOr[String] = js.native
  /** IDs of users who have approved this order document. */
  var approvedByUserProfileIds: js.UndefOr[js.Array[String]] = js.native
  /** Whether this order document is cancelled. */
  var cancelled: js.UndefOr[Boolean] = js.native
  /** Information about the creation of this order document. */
  var createdInfo: js.UndefOr[LastModifiedInfo] = js.native
  /** Effective date of this order document. */
  var effectiveDate: js.UndefOr[String] = js.native
  /** ID of this order document. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#orderDocument". */
  var kind: js.UndefOr[String] = js.native
  /** List of email addresses that received the last sent document. */
  var lastSentRecipients: js.UndefOr[js.Array[String]] = js.native
  /** Timestamp of the last email sent with this order document. */
  var lastSentTime: js.UndefOr[String] = js.native
  /** ID of the order from which this order document is created. */
  var orderId: js.UndefOr[String] = js.native
  /** Project ID of this order document. */
  var projectId: js.UndefOr[String] = js.native
  /** Whether this order document has been signed. */
  var signed: js.UndefOr[Boolean] = js.native
  /** Subaccount ID of this order document. */
  var subaccountId: js.UndefOr[String] = js.native
  /** Title of this order document. */
  var title: js.UndefOr[String] = js.native
  /** Type of this order document */
  var `type`: js.UndefOr[String] = js.native
}

object OrderDocument {
  @scala.inline
  def apply(): OrderDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderDocument]
  }
  @scala.inline
  implicit class OrderDocumentOps[Self <: OrderDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withAmendedOrderDocumentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amendedOrderDocumentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmendedOrderDocumentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amendedOrderDocumentId")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovedByUserProfileIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedByUserProfileIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovedByUserProfileIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvedByUserProfileIds")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedInfo(value: LastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSentRecipients(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSentRecipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSentRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSentRecipients")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSentTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(js.undefined)
        ret
    }
    @scala.inline
    def withSubaccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

