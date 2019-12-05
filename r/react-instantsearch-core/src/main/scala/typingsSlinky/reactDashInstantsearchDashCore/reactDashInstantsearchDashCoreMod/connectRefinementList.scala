package typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectRefinementList")
@js.native
object connectRefinementList extends js.Object {
  def apply(stateless: StatelessComponent[RefinementListProvided]): ReactComponentClass[RefinementListExposed] = js.native
  def apply[TProps /* <: Partial[RefinementListProvided] */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, RefinementListProvided]) with RefinementListExposed] = js.native
}

