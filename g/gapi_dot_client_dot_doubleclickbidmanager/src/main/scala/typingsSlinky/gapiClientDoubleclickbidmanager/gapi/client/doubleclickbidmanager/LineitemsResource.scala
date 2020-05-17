package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDoubleclickbidmanager.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineitemsResource extends js.Object {
  /** Retrieves line items in CSV format. */
  def downloadlineitems(request: Alt): Request[DownloadLineItemsResponse] = js.native
  /** Uploads line items in CSV format. */
  def uploadlineitems(request: Alt): Request[UploadLineItemsResponse] = js.native
}

object LineitemsResource {
  @scala.inline
  def apply(
    downloadlineitems: Alt => Request[DownloadLineItemsResponse],
    uploadlineitems: Alt => Request[UploadLineItemsResponse]
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
    def withDownloadlineitems(value: Alt => Request[DownloadLineItemsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadlineitems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUploadlineitems(value: Alt => Request[UploadLineItemsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadlineitems")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

