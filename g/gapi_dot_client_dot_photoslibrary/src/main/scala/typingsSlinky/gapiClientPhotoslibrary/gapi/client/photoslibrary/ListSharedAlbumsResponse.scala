package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSharedAlbumsResponse extends js.Object {
  /**
    * Output only. Token to use to get the next set of shared albums. Populated
    * if there are more shared albums to retrieve for this request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Output only. List of shared albums. */
  var sharedAlbums: js.UndefOr[js.Array[Album]] = js.native
}

object ListSharedAlbumsResponse {
  @scala.inline
  def apply(): ListSharedAlbumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSharedAlbumsResponse]
  }
  @scala.inline
  implicit class ListSharedAlbumsResponseOps[Self <: ListSharedAlbumsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSharedAlbums(value: js.Array[Album]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAlbums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedAlbums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAlbums")(js.undefined)
        ret
    }
  }
  
}

