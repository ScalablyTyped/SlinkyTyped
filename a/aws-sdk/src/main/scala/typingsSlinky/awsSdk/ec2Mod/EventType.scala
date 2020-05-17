package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.instanceChange
  - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestChange
  - typingsSlinky.awsSdk.awsSdkStrings.error__
  - typingsSlinky.awsSdk.awsSdkStrings.information
  - java.lang.String
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def instanceChange: typingsSlinky.awsSdk.awsSdkStrings.instanceChange = "instanceChange".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.instanceChange]
  @scala.inline
  def fleetRequestChange: typingsSlinky.awsSdk.awsSdkStrings.fleetRequestChange = "fleetRequestChange".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fleetRequestChange]
  @scala.inline
  def error__ : typingsSlinky.awsSdk.awsSdkStrings.error__ = "error".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.error__]
  @scala.inline
  def information: typingsSlinky.awsSdk.awsSdkStrings.information = "information".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.information]
  @scala.inline
  implicit def apply(value: java.lang.String): EventType = value.asInstanceOf[EventType]
}

