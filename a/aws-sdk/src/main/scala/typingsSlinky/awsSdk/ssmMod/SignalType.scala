package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Approve_
  - typingsSlinky.awsSdk.awsSdkStrings.Reject_
  - typingsSlinky.awsSdk.awsSdkStrings.StartStep
  - typingsSlinky.awsSdk.awsSdkStrings.StopStep
  - typingsSlinky.awsSdk.awsSdkStrings.Resume
  - java.lang.String
*/
trait SignalType extends js.Object

object SignalType {
  @scala.inline
  def Approve_ : typingsSlinky.awsSdk.awsSdkStrings.Approve_ = "Approve".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Approve_]
  @scala.inline
  def Reject_ : typingsSlinky.awsSdk.awsSdkStrings.Reject_ = "Reject".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Reject_]
  @scala.inline
  def StartStep: typingsSlinky.awsSdk.awsSdkStrings.StartStep = "StartStep".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.StartStep]
  @scala.inline
  def StopStep: typingsSlinky.awsSdk.awsSdkStrings.StopStep = "StopStep".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.StopStep]
  @scala.inline
  def Resume: typingsSlinky.awsSdk.awsSdkStrings.Resume = "Resume".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Resume]
  @scala.inline
  implicit def apply(value: java.lang.String): SignalType = value.asInstanceOf[SignalType]
}

