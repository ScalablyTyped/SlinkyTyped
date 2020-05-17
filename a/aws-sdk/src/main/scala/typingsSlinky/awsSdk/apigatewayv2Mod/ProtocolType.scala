package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET
  - typingsSlinky.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
trait ProtocolType extends js.Object

object ProtocolType {
  @scala.inline
  def WEBSOCKET: typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET = "WEBSOCKET".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET]
  @scala.inline
  def HTTP: typingsSlinky.awsSdk.awsSdkStrings.HTTP = "HTTP".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HTTP]
  @scala.inline
  implicit def apply(value: String): ProtocolType = value.asInstanceOf[ProtocolType]
}

