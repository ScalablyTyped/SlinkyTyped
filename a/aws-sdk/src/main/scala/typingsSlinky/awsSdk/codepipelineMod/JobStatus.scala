package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Created_
  - typingsSlinky.awsSdk.awsSdkStrings.Queued_
  - typingsSlinky.awsSdk.awsSdkStrings.Dispatched
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.TimedOut_
  - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait JobStatus extends js.Object

object JobStatus {
  @scala.inline
  def Created_ : typingsSlinky.awsSdk.awsSdkStrings.Created_ = "Created".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Created_]
  @scala.inline
  def Queued_ : typingsSlinky.awsSdk.awsSdkStrings.Queued_ = "Queued".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Queued_]
  @scala.inline
  def Dispatched: typingsSlinky.awsSdk.awsSdkStrings.Dispatched = "Dispatched".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Dispatched]
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def TimedOut_ : typingsSlinky.awsSdk.awsSdkStrings.TimedOut_ = "TimedOut".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TimedOut_]
  @scala.inline
  def Succeeded_ : typingsSlinky.awsSdk.awsSdkStrings.Succeeded_ = "Succeeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Succeeded_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: java.lang.String): JobStatus = value.asInstanceOf[JobStatus]
}

