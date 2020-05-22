package typingsSlinky.amapJsApiAutocomplete.AMap.Autocomplete

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select
import typingsSlinky.amapJsApiAutocomplete.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var choose: Event_[
    typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, 
    typingsSlinky.amapJsApiAutocomplete.anon.Tip
  ]
  var complete: Event_[
    typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
    SearchResult | Info
  ]
  var error: Event_[typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, Info]
  var select: Event_[
    typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, 
    typingsSlinky.amapJsApiAutocomplete.anon.Tip
  ]
}

object EventMap {
  @scala.inline
  def apply(
    choose: Event_[choose, typingsSlinky.amapJsApiAutocomplete.anon.Tip],
    complete: Event_[complete, SearchResult | Info],
    error: Event_[error, Info],
    select: Event_[select, typingsSlinky.amapJsApiAutocomplete.anon.Tip]
  ): EventMap = {
    val __obj = js.Dynamic.literal(choose = choose.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

