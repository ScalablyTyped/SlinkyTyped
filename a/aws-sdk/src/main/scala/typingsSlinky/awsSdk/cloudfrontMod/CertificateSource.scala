package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.cloudfront_
  - typingsSlinky.awsSdk.awsSdkStrings.iam_
  - typingsSlinky.awsSdk.awsSdkStrings.acm
  - java.lang.String
*/
trait CertificateSource extends js.Object

object CertificateSource {
  @scala.inline
  def cloudfront_ : typingsSlinky.awsSdk.awsSdkStrings.cloudfront_ = "cloudfront".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cloudfront_]
  @scala.inline
  def iam_ : typingsSlinky.awsSdk.awsSdkStrings.iam_ = "iam".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.iam_]
  @scala.inline
  def acm: typingsSlinky.awsSdk.awsSdkStrings.acm = "acm".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.acm]
  @scala.inline
  implicit def apply(value: String): CertificateSource = value.asInstanceOf[CertificateSource]
}

