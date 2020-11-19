package typingsSlinky.reactDom.mod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
@js.native
object unstableRenderSubtreeIntoContainer extends js.Object {
  
  def apply[T /* <: Element */](
    parentComponent: ReactComponentClass[_],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  def apply[T /* <: Element */](
    parentComponent: ReactComponentClass[_],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def apply[P](parentComponent: ReactComponentClass[_], element: ReactElement, container: Element): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P](
    parentComponent: ReactComponentClass[_],
    element: ReactElement,
    container: Element,
    callback: js.Function1[/* component */ js.UndefOr[ReactComponentClass[P] | Element], _]
  ): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](parentComponent: ReactComponentClass[_], element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](
    parentComponent: ReactComponentClass[_],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}
