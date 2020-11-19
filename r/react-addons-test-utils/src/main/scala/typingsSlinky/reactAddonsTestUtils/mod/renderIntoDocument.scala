package typingsSlinky.reactAddonsTestUtils.mod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.DOMElement
import typingsSlinky.react.mod.ReactElement
import typingsSlinky.react.mod.SFCElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-addons-test-utils", "renderIntoDocument")
@js.native
object renderIntoDocument extends js.Object {
  
  def apply(element: SFCElement[_]): Unit = js.native
  def apply[T /* <: ReactComponentClass[_] */](element: CElement[_, T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def apply[P](element: ReactElement): ReactComponentClass[P] | Element | Unit = js.native
}
