package typingsSlinky.reactDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.ClassType
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.SFC
import typingsSlinky.react.mod.SFCElement
import typingsSlinky.reactDom.testUtilsMod.MockedComponentClass
import typingsSlinky.reactDom.testUtilsMod.ShallowRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactTestUtils extends js.Object {
  val Simulate: TypeofSimulate = js.native
  def act(callback: js.Function0[js.UndefOr[Unit]]): Unit = js.native
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
  def isElementOfType_P_DOMAttributesObjectT_Element[P /* <: DOMAttributes[js.Object] */, T /* <: Element */](element: ReactElement, `type`: String): /* is react.react.DOMElement<P, T> */ Boolean = js.native
  def mockComponent(mocked: MockedComponentClass): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def mockComponent(mocked: MockedComponentClass, mockTagName: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof ReactTestUtils */ js.Any = js.native
  def renderIntoDocument(element: SFCElement[_]): Unit = js.native
  def renderIntoDocument[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def renderIntoDocument[P](element: typingsSlinky.react.mod.ReactElement): ReactComponentClass[P] | Element | Unit = js.native
  def renderIntoDocument[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T]): T = js.native
  def scryRenderedComponentsWithType[T /* <: ReactComponentClass[_] */, C /* <: ReactComponentClass[_] */](root: ReactComponentClass[_], `type`: ClassType[_, T, C]): js.Array[T] = js.native
  def scryRenderedDOMComponentsWithClass(root: ReactComponentClass[_], className: String): js.Array[Element] = js.native
  def scryRenderedDOMComponentsWithTag(root: ReactComponentClass[_], tagName: String): js.Array[Element] = js.native
}

