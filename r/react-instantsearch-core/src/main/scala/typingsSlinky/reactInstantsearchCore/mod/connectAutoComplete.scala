package typingsSlinky.reactInstantsearchCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-core", "connectAutoComplete")
@js.native
object connectAutoComplete extends js.Object {
  
  def apply[TDoc](stateless: FunctionComponent[AutocompleteProvided[TDoc]]): ReactComponentClass[AutocompleteExposed] = js.native
  def apply[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ReactComponentClass[(Omit[Props, AutocompleteProvided[TDoc]]) with AutocompleteExposed] = js.native
}
