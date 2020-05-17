package typingsSlinky.awsSdk.pollyMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.pollyMod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait AudioStream extends js.Object

object AudioStream {
  @scala.inline
  implicit def apply(value: Blob): AudioStream = value.asInstanceOf[AudioStream]
  @scala.inline
  implicit def apply(value: Buffer): AudioStream = value.asInstanceOf[AudioStream]
  @scala.inline
  implicit def apply(value: Readable): AudioStream = value.asInstanceOf[AudioStream]
  @scala.inline
  implicit def apply(value: String): AudioStream = value.asInstanceOf[AudioStream]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): AudioStream = value.asInstanceOf[AudioStream]
}

