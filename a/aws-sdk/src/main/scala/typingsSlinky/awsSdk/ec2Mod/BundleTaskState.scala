package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.pending__
  - typingsSlinky.awsSdk.awsSdkStrings.`waiting-for-shutdown`
  - typingsSlinky.awsSdk.awsSdkStrings.bundling
  - typingsSlinky.awsSdk.awsSdkStrings.storing
  - typingsSlinky.awsSdk.awsSdkStrings.cancelling__
  - typingsSlinky.awsSdk.awsSdkStrings.complete__
  - typingsSlinky.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
trait BundleTaskState extends js.Object

object BundleTaskState {
  @scala.inline
  def pending__ : typingsSlinky.awsSdk.awsSdkStrings.pending__ = "pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending__]
  @scala.inline
  def `waiting-for-shutdown`: typingsSlinky.awsSdk.awsSdkStrings.`waiting-for-shutdown` = "waiting-for-shutdown".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`waiting-for-shutdown`]
  @scala.inline
  def bundling: typingsSlinky.awsSdk.awsSdkStrings.bundling = "bundling".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.bundling]
  @scala.inline
  def storing: typingsSlinky.awsSdk.awsSdkStrings.storing = "storing".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.storing]
  @scala.inline
  def cancelling__ : typingsSlinky.awsSdk.awsSdkStrings.cancelling__ = "cancelling".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cancelling__]
  @scala.inline
  def complete__ : typingsSlinky.awsSdk.awsSdkStrings.complete__ = "complete".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.complete__]
  @scala.inline
  def failed__ : typingsSlinky.awsSdk.awsSdkStrings.failed__ = "failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.failed__]
  @scala.inline
  implicit def apply(value: java.lang.String): BundleTaskState = value.asInstanceOf[BundleTaskState]
}

