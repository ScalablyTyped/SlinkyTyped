package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.scheduled__
  - typingsSlinky.awsSdk.awsSdkStrings.inProgress__
  - typingsSlinky.awsSdk.awsSdkStrings.completed__
  - typingsSlinky.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
trait TaskStatus extends js.Object

object TaskStatus {
  @scala.inline
  def scheduled__ : typingsSlinky.awsSdk.awsSdkStrings.scheduled__ = "scheduled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.scheduled__]
  @scala.inline
  def inProgress__ : typingsSlinky.awsSdk.awsSdkStrings.inProgress__ = "inProgress".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.inProgress__]
  @scala.inline
  def completed__ : typingsSlinky.awsSdk.awsSdkStrings.completed__ = "completed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.completed__]
  @scala.inline
  def failed__ : typingsSlinky.awsSdk.awsSdkStrings.failed__ = "failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.failed__]
  @scala.inline
  implicit def apply(value: String): TaskStatus = value.asInstanceOf[TaskStatus]
}

