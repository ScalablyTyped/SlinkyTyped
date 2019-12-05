package typingsSlinky.kdbxweb.kdbxwebMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Times")
@js.native
class Times () extends js.Object {
  var creationTime: js.Date = js.native
  var expires: Boolean = js.native
  var expiryTime: js.Date = js.native
  var lastAccessTime: js.Date = js.native
  var lastModTime: js.Date = js.native
  var locationChanged: js.Date = js.native
  var usageCount: Double = js.native
  def update(): Unit = js.native
  def write(parentNode: Node, ctx: Context): Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "Times")
@js.native
object Times extends js.Object {
  def create(): Times = js.native
  def read(xmlNode: Node): Times = js.native
}

