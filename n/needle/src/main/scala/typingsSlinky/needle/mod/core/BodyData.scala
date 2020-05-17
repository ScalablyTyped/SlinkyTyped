package typingsSlinky.needle.mod.core

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.needle.mod.core.KeyValue
  - typingsSlinky.node.NodeJS.ReadableStream
  - java.lang.String
  - scala.Null
*/
trait BodyData extends js.Object

object BodyData {
  @scala.inline
  implicit def apply(value: Buffer): BodyData = value.asInstanceOf[BodyData]
  @scala.inline
  implicit def apply(value: KeyValue): BodyData = value.asInstanceOf[BodyData]
  @scala.inline
  implicit def apply(value: Null): BodyData = value.asInstanceOf[BodyData]
  @scala.inline
  implicit def apply(value: typingsSlinky.node.NodeJS.ReadableStream): BodyData = value.asInstanceOf[BodyData]
  @scala.inline
  implicit def apply(value: String): BodyData = value.asInstanceOf[BodyData]
}

