package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.PartialStateResultsProvid
import typingsSlinky.reactInstantsearchCore.mod.BasicDoc
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.reactInstantsearchCore.mod.StateResultsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectStateResults")
@js.native
object connectStateResults extends js.Object {
  def apply(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ReactComponentClass[js.Object] = js.native
  def apply[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StateResultsProvided[BasicDoc]]) with js.Object] = js.native
}

