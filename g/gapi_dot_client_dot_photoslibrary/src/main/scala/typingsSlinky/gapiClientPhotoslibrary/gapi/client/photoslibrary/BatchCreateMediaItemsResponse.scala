package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateMediaItemsResponse extends js.Object {
  /** Output only. List of media items created. */
  var newMediaItemResults: js.UndefOr[js.Array[NewMediaItemResult]] = js.native
}

object BatchCreateMediaItemsResponse {
  @scala.inline
  def apply(): BatchCreateMediaItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateMediaItemsResponse]
  }
  @scala.inline
  implicit class BatchCreateMediaItemsResponseOps[Self <: BatchCreateMediaItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewMediaItemResults(value: js.Array[NewMediaItemResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMediaItemResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewMediaItemResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMediaItemResults")(js.undefined)
        ret
    }
  }
  
}

