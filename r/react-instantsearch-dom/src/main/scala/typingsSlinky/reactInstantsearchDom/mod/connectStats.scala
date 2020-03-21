package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.PartialStatsProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.reactInstantsearchCore.mod.StatsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectStats")
@js.native
object connectStats extends js.Object {
  def apply(stateless: StatelessComponent[StatsProvided]): ReactComponentClass[js.Object] = js.native
  def apply[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, StatsProvided]) with js.Object] = js.native
}

