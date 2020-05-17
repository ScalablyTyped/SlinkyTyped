package typingsSlinky.combinedStream.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.ReadableStream
  - typingsSlinky.node.NodeJS.WritableStream
  - typingsSlinky.node.Buffer
  - java.lang.String
  - typingsSlinky.combinedStream.mod.NextFunction
*/
trait Appendable extends js.Object

object Appendable {
  @scala.inline
  implicit def apply(value: Buffer): Appendable = value.asInstanceOf[Appendable]
  @scala.inline
  implicit def apply(value: NextFunction): Appendable = value.asInstanceOf[Appendable]
  @scala.inline
  implicit def apply(value: ReadableStream): Appendable = value.asInstanceOf[Appendable]
  @scala.inline
  implicit def apply(value: String): Appendable = value.asInstanceOf[Appendable]
  @scala.inline
  implicit def apply(value: WritableStream): Appendable = value.asInstanceOf[Appendable]
}

