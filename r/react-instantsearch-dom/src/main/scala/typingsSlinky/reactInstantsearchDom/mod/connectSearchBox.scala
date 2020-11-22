package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactInstantsearchCore.anon.PartialSearchBoxProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.reactInstantsearchCore.mod.SearchBoxExposed
import typingsSlinky.reactInstantsearchCore.mod.SearchBoxProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-dom", "connectSearchBox")
@js.native
object connectSearchBox extends js.Object {
  
  def apply(stateless: FunctionComponent[SearchBoxProvided]): ReactComponentClass[SearchBoxExposed] = js.native
  def apply[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, SearchBoxProvided]) with SearchBoxExposed] = js.native
}
