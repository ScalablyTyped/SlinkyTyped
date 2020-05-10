package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryAutocompleteResult extends js.Object {
  /** contains the human-readable name for the returned result. For establishment results, this is usually the business name. */
  var description: String = js.native
  /**
    * contains an `offset` value and a `length`.
    * These describe the location of the entered term in the prediction result text, so that the term can be highlighted if desired.
    */
  var matched_substrings: js.Array[PredictionSubstring] = js.native
  /**
    * contains an array of terms identifying each section of the returned description
    * (a section of the description is generally terminated with a comma).
    */
  var terms: js.Array[PredictionTerm] = js.native
}

object QueryAutocompleteResult {
  @scala.inline
  def apply(
    description: String,
    matched_substrings: js.Array[PredictionSubstring],
    terms: js.Array[PredictionTerm]
  ): QueryAutocompleteResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], matched_substrings = matched_substrings.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompleteResult]
  }
  @scala.inline
  implicit class QueryAutocompleteResultOps[Self <: QueryAutocompleteResult] (val x: Self) extends AnyVal {
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
    def withMatched_substrings(value: js.Array[PredictionSubstring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched_substrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerms(value: js.Array[PredictionTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

