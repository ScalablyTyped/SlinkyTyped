package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NotSent
  - typingsSlinky.awsSdk.awsSdkStrings.Sent
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
trait EmailStatus extends js.Object

object EmailStatus {
  @scala.inline
  def NotSent: typingsSlinky.awsSdk.awsSdkStrings.NotSent = "NotSent".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NotSent]
  @scala.inline
  def Sent: typingsSlinky.awsSdk.awsSdkStrings.Sent = "Sent".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Sent]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  implicit def apply(value: java.lang.String): EmailStatus = value.asInstanceOf[EmailStatus]
}

