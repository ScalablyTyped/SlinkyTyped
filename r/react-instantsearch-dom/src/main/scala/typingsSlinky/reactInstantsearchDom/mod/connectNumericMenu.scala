package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.anon.PartialNumericMenuProvide
import typingsSlinky.reactInstantsearchCore.mod.NumericMenuExposed
import typingsSlinky.reactInstantsearchCore.mod.NumericMenuProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ReactComponentClass[NumericMenuExposed] = js.native
  def apply[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed] = js.native
}

