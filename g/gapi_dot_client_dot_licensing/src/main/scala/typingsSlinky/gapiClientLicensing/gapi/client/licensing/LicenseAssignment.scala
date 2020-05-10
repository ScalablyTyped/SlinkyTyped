package typingsSlinky.gapiClientLicensing.gapi.client.licensing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseAssignment extends js.Object {
  /** ETag of the resource. */
  var etags: js.UndefOr[String] = js.native
  /** Identifies the resource as a LicenseAssignment. */
  var kind: js.UndefOr[String] = js.native
  /** Id of the product. */
  var productId: js.UndefOr[String] = js.native
  /** Display Name of the product. */
  var productName: js.UndefOr[String] = js.native
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.native
  /** Id of the sku of the product. */
  var skuId: js.UndefOr[String] = js.native
  /** Display Name of the sku of the product. */
  var skuName: js.UndefOr[String] = js.native
  /** Email id of the user. */
  var userId: js.UndefOr[String] = js.native
}

object LicenseAssignment {
  @scala.inline
  def apply(): LicenseAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseAssignment]
  }
  @scala.inline
  implicit class LicenseAssignmentOps[Self <: LicenseAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etags")(js.undefined)
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
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuId")(js.undefined)
        ret
    }
    @scala.inline
    def withSkuName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkuName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skuName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

