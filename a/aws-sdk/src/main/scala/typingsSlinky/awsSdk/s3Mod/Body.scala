package typingsSlinky.awsSdk.s3Mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.s3Mod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait Body extends js.Object

object Body {
  @scala.inline
  implicit def apply(value: Blob): Body = value.asInstanceOf[Body]
  @scala.inline
  implicit def apply(value: Buffer): Body = value.asInstanceOf[Body]
  @scala.inline
  implicit def apply(value: Readable): Body = value.asInstanceOf[Body]
  @scala.inline
  implicit def apply(value: String): Body = value.asInstanceOf[Body]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Body = value.asInstanceOf[Body]
}

