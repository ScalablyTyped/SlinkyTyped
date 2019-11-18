package typingsSlinky.reactDashDom.testDashUtilsMod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.CElement
import typingsSlinky.react.reactMod.DOMElement
import typingsSlinky.react.reactMod.ReactElement
import typingsSlinky.react.reactMod.SFCElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "renderIntoDocument")
@js.native
object renderIntoDocument extends js.Object {
  def apply(element: SFCElement[_]): Unit = js.native
  def apply[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def apply[P](element: ReactElement): ReactComponentClass[P] | Element | Unit = js.native
  def apply[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T]): T = js.native
}

