package typingsSlinky.prefixfree

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.prefixfree.PrefixFree.KnownPrefixCSS
import typingsSlinky.prefixfree.PrefixFree.KnownPrefixJS
import typingsSlinky.prefixfree.StyleFix.StyleFixer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixFree extends StObject {
  
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
// PrefixFree
object PrefixFree {
  
  /** The known prefixes used for CSS properties. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.prefixfree.prefixfreeStrings.`-moz-`
    - typingsSlinky.prefixfree.prefixfreeStrings.`-ms-`
    - typingsSlinky.prefixfree.prefixfreeStrings.`-o-`
    - typingsSlinky.prefixfree.prefixfreeStrings.`-webkit-`
  */
  trait KnownPrefixCSS extends StObject
  object KnownPrefixCSS {
    
    @scala.inline
    def `-moz-`: typingsSlinky.prefixfree.prefixfreeStrings.`-moz-` = "-moz-".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.`-moz-`]
    
    @scala.inline
    def `-ms-`: typingsSlinky.prefixfree.prefixfreeStrings.`-ms-` = "-ms-".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.`-ms-`]
    
    @scala.inline
    def `-o-`: typingsSlinky.prefixfree.prefixfreeStrings.`-o-` = "-o-".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.`-o-`]
    
    @scala.inline
    def `-webkit-`: typingsSlinky.prefixfree.prefixfreeStrings.`-webkit-` = "-webkit-".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.`-webkit-`]
  }
  
  /** The known prefixes used for CSS properties in `CSSStyleDeclaration`. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.prefixfree.prefixfreeStrings.Moz
    - typingsSlinky.prefixfree.prefixfreeStrings.Ms
    - typingsSlinky.prefixfree.prefixfreeStrings.O
    - typingsSlinky.prefixfree.prefixfreeStrings.Webkit
  */
  trait KnownPrefixJS extends StObject
  object KnownPrefixJS {
    
    @scala.inline
    def Moz: typingsSlinky.prefixfree.prefixfreeStrings.Moz = "Moz".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.Moz]
    
    @scala.inline
    def Ms: typingsSlinky.prefixfree.prefixfreeStrings.Ms = "Ms".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.Ms]
    
    @scala.inline
    def O: typingsSlinky.prefixfree.prefixfreeStrings.O = "O".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.O]
    
    @scala.inline
    def Webkit: typingsSlinky.prefixfree.prefixfreeStrings.Webkit = "Webkit".asInstanceOf[typingsSlinky.prefixfree.prefixfreeStrings.Webkit]
  }
}
