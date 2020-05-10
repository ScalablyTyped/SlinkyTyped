package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `RemoveProductFromProductSet` method.
  */
@js.native
trait SchemaRemoveProductFromProductSetRequest extends js.Object {
  /**
    * The resource name for the Product to be removed from this ProductSet.
    * Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    */
  var product: js.UndefOr[String] = js.native
}

object SchemaRemoveProductFromProductSetRequest {
  @scala.inline
  def apply(): SchemaRemoveProductFromProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveProductFromProductSetRequest]
  }
  @scala.inline
  implicit class SchemaRemoveProductFromProductSetRequestOps[Self <: SchemaRemoveProductFromProductSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
  }
  
}

