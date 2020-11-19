package typingsSlinky.kdbxweb.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Context")
@js.native
class Context protected () extends js.Object {
  def this(opts: Kdbx) = this()
  
  def setXmlDate(node: Node, dt: js.Date): Unit = js.native
}
