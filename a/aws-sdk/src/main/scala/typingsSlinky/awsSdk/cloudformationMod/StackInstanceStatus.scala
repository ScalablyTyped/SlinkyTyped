package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CURRENT
  - typingsSlinky.awsSdk.awsSdkStrings.OUTDATED
  - typingsSlinky.awsSdk.awsSdkStrings.INOPERABLE
  - java.lang.String
*/
trait StackInstanceStatus extends js.Object

object StackInstanceStatus {
  @scala.inline
  def CURRENT: typingsSlinky.awsSdk.awsSdkStrings.CURRENT = "CURRENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CURRENT]
  @scala.inline
  def OUTDATED: typingsSlinky.awsSdk.awsSdkStrings.OUTDATED = "OUTDATED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OUTDATED]
  @scala.inline
  def INOPERABLE: typingsSlinky.awsSdk.awsSdkStrings.INOPERABLE = "INOPERABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INOPERABLE]
  @scala.inline
  implicit def apply(value: String): StackInstanceStatus = value.asInstanceOf[StackInstanceStatus]
}

