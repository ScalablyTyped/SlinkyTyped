package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SignIn
  - typingsSlinky.awsSdk.awsSdkStrings.SignUp
  - typingsSlinky.awsSdk.awsSdkStrings.ForgotPassword
  - java.lang.String
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def SignIn: typingsSlinky.awsSdk.awsSdkStrings.SignIn = "SignIn".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SignIn]
  @scala.inline
  def SignUp: typingsSlinky.awsSdk.awsSdkStrings.SignUp = "SignUp".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SignUp]
  @scala.inline
  def ForgotPassword: typingsSlinky.awsSdk.awsSdkStrings.ForgotPassword = "ForgotPassword".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ForgotPassword]
  @scala.inline
  implicit def apply(value: String): EventType = value.asInstanceOf[EventType]
}

