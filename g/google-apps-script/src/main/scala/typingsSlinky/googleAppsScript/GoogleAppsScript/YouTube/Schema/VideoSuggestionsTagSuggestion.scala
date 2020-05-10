package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSuggestionsTagSuggestion extends js.Object {
  var categoryRestricts: js.UndefOr[js.Array[String]] = js.native
  var tag: js.UndefOr[String] = js.native
}

object VideoSuggestionsTagSuggestion {
  @scala.inline
  def apply(): VideoSuggestionsTagSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSuggestionsTagSuggestion]
  }
  @scala.inline
  implicit class VideoSuggestionsTagSuggestionOps[Self <: VideoSuggestionsTagSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryRestricts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryRestricts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategoryRestricts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryRestricts")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

