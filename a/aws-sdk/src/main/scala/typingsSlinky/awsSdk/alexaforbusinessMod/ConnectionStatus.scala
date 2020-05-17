package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ONLINE
  - typingsSlinky.awsSdk.awsSdkStrings.OFFLINE
  - java.lang.String
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def ONLINE: typingsSlinky.awsSdk.awsSdkStrings.ONLINE = "ONLINE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ONLINE]
  @scala.inline
  def OFFLINE: typingsSlinky.awsSdk.awsSdkStrings.OFFLINE = "OFFLINE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OFFLINE]
  @scala.inline
  implicit def apply(value: String): ConnectionStatus = value.asInstanceOf[ConnectionStatus]
}

