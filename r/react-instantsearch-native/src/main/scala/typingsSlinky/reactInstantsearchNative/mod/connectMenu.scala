package typingsSlinky.reactInstantsearchNative.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactInstantsearchCore.PartialMenuProvided
import typingsSlinky.reactInstantsearchCore.mod.MenuExposed
import typingsSlinky.reactInstantsearchCore.mod.MenuProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectMenu")
@js.native
object connectMenu extends js.Object {
  def apply(stateless: StatelessComponent[MenuProvided]): ReactComponentClass[MenuExposed] = js.native
  def apply[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, MenuProvided]) with MenuExposed] = js.native
}

