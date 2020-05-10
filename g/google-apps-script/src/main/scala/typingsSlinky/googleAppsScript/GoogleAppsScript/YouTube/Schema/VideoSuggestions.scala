package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSuggestions extends js.Object {
  var editorSuggestions: js.UndefOr[js.Array[String]] = js.native
  var processingErrors: js.UndefOr[js.Array[String]] = js.native
  var processingHints: js.UndefOr[js.Array[String]] = js.native
  var processingWarnings: js.UndefOr[js.Array[String]] = js.native
  var tagSuggestions: js.UndefOr[js.Array[VideoSuggestionsTagSuggestion]] = js.native
}

object VideoSuggestions {
  @scala.inline
  def apply(): VideoSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSuggestions]
  }
  @scala.inline
  implicit class VideoSuggestionsOps[Self <: VideoSuggestions] (val x: Self) extends AnyVal {
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
    def withTagSuggestions(value: js.Array[VideoSuggestionsTagSuggestion]): Self = {
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

