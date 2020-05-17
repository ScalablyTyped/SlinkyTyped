package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Connected_
  - typingsSlinky.awsSdk.awsSdkStrings.NotConnected
  - java.lang.String
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def Connected_ : typingsSlinky.awsSdk.awsSdkStrings.Connected_ = "Connected".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Connected_]
  @scala.inline
  def NotConnected: typingsSlinky.awsSdk.awsSdkStrings.NotConnected = "NotConnected".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NotConnected]
  @scala.inline
  implicit def apply(value: java.lang.String): ConnectionStatus = value.asInstanceOf[ConnectionStatus]
}

