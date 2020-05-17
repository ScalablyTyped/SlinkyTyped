package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Online_
  - typingsSlinky.awsSdk.awsSdkStrings.ConnectionLost
  - typingsSlinky.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
trait PingStatus extends js.Object

object PingStatus {
  @scala.inline
  def Online_ : typingsSlinky.awsSdk.awsSdkStrings.Online_ = "Online".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Online_]
  @scala.inline
  def ConnectionLost: typingsSlinky.awsSdk.awsSdkStrings.ConnectionLost = "ConnectionLost".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ConnectionLost]
  @scala.inline
  def Inactive_ : typingsSlinky.awsSdk.awsSdkStrings.Inactive_ = "Inactive".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Inactive_]
  @scala.inline
  implicit def apply(value: java.lang.String): PingStatus = value.asInstanceOf[PingStatus]
}

