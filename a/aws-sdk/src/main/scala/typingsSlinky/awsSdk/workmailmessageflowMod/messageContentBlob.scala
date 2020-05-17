package typingsSlinky.awsSdk.workmailmessageflowMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.workmailmessageflowMod.Blob
  - java.lang.String
  - typingsSlinky.node.streamMod.Readable
*/
trait messageContentBlob extends js.Object

object messageContentBlob {
  @scala.inline
  implicit def apply(value: Blob): messageContentBlob = value.asInstanceOf[messageContentBlob]
  @scala.inline
  implicit def apply(value: Buffer): messageContentBlob = value.asInstanceOf[messageContentBlob]
  @scala.inline
  implicit def apply(value: Readable): messageContentBlob = value.asInstanceOf[messageContentBlob]
  @scala.inline
  implicit def apply(value: String): messageContentBlob = value.asInstanceOf[messageContentBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): messageContentBlob = value.asInstanceOf[messageContentBlob]
}

