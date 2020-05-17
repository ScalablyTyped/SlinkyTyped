package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`allow-all`
  - typingsSlinky.awsSdk.awsSdkStrings.`https-only`
  - typingsSlinky.awsSdk.awsSdkStrings.`redirect-to-https`
  - java.lang.String
*/
trait ViewerProtocolPolicy extends js.Object

object ViewerProtocolPolicy {
  @scala.inline
  def `allow-all`: typingsSlinky.awsSdk.awsSdkStrings.`allow-all` = "allow-all".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`allow-all`]
  @scala.inline
  def `https-only`: typingsSlinky.awsSdk.awsSdkStrings.`https-only` = "https-only".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`https-only`]
  @scala.inline
  def `redirect-to-https`: typingsSlinky.awsSdk.awsSdkStrings.`redirect-to-https` = "redirect-to-https".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`redirect-to-https`]
  @scala.inline
  implicit def apply(value: String): ViewerProtocolPolicy = value.asInstanceOf[ViewerProtocolPolicy]
}

