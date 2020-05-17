package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.movingToVpc
  - typingsSlinky.awsSdk.awsSdkStrings.restoringToClassic
  - java.lang.String
*/
trait MoveStatus extends js.Object

object MoveStatus {
  @scala.inline
  def movingToVpc: typingsSlinky.awsSdk.awsSdkStrings.movingToVpc = "movingToVpc".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.movingToVpc]
  @scala.inline
  def restoringToClassic: typingsSlinky.awsSdk.awsSdkStrings.restoringToClassic = "restoringToClassic".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.restoringToClassic]
  @scala.inline
  implicit def apply(value: java.lang.String): MoveStatus = value.asInstanceOf[MoveStatus]
}

