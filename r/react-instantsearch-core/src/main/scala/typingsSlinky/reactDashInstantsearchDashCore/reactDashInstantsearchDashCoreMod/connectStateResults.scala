package typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectStateResults")
@js.native
object connectStateResults extends js.Object {
  def apply(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ReactComponentClass[js.Object] = js.native
  def apply[TProps /* <: Partial[StateResultsProvided[_]] */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StateResultsProvided[BasicDoc]]) with js.Object] = js.native
}

