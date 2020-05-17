package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.DONE
  - java.lang.String
*/
trait WarmupStatus extends js.Object

object WarmupStatus {
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def DONE: typingsSlinky.awsSdk.awsSdkStrings.DONE = "DONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DONE]
  @scala.inline
  implicit def apply(value: String): WarmupStatus = value.asInstanceOf[WarmupStatus]
}

