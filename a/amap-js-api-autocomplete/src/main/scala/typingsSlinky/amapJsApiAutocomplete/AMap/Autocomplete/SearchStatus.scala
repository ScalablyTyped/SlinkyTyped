package typingsSlinky.amapJsApiAutocomplete.AMap.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
  - typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
  - typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.no_data = this.cast("no_data")
}

