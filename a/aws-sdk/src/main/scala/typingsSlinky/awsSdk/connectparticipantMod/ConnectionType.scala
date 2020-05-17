package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_CREDENTIALS
  - java.lang.String
*/
trait ConnectionType extends js.Object

object ConnectionType {
  @scala.inline
  def WEBSOCKET: typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET = "WEBSOCKET".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET]
  @scala.inline
  def CONNECTION_CREDENTIALS: typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_CREDENTIALS = "CONNECTION_CREDENTIALS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_CREDENTIALS]
  @scala.inline
  implicit def apply(value: String): ConnectionType = value.asInstanceOf[ConnectionType]
}

