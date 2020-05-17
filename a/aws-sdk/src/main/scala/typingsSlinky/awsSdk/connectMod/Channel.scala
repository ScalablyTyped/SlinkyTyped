package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.VOICE
  - typingsSlinky.awsSdk.awsSdkStrings.CHAT
  - java.lang.String
*/
trait Channel extends js.Object

object Channel {
  @scala.inline
  def VOICE: typingsSlinky.awsSdk.awsSdkStrings.VOICE = "VOICE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VOICE]
  @scala.inline
  def CHAT: typingsSlinky.awsSdk.awsSdkStrings.CHAT = "CHAT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CHAT]
  @scala.inline
  implicit def apply(value: String): Channel = value.asInstanceOf[Channel]
}

