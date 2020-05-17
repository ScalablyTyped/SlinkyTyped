package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.LOW
  - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM
  - typingsSlinky.awsSdk.awsSdkStrings.HIGH
  - typingsSlinky.awsSdk.awsSdkStrings.CRITICAL
  - java.lang.String
*/
trait SeverityRating extends js.Object

object SeverityRating {
  @scala.inline
  def LOW: typingsSlinky.awsSdk.awsSdkStrings.LOW = "LOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LOW]
  @scala.inline
  def MEDIUM: typingsSlinky.awsSdk.awsSdkStrings.MEDIUM = "MEDIUM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MEDIUM]
  @scala.inline
  def HIGH: typingsSlinky.awsSdk.awsSdkStrings.HIGH = "HIGH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HIGH]
  @scala.inline
  def CRITICAL: typingsSlinky.awsSdk.awsSdkStrings.CRITICAL = "CRITICAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CRITICAL]
  @scala.inline
  implicit def apply(value: String): SeverityRating = value.asInstanceOf[SeverityRating]
}

