package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TRANSACTIONAL
  - typingsSlinky.awsSdk.awsSdkStrings.PROMOTIONAL
  - java.lang.String
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  def TRANSACTIONAL: typingsSlinky.awsSdk.awsSdkStrings.TRANSACTIONAL = "TRANSACTIONAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TRANSACTIONAL]
  @scala.inline
  def PROMOTIONAL: typingsSlinky.awsSdk.awsSdkStrings.PROMOTIONAL = "PROMOTIONAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PROMOTIONAL]
  @scala.inline
  implicit def apply(value: String): MessageType = value.asInstanceOf[MessageType]
}

