package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompletePrediction extends js.Object {
  var description: String = js.native
  var id: String = js.native
  var matched_substrings: js.Array[PredictionSubstring] = js.native
  var place_id: String = js.native
  var reference: String = js.native
  var structured_formatting: AutocompleteStructuredFormatting = js.native
  var terms: js.Array[PredictionTerm] = js.native
  var types: js.Array[String] = js.native
}

object AutocompletePrediction {
  @scala.inline
  def apply(
    description: String,
    id: String,
    matched_substrings: js.Array[PredictionSubstring],
    place_id: String,
    reference: String,
    structured_formatting: AutocompleteStructuredFormatting,
    terms: js.Array[PredictionTerm],
    types: js.Array[String]
  ): AutocompletePrediction = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], structured_formatting = structured_formatting.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompletePrediction]
  }
  @scala.inline
  implicit class AutocompletePredictionOps[Self <: AutocompletePrediction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatched_substrings(value: js.Array[PredictionSubstring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched_substrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructured_formatting(value: AutocompleteStructuredFormatting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structured_formatting")(value.asInstanceOf[js.Any])
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

