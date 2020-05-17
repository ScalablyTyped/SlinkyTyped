package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CompositeAlarm
  - typingsSlinky.awsSdk.awsSdkStrings.MetricAlarm
  - java.lang.String
*/
trait AlarmType extends js.Object

object AlarmType {
  @scala.inline
  def CompositeAlarm: typingsSlinky.awsSdk.awsSdkStrings.CompositeAlarm = "CompositeAlarm".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CompositeAlarm]
  @scala.inline
  def MetricAlarm: typingsSlinky.awsSdk.awsSdkStrings.MetricAlarm = "MetricAlarm".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MetricAlarm]
  @scala.inline
  implicit def apply(value: String): AlarmType = value.asInstanceOf[AlarmType]
}

