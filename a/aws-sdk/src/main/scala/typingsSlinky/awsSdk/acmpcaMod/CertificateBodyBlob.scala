package typingsSlinky.awsSdk.acmpcaMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.acmpcaMod.Blob
  - java.lang.String
*/
trait CertificateBodyBlob extends js.Object

object CertificateBodyBlob {
  @scala.inline
  implicit def apply(value: Blob): CertificateBodyBlob = value.asInstanceOf[CertificateBodyBlob]
  @scala.inline
  implicit def apply(value: Buffer): CertificateBodyBlob = value.asInstanceOf[CertificateBodyBlob]
  @scala.inline
  implicit def apply(value: java.lang.String): CertificateBodyBlob = value.asInstanceOf[CertificateBodyBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CertificateBodyBlob = value.asInstanceOf[CertificateBodyBlob]
}

