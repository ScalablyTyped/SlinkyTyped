package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Album extends js.Object {
  /**
    * [Output only] A URL to the cover photo's bytes. This shouldn't be used as
    * is. Parameters should be appended to this URL before use. See the
    * [developer
    * documentation](https://developers.google.com/photos/library/guides/access-media-items#base-urls)
    * for a complete list of supported parameters. For example,
    * `'=w2048-h1024'` sets the dimensions of the cover photo to have a width of
    * 2048 px and height of 1024 px.
    */
  var coverPhotoBaseUrl: js.UndefOr[String] = js.native
  /**
    * [Output only] Identifier for the media item associated with the cover
    * photo.
    */
  var coverPhotoMediaItemId: js.UndefOr[String] = js.native
  /**
    * [Ouput only] Identifier for the album. This is a persistent identifier that
    * can be used between sessions to identify this album.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] True if you can create media items in this album.
    * This field is based on the scopes granted and permissions of the album. If
    * the scopes are changed or permissions of the album are changed, this field
    * is updated.
    */
  var isWriteable: js.UndefOr[Boolean] = js.native
  /** [Output only] The number of media items in the album. */
  var mediaItemsCount: js.UndefOr[String] = js.native
  /**
    * [Output only] Google Photos URL for the album. The user needs to be signed
    * in to their Google Photos account to access this link.
    */
  var productUrl: js.UndefOr[String] = js.native
  /**
    * [Output only] Information related to shared albums.
    * This field is only populated if the album is a shared album, the
    * developer created the album and the user has granted the
    * `photoslibrary.sharing` scope.
    */
  var shareInfo: js.UndefOr[ShareInfo] = js.native
  /**
    * Name of the album displayed to the user in their Google Photos account.
    * This string shouldn't be more than 500 characters.
    */
  var title: js.UndefOr[String] = js.native
}

object Album {
  @scala.inline
  def apply(): Album = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Album]
  }
  @scala.inline
  implicit class AlbumOps[Self <: Album] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverPhotoBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhotoBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverPhotoBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhotoBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverPhotoMediaItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhotoMediaItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverPhotoMediaItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverPhotoMediaItemId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWriteable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWriteable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWriteable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWriteable")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaItemsCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaItemsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withProductUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShareInfo(value: ShareInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

