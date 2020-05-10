package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteStructuredFormatting extends js.Object {
  var main_text: String = js.native
  var main_text_matched_substrings: js.Array[PredictionSubstring] = js.native
  var secondary_text: String = js.native
  var secondary_text_matched_substrings: js.UndefOr[js.Array[PredictionSubstring]] = js.native
}

object AutocompleteStructuredFormatting {
  @scala.inline
  def apply(
    main_text: String,
    main_text_matched_substrings: js.Array[PredictionSubstring],
    secondary_text: String
  ): AutocompleteStructuredFormatting = {
    val __obj = js.Dynamic.literal(main_text = main_text.asInstanceOf[js.Any], main_text_matched_substrings = main_text_matched_substrings.asInstanceOf[js.Any], secondary_text = secondary_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteStructuredFormatting]
  }
  @scala.inline
  implicit class AutocompleteStructuredFormattingOps[Self <: AutocompleteStructuredFormatting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMain_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main_text_matched_substrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary_text_matched_substrings(value: js.Array[PredictionSubstring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary_text_matched_substrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary_text_matched_substrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary_text_matched_substrings")(js.undefined)
        ret
    }
  }
  
}

