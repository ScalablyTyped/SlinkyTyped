package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NotStarted
  - typingsSlinky.awsSdk.awsSdkStrings.Started_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.Completed_
  - typingsSlinky.awsSdk.awsSdkStrings.Succeeded_
  - java.lang.String
*/
trait OperationStatus extends js.Object

object OperationStatus {
  @scala.inline
  def NotStarted: typingsSlinky.awsSdk.awsSdkStrings.NotStarted = "NotStarted".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NotStarted]
  @scala.inline
  def Started_ : typingsSlinky.awsSdk.awsSdkStrings.Started_ = "Started".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Started_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def Completed_ : typingsSlinky.awsSdk.awsSdkStrings.Completed_ = "Completed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Completed_]
  @scala.inline
  def Succeeded_ : typingsSlinky.awsSdk.awsSdkStrings.Succeeded_ = "Succeeded".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Succeeded_]
  @scala.inline
  implicit def apply(value: String): OperationStatus = value.asInstanceOf[OperationStatus]
}

