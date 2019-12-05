package typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ReactComponentClass[NumericMenuExposed] = js.native
  def apply[TProps /* <: Partial[NumericMenuProvided] */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed] = js.native
}

