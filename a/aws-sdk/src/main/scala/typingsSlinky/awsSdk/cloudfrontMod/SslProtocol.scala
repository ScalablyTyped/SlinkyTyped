package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SSLv3
  - typingsSlinky.awsSdk.awsSdkStrings.TLSv1
  - typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot1
  - typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot2
  - java.lang.String
*/
trait SslProtocol extends js.Object

object SslProtocol {
  @scala.inline
  def SSLv3: typingsSlinky.awsSdk.awsSdkStrings.SSLv3 = "SSLv3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSLv3]
  @scala.inline
  def TLSv1: typingsSlinky.awsSdk.awsSdkStrings.TLSv1 = "TLSv1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TLSv1]
  @scala.inline
  def TLSv1Dot1: typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot1]
  @scala.inline
  def TLSv1Dot2: typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TLSv1Dot2]
  @scala.inline
  implicit def apply(value: String): SslProtocol = value.asInstanceOf[SslProtocol]
}

