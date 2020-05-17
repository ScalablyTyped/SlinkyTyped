package typingsSlinky.mailparser.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.streamMod.Stream
  - java.lang.String
*/
trait Source extends js.Object

object Source {
  @scala.inline
  implicit def apply(value: Buffer): Source = value.asInstanceOf[Source]
  @scala.inline
  implicit def apply(value: Stream): Source = value.asInstanceOf[Source]
  @scala.inline
  implicit def apply(value: String): Source = value.asInstanceOf[Source]
}

