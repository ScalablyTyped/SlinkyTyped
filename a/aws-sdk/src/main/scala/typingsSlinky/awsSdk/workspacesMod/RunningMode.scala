package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AUTO_STOP
  - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS_ON
  - java.lang.String
*/
trait RunningMode extends js.Object

object RunningMode {
  @scala.inline
  def AUTO_STOP: typingsSlinky.awsSdk.awsSdkStrings.AUTO_STOP = "AUTO_STOP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AUTO_STOP]
  @scala.inline
  def ALWAYS_ON: typingsSlinky.awsSdk.awsSdkStrings.ALWAYS_ON = "ALWAYS_ON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALWAYS_ON]
  @scala.inline
  implicit def apply(value: String): RunningMode = value.asInstanceOf[RunningMode]
}

