package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.InProgress_
  - typingsSlinky.awsSdk.awsSdkStrings.Completed_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
  - typingsSlinky.awsSdk.awsSdkStrings.Cancelling_
  - java.lang.String
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def InProgress_ : typingsSlinky.awsSdk.awsSdkStrings.InProgress_ = "InProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InProgress_]
  @scala.inline
  def Completed_ : typingsSlinky.awsSdk.awsSdkStrings.Completed_ = "Completed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Completed_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def Cancelled_ : typingsSlinky.awsSdk.awsSdkStrings.Cancelled_ = "Cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Cancelled_]
  @scala.inline
  def Cancelling_ : typingsSlinky.awsSdk.awsSdkStrings.Cancelling_ = "Cancelling".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Cancelling_]
  @scala.inline
  implicit def apply(value: java.lang.String): Status = value.asInstanceOf[Status]
}

