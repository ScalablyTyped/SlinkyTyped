package typingsSlinky.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteOptions extends js.Object {
  /**
    * Data object defining autocomplete options with optional icon strings.
    */
  var data: AutocompleteData = js.native
  /**
    * Limit of results the autocomplete shows.
    * @default infinity
    */
  var limit: Double = js.native
  /**
    * Minimum number of characters before autocomplete starts.
    * @default 1
    */
  var minLength: Double = js.native
  /**
    * Callback for when autocompleted.
    */
  def onAutocomplete(text: String): Unit = js.native
  /**
    * Sort function that defines the order of the list of autocomplete options.
    */
  def sortFunction(a: String, b: String, inputText: String): Double = js.native
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    data: AutocompleteData,
    limit: Double,
    minLength: Double,
    onAutocomplete: String => Unit,
    sortFunction: (String, String, String) => Double
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], onAutocomplete = js.Any.fromFunction1(onAutocomplete), sortFunction = js.Any.fromFunction3(sortFunction))
    __obj.asInstanceOf[AutocompleteOptions]
  }
  @scala.inline
  implicit class AutocompleteOptionsOps[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AutocompleteData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAutocomplete(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutocomplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortFunction(value: (String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunction")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

