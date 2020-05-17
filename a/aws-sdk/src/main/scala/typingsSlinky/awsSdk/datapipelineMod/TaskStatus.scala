package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FINISHED
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.FALSE
  - java.lang.String
*/
trait TaskStatus extends js.Object

object TaskStatus {
  @scala.inline
  def FINISHED: typingsSlinky.awsSdk.awsSdkStrings.FINISHED = "FINISHED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FINISHED]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  def FALSE: typingsSlinky.awsSdk.awsSdkStrings.FALSE = "FALSE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FALSE]
  @scala.inline
  implicit def apply(value: String): TaskStatus = value.asInstanceOf[TaskStatus]
}

