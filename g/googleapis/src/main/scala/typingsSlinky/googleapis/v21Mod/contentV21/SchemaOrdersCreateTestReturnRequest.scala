package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestReturnRequest extends js.Object {
  /**
    * Returned items.
    */
  var items: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.native
}

object SchemaOrdersCreateTestReturnRequest {
  @scala.inline
  def apply(): SchemaOrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnRequest]
  }
  @scala.inline
  implicit class SchemaOrdersCreateTestReturnRequestOps[Self <: SchemaOrdersCreateTestReturnRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

