package typingsSlinky.awsSdk.glacierMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.glacierMod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait Stream extends js.Object

object Stream {
  @scala.inline
  implicit def apply(value: Blob): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: Buffer): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: Readable): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: String): Stream = value.asInstanceOf[Stream]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Stream = value.asInstanceOf[Stream]
}

