package typingsSlinky.jsdom.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jsdom.anon.ReadonlyDISABLEDstringSIL
import typingsSlinky.jsdom.anon.TypeofCookie
import typingsSlinky.jsdom.anon.TypeofCookieJar
import typingsSlinky.toughCookie.mod.Cookie
import typingsSlinky.toughCookie.mod.Cookie.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsdom", "toughCookie")
@js.native
object toughCookie extends js.Object {
  
  var Cookie: js.Any | TypeofCookie = js.native
  
  var CookieJar: js.Any | TypeofCookieJar = js.native
  
  val PrefixSecurityEnum: ReadonlyDISABLEDstringSIL = js.native
  
  def canonicalDomain(str: String): String = js.native
  
  def cookieCompare(a: Cookie, b: Cookie): Double = js.native
  
  def defaultPath(path: String): String = js.native
  
  def domainMatch(str: String, domStr: String): Boolean = js.native
  def domainMatch(str: String, domStr: String, canonicalize: Boolean): Boolean = js.native
  
  def formatDate(date: js.Date): String = js.native
  
  def fromJSON(string: String): Cookie = js.native
  
  def getPublicSuffix(hostname: String): String | Null = js.native
  
  def parse(cookieString: String): js.UndefOr[Cookie] = js.native
  def parse(cookieString: String, options: ParseOptions): js.UndefOr[Cookie] = js.native
  
  def parseDate(string: String): js.Date = js.native
  
  def pathMatch(reqPath: String, cookiePath: String): Boolean = js.native
  
  def permuteDomain(domain: String): js.Array[String] = js.native
  def permuteDomain(domain: String, allowSpecialUseDomain: Boolean): js.Array[String] = js.native
  
  def permutePath(path: String): js.Array[String] = js.native
  
  val version: String = js.native
  
  @js.native
  class MemoryCookieStore ()
    extends typingsSlinky.toughCookie.mod.MemoryCookieStore
  @js.native
  object MemoryCookieStore
    extends TopLevel[Instantiable0[typingsSlinky.toughCookie.mod.MemoryCookieStore]]
  
  @js.native
  class Store ()
    extends typingsSlinky.toughCookie.mod.Store
  @js.native
  object Store
    extends TopLevel[Instantiable0[typingsSlinky.toughCookie.mod.Store]]
}
