package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.dns.DNSRecord
import typingsSlinky.firefoxWebextBrowser.browser.dns.ResolveFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdns extends js.Object {
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  def resolve(hostname: String): js.Promise[DNSRecord] = js.native
  def resolve(hostname: String, flags: ResolveFlags): js.Promise[DNSRecord] = js.native
}

