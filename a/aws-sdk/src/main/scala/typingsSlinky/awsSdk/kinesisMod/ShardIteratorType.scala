package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
  - typingsSlinky.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
  - typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typingsSlinky.awsSdk.awsSdkStrings.LATEST
  - typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP
  - java.lang.String
*/
trait ShardIteratorType extends js.Object

object ShardIteratorType {
  @scala.inline
  def AT_SEQUENCE_NUMBER: typingsSlinky.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER = "AT_SEQUENCE_NUMBER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER]
  @scala.inline
  def AFTER_SEQUENCE_NUMBER: typingsSlinky.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER = "AFTER_SEQUENCE_NUMBER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER]
  @scala.inline
  def TRIM_HORIZON: typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON = "TRIM_HORIZON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRIM_HORIZON]
  @scala.inline
  def LATEST: typingsSlinky.awsSdk.awsSdkStrings.LATEST = "LATEST".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LATEST]
  @scala.inline
  def AT_TIMESTAMP: typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP = "AT_TIMESTAMP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AT_TIMESTAMP]
  @scala.inline
  implicit def apply(value: String): ShardIteratorType = value.asInstanceOf[ShardIteratorType]
}

