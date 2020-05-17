package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.RESERVED
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
  - typingsSlinky.awsSdk.awsSdkStrings.TIMEDOUT
  - java.lang.String
*/
trait PlayerSessionStatus extends js.Object

object PlayerSessionStatus {
  @scala.inline
  def RESERVED: typingsSlinky.awsSdk.awsSdkStrings.RESERVED = "RESERVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESERVED]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def COMPLETED: typingsSlinky.awsSdk.awsSdkStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLETED]
  @scala.inline
  def TIMEDOUT: typingsSlinky.awsSdk.awsSdkStrings.TIMEDOUT = "TIMEDOUT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TIMEDOUT]
  @scala.inline
  implicit def apply(value: String): PlayerSessionStatus = value.asInstanceOf[PlayerSessionStatus]
}

