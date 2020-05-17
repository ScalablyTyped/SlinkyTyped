package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AGENT
  - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER
  - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
  - java.lang.String
*/
trait ParticipantRole extends js.Object

object ParticipantRole {
  @scala.inline
  def AGENT: typingsSlinky.awsSdk.awsSdkStrings.AGENT = "AGENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AGENT]
  @scala.inline
  def CUSTOMER: typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER = "CUSTOMER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER]
  @scala.inline
  def SYSTEM: typingsSlinky.awsSdk.awsSdkStrings.SYSTEM = "SYSTEM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYSTEM]
  @scala.inline
  implicit def apply(value: String): ParticipantRole = value.asInstanceOf[ParticipantRole]
}

