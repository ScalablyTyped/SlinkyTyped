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
trait CertificateChainBlob extends js.Object

object CertificateChainBlob {
  @scala.inline
  implicit def apply(value: Blob): CertificateChainBlob = value.asInstanceOf[CertificateChainBlob]
  @scala.inline
  implicit def apply(value: Buffer): CertificateChainBlob = value.asInstanceOf[CertificateChainBlob]
  @scala.inline
  implicit def apply(value: java.lang.String): CertificateChainBlob = value.asInstanceOf[CertificateChainBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CertificateChainBlob = value.asInstanceOf[CertificateChainBlob]
}

