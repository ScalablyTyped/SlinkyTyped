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

@js.native
trait EventMap extends js.Object {
  var choose: Event_[
    typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, 
    typingsSlinky.amapJsApiAutocomplete.anon.Tip
  ] = js.native
  var complete: Event_[
    typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
    SearchResult | Info
  ] = js.native
  var error: Event_[typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, Info] = js.native
  var select: Event_[
    typingsSlinky.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, 
    typingsSlinky.amapJsApiAutocomplete.anon.Tip
  ] = js.native
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
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChoose(value: Event_[choose, typingsSlinky.amapJsApiAutocomplete.anon.Tip]): Self = this.set("choose", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: Event_[complete, SearchResult | Info]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event_[error, Info]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: Event_[select, typingsSlinky.amapJsApiAutocomplete.anon.Tip]): Self = this.set("select", value.asInstanceOf[js.Any])
  }
  
}

