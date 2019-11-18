package typingsSlinky.reactDashDom.reactDashDomMod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.CElement
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod.DOMElement
import typingsSlinky.react.reactMod.ReactElement
import typingsSlinky.react.reactMod.SFCElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def apply(element: js.Array[ReactElement]): ReactComponentClass[_] | Element | Unit = js.native
  def apply(element: js.Array[ReactElement], container: Null, callback: js.Function0[Unit]): ReactComponentClass[_] | Element | Unit = js.native
  def apply(element: js.Array[ReactElement], container: typingsSlinky.std.Element): ReactComponentClass[_] | Element | Unit = js.native
  def apply(
    element: js.Array[ReactElement],
    container: typingsSlinky.std.Element,
    callback: js.Function0[Unit]
  ): ReactComponentClass[_] | Element | Unit = js.native
  def apply(element: SFCElement[_]): Unit = js.native
  def apply(element: SFCElement[_], container: Null, callback: js.Function0[Unit]): Unit = js.native
  def apply(element: SFCElement[_], container: typingsSlinky.std.Element): Unit = js.native
  def apply(element: SFCElement[_], container: typingsSlinky.std.Element, callback: js.Function0[Unit]): Unit = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
  // Deprecated(render): The return value is deprecated.
  // In future releases the render function's return type will be void.
  def apply[T /* <: Element */](element: DOMElement[DOMAttributes[T], T], container: typingsSlinky.std.Element): T = js.native
  def apply[T /* <: Element */](
    element: DOMElement[DOMAttributes[T], T],
    container: typingsSlinky.std.Element,
    callback: js.Function0[Unit]
  ): T = js.native
  def apply[P](element: ReactElement): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P](element: ReactElement, container: typingsSlinky.std.Element): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P](element: ReactElement, container: typingsSlinky.std.Element, callback: js.Function0[Unit]): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T]): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], container: typingsSlinky.std.Element): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], container: typingsSlinky.std.Element, callback: js.Function0[Unit]): T = js.native
}

