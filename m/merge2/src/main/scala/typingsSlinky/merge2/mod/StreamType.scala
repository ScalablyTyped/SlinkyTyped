package typingsSlinky.merge2.mod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.ReadableStream
  - typingsSlinky.merge2.mod.Merge2Stream
*/
trait StreamType extends Streams

object StreamType {
  @scala.inline
  implicit def apply(value: Merge2Stream): StreamType = value.asInstanceOf[StreamType]
  @scala.inline
  implicit def apply(value: ReadableStream): StreamType = value.asInstanceOf[StreamType]
}

