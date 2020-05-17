package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EMAIL
  - typingsSlinky.awsSdk.awsSdkStrings.SMS
  - typingsSlinky.awsSdk.awsSdkStrings.VOICE
  - typingsSlinky.awsSdk.awsSdkStrings.PUSH
  - java.lang.String
*/
trait TemplateType extends js.Object

object TemplateType {
  @scala.inline
  def EMAIL: typingsSlinky.awsSdk.awsSdkStrings.EMAIL = "EMAIL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EMAIL]
  @scala.inline
  def SMS: typingsSlinky.awsSdk.awsSdkStrings.SMS = "SMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SMS]
  @scala.inline
  def VOICE: typingsSlinky.awsSdk.awsSdkStrings.VOICE = "VOICE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VOICE]
  @scala.inline
  def PUSH: typingsSlinky.awsSdk.awsSdkStrings.PUSH = "PUSH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUSH]
  @scala.inline
  implicit def apply(value: String): TemplateType = value.asInstanceOf[TemplateType]
}

