package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNCONFIRMED
  - typingsSlinky.awsSdk.awsSdkStrings.CONFIRMED
  - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED
  - typingsSlinky.awsSdk.awsSdkStrings.COMPROMISED
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - typingsSlinky.awsSdk.awsSdkStrings.RESET_REQUIRED
  - typingsSlinky.awsSdk.awsSdkStrings.FORCE_CHANGE_PASSWORD
  - java.lang.String
*/
trait UserStatusType extends js.Object

object UserStatusType {
  @scala.inline
  def UNCONFIRMED: typingsSlinky.awsSdk.awsSdkStrings.UNCONFIRMED = "UNCONFIRMED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNCONFIRMED]
  @scala.inline
  def CONFIRMED: typingsSlinky.awsSdk.awsSdkStrings.CONFIRMED = "CONFIRMED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONFIRMED]
  @scala.inline
  def ARCHIVED: typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED = "ARCHIVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED]
  @scala.inline
  def COMPROMISED: typingsSlinky.awsSdk.awsSdkStrings.COMPROMISED = "COMPROMISED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPROMISED]
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  def RESET_REQUIRED: typingsSlinky.awsSdk.awsSdkStrings.RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESET_REQUIRED]
  @scala.inline
  def FORCE_CHANGE_PASSWORD: typingsSlinky.awsSdk.awsSdkStrings.FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FORCE_CHANGE_PASSWORD]
  @scala.inline
  implicit def apply(value: String): UserStatusType = value.asInstanceOf[UserStatusType]
}

