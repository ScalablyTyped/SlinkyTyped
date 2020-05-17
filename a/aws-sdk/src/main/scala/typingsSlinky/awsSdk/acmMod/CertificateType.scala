package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IMPORTED
  - typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ISSUED
  - typingsSlinky.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
trait CertificateType extends js.Object

object CertificateType {
  @scala.inline
  def IMPORTED: typingsSlinky.awsSdk.awsSdkStrings.IMPORTED = "IMPORTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMPORTED]
  @scala.inline
  def AMAZON_ISSUED: typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ISSUED = "AMAZON_ISSUED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AMAZON_ISSUED]
  @scala.inline
  def PRIVATE: typingsSlinky.awsSdk.awsSdkStrings.PRIVATE = "PRIVATE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRIVATE]
  @scala.inline
  implicit def apply(value: java.lang.String): CertificateType = value.asInstanceOf[CertificateType]
}

