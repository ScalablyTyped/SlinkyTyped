package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.pending__
  - typingsSlinky.awsSdk.awsSdkStrings.completed__
  - typingsSlinky.awsSdk.awsSdkStrings.error__
  - java.lang.String
*/
trait SnapshotState extends js.Object

object SnapshotState {
  @scala.inline
  def pending__ : typingsSlinky.awsSdk.awsSdkStrings.pending__ = "pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.pending__]
  @scala.inline
  def completed__ : typingsSlinky.awsSdk.awsSdkStrings.completed__ = "completed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.completed__]
  @scala.inline
  def error__ : typingsSlinky.awsSdk.awsSdkStrings.error__ = "error".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.error__]
  @scala.inline
  implicit def apply(value: java.lang.String): SnapshotState = value.asInstanceOf[SnapshotState]
}

