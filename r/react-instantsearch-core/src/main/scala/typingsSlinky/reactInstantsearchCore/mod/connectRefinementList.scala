package typingsSlinky.reactInstantsearchCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactInstantsearchCore.anon.PartialRefinementListProv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-core", "connectRefinementList")
@js.native
object connectRefinementList extends js.Object {
  
  def apply(stateless: FunctionComponent[RefinementListProvided]): ReactComponentClass[RefinementListExposed] = js.native
  def apply[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, RefinementListProvided]) with RefinementListExposed] = js.native
}
