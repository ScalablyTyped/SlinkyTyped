package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_JOB_FLOW
  - typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
  - typingsSlinky.awsSdk.awsSdkStrings.CANCEL_AND_WAIT
  - typingsSlinky.awsSdk.awsSdkStrings.CONTINUE
  - java.lang.String
*/
trait ActionOnFailure extends js.Object

object ActionOnFailure {
  @scala.inline
  def TERMINATE_JOB_FLOW: typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_JOB_FLOW = "TERMINATE_JOB_FLOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_JOB_FLOW]
  @scala.inline
  def TERMINATE_CLUSTER: typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_CLUSTER = "TERMINATE_CLUSTER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TERMINATE_CLUSTER]
  @scala.inline
  def CANCEL_AND_WAIT: typingsSlinky.awsSdk.awsSdkStrings.CANCEL_AND_WAIT = "CANCEL_AND_WAIT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CANCEL_AND_WAIT]
  @scala.inline
  def CONTINUE: typingsSlinky.awsSdk.awsSdkStrings.CONTINUE = "CONTINUE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONTINUE]
  @scala.inline
  implicit def apply(value: java.lang.String): ActionOnFailure = value.asInstanceOf[ActionOnFailure]
}

