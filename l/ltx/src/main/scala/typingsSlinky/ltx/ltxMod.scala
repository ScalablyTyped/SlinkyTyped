package typingsSlinky.ltx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ltx.libElementMod.Node
import typingsSlinky.ltx.libParserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx", JSImport.Namespace)
@js.native
object ltxMod extends js.Object {
  @js.native
  class Element protected ()
    extends typingsSlinky.ltx.libElementMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class Parser ()
    extends typingsSlinky.ltx.libParserMod.Parser {
    def this(options: ParserOptions) = this()
  }
  
  def attrsEqual(a: typingsSlinky.ltx.libElementMod.Element, b: typingsSlinky.ltx.libElementMod.Element): Boolean = js.native
  def childrenEqual(a: typingsSlinky.ltx.libElementMod.Element, b: typingsSlinky.ltx.libElementMod.Element): Boolean = js.native
  def clone[T /* <: typingsSlinky.ltx.libElementMod.Element */](el: T): T = js.native
  def createElement(name: String): typingsSlinky.ltx.libElementMod.Element = js.native
  def createElement(name: String, attrs: String, children: Node*): typingsSlinky.ltx.libElementMod.Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typingsSlinky.ltx.libElementMod.Element = js.native
  def equal(a: typingsSlinky.ltx.libElementMod.Element, b: typingsSlinky.ltx.libElementMod.Element): Boolean = js.native
  def escapeXML(s: String): String = js.native
  def escapeXMLText(s: String): String = js.native
  def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ Boolean = js.native
  def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ Boolean = js.native
  def isText(el: js.Any): /* is string */ Boolean = js.native
  def nameEqual(a: typingsSlinky.ltx.libElementMod.Element, b: typingsSlinky.ltx.libElementMod.Element): Boolean = js.native
  def parse(data: String): typingsSlinky.ltx.libElementMod.Element = js.native
  def parse(data: String, options: typingsSlinky.ltx.libParserMod.Parser): typingsSlinky.ltx.libElementMod.Element = js.native
  def parse(data: String, options: ParserOptions): typingsSlinky.ltx.libElementMod.Element = js.native
  def stringify(el: typingsSlinky.ltx.libElementMod.Element): String = js.native
  def stringify(el: typingsSlinky.ltx.libElementMod.Element, indent: Double): String = js.native
  def stringify(el: typingsSlinky.ltx.libElementMod.Element, indent: Double, level: Double): String = js.native
  def tag(literals: js.Array[String], substitutions: String*): typingsSlinky.ltx.libElementMod.Element = js.native
  def tagString(literals: js.Array[String], substitutions: String*): String = js.native
  def unescapeXML(s: String): String = js.native
  def unescapeXMLText(s: String): String = js.native
}

