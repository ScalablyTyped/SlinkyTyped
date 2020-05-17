package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.hibernate
  - typingsSlinky.awsSdk.awsSdkStrings.stop
  - typingsSlinky.awsSdk.awsSdkStrings.terminate_
  - java.lang.String
*/
trait InstanceInterruptionBehavior extends js.Object

object InstanceInterruptionBehavior {
  @scala.inline
  def hibernate: typingsSlinky.awsSdk.awsSdkStrings.hibernate = "hibernate".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.hibernate]
  @scala.inline
  def stop: typingsSlinky.awsSdk.awsSdkStrings.stop = "stop".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.stop]
  @scala.inline
  def terminate_ : typingsSlinky.awsSdk.awsSdkStrings.terminate_ = "terminate".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.terminate_]
  @scala.inline
  implicit def apply(value: java.lang.String): InstanceInterruptionBehavior = value.asInstanceOf[InstanceInterruptionBehavior]
}

