package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
  - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
trait ControlStatus extends js.Object

object ControlStatus {
  @scala.inline
  def ENABLED: typingsSlinky.awsSdk.awsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENABLED]
  @scala.inline
  def DISABLED: typingsSlinky.awsSdk.awsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISABLED]
  @scala.inline
  implicit def apply(value: String): ControlStatus = value.asInstanceOf[ControlStatus]
}

