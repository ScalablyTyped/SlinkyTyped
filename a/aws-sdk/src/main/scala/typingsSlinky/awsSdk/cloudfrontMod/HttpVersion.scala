package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.http1Dot1
  - typingsSlinky.awsSdk.awsSdkStrings.http2
  - java.lang.String
*/
trait HttpVersion extends js.Object

object HttpVersion {
  @scala.inline
  def http1Dot1: typingsSlinky.awsSdk.awsSdkStrings.http1Dot1 = "http1.1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.http1Dot1]
  @scala.inline
  def http2: typingsSlinky.awsSdk.awsSdkStrings.http2 = "http2".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.http2]
  @scala.inline
  implicit def apply(value: String): HttpVersion = value.asInstanceOf[HttpVersion]
}

