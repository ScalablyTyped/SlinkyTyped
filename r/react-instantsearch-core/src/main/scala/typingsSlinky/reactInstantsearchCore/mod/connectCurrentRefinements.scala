package typingsSlinky.reactInstantsearchCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactInstantsearchCore.anon.PartialCurrentRefinements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-core", "connectCurrentRefinements")
@js.native
object connectCurrentRefinements extends js.Object {
  
  def apply(stateless: FunctionComponent[CurrentRefinementsProvided]): ReactComponentClass[CurrentRefinementsExposed] = js.native
  def apply[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, CurrentRefinementsProvided]) with CurrentRefinementsExposed] = js.native
}
