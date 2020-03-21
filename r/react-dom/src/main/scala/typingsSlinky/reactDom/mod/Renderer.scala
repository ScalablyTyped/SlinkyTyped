package typingsSlinky.reactDom.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.ReactElement
import typingsSlinky.react.mod.SFCElement
import typingsSlinky.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def apply(element: js.Array[CElement[_, Component[_, ComponentState, _]]]): ReactComponentClass[_] = js.native
  def apply(
    element: js.Array[CElement[_, Component[_, ComponentState, _]]],
    container: Null,
    callback: js.Function0[Unit]
  ): ReactComponentClass[_] = js.native
  def apply(element: js.Array[CElement[_, Component[_, ComponentState, _]]], container: Element): ReactComponentClass[_] = js.native
  def apply(
    element: js.Array[CElement[_, Component[_, ComponentState, _]]],
    container: Element,
    callback: js.Function0[Unit]
  ): ReactComponentClass[_] = js.native
  def apply(element: SFCElement[_]): Unit = js.native
  def apply(element: SFCElement[_], container: Null, callback: js.Function0[Unit]): Unit = js.native
  def apply(element: SFCElement[_], container: Element): Unit = js.native
  def apply(element: SFCElement[_], container: Element, callback: js.Function0[Unit]): Unit = js.native
  def apply[T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[DOMAttributes[T], T]): T = js.native
  def apply[T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[DOMAttributes[T], T], container: Null, callback: js.Function0[Unit]): T = js.native
  // Deprecated(render): The return value is deprecated.
  // In future releases the render function's return type will be void.
  def apply[T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[DOMAttributes[T], T], container: Element): T = js.native
  def apply[T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[DOMAttributes[T], T], container: Element, callback: js.Function0[Unit]): T = js.native
  def apply[P](element: ReactElement): ReactComponentClass[P] | org.scalajs.dom.raw.Element | Unit = js.native
  def apply[P](element: ReactElement, container: Null, callback: js.Function0[Unit]): ReactComponentClass[P] | org.scalajs.dom.raw.Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element): ReactComponentClass[P] | org.scalajs.dom.raw.Element | Unit = js.native
  def apply[P](element: ReactElement, container: Element, callback: js.Function0[Unit]): ReactComponentClass[P] | org.scalajs.dom.raw.Element | Unit = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T]): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], container: Null, callback: js.Function0[Unit]): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], container: Element): T = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], container: Element, callback: js.Function0[Unit]): T = js.native
}

