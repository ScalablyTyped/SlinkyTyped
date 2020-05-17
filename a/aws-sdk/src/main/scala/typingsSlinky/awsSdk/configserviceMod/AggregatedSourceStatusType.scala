package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsSlinky.awsSdk.awsSdkStrings.OUTDATED
  - java.lang.String
*/
trait AggregatedSourceStatusType extends js.Object

object AggregatedSourceStatusType {
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def SUCCEEDED: typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED]
  @scala.inline
  def OUTDATED: typingsSlinky.awsSdk.awsSdkStrings.OUTDATED = "OUTDATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OUTDATED]
  @scala.inline
  implicit def apply(value: java.lang.String): AggregatedSourceStatusType = value.asInstanceOf[AggregatedSourceStatusType]
}

