package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the Z-order of page elements. Z-order is an ordering of the
  * elements on the page from back to front. The page element in the front may
  * cover the elements that are behind it.
  */
@js.native
trait SchemaUpdatePageElementsZOrderRequest extends js.Object {
  /**
    * The Z-order operation to apply on the page elements.  When applying the
    * operation on multiple page elements, the relative Z-orders within these
    * page elements before the operation is maintained.
    */
  var operation: js.UndefOr[String] = js.native
  /**
    * The object IDs of the page elements to update.  All the page elements
    * must be on the same page and must not be grouped.
    */
  var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUpdatePageElementsZOrderRequest {
  @scala.inline
  def apply(): SchemaUpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePageElementsZOrderRequest]
  }
  @scala.inline
  implicit class SchemaUpdatePageElementsZOrderRequestOps[Self <: SchemaUpdatePageElementsZOrderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withPageElementObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElementObjectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageElementObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElementObjectIds")(js.undefined)
        ret
    }
  }
  
}

