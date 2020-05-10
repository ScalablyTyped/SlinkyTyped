package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAlbumsResponse extends js.Object {
  /**
    * Output only. List of albums shown in the Albums tab of the user's Google
    * Photos app.
    */
  var albums: js.UndefOr[js.Array[Album]] = js.native
  /**
    * Output only. Token to use to get the next set of albums. Populated if
    * there are more albums to retrieve for this request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListAlbumsResponse {
  @scala.inline
  def apply(): ListAlbumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlbumsResponse]
  }
  @scala.inline
  implicit class ListAlbumsResponseOps[Self <: ListAlbumsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbums(value: js.Array[Album]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albums")(js.undefined)
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

