package typingsSlinky.proxyDashVerifier.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.proxyDashVerifier.proxyDashVerifierStrings.http
  - typings.proxyDashVerifier.proxyDashVerifierStrings.https
  - typings.proxyDashVerifier.proxyDashVerifierStrings.socks5
  - typings.proxyDashVerifier.proxyDashVerifierStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsSlinky.proxyDashVerifier.proxyDashVerifierStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.proxyDashVerifier.proxyDashVerifierStrings.https = this.cast("https")
  @scala.inline
  def socks4: typingsSlinky.proxyDashVerifier.proxyDashVerifierStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typingsSlinky.proxyDashVerifier.proxyDashVerifierStrings.socks5 = this.cast("socks5")
}

