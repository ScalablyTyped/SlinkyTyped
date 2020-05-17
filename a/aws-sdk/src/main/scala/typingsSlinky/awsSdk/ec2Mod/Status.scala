package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MoveInProgress
  - typingsSlinky.awsSdk.awsSdkStrings.InVpc
  - typingsSlinky.awsSdk.awsSdkStrings.InClassic
  - java.lang.String
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def MoveInProgress: typingsSlinky.awsSdk.awsSdkStrings.MoveInProgress = "MoveInProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MoveInProgress]
  @scala.inline
  def InVpc: typingsSlinky.awsSdk.awsSdkStrings.InVpc = "InVpc".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InVpc]
  @scala.inline
  def InClassic: typingsSlinky.awsSdk.awsSdkStrings.InClassic = "InClassic".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InClassic]
  @scala.inline
  implicit def apply(value: java.lang.String): Status = value.asInstanceOf[Status]
}

