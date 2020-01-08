package typingsSlinky.reactDashCloneDashReferencedDashElement

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.reactMod.Attributes
import typingsSlinky.react.reactMod.CElement
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod.DOMElement
import typingsSlinky.react.reactMod.DetailedReactHTMLElement
import typingsSlinky.react.reactMod.FunctionComponentElement
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.react.reactMod.ReactElement
import typingsSlinky.react.reactMod.ReactHTMLElement
import typingsSlinky.react.reactMod.ReactSVGElement
import typingsSlinky.react.reactMod.SVGAttributes
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-clone-referenced-element", JSImport.Namespace)
@js.native
object reactDashCloneDashReferencedDashElementMod extends js.Object {
  // Custom components
  def default[P](element: FunctionComponentElement[P]): FunctionComponentElement[P] = js.native
  def default[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: TagMod[Any]*): FunctionComponentElement[P] = js.native
  def default[P](element: ReactElement): slinky.core.facade.ReactElement = js.native
  def default[P](element: ReactElement, props: Partial[P] with Attributes, children: TagMod[Any]*): slinky.core.facade.ReactElement = js.native
  def default[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T]): CElement[P, T] = js.native
  def default[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: TagMod[Any]*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T]): slinky.core.facade.ReactElement = js.native
  def default[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: TagMod[Any]*): slinky.core.facade.ReactElement = js.native
  // ReactHTMLElement, less specific
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T]): ReactHTMLElement[T] = js.native
  def default[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: TagMod[Any]*): ReactHTMLElement[T] = js.native
  // SVGElement
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement): ReactSVGElement = js.native
  def default[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: TagMod[Any]*): ReactSVGElement = js.native
  // DOM Elements
  // ReactHTMLElement
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T]): DetailedReactHTMLElement[P, T] = js.native
  @JSName("default")
  def default_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: TagMod[Any]*): DetailedReactHTMLElement[P, T] = js.native
}

