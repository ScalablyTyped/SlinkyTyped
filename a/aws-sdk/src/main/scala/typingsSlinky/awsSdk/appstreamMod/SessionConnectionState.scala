package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_CONNECTED
  - java.lang.String
*/
trait SessionConnectionState extends js.Object

object SessionConnectionState {
  @scala.inline
  def CONNECTED: typingsSlinky.awsSdk.awsSdkStrings.CONNECTED = "CONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTED]
  @scala.inline
  def NOT_CONNECTED: typingsSlinky.awsSdk.awsSdkStrings.NOT_CONNECTED = "NOT_CONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_CONNECTED]
  @scala.inline
  implicit def apply(value: java.lang.String): SessionConnectionState = value.asInstanceOf[SessionConnectionState]
}

