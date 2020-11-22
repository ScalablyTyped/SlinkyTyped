package typingsSlinky.kagekiri

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kagekiri", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def querySelector(selector: String): HTMLElement | Null = js.native
  def querySelector(selector: String, context: Node): HTMLElement | Null = js.native
  
  def querySelectorAll(selector: String): NodeList = js.native
  def querySelectorAll(selector: String, context: Node): NodeList = js.native
}
