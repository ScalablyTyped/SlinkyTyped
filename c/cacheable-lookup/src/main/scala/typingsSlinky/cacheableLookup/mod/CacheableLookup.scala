package typingsSlinky.cacheableLookup.mod

import typingsSlinky.cacheableLookup.anon.LookupOptionsalltrue
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheableLookup extends js.Object {
  
  /**
  	 * Attaches itself to an Agent instance.
  	 */
  def install(agent: Agent): Unit = js.native
  
  def lookup(
    hostname: String,
    callback: js.Function3[/* error */ ErrnoException, /* address */ String, /* family */ IPFamily, Unit]
  ): Unit = js.native
  /**
  	 * @see https://nodejs.org/api/dns.html#dns_dns_lookup_hostname_options_callback
  	 */
  def lookup(
    hostname: String,
    family: IPFamily,
    callback: js.Function3[/* error */ ErrnoException, /* address */ String, /* family */ IPFamily, Unit]
  ): Unit = js.native
  def lookup(
    hostname: String,
    options: LookupOptionsalltrue,
    callback: js.Function2[/* error */ ErrnoException, /* result */ js.Array[EntryObject], Unit]
  ): Unit = js.native
  def lookup(
    hostname: String,
    options: LookupOptions,
    callback: js.Function3[/* error */ ErrnoException, /* address */ String, /* family */ IPFamily, Unit]
  ): Unit = js.native
  
  def lookupAsync(hostname: String): js.Promise[EntryObject] = js.native
  def lookupAsync(hostname: String, family: IPFamily): js.Promise[EntryObject] = js.native
  /**
  	 * The asynchronous version of `dns.lookup(…)`.
  	 */
  def lookupAsync(hostname: String, options: LookupOptionsalltrue): js.Promise[js.Array[EntryObject]] = js.native
  def lookupAsync(hostname: String, options: LookupOptions): js.Promise[EntryObject] = js.native
  
  /**
  	 * An asynchronous function which returns cached DNS lookup entries. This is the base for `lookupAsync(hostname, options)` and `lookup(hostname, options, callback)`.
  	 */
  def query(hostname: String, family: IPFamily): js.Promise[js.Array[EntryObject]] = js.native
  
  /**
  	 * An asynchronous function which makes a new DNS lookup query and updates the database. This is used by `query(hostname, family)` if no entry in the database is present. Returns an array of objects with `address`, `family`, `ttl` and `expires` properties.
  	 */
  def queryAndCache(hostname: String, family: IPFamily): js.Promise[js.Array[EntryObject]] = js.native
  
  /**
  	 * DNS servers used to make the query. Can be overridden - then the new servers will be used.
  	 */
  var servers: js.Array[String] = js.native
  
  /**
  	 * Removes itself from an Agent instance.
  	 */
  def uninstall(agent: Agent): Unit = js.native
  
  /**
  	 * Updates interface info. For example, you need to run this when you plug or unplug your WiFi driver.
  	 */
  def updateInterfaceInfo(): Unit = js.native
}
