package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes properties of a Planning order.
  */
@js.native
trait SchemaOrder extends js.Object {
  /**
    * Account ID of this order.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this order.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * IDs for users that have to approve documents created for this order.
    */
  var approverUserProfileIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Buyer invoice ID associated with this order.
    */
  var buyerInvoiceId: js.UndefOr[String] = js.native
  /**
    * Name of the buyer organization.
    */
  var buyerOrganizationName: js.UndefOr[String] = js.native
  /**
    * Comments in this order.
    */
  var comments: js.UndefOr[String] = js.native
  /**
    * Contacts for this order.
    */
  var contacts: js.UndefOr[js.Array[SchemaOrderContact]] = js.native
  /**
    * ID of this order. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#order&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this order.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this order.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Notes of this order.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * ID of the terms and conditions template used in this order.
    */
  var planningTermId: js.UndefOr[String] = js.native
  /**
    * Project ID of this order.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Seller order ID associated with this order.
    */
  var sellerOrderId: js.UndefOr[String] = js.native
  /**
    * Name of the seller organization.
    */
  var sellerOrganizationName: js.UndefOr[String] = js.native
  /**
    * Site IDs this order is associated with.
    */
  var siteId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Free-form site names this order is associated with.
    */
  var siteNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Subaccount ID of this order.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Terms and conditions of this order.
    */
  var termsAndConditions: js.UndefOr[String] = js.native
}

object SchemaOrder {
  @scala.inline
  def apply(): SchemaOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrder]
  }
  @scala.inline
  implicit class SchemaOrderOps[Self <: SchemaOrder] (val x: Self) extends AnyVal {
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
    def withApproverUserProfileIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approverUserProfileIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproverUserProfileIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approverUserProfileIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerInvoiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerInvoiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerInvoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerInvoiceId")(js.undefined)
        ret
    }
    @scala.inline
    def withBuyerOrganizationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerOrganizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerOrganizationName")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withContacts(value: js.Array[SchemaOrderContact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(js.undefined)
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
    def withLastModifiedInfo(value: SchemaLastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withPlanningTermId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planningTermId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlanningTermId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planningTermId")(js.undefined)
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
    def withSellerOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withSellerOrganizationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerOrganizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellerOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellerOrganizationName")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteNames")(js.undefined)
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
    def withTermsAndConditions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsAndConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsAndConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsAndConditions")(js.undefined)
        ret
    }
  }
  
}

