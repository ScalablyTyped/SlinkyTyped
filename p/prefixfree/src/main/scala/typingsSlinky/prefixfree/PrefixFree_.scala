package typingsSlinky.prefixfree

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.prefixfree.PrefixFree.KnownPrefixCSS
import typingsSlinky.prefixfree.PrefixFree.KnownPrefixJS
import typingsSlinky.prefixfree.StyleFix.StyleFixer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixFree_ extends js.Object {
  
  /**
    * The prefix used for CSS properties in `CSSStyleDeclaration`.
    *
    * Eg.: `Moz`, `Ms`, `O` or `Webkit`.
    */
  var Prefix: KnownPrefixJS | String = js.native
  
  var atrules: js.Array[String] = js.native
  
  var functions: js.Array[String] = js.native
  
  var keywords: js.Array[String] = js.native
  
  /**
    * The prefix used for CSS properties.
    *
    * Eg.: `-moz-`, `-ms-`, `-o-` or `-webkit-`.
    */
  var prefix: KnownPrefixCSS | String = js.native
  
  def prefixCSS(css: String, raw: Boolean, element: Element): String = js.native
  @JSName("prefixCSS")
  var prefixCSS_Original: StyleFixer = js.native
  
  def prefixProperty(property: String): String = js.native
  def prefixProperty(property: String, camelCase: Boolean): String = js.native
  
  def prefixSelector(selector: String): String = js.native
  
  var properties: js.Array[String] = js.native
  
  def property(property: String): String = js.native
  
  var selectorMap: StringDictionary[String] = js.native
  
  var selectors: js.Array[String] = js.native
  
  def value(value: String): String = js.native
  def value(value: String, property: String): String = js.native
  
  var valueProperties: js.Array[String] = js.native
}
