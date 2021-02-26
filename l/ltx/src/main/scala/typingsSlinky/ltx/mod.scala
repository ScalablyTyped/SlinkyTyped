package typingsSlinky.ltx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ltx.elementMod.Node
import typingsSlinky.ltx.parserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ltx", "Element")
  @js.native
  class Element protected ()
    extends typingsSlinky.ltx.elementMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("ltx", "Parser")
  @js.native
  class Parser ()
    extends typingsSlinky.ltx.parserMod.Parser {
    def this(options: ParserOptions) = this()
  }
  
  @JSImport("ltx", "attrsEqual")
  @js.native
  def attrsEqual(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  
  @JSImport("ltx", "childrenEqual")
  @js.native
  def childrenEqual(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  
  @JSImport("ltx", "clone")
  @js.native
  def clone_[T /* <: typingsSlinky.ltx.elementMod.Element */](el: T): T = js.native
  
  @JSImport("ltx", "createElement")
  @js.native
  def createElement(name: String, attrs: js.UndefOr[scala.Nothing], children: Node*): typingsSlinky.ltx.elementMod.Element = js.native
  @JSImport("ltx", "createElement")
  @js.native
  def createElement(name: String, attrs: String, children: Node*): typingsSlinky.ltx.elementMod.Element = js.native
  @JSImport("ltx", "createElement")
  @js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typingsSlinky.ltx.elementMod.Element = js.native
  
  @JSImport("ltx", "equal")
  @js.native
  def equal(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  
  @JSImport("ltx", "escapeXML")
  @js.native
  def escapeXML(s: String): String = js.native
  
  @JSImport("ltx", "escapeXMLText")
  @js.native
  def escapeXMLText(s: String): String = js.native
  
  @JSImport("ltx", "isElement")
  @js.native
  def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ Boolean = js.native
  
  @JSImport("ltx", "isNode")
  @js.native
  def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ Boolean = js.native
  
  @JSImport("ltx", "isText")
  @js.native
  def isText(el: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("ltx", "nameEqual")
  @js.native
  def nameEqual(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  
  @JSImport("ltx", "parse")
  @js.native
  def parse(data: String): typingsSlinky.ltx.elementMod.Element = js.native
  @JSImport("ltx", "parse")
  @js.native
  def parse(data: String, options: typingsSlinky.ltx.parserMod.Parser): typingsSlinky.ltx.elementMod.Element = js.native
  @JSImport("ltx", "parse")
  @js.native
  def parse(data: String, options: ParserOptions): typingsSlinky.ltx.elementMod.Element = js.native
  
  @JSImport("ltx", "stringify")
  @js.native
  def stringify(el: typingsSlinky.ltx.elementMod.Element): String = js.native
  @JSImport("ltx", "stringify")
  @js.native
  def stringify(el: typingsSlinky.ltx.elementMod.Element, indent: js.UndefOr[scala.Nothing], level: Double): String = js.native
  @JSImport("ltx", "stringify")
  @js.native
  def stringify(el: typingsSlinky.ltx.elementMod.Element, indent: Double): String = js.native
  @JSImport("ltx", "stringify")
  @js.native
  def stringify(el: typingsSlinky.ltx.elementMod.Element, indent: Double, level: Double): String = js.native
  
  @JSImport("ltx", "tag")
  @js.native
  def tag(literals: js.Array[String], substitutions: String*): typingsSlinky.ltx.elementMod.Element = js.native
  
  @JSImport("ltx", "tagString")
  @js.native
  def tagString(literals: js.Array[String], substitutions: String*): String = js.native
  
  @JSImport("ltx", "unescapeXML")
  @js.native
  def unescapeXML(s: String): String = js.native
  
  @JSImport("ltx", "unescapeXMLText")
  @js.native
  def unescapeXMLText(s: String): String = js.native
}
