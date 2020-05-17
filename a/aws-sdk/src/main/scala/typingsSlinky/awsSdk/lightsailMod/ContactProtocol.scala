package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Email_
  - typingsSlinky.awsSdk.awsSdkStrings.SMS
  - java.lang.String
*/
trait ContactProtocol extends js.Object

object ContactProtocol {
  @scala.inline
  def Email_ : typingsSlinky.awsSdk.awsSdkStrings.Email_ = "Email".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Email_]
  @scala.inline
  def SMS: typingsSlinky.awsSdk.awsSdkStrings.SMS = "SMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SMS]
  @scala.inline
  implicit def apply(value: String): ContactProtocol = value.asInstanceOf[ContactProtocol]
}

