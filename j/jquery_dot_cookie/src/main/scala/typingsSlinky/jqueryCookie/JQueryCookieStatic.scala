package typingsSlinky.jqueryCookie

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// The following jsdoc comments are used to add intellisense to editors that support it. Uses snippets
// of documentation from the Github repo when possible.
// 
// The ordering here matters. For example, the read function with the converter parameter is purposefully after
// the set function. This is because the intellisense that shows up after you press comma should be the set first,
// since that is more common, then the conversion function if user starts typing a parameter with a function type
@js.native
trait JQueryCookieStatic extends StObject {
  
  /**
    * Gets an object of cookies as key-value pairs
    */
  def apply(): StringDictionary[String] = js.native
  /**
    * Gets a cookie by name
    * @param name The name of the cookie to get
    */
  def apply(name: String): js.Any = js.native
  /**
    * Gets a cookie by name after applying a conversion function to the value
    * @param name The name of the cookie to get
    * @param converter A conversion function to change the cookie's value to a different representation on the fly
    */
  def apply(name: String, converter: js.Function1[/* value */ String, _]): js.Any = js.native
  /**
    * Sets a cookie
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    */
  def apply(name: String, value: String): Unit = js.native
  /**
    * Sets a cookie with some options
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    * @param options An object of options that change how the cookie is set
    */
  def apply(name: String, value: String, options: JQueryCookieOptions): Unit = js.native
  /**
    * Sets a cookie using .toString(), or if $.cookie.json is set to true using JSON.stringify()
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    */
  def apply(name: String, value: js.Any): Unit = js.native
  /**
    * Sets a cookie using .toString(), or if $.cookie.json is set to true using JSON.stringify()
    * @param name The name of the cookie to set
    * @param value The value to set the cookie to
    * @param options An object of options that change how the cookie is set
    */
  def apply(name: String, value: js.Any, options: JQueryCookieOptions): Unit = js.native
  
  /**
    * Cookie attributes can be set globally by setting properties of the $.cookie.defaults object or individually for each call to $.cookie() by passing a plain object to the options argument. Per-call options override the default options.
    */
  var defaults: js.UndefOr[JQueryCookieOptions] = js.native
  
  /**
    * Turn on automatic storage of JSON objects passed as the cookie value. Assumes JSON.stringify and JSON.parse
    */
  var json: js.UndefOr[Boolean] = js.native
  
  /**
    * By default the cookie value is encoded/decoded when writing/reading, using encodeURIComponent/decodeURIComponent. Bypass this by setting raw to true:
    */
  var raw: js.UndefOr[Boolean] = js.native
}
