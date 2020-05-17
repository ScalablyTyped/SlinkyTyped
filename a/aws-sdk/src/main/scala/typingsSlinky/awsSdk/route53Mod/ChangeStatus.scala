package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.INSYNC
  - java.lang.String
*/
trait ChangeStatus extends js.Object

object ChangeStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def INSYNC: typingsSlinky.awsSdk.awsSdkStrings.INSYNC = "INSYNC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INSYNC]
  @scala.inline
  implicit def apply(value: String): ChangeStatus = value.asInstanceOf[ChangeStatus]
}

