package typingsSlinky.reactDashInstantsearchDashNative.reactDashInstantsearchDashNativeMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.ConnectedComponentClass
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.CurrentRefinementsExposed
import typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.CurrentRefinementsProvided
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectCurrentRefinements")
@js.native
object connectCurrentRefinements extends js.Object {
  def apply(stateless: StatelessComponent[CurrentRefinementsProvided]): ReactComponentClass[CurrentRefinementsExposed] = js.native
  def apply[TProps /* <: Partial[CurrentRefinementsProvided] */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = js.native
}

