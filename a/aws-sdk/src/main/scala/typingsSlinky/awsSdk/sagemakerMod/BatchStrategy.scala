package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MultiRecord
  - typingsSlinky.awsSdk.awsSdkStrings.SingleRecord
  - java.lang.String
*/
trait BatchStrategy extends js.Object

object BatchStrategy {
  @scala.inline
  def MultiRecord: typingsSlinky.awsSdk.awsSdkStrings.MultiRecord = "MultiRecord".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MultiRecord]
  @scala.inline
  def SingleRecord: typingsSlinky.awsSdk.awsSdkStrings.SingleRecord = "SingleRecord".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SingleRecord]
  @scala.inline
  implicit def apply(value: java.lang.String): BatchStrategy = value.asInstanceOf[BatchStrategy]
}

