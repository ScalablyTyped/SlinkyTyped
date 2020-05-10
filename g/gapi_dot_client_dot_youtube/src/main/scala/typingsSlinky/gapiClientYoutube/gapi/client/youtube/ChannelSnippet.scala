package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSnippet extends js.Object {
  /** The country of the channel. */
  var country: js.UndefOr[String] = js.native
  /** The custom url of the channel. */
  var customUrl: js.UndefOr[String] = js.native
  /** The language of the channel's default title and description. */
  var defaultLanguage: js.UndefOr[String] = js.native
  /** The description of the channel. */
  var description: js.UndefOr[String] = js.native
  /** Localized title and description, read-only. */
  var localized: js.UndefOr[ChannelLocalization] = js.native
  /** The date and time that the channel was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * A map of thumbnail images associated with the channel. For each object in the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.native
  /** The channel's title. */
  var title: js.UndefOr[String] = js.native
}

object ChannelSnippet {
  @scala.inline
  def apply(): ChannelSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSnippet]
  }
  @scala.inline
  implicit class ChannelSnippetOps[Self <: ChannelSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguage")(js.undefined)
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
    def withLocalized(value: ChannelLocalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localized")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: ThumbnailDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(js.undefined)
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

