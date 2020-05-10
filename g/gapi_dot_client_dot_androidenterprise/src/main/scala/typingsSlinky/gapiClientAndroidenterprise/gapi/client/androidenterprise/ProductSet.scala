package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productSet". */
  var kind: js.UndefOr[String] = js.native
  /** The list of product IDs making up the set of products. */
  var productId: js.UndefOr[js.Array[String]] = js.native
  /**
    * The interpretation of this product set. "unknown" should never be sent and is ignored if received. "whitelist" means that the user is entitled to
    * access the product set. "includeAll" means that all products are accessible, including products that are approved, products with revoked approval, and
    * products that have never been approved. "allApproved" means that the user is entitled to access all products that are approved for the enterprise. If
    * the value is "allApproved" or "includeAll", the productId field is ignored. If no value is provided, it is interpreted as "whitelist" for backwards
    * compatibility. Further "allApproved" or "includeAll" does not enable automatic visibility of "alpha" or "beta" tracks for Android app. Use
    * ProductVisibility to enable "alpha" or "beta" tracks per user.
    */
  var productSetBehavior: js.UndefOr[String] = js.native
  /**
    * Other products that are part of the set, in addition to those specified in the productId array. The only difference between this field and the
    * productId array is that it's possible to specify additional information about this product visibility, see ProductVisibility and its fields for more
    * information. Specifying the same product ID both here and in the productId array is not allowed and it will result in an error.
    */
  var productVisibility: js.UndefOr[js.Array[ProductVisibility]] = js.native
}

object ProductSet {
  @scala.inline
  def apply(): ProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSet]
  }
  @scala.inline
  implicit class ProductSetOps[Self <: ProductSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withProductId(value: js.Array[String]): Self = {
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
    def withProductSetBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSetBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSetBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSetBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withProductVisibility(value: js.Array[ProductVisibility]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productVisibility")(js.undefined)
        ret
    }
  }
  
}

