package typingsSlinky.amapDashJsDashApiDashAutocomplete.AMap.Autocomplete

import typingsSlinky.amapDashJsDashApi.AMap.Event
import typingsSlinky.amapDashJsDashApiDashAutocomplete.Anon_Info
import typingsSlinky.amapDashJsDashApiDashAutocomplete.Anon_Tip
import typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.choose
import typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.complete
import typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.error
import typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var choose: Event[
    typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.choose, 
    Anon_Tip
  ]
  var complete: Event[
    typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.complete, 
    SearchResult | Anon_Info
  ]
  var error: Event[
    typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.error, 
    Anon_Info
  ]
  var select: Event[
    typingsSlinky.amapDashJsDashApiDashAutocomplete.amapDashJsDashApiDashAutocompleteStrings.select, 
    Anon_Tip
  ]
}

object EventMap {
  @scala.inline
  def apply(
    choose: Event[choose, Anon_Tip],
    complete: Event[complete, SearchResult | Anon_Info],
    error: Event[error, Anon_Info],
    select: Event[select, Anon_Tip]
  ): EventMap = {
    val __obj = js.Dynamic.literal(choose = choose.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

