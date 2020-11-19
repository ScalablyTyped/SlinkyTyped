package typingsSlinky.reactDom.mod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactPortal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dom", "createPortal")
@js.native
object createPortal extends js.Object {
  
  def apply(children: ReactElement, container: Element): ReactPortal = js.native
  def apply(children: ReactElement, container: Element, key: String): ReactPortal = js.native
}
