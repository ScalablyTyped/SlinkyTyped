package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single tag suggestion with it&#39;s relevance information.
  */
@js.native
trait SchemaVideoSuggestionsTagSuggestion extends js.Object {
  /**
    * A set of video categories for which the tag is relevant. You can use this
    * information to display appropriate tag suggestions based on the video
    * category that the video uploader associates with the video. By default,
    * tag suggestions are relevant for all categories if there are no restricts
    * defined for the keyword.
    */
  var categoryRestricts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The keyword tag suggested for the video.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaVideoSuggestionsTagSuggestion {
  @scala.inline
  def apply(): SchemaVideoSuggestionsTagSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSuggestionsTagSuggestion]
  }
  @scala.inline
  implicit class SchemaVideoSuggestionsTagSuggestionOps[Self <: SchemaVideoSuggestionsTagSuggestion] (val x: Self) extends AnyVal {
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

