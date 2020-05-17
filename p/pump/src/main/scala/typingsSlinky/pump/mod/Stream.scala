package typingsSlinky.pump.mod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.ReadableStream
  - typingsSlinky.node.NodeJS.WritableStream
*/
trait Stream extends js.Object

object Stream {
  @scala.inline
  implicit def apply(value: ReadableStream): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: WritableStream): Stream = value.asInstanceOf[Stream]
}

