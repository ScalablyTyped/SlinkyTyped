package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetMediaItemsResponse extends js.Object {
  /**
    * Output only. List of media items retrieved.
    * Note that even if the call to BatchGetMediaItems succeeds, there may have
    * been failures for some media items in the batch. These failures are
    * indicated in each
    * MediaItemResult.status.
    */
  var mediaItemResults: js.UndefOr[js.Array[MediaItemResult]] = js.native
}

object BatchGetMediaItemsResponse {
  @scala.inline
  def apply(): BatchGetMediaItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetMediaItemsResponse]
  }
  @scala.inline
  implicit class BatchGetMediaItemsResponseOps[Self <: BatchGetMediaItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaItemResults(value: js.Array[MediaItemResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaItemResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaItemResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaItemResults")(js.undefined)
        ret
    }
  }
  
}

