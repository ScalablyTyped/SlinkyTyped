package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
  - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
trait DomainConfigurationStatus extends js.Object

object DomainConfigurationStatus {
  @scala.inline
  def ENABLED: typingsSlinky.awsSdk.awsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENABLED]
  @scala.inline
  def DISABLED: typingsSlinky.awsSdk.awsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISABLED]
  @scala.inline
  implicit def apply(value: java.lang.String): DomainConfigurationStatus = value.asInstanceOf[DomainConfigurationStatus]
}

