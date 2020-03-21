package typingsSlinky.amapJsApiAutocomplete.AMap.Autocomplete

import typingsSlinky.amapJsApi.AMap.Event_
import typingsSlinky.amapJsApiAutocomplete.AnonInfo
import typingsSlinky.amapJsApiAutocomplete.AnonTip
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
import typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var choose: Event_[typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, AnonTip]
  var complete: Event_[
    typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
    SearchResult | AnonInfo
  ]
  var error: Event_[typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, AnonInfo]
  var select: Event_[typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, AnonTip]
}

object EventMap {
  @scala.inline
  def apply(
    choose: Event_[choose, AnonTip],
    complete: Event_[complete, SearchResult | AnonInfo],
    error: Event_[error, AnonInfo],
    select: Event_[select, AnonTip]
  ): EventMap = {
    val __obj = js.Dynamic.literal(choose = choose.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

