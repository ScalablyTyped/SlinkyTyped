package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMediaItemsResponse extends js.Object {
  /** Output only. List of media items in the user's library. */
  var mediaItems: js.UndefOr[js.Array[MediaItem]] = js.native
  /**
    * Output only. Token to use to get the next set of media items. Its presence
    * is the only reliable indicator of more media items being available in the
    * next request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListMediaItemsResponse {
  @scala.inline
  def apply(): ListMediaItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMediaItemsResponse]
  }
  @scala.inline
  implicit class ListMediaItemsResponseOps[Self <: ListMediaItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaItems(value: js.Array[MediaItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

