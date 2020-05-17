package typingsSlinky.hapiWreck.mod.Client.toReadableStream

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
*/
trait Item extends Payload

object Item {
  @scala.inline
  implicit def apply(value: Buffer): Item = value.asInstanceOf[Item]
  @scala.inline
  implicit def apply(value: String): Item = value.asInstanceOf[Item]
}

