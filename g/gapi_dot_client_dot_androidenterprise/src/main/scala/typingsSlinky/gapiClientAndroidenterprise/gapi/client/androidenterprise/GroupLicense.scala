package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLicense extends js.Object {
  /**
    * How this group license was acquired. "bulkPurchase" means that this Grouplicenses resource was created because the enterprise purchased licenses for
    * this product; otherwise, the value is "free" (for free products).
    */
  var acquisitionKind: js.UndefOr[String] = js.native
  /**
    * Whether the product to which this group license relates is currently approved by the enterprise. Products are approved when a group license is first
    * created, but this approval may be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to end users in collections,
    * and new entitlements to them should not normally be created.
    */
  var approval: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicense". */
  var kind: js.UndefOr[String] = js.native
  /** The total number of provisioned licenses for this product. Returned by read operations, but ignored in write operations. */
  var numProvisioned: js.UndefOr[Double] = js.native
  /**
    * The number of purchased licenses (possibly in multiple purchases). If this field is omitted, then there is no limit on the number of licenses that can
    * be provisioned (for example, if the acquisition kind is "free").
    */
  var numPurchased: js.UndefOr[Double] = js.native
  /**
    * The permission approval status of the product. This field is only set if the product is approved. Possible states are:
    * - "currentApproved", the current set of permissions is approved, but additional permissions will require the administrator to reapprove the product (If
    * the product was approved without specifying the approved permissions setting, then this is the default behavior.),
    * - "needsReapproval", the product has unapproved permissions. No additional product licenses can be assigned until the product is reapproved,
    * - "allCurrentAndFutureApproved", the current permissions are approved and any future permission updates will be automatically approved without
    * administrator review.
    */
  var permissions: js.UndefOr[String] = js.native
  /** The ID of the product that the license is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.native
}

object GroupLicense {
  @scala.inline
  def apply(): GroupLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicense]
  }
  @scala.inline
  implicit class GroupLicenseOps[Self <: GroupLicense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquisitionKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisitionKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquisitionKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquisitionKind")(js.undefined)
        ret
    }
    @scala.inline
    def withApproval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approval")(js.undefined)
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
    def withNumProvisioned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numProvisioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumProvisioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numProvisioned")(js.undefined)
        ret
    }
    @scala.inline
    def withNumPurchased(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPurchased")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumPurchased: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPurchased")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
  }
  
}

