package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video, including title, description, uploader,
  * thumbnails and category.
  */
@js.native
trait SchemaVideoSnippet extends js.Object {
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video
    * was uploaded to.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  /**
    * The default_audio_language property specifies the language spoken in the
    * video&#39;s default audio track.
    */
  var defaultAudioLanguage: js.UndefOr[String] = js.native
  /**
    * The language of the videos&#39;s default snippet.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * The video&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Indicates if the video is an upcoming/active live broadcast. Or it&#39;s
    * &quot;none&quot; if the video is not an upcoming/active live broadcast.
    */
  var liveBroadcastContent: js.UndefOr[String] = js.native
  /**
    * Localized snippet selected with the hl parameter. If no such localization
    * exists, this field is populated with the default snippet. (Read-only)
    */
  var localized: js.UndefOr[SchemaVideoLocalization] = js.native
  /**
    * The date and time that the video was uploaded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * A list of keyword tags associated with the video. Tags may contain
    * spaces.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of thumbnail images associated with the video. For each object in
    * the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  /**
    * The video&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaVideoSnippet {
  @scala.inline
  def apply(): SchemaVideoSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSnippet]
  }
  @scala.inline
  implicit class SchemaVideoSnippetOps[Self <: SchemaVideoSnippet] (val x: Self) extends AnyVal {
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
    def withLocalized(value: SchemaVideoLocalization): Self = {
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
    def withThumbnails(value: SchemaThumbnailDetails): Self = {
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

