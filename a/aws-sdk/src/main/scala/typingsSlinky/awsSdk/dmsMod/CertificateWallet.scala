package typingsSlinky.awsSdk.dmsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.dmsMod.Blob
  - java.lang.String
*/
trait CertificateWallet extends js.Object

object CertificateWallet {
  @scala.inline
  implicit def apply(value: Blob): CertificateWallet = value.asInstanceOf[CertificateWallet]
  @scala.inline
  implicit def apply(value: Buffer): CertificateWallet = value.asInstanceOf[CertificateWallet]
  @scala.inline
  implicit def apply(value: java.lang.String): CertificateWallet = value.asInstanceOf[CertificateWallet]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CertificateWallet = value.asInstanceOf[CertificateWallet]
}

