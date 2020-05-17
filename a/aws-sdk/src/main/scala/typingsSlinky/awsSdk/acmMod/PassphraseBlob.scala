package typingsSlinky.awsSdk.acmMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.acmMod.Blob
  - java.lang.String
*/
trait PassphraseBlob extends js.Object

object PassphraseBlob {
  @scala.inline
  implicit def apply(value: Blob): PassphraseBlob = value.asInstanceOf[PassphraseBlob]
  @scala.inline
  implicit def apply(value: Buffer): PassphraseBlob = value.asInstanceOf[PassphraseBlob]
  @scala.inline
  implicit def apply(value: java.lang.String): PassphraseBlob = value.asInstanceOf[PassphraseBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): PassphraseBlob = value.asInstanceOf[PassphraseBlob]
}

