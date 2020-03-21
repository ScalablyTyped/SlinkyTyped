package typingsSlinky.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.proxyLists.proxyListsStrings.http
  - typingsSlinky.proxyLists.proxyListsStrings.https
  - typingsSlinky.proxyLists.proxyListsStrings.socks5
  - typingsSlinky.proxyLists.proxyListsStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsSlinky.proxyLists.proxyListsStrings.http = this.cast("http")
  @scala.inline
  def https: typingsSlinky.proxyLists.proxyListsStrings.https = this.cast("https")
  @scala.inline
  def socks4: typingsSlinky.proxyLists.proxyListsStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typingsSlinky.proxyLists.proxyListsStrings.socks5 = this.cast("socks5")
}

