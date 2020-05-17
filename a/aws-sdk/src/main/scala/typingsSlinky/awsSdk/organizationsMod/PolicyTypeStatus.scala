package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_ENABLE
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DISABLE
  - java.lang.String
*/
trait PolicyTypeStatus extends js.Object

object PolicyTypeStatus {
  @scala.inline
  def ENABLED: typingsSlinky.awsSdk.awsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENABLED]
  @scala.inline
  def PENDING_ENABLE: typingsSlinky.awsSdk.awsSdkStrings.PENDING_ENABLE = "PENDING_ENABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_ENABLE]
  @scala.inline
  def PENDING_DISABLE: typingsSlinky.awsSdk.awsSdkStrings.PENDING_DISABLE = "PENDING_DISABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_DISABLE]
  @scala.inline
  implicit def apply(value: String): PolicyTypeStatus = value.asInstanceOf[PolicyTypeStatus]
}

