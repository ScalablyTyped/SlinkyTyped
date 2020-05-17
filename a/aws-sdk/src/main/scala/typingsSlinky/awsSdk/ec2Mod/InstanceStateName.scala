package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.pending__
  - typingsSlinky.awsSdk.awsSdkStrings.running__
  - typingsSlinky.awsSdk.awsSdkStrings.`shutting-down`
  - typingsSlinky.awsSdk.awsSdkStrings.terminated__
  - typingsSlinky.awsSdk.awsSdkStrings.stopping__
  - typingsSlinky.awsSdk.awsSdkStrings.stopped__
  - java.lang.String
*/
trait InstanceStateName extends js.Object

object InstanceStateName {
  @scala.inline
  def pending__ : typingsSlinky.awsSdk.awsSdkStrings.pending__ = "pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending__]
  @scala.inline
  def running__ : typingsSlinky.awsSdk.awsSdkStrings.running__ = "running".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.running__]
  @scala.inline
  def `shutting-down`: typingsSlinky.awsSdk.awsSdkStrings.`shutting-down` = "shutting-down".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`shutting-down`]
  @scala.inline
  def terminated__ : typingsSlinky.awsSdk.awsSdkStrings.terminated__ = "terminated".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.terminated__]
  @scala.inline
  def stopping__ : typingsSlinky.awsSdk.awsSdkStrings.stopping__ = "stopping".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.stopping__]
  @scala.inline
  def stopped__ : typingsSlinky.awsSdk.awsSdkStrings.stopped__ = "stopped".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.stopped__]
  @scala.inline
  implicit def apply(value: java.lang.String): InstanceStateName = value.asInstanceOf[InstanceStateName]
}

