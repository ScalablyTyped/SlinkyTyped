package typingsSlinky.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Success_
  - typingsSlinky.awsSdk.awsSdkStrings.CustomerNotSubscribed
  - typingsSlinky.awsSdk.awsSdkStrings.DuplicateRecord
  - java.lang.String
*/
trait UsageRecordResultStatus extends js.Object

object UsageRecordResultStatus {
  @scala.inline
  def Success_ : typingsSlinky.awsSdk.awsSdkStrings.Success_ = "Success".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Success_]
  @scala.inline
  def CustomerNotSubscribed: typingsSlinky.awsSdk.awsSdkStrings.CustomerNotSubscribed = "CustomerNotSubscribed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CustomerNotSubscribed]
  @scala.inline
  def DuplicateRecord: typingsSlinky.awsSdk.awsSdkStrings.DuplicateRecord = "DuplicateRecord".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DuplicateRecord]
  @scala.inline
  implicit def apply(value: java.lang.String): UsageRecordResultStatus = value.asInstanceOf[UsageRecordResultStatus]
}

