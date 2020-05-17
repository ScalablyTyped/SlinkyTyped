package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AwaitingQuorum
  - typingsSlinky.awsSdk.awsSdkStrings.Pending_
  - typingsSlinky.awsSdk.awsSdkStrings.InUse
  - typingsSlinky.awsSdk.awsSdkStrings.Complete_
  - typingsSlinky.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
trait ClusterState extends js.Object

object ClusterState {
  @scala.inline
  def AwaitingQuorum: typingsSlinky.awsSdk.awsSdkStrings.AwaitingQuorum = "AwaitingQuorum".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AwaitingQuorum]
  @scala.inline
  def Pending_ : typingsSlinky.awsSdk.awsSdkStrings.Pending_ = "Pending".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Pending_]
  @scala.inline
  def InUse: typingsSlinky.awsSdk.awsSdkStrings.InUse = "InUse".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.InUse]
  @scala.inline
  def Complete_ : typingsSlinky.awsSdk.awsSdkStrings.Complete_ = "Complete".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Complete_]
  @scala.inline
  def Cancelled_ : typingsSlinky.awsSdk.awsSdkStrings.Cancelled_ = "Cancelled".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Cancelled_]
  @scala.inline
  implicit def apply(value: java.lang.String): ClusterState = value.asInstanceOf[ClusterState]
}

