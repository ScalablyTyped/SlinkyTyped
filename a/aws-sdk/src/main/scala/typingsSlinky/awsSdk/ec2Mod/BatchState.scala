package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.submitted__
  - typingsSlinky.awsSdk.awsSdkStrings.active__
  - typingsSlinky.awsSdk.awsSdkStrings.cancelled__
  - typingsSlinky.awsSdk.awsSdkStrings.failed__
  - typingsSlinky.awsSdk.awsSdkStrings.cancelled_running
  - typingsSlinky.awsSdk.awsSdkStrings.cancelled_terminating
  - typingsSlinky.awsSdk.awsSdkStrings.modifying_
  - java.lang.String
*/
trait BatchState extends js.Object

object BatchState {
  @scala.inline
  def submitted__ : typingsSlinky.awsSdk.awsSdkStrings.submitted__ = "submitted".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.submitted__]
  @scala.inline
  def active__ : typingsSlinky.awsSdk.awsSdkStrings.active__ = "active".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.active__]
  @scala.inline
  def cancelled__ : typingsSlinky.awsSdk.awsSdkStrings.cancelled__ = "cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cancelled__]
  @scala.inline
  def failed__ : typingsSlinky.awsSdk.awsSdkStrings.failed__ = "failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.failed__]
  @scala.inline
  def cancelled_running: typingsSlinky.awsSdk.awsSdkStrings.cancelled_running = "cancelled_running".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cancelled_running]
  @scala.inline
  def cancelled_terminating: typingsSlinky.awsSdk.awsSdkStrings.cancelled_terminating = "cancelled_terminating".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.cancelled_terminating]
  @scala.inline
  def modifying_ : typingsSlinky.awsSdk.awsSdkStrings.modifying_ = "modifying".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.modifying_]
  @scala.inline
  implicit def apply(value: java.lang.String): BatchState = value.asInstanceOf[BatchState]
}

