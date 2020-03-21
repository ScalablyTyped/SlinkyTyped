package typingsSlinky.reactInstantsearchNative.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.PartialCurrentRefinements
import typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typingsSlinky.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectCurrentRefinements")
@js.native
object connectCurrentRefinements extends js.Object {
  def apply(stateless: StatelessComponent[CurrentRefinementsProvided]): ReactComponentClass[CurrentRefinementsExposed] = js.native
  def apply[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, CurrentRefinementsProvided]) with CurrentRefinementsExposed] = js.native
}

