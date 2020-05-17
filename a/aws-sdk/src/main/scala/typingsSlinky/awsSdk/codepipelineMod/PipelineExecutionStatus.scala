package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.Stopped_
  - typingsSlinky.awsSdk.awsSdkStrings.Stopping_
  - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
  - typingsSlinky.awsSdk.awsSdkStrings.Superseded_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait PipelineExecutionStatus extends js.Object

object PipelineExecutionStatus {
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def Stopped_ : typingsSlinky.awsSdk.awsSdkStrings.Stopped_ = "Stopped".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Stopped_]
  @scala.inline
  def Stopping_ : typingsSlinky.awsSdk.awsSdkStrings.Stopping_ = "Stopping".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Stopping_]
  @scala.inline
  def Succeeded_ : typingsSlinky.awsSdk.awsSdkStrings.Succeeded_ = "Succeeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Succeeded_]
  @scala.inline
  def Superseded_ : typingsSlinky.awsSdk.awsSdkStrings.Superseded_ = "Superseded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Superseded_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: java.lang.String): PipelineExecutionStatus = value.asInstanceOf[PipelineExecutionStatus]
}

