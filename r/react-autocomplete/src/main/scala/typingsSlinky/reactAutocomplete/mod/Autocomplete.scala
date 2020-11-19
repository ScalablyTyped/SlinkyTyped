package typingsSlinky.reactAutocomplete.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactAutocomplete.anon.FnCall
import typingsSlinky.reactAutocomplete.anon.FnCallStartEndDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autocomplete
  extends Component[Props, State, js.Any] {
  
  /**
    * Autocomplete exposes a subset of `HTMLInputElement` properties to the parent component.
    * They can be accessed through Autocomplete's `ref` prop.
    */
  var blur: js.Function0[Unit] = js.native
  
  var checkValidity: js.Function0[Boolean] = js.native
  
  var click: js.Function0[Unit] = js.native
  
  var focus: FnCall = js.native
  
  var select: js.Function0[Unit] = js.native
  
  var setCustomValidity: js.Function1[/* error */ String, Unit] = js.native
  
  var setSelectionRange: FnCallStartEndDirection = js.native
}
