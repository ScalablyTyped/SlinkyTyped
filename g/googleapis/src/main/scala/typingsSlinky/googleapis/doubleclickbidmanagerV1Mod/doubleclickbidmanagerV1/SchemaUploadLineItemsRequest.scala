package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to upload line items.
  */
@js.native
trait SchemaUploadLineItemsRequest extends js.Object {
  /**
    * Set to true to get upload status without actually persisting the line
    * items.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * Format the line items are in. Default to CSV.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Line items in CSV to upload. Refer to  Entity Write File Format for more
    * information on file format.
    */
  var lineItems: js.UndefOr[String] = js.native
}

object SchemaUploadLineItemsRequest {
  @scala.inline
  def apply(): SchemaUploadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadLineItemsRequest]
  }
  @scala.inline
  implicit class SchemaUploadLineItemsRequestOps[Self <: SchemaUploadLineItemsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
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

