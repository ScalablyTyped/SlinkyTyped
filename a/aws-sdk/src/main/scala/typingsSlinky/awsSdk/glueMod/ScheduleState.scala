package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_SCHEDULED
  - typingsSlinky.awsSdk.awsSdkStrings.TRANSITIONING
  - java.lang.String
*/
trait ScheduleState extends js.Object

object ScheduleState {
  @scala.inline
  def SCHEDULED: typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED = "SCHEDULED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED]
  @scala.inline
  def NOT_SCHEDULED: typingsSlinky.awsSdk.awsSdkStrings.NOT_SCHEDULED = "NOT_SCHEDULED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_SCHEDULED]
  @scala.inline
  def TRANSITIONING: typingsSlinky.awsSdk.awsSdkStrings.TRANSITIONING = "TRANSITIONING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRANSITIONING]
  @scala.inline
  implicit def apply(value: String): ScheduleState = value.asInstanceOf[ScheduleState]
}

