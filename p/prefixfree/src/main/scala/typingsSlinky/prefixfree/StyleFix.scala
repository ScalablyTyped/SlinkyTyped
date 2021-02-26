package typingsSlinky.prefixfree

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLStyleElement
import typingsSlinky.prefixfree.StyleFix.StyleFixer
import typingsSlinky.std.ElementCSSInlineStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleFix extends StObject {
  
  def camelCase(str: String): String = js.native
  
  def deCamelCase(str: String): String = js.native
  
  def fix(css: String, raw: Boolean, element: Element): String = js.native
  @JSName("fix")
  var fix_Original: StyleFixer = js.native
  
  var fixers: js.UndefOr[js.Array[StyleFixer]] = js.native
  
  def link(link: HTMLLinkElement): Unit = js.native
  
  var optIn: Boolean = js.native
  
  def process(): Unit = js.native
  
  def register(fixer: StyleFixer): Unit = js.native
  def register(fixer: StyleFixer, index: Double): Unit = js.native
  
  def styleAttribute(element: ElementCSSInlineStyle): Unit = js.native
  
  def styleElement(style: HTMLStyleElement): Unit = js.native
}
object StyleFix {
  
  type StyleFixer = js.Function3[/* css */ String, /* raw */ Boolean, /* element */ Element, String]
}
