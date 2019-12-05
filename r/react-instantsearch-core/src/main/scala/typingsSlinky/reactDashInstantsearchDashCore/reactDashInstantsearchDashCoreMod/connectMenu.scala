package typingsSlinky.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectMenu")
@js.native
object connectMenu extends js.Object {
  def apply(stateless: StatelessComponent[MenuProvided]): ReactComponentClass[MenuExposed] = js.native
  def apply[TProps /* <: Partial[MenuProvided] */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, MenuProvided]) with MenuExposed] = js.native
}

