package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies suggestions on how to improve video content, including encoding
  * hints, tag suggestions, and editor suggestions.
  */
@js.native
trait SchemaVideoSuggestions extends js.Object {
  /**
    * A list of video editing operations that might improve the video quality
    * or playback experience of the uploaded video.
    */
  var editorSuggestions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of errors that will prevent YouTube from successfully processing
    * the uploaded video video. These errors indicate that, regardless of the
    * video&#39;s current processing status, eventually, that status will
    * almost certainly be failed.
    */
  var processingErrors: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of suggestions that may improve YouTube&#39;s ability to process
    * the video.
    */
  var processingHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of reasons why YouTube may have difficulty transcoding the
    * uploaded video or that might result in an erroneous transcoding. These
    * warnings are generated before YouTube actually processes the uploaded
    * video file. In addition, they identify issues that are unlikely to cause
    * the video processing to fail but that might cause problems such as sync
    * issues, video artifacts, or a missing audio track.
    */
  var processingWarnings: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of keyword tags that could be added to the video&#39;s metadata to
    * increase the likelihood that users will locate your video when searching
    * or browsing on YouTube.
    */
  var tagSuggestions: js.UndefOr[js.Array[SchemaVideoSuggestionsTagSuggestion]] = js.native
}

object SchemaVideoSuggestions {
  @scala.inline
  def apply(): SchemaVideoSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSuggestions]
  }
  @scala.inline
  implicit class SchemaVideoSuggestionsOps[Self <: SchemaVideoSuggestions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorSuggestions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingHints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingHints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingHints")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSuggestions(value: js.Array[SchemaVideoSuggestionsTagSuggestion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSuggestions")(js.undefined)
        ret
    }
  }
  
}

