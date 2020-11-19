package typingsSlinky.babelPluginReactHtmlAttrs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-plugin-react-html-attrs", "cloneElement")
@js.native
object cloneElement extends js.Object {
  
  // Custom components
  def apply[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P](element: FunctionComponentElement[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  def apply[P](
    element: ReactElement[P, String | JSXElementConstructor[_]],
    props: Partial[P] with Attributes,
    children: ReactNode*
  ): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P](
    element: ReactElement[P, String | JSXElementConstructor[_]],
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): ReactElement[P, String | JSXElementConstructor[_]] = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactNode*): CElement[P, T] = js.native
  def apply[P, T /* <: Component[P, ComponentState, _] */](element: CElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
  // DOM Elements
  // ReactHTMLElement
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactSVGElement = js.native
}
