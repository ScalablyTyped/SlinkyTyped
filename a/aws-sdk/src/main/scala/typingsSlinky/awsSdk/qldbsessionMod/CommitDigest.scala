package typingsSlinky.awsSdk.qldbsessionMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.qldbsessionMod.Blob
  - java.lang.String
*/
trait CommitDigest extends js.Object

object CommitDigest {
  @scala.inline
  implicit def apply(value: Blob): CommitDigest = value.asInstanceOf[CommitDigest]
  @scala.inline
  implicit def apply(value: Buffer): CommitDigest = value.asInstanceOf[CommitDigest]
  @scala.inline
  implicit def apply(value: String): CommitDigest = value.asInstanceOf[CommitDigest]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CommitDigest = value.asInstanceOf[CommitDigest]
}

