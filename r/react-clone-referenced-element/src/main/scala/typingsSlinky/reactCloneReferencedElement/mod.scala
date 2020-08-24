package typingsSlinky.reactCloneReferencedElement

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Attributes
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.DetailedReactHTMLElement
import typingsSlinky.react.mod.FunctionComponentElement
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.ReactHTMLElement
import typingsSlinky.react.mod.ReactSVGElement
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-clone-referenced-element", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // Custom components
  def default[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactElement*): FunctionComponentElement[P] = js.native
  def default[P](element: FunctionComponentElement[P], props: js.UndefOr[scala.Nothing], children: ReactElement*): FunctionComponentElement[P] = js.native
  def default[P](
    element: typingsSlinky.react.mod.ReactElement,
    props: Partial[P] with Attributes,
    children: ReactElement*
  ): ReactElement = js.native
  def default[P](
    element: typingsSlinky.react.mod.ReactElement,
    props: js.UndefOr[scala.Nothing],
    children: ReactElement*
  ): ReactElement = js.native
  def default[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactElement*): CElement[P, T] = js.native
  def default[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactElement*): ReactElement = js.native
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactElement = js.native
  // DOM Elements
  // ReactHTMLElement
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactElement*): DetailedReactHTMLElement[P, T] = js.native
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactElement*): DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactElement*): ReactSVGElement = js.native
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactSVGElement = js.native
  // ReactHTMLElement, less specific
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactElement*): ReactHTMLElement[T] = js.native
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: js.UndefOr[scala.Nothing], children: ReactElement*): ReactHTMLElement[T] = js.native
}

