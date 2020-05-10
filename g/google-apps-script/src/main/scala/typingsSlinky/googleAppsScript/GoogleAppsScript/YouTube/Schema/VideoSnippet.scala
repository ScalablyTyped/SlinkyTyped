package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSnippet extends js.Object {
  var categoryId: js.UndefOr[String] = js.native
  var channelId: js.UndefOr[String] = js.native
  var channelTitle: js.UndefOr[String] = js.native
  var defaultAudioLanguage: js.UndefOr[String] = js.native
  var defaultLanguage: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var liveBroadcastContent: js.UndefOr[String] = js.native
  var localized: js.UndefOr[VideoLocalization] = js.native
  var publishedAt: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.native
  var title: js.UndefOr[String] = js.native
}

object VideoSnippet {
  @scala.inline
  def apply(): VideoSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSnippet]
  }
  @scala.inline
  implicit class VideoSnippetOps[Self <: VideoSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAudioLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAudioLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAudioLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAudioLanguage")(js.undefined)
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
    def withLiveBroadcastContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBroadcastContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveBroadcastContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveBroadcastContent")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalized(value: VideoLocalization): Self = {
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
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
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

