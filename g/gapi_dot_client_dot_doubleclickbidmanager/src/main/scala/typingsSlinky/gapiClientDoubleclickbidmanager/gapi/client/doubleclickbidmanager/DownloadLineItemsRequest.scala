package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadLineItemsRequest extends js.Object {
  /** File specification (column names, types, order) in which the line items will be returned. Default to EWF. */
  var fileSpec: js.UndefOr[String] = js.native
  /** Ids of the specified filter type used to filter line items to fetch. If omitted, all the line items will be returned. */
  var filterIds: js.UndefOr[js.Array[String]] = js.native
  /** Filter type used to filter line items to fetch. */
  var filterType: js.UndefOr[String] = js.native
  /** Format in which the line items will be returned. Default to CSV. */
  var format: js.UndefOr[String] = js.native
}

object DownloadLineItemsRequest {
  @scala.inline
  def apply(): DownloadLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadLineItemsRequest]
  }
  @scala.inline
  implicit class DownloadLineItemsRequestOps[Self <: DownloadLineItemsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterIds")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
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
  }
  
}

