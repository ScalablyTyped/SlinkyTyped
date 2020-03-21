package typingsSlinky.reactInstantsearchCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.PartialNumericMenuProvide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ReactComponentClass[NumericMenuExposed] = js.native
  def apply[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed] = js.native
}

