package typingsSlinky.memFsEditor.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait Contents extends js.Object

object Contents {
  @scala.inline
  implicit def apply(value: Buffer): Contents = value.asInstanceOf[Contents]
  @scala.inline
  implicit def apply(value: String): Contents = value.asInstanceOf[Contents]
}

