package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
trait AcceleratorStatus extends js.Object

object AcceleratorStatus {
  @scala.inline
  def DEPLOYED: typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED = "DEPLOYED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  implicit def apply(value: String): AcceleratorStatus = value.asInstanceOf[AcceleratorStatus]
}

