package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
  - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  def CONNECTED: typingsSlinky.awsSdk.awsSdkStrings.CONNECTED = "CONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTED]
  @scala.inline
  def DISCONNECTED: typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED = "DISCONNECTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED]
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  implicit def apply(value: String): ConnectionState = value.asInstanceOf[ConnectionState]
}

