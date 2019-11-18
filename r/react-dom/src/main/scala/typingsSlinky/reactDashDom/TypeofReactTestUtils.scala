package typingsSlinky.reactDashDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.CElement
import typingsSlinky.react.reactMod.ClassType
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod.DOMElement
import typingsSlinky.react.reactMod.ReactElement
import typingsSlinky.react.reactMod.ReactInstance
import typingsSlinky.react.reactMod.SFC
import typingsSlinky.react.reactMod.SFCElement
import typingsSlinky.reactDashDom.testDashUtilsMod.DebugPromiseLike
import typingsSlinky.reactDashDom.testDashUtilsMod.MockedComponentClass
import typingsSlinky.reactDashDom.testDashUtilsMod.ShallowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactTestUtils extends js.Object {
  val Simulate: TypeofSimulate = js.native
  def act(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = js.native
  @JSName("act")
  def act_Promise(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def createRenderer(): ShallowRenderer = js.native
  def findAllInRenderedTree(root: ReactComponentClass[_], fn: js.Function1[/* i */ ReactInstance, Boolean]): js.Array[ReactInstance] = js.native
  def findRenderedComponentWithType[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](root: ReactComponentClass[_], `type`: ClassType[_, T, C]): T = js.native
  def findRenderedDOMComponentWithClass(root: ReactComponentClass[_], className: String): Element = js.native
  def findRenderedDOMComponentWithTag(root: ReactComponentClass[_], tagName: String): Element = js.native
  def isCompositeComponent(instance: ReactInstance): /* is react.react.Component<any, {}, any> */ Boolean = js.native
  def isCompositeComponentWithType[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
  def isDOMComponent(instance: ReactInstance): /* is std.Element */ Boolean = js.native
  def isElement(element: js.Any): Boolean = js.native
  def isElementOfType[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
  def isElementOfType[P](element: ReactElement, `type`: SFC[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
  def isElementOfType[P, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
  @JSName("isElementOfType")
  def isElementOfType_P_DOMAttributesObjectT_Element[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: slinky.core.facade.ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
  def mockComponent(mocked: MockedComponentClass): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def mockComponent(mocked: MockedComponentClass, mockTagName: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def renderIntoDocument(element: SFCElement[_]): Unit = js.native
  def renderIntoDocument[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def renderIntoDocument[P](element: ReactElement): ReactComponentClass[P] | Element | Unit = js.native
  def renderIntoDocument[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T]): T = js.native
  def scryRenderedComponentsWithType[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](root: ReactComponentClass[_], `type`: ClassType[_, T, C]): js.Array[T] = js.native
  def scryRenderedDOMComponentsWithClass(root: ReactComponentClass[_], className: String): js.Array[Element] = js.native
  def scryRenderedDOMComponentsWithTag(root: ReactComponentClass[_], tagName: String): js.Array[Element] = js.native
}

