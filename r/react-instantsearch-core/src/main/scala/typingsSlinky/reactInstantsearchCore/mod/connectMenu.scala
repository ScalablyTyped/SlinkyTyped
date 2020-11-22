package typingsSlinky.reactInstantsearchCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactInstantsearchCore.anon.PartialMenuProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-core", "connectMenu")
@js.native
object connectMenu extends js.Object {
  
  def apply(stateless: FunctionComponent[MenuProvided]): ReactComponentClass[MenuExposed] = js.native
  def apply[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, MenuProvided]) with MenuExposed] = js.native
}
