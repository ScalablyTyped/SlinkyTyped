package typingsSlinky.polymer.mod._Global_.polymer

import org.scalajs.dom.raw.Node
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomApiStatic extends js.Object {
  def apply(obj: Base): DomApi = js.native
  def apply(obj: Event_): EventApi = js.native
  def apply(obj: Node): DomApi = js.native
  def flush(): Unit = js.native
}

