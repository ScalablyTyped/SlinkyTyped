package typingsSlinky.memorystream.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.node.streamMod.Stream
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  implicit def apply(value: Buffer): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: Stream): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: String): DataType = value.asInstanceOf[DataType]
}

