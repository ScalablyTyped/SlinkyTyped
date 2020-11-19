package typingsSlinky.jsCookie.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsCookie.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookiesStatic[T /* <: js.Object */] extends js.Object {
  
  /**
    * Allows default cookie attributes to be accessed, changed, or reset
    */
  var defaults: CookieAttributes = js.native
  
  /**
    * Read all available cookies
    */
  def get(): StringDictionary[String] = js.native
  /**
    * Read cookie
    */
  def get(name: String): js.UndefOr[String] = js.native
  
  /**
    * Returns the parsed representation of
    * all cookies according to JSON.parse
    */
  def getJSON(): StringDictionary[js.Any] = js.native
  /**
    * Returns the parsed representation of the string
    * stored in the cookie according to JSON.parse
    */
  def getJSON(name: String): js.Any = js.native
  
  /**
    * If there is any danger of a conflict with the namespace Cookies,
    * the noConflict method will allow you to define a new namespace
    * and preserve the original one. This is especially useful when
    * running the script on third party sites e.g. as part of a widget
    * or SDK. Note: The noConflict method is not necessary when using
    * AMD or CommonJS, thus it is not exposed in those environments.
    */
  var noConflict: js.UndefOr[js.Function0[CookiesStatic[T]]] = js.native
  
  /**
    * Delete cookie
    */
  def remove(name: String): Unit = js.native
  def remove(name: String, options: CookieAttributes): Unit = js.native
  
  def set(name: String, value: T): js.UndefOr[String] = js.native
  def set(name: String, value: T, options: CookieAttributes): js.UndefOr[String] = js.native
  /**
    * Create a cookie
    */
  def set(name: String, value: String): js.UndefOr[String] = js.native
  def set(name: String, value: String, options: CookieAttributes): js.UndefOr[String] = js.native
  
  def withConverter[TConv /* <: js.Object */](converter: Read[TConv]): CookiesStatic[TConv] = js.native
  /**
    * Create a new instance of the api that overrides the default
    * decoding implementation. All methods that rely in a proper
    * decoding to work, such as Cookies.remove() and Cookies.get(),
    * will run the converter first for each cookie. The returned
    * string will be used as the cookie value.
    */
  def withConverter[TConv /* <: js.Object */](converter: CookieReadConverter): CookiesStatic[TConv] = js.native
}
