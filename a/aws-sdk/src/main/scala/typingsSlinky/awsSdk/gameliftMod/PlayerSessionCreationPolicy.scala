package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACCEPT_ALL
  - typingsSlinky.awsSdk.awsSdkStrings.DENY_ALL
  - java.lang.String
*/
trait PlayerSessionCreationPolicy extends js.Object

object PlayerSessionCreationPolicy {
  @scala.inline
  def ACCEPT_ALL: typingsSlinky.awsSdk.awsSdkStrings.ACCEPT_ALL = "ACCEPT_ALL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACCEPT_ALL]
  @scala.inline
  def DENY_ALL: typingsSlinky.awsSdk.awsSdkStrings.DENY_ALL = "DENY_ALL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DENY_ALL]
  @scala.inline
  implicit def apply(value: String): PlayerSessionCreationPolicy = value.asInstanceOf[PlayerSessionCreationPolicy]
}

