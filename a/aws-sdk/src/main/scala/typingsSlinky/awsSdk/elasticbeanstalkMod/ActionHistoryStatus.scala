package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Completed_
  - typingsSlinky.awsSdk.awsSdkStrings.Failed_
  - typingsSlinky.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
trait ActionHistoryStatus extends js.Object

object ActionHistoryStatus {
  @scala.inline
  def Completed_ : typingsSlinky.awsSdk.awsSdkStrings.Completed_ = "Completed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Completed_]
  @scala.inline
  def Failed_ : typingsSlinky.awsSdk.awsSdkStrings.Failed_ = "Failed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Failed_]
  @scala.inline
  def Unknown_ : typingsSlinky.awsSdk.awsSdkStrings.Unknown_ = "Unknown".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Unknown_]
  @scala.inline
  implicit def apply(value: java.lang.String): ActionHistoryStatus = value.asInstanceOf[ActionHistoryStatus]
}

