package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a caption track, such as its language and name.
  */
@js.native
trait SchemaCaptionSnippet extends js.Object {
  /**
    * The type of audio track associated with the caption track.
    */
  var audioTrackType: js.UndefOr[String] = js.native
  /**
    * The reason that YouTube failed to process the caption track. This
    * property is only present if the state property&#39;s value is failed.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * Indicates whether YouTube synchronized the caption track to the audio
    * track in the video. The value will be true if a sync was explicitly
    * requested when the caption track was uploaded. For example, when calling
    * the captions.insert or captions.update methods, you can set the sync
    * parameter to true to instruct YouTube to sync the uploaded track to the
    * video. If the value is false, YouTube uses the time codes in the uploaded
    * caption track to determine when to display captions.
    */
  var isAutoSynced: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the track contains closed captions for the deaf and
    * hard of hearing. The default value is false.
    */
  var isCC: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the caption track is a draft. If the value is true,
    * then the track is not publicly visible. The default value is false.
    */
  var isDraft: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether caption track is formatted for &quot;easy reader,&quot;
    * meaning it is at a third-grade level for language learners. The default
    * value is false.
    */
  var isEasyReader: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the caption track uses large text for the
    * vision-impaired. The default value is false.
    */
  var isLarge: js.UndefOr[Boolean] = js.native
  /**
    * The language of the caption track. The property value is a BCP-47
    * language tag.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The date and time when the caption track was last updated. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var lastUpdated: js.UndefOr[String] = js.native
  /**
    * The name of the caption track. The name is intended to be visible to the
    * user as an option during playback.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The caption track&#39;s status.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The caption track&#39;s type.
    */
  var trackKind: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video associated with
    * the caption track.
    */
  var videoId: js.UndefOr[String] = js.native
}

object SchemaCaptionSnippet {
  @scala.inline
  def apply(): SchemaCaptionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCaptionSnippet]
  }
  @scala.inline
  implicit class SchemaCaptionSnippetOps[Self <: SchemaCaptionSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTrackType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTrackType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTrackType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTrackType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAutoSynced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoSynced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAutoSynced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoSynced")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCC")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDraft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDraft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraft")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEasyReader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEasyReader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEasyReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEasyReader")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackKind")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

