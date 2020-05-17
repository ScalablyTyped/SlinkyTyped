package typingsSlinky.axeCore.mod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Node
  - java.lang.String
  - typingsSlinky.axeCore.mod.ContextObject
*/
trait ElementContext extends js.Object

object ElementContext {
  @scala.inline
  implicit def apply(value: ContextObject): ElementContext = value.asInstanceOf[ElementContext]
  @scala.inline
  implicit def apply(value: Node): ElementContext = value.asInstanceOf[ElementContext]
  @scala.inline
  implicit def apply(value: String): ElementContext = value.asInstanceOf[ElementContext]
}

