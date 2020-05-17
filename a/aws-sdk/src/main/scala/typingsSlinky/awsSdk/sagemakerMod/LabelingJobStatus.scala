package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.Completed_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
  - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
trait LabelingJobStatus extends js.Object

object LabelingJobStatus {
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def Completed_ : typingsSlinky.awsSdk.awsSdkStrings.Completed_ = "Completed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Completed_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def Stopping_ : typingsSlinky.awsSdk.awsSdkStrings.Stopping_ = "Stopping".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Stopping_]
  @scala.inline
  def Stopped_ : typingsSlinky.awsSdk.awsSdkStrings.Stopped_ = "Stopped".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Stopped_]
  @scala.inline
  implicit def apply(value: java.lang.String): LabelingJobStatus = value.asInstanceOf[LabelingJobStatus]
}

