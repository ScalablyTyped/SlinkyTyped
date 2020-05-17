package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.`instance-change`
  - typingsSlinky.awsSdk.awsSdkStrings.`fleet-change`
  - typingsSlinky.awsSdk.awsSdkStrings.`service-error`
  - java.lang.String
*/
trait FleetEventType extends js.Object

object FleetEventType {
  @scala.inline
  def `instance-change`: typingsSlinky.awsSdk.awsSdkStrings.`instance-change` = "instance-change".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`instance-change`]
  @scala.inline
  def `fleet-change`: typingsSlinky.awsSdk.awsSdkStrings.`fleet-change` = "fleet-change".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`fleet-change`]
  @scala.inline
  def `service-error`: typingsSlinky.awsSdk.awsSdkStrings.`service-error` = "service-error".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`service-error`]
  @scala.inline
  implicit def apply(value: java.lang.String): FleetEventType = value.asInstanceOf[FleetEventType]
}

