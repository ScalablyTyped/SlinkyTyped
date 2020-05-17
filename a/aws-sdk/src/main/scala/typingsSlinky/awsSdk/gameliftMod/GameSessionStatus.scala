package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATED
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATING
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
trait GameSessionStatus extends js.Object

object GameSessionStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def ACTIVATING: typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING = "ACTIVATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVATING]
  @scala.inline
  def TERMINATED: typingsSlinky.awsSdk.awsSdkStrings.TERMINATED = "TERMINATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATED]
  @scala.inline
  def TERMINATING: typingsSlinky.awsSdk.awsSdkStrings.TERMINATING = "TERMINATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATING]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  implicit def apply(value: String): GameSessionStatus = value.asInstanceOf[GameSessionStatus]
}

