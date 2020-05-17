package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED
  - java.lang.String
*/
trait AccountStatus extends js.Object

object AccountStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def SUSPENDED: typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED = "SUSPENDED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUSPENDED]
  @scala.inline
  implicit def apply(value: String): AccountStatus = value.asInstanceOf[AccountStatus]
}

