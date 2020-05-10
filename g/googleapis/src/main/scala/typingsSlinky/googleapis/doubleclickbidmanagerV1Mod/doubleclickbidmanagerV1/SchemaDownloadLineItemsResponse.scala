package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Download line items response.
  */
@js.native
trait SchemaDownloadLineItemsResponse extends js.Object {
  /**
    * Retrieved line items in CSV format. For more information about file
    * formats, see  Entity Write File Format.
    */
  var lineItems: js.UndefOr[String] = js.native
}

object SchemaDownloadLineItemsResponse {
  @scala.inline
  def apply(): SchemaDownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadLineItemsResponse]
  }
  @scala.inline
  implicit class SchemaDownloadLineItemsResponseOps[Self <: SchemaDownloadLineItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(js.undefined)
        ret
    }
  }
  
}

