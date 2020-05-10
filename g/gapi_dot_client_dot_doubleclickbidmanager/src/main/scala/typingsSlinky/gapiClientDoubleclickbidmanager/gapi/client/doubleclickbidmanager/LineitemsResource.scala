package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDoubleclickbidmanager.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineitemsResource extends js.Object {
  /** Retrieves line items in CSV format. */
  def downloadlineitems(request: AnonAlt): Request_[DownloadLineItemsResponse] = js.native
  /** Uploads line items in CSV format. */
  def uploadlineitems(request: AnonAlt): Request_[UploadLineItemsResponse] = js.native
}

object LineitemsResource {
  @scala.inline
  def apply(
    downloadlineitems: AnonAlt => Request_[DownloadLineItemsResponse],
    uploadlineitems: AnonAlt => Request_[UploadLineItemsResponse]
  ): LineitemsResource = {
    val __obj = js.Dynamic.literal(downloadlineitems = js.Any.fromFunction1(downloadlineitems), uploadlineitems = js.Any.fromFunction1(uploadlineitems))
    __obj.asInstanceOf[LineitemsResource]
  }
  @scala.inline
  implicit class LineitemsResourceOps[Self <: LineitemsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadlineitems(value: AnonAlt => Request_[DownloadLineItemsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadlineitems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadlineitems(value: AnonAlt => Request_[UploadLineItemsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadlineitems")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

