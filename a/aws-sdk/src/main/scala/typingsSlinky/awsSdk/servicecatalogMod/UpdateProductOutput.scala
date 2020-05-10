package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProductOutput extends js.Object {
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}

object UpdateProductOutput {
  @scala.inline
  def apply(): UpdateProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProductOutput]
  }
  @scala.inline
  implicit class UpdateProductOutputOps[Self <: UpdateProductOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductViewDetail(value: ProductViewDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductViewDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductViewDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

