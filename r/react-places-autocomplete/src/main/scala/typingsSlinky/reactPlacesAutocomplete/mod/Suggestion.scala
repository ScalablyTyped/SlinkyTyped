package typingsSlinky.reactPlacesAutocomplete.mod

import typingsSlinky.googlemaps.google.maps.places.PredictionSubstring
import typingsSlinky.googlemaps.google.maps.places.PredictionTerm
import typingsSlinky.reactPlacesAutocomplete.AnonMainText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggestion extends js.Object {
  var active: Boolean = js.native
  var description: String = js.native
  var formattedSuggestion: AnonMainText = js.native
  var id: String = js.native
  var index: Double = js.native
  var matchedSubstrings: js.Array[PredictionSubstring] = js.native
  var placeId: String = js.native
  var terms: js.Array[PredictionTerm] = js.native
  var types: js.Array[String] = js.native
}

object Suggestion {
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    formattedSuggestion: AnonMainText,
    id: String,
    index: Double,
    matchedSubstrings: js.Array[PredictionSubstring],
    placeId: String,
    terms: js.Array[PredictionTerm],
    types: js.Array[String]
  ): Suggestion = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedSuggestion = formattedSuggestion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], matchedSubstrings = matchedSubstrings.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
  @scala.inline
  implicit class SuggestionOps[Self <: Suggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedSuggestion(value: AnonMainText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedSubstrings(value: js.Array[PredictionSubstring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedSubstrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerms(value: js.Array[PredictionTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

