package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`http-only`
  - typingsSlinky.awsSdk.awsSdkStrings.`match-viewer`
  - typingsSlinky.awsSdk.awsSdkStrings.`https-only`
  - java.lang.String
*/
trait OriginProtocolPolicy extends js.Object

object OriginProtocolPolicy {
  @scala.inline
  def `http-only`: typingsSlinky.awsSdk.awsSdkStrings.`http-only` = "http-only".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`http-only`]
  @scala.inline
  def `match-viewer`: typingsSlinky.awsSdk.awsSdkStrings.`match-viewer` = "match-viewer".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`match-viewer`]
  @scala.inline
  def `https-only`: typingsSlinky.awsSdk.awsSdkStrings.`https-only` = "https-only".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`https-only`]
  @scala.inline
  implicit def apply(value: String): OriginProtocolPolicy = value.asInstanceOf[OriginProtocolPolicy]
}

