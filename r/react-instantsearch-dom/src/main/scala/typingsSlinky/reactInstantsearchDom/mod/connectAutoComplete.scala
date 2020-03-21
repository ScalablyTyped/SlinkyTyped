package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.mod.AutocompleteExposed
import typingsSlinky.reactInstantsearchCore.mod.AutocompleteProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectAutoComplete")
@js.native
object connectAutoComplete extends js.Object {
  def apply[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ReactComponentClass[AutocompleteExposed] = js.native
  def apply[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ReactComponentClass[(Omit[Props, AutocompleteProvided[TDoc]]) with AutocompleteExposed] = js.native
}

