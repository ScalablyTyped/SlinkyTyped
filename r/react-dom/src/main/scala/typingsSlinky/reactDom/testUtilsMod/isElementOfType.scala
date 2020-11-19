package typingsSlinky.reactDom.testUtilsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ClassType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dom/test-utils", "isElementOfType")
@js.native
object isElementOfType extends js.Object {
  
  def apply[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
  def apply[P](element: ReactElement, `type`: ReactComponentClass[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
  def apply[P, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
}
