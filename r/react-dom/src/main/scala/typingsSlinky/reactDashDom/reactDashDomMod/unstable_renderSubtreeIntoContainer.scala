package typingsSlinky.reactDashDom.reactDashDomMod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.CElement
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod.DOMElement
import typingsSlinky.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "unstable_renderSubtreeIntoContainer")
@js.native
object unstable_renderSubtreeIntoContainer extends js.Object {
  def apply[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: typingsSlinky.std.Element
  ): T = js.native
  def apply[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: typingsSlinky.std.Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def apply[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: typingsSlinky.std.Element
  ): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: typingsSlinky.std.Element,
    callback: js.Function1[
      /* component */ js.UndefOr[(Component[P, ComponentState, _]) | typingsSlinky.std.Element], 
      _
    ]
  ): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: typingsSlinky.std.Element
  ): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: typingsSlinky.std.Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}

