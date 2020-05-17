package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INVITE
  - typingsSlinky.awsSdk.awsSdkStrings.ENABLE_ALL_FEATURES
  - typingsSlinky.awsSdk.awsSdkStrings.APPROVE_ALL_FEATURES
  - typingsSlinky.awsSdk.awsSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
  - java.lang.String
*/
trait ActionType extends js.Object

object ActionType {
  @scala.inline
  def INVITE: typingsSlinky.awsSdk.awsSdkStrings.INVITE = "INVITE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INVITE]
  @scala.inline
  def ENABLE_ALL_FEATURES: typingsSlinky.awsSdk.awsSdkStrings.ENABLE_ALL_FEATURES = "ENABLE_ALL_FEATURES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENABLE_ALL_FEATURES]
  @scala.inline
  def APPROVE_ALL_FEATURES: typingsSlinky.awsSdk.awsSdkStrings.APPROVE_ALL_FEATURES = "APPROVE_ALL_FEATURES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.APPROVE_ALL_FEATURES]
  @scala.inline
  def ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE: typingsSlinky.awsSdk.awsSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE = "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE]
  @scala.inline
  implicit def apply(value: String): ActionType = value.asInstanceOf[ActionType]
}

