package typingsSlinky.reactDom.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dom", "findDOMNode")
@js.native
object findDOMNode extends js.Object {
  
  def apply(): Element | Null | Text = js.native
  def apply(instance: ReactInstance): Element | Null | Text = js.native
}
