package typingsSlinky.reactInstantsearchDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.reactInstantsearchCore.mod.HighlightPassedThru
import typingsSlinky.reactInstantsearchCore.mod.HighlightProps
import typingsSlinky.reactInstantsearchCore.mod.HighlightProvided
import typingsSlinky.reactInstantsearchCore.mod.Omit
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-instantsearch-dom", "connectHighlight")
@js.native
object connectHighlight extends js.Object {
  
  def apply[TDoc](stateless: FunctionComponent[HighlightProps[TDoc]]): ReactComponentClass[HighlightPassedThru[TDoc]] = js.native
  def apply[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ReactComponentClass[(Omit[TProps, HighlightProvided[TDoc]]) with js.Object] = js.native
}
