package typingsSlinky.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.acmeClient.rfc8555Mod.HttpChallenge
  - typingsSlinky.acmeClient.rfc8555Mod.DnsChallenge
*/
trait Challenge extends js.Object

object Challenge {
  @scala.inline
  implicit def apply(value: DnsChallenge): Challenge = value.asInstanceOf[Challenge]
  @scala.inline
  implicit def apply(value: HttpChallenge): Challenge = value.asInstanceOf[Challenge]
}

