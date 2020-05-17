package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`instance-reboot`
  - typingsSlinky.awsSdk.awsSdkStrings.`system-reboot`
  - typingsSlinky.awsSdk.awsSdkStrings.`system-maintenance`
  - typingsSlinky.awsSdk.awsSdkStrings.`instance-retirement`
  - typingsSlinky.awsSdk.awsSdkStrings.`instance-stop`
  - java.lang.String
*/
trait EventCode extends js.Object

object EventCode {
  @scala.inline
  def `instance-reboot`: typingsSlinky.awsSdk.awsSdkStrings.`instance-reboot` = "instance-reboot".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`instance-reboot`]
  @scala.inline
  def `system-reboot`: typingsSlinky.awsSdk.awsSdkStrings.`system-reboot` = "system-reboot".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`system-reboot`]
  @scala.inline
  def `system-maintenance`: typingsSlinky.awsSdk.awsSdkStrings.`system-maintenance` = "system-maintenance".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`system-maintenance`]
  @scala.inline
  def `instance-retirement`: typingsSlinky.awsSdk.awsSdkStrings.`instance-retirement` = "instance-retirement".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`instance-retirement`]
  @scala.inline
  def `instance-stop`: typingsSlinky.awsSdk.awsSdkStrings.`instance-stop` = "instance-stop".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`instance-stop`]
  @scala.inline
  implicit def apply(value: java.lang.String): EventCode = value.asInstanceOf[EventCode]
}

