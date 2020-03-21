package typingsSlinky.kdbxweb.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Meta")
@js.native
class Meta () extends js.Object {
  def merge(remote: Meta, objectMap: ObjectMap): Unit = js.native
  def write(parentNode: Node, ctx: Context): Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "Meta")
@js.native
object Meta extends js.Object {
  def create(): Meta = js.native
  def read(xmlNode: Node, ctx: Context): Meta = js.native
}

