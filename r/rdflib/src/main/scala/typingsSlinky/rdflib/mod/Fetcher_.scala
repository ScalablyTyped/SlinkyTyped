package typingsSlinky.rdflib.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.rdflib.fetcherMod.Handler
import typingsSlinky.rdflib.fetcherMod.Options
import typingsSlinky.rdflib.fetcherMod.default
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdflib", "Fetcher")
@js.native
class Fetcher_ protected () extends default {
  def this(store: typingsSlinky.rdflib.storeMod.default) = this()
  def this(store: typingsSlinky.rdflib.storeMod.default, options: Options) = this()
}
/* static members */
@JSImport("rdflib", "Fetcher")
@js.native
object Fetcher_ extends js.Object {
  
  var CONTENT_TYPE_BY_EXT: Record[String, String] = js.native
  
  var HANDLERS: NumberDictionary[Handler] = js.native
  
  def crossSiteProxy(uri: String): js.UndefOr[js.Any] = js.native
  
  var crossSiteProxyTemplate: js.Any = js.native
  
  def offlineOverride(uri: String): String = js.native
  
  def proxyIfNecessary(uri: String): js.Any = js.native
  
  /** Decide on credentials using old XXHR api or new fetch()  one
    * @param requestedURI
    * @param options
    */
  def setCredentials(requestedURI: String): Unit = js.native
  def setCredentials(requestedURI: String, options: Options): Unit = js.native
  
  /**
    * Tests whether the uri's protocol is supported by the Fetcher.
    * @param uri
    */
  def unsupportedProtocol(uri: String): Boolean = js.native
}
