package typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectStats")
@js.native
object connectStats extends js.Object {
  def apply(stateless: StatelessComponent[StatsProvided]): ReactComponentClass[js.Object] = js.native
  def apply[TProps /* <: Partial[StatsProvided] */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StatsProvided]) with js.Object] = js.native
}

