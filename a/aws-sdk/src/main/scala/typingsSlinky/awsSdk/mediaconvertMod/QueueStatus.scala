package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.PAUSED
  - java.lang.String
*/
trait QueueStatus extends js.Object

object QueueStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def PAUSED: typingsSlinky.awsSdk.awsSdkStrings.PAUSED = "PAUSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PAUSED]
  @scala.inline
  implicit def apply(value: String): QueueStatus = value.asInstanceOf[QueueStatus]
}

