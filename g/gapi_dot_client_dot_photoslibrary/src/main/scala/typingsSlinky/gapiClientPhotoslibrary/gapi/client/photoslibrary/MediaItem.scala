package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaItem extends js.Object {
  /**
    * A URL to the media item's bytes. This shouldn't be used as is. Parameters
    * should be appended to this URL before use. See the [developer
    * documentation](https://developers.google.com/photos/library/guides/access-media-items#base-urls)
    * for a complete list of supported parameters. For example, `'=w2048-h1024'`
    * will set the dimensions of a media item of type photo to have a width of
    * 2048 px and height of 1024 px.
    */
  var baseUrl: js.UndefOr[String] = js.native
  /** Information about the user who created this media item. */
  var contributorInfo: js.UndefOr[ContributorInfo] = js.native
  /**
    * Description of the media item. This is shown to the user in the item's
    * info section in the Google Photos app.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Filename of the media item. This is shown to the user in the item's info
    * section in the Google Photos app.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Identifier for the media item. This is a persistent identifier that can be
    * used between sessions to identify this media item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Metadata related to the media item, such as, height, width, or
    * creation time.
    */
  var mediaMetadata: js.UndefOr[MediaMetadata] = js.native
  /** MIME type of the media item. For example, `image/jpeg`. */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Google Photos URL for the media item. This link is available to
    * the user only if they're signed in.
    */
  var productUrl: js.UndefOr[String] = js.native
}

object MediaItem {
  @scala.inline
  def apply(): MediaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaItem]
  }
  @scala.inline
  implicit class MediaItemOps[Self <: MediaItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withContributorInfo(value: ContributorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
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
    def withMediaMetadata(value: MediaMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
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
  }
  
}

