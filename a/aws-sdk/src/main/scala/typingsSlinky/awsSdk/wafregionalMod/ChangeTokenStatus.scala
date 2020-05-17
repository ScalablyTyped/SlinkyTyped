package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.INSYNC
  - java.lang.String
*/
trait ChangeTokenStatus extends js.Object

object ChangeTokenStatus {
  @scala.inline
  def PROVISIONED: typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED = "PROVISIONED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROVISIONED]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def INSYNC: typingsSlinky.awsSdk.awsSdkStrings.INSYNC = "INSYNC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSYNC]
  @scala.inline
  implicit def apply(value: String): ChangeTokenStatus = value.asInstanceOf[ChangeTokenStatus]
}

