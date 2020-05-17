package typingsSlinky.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MESSAGE
  - typingsSlinky.awsSdk.awsSdkStrings.EVENT
  - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_ACK
  - java.lang.String
*/
trait ChatItemType extends js.Object

object ChatItemType {
  @scala.inline
  def MESSAGE: typingsSlinky.awsSdk.awsSdkStrings.MESSAGE = "MESSAGE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MESSAGE]
  @scala.inline
  def EVENT: typingsSlinky.awsSdk.awsSdkStrings.EVENT = "EVENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EVENT]
  @scala.inline
  def CONNECTION_ACK: typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_ACK = "CONNECTION_ACK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_ACK]
  @scala.inline
  implicit def apply(value: String): ChatItemType = value.asInstanceOf[ChatItemType]
}

