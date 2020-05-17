package typingsSlinky.awsSdk.kinesisvideomediaMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.kinesisvideomediaMod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait Payload extends js.Object

object Payload {
  @scala.inline
  implicit def apply(value: Blob): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: Buffer): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: Readable): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: String): Payload = value.asInstanceOf[Payload]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Payload = value.asInstanceOf[Payload]
}

