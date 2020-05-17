package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MODIFYING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait ScheduleState extends js.Object

object ScheduleState {
  @scala.inline
  def MODIFYING: typingsSlinky.awsSdk.awsSdkStrings.MODIFYING = "MODIFYING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MODIFYING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): ScheduleState = value.asInstanceOf[ScheduleState]
}

