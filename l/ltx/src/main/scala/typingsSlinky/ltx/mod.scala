package typingsSlinky.ltx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ltx.elementMod.Node
import typingsSlinky.ltx.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Element protected ()
    extends typingsSlinky.ltx.elementMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class Parser ()
    extends typingsSlinky.ltx.parserMod.Parser {
    def this(options: ParserOptions) = this()
  }
  
  def attrsEqual(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  def childrenEqual(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  def clone[T /* <: typingsSlinky.ltx.elementMod.Element */](el: T): T = js.native
  def createElement(name: String): typingsSlinky.ltx.elementMod.Element = js.native
  def createElement(name: String, attrs: String, children: Node*): typingsSlinky.ltx.elementMod.Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typingsSlinky.ltx.elementMod.Element = js.native
  def equal(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  def escapeXML(s: String): String = js.native
  def escapeXMLText(s: String): String = js.native
  def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ Boolean = js.native
  def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ Boolean = js.native
  def isText(el: js.Any): /* is string */ Boolean = js.native
  def nameEqual(a: typingsSlinky.ltx.elementMod.Element, b: typingsSlinky.ltx.elementMod.Element): Boolean = js.native
  def parse(data: String): typingsSlinky.ltx.elementMod.Element = js.native
  def parse(data: String, options: typingsSlinky.ltx.parserMod.Parser): typingsSlinky.ltx.elementMod.Element = js.native
  def parse(data: String, options: ParserOptions): typingsSlinky.ltx.elementMod.Element = js.native
  def stringify(el: typingsSlinky.ltx.elementMod.Element): String = js.native
  def stringify(el: typingsSlinky.ltx.elementMod.Element, indent: Double): String = js.native
  def stringify(el: typingsSlinky.ltx.elementMod.Element, indent: Double, level: Double): String = js.native
  def tag(literals: js.Array[String], substitutions: String*): typingsSlinky.ltx.elementMod.Element = js.native
  def tagString(literals: js.Array[String], substitutions: String*): String = js.native
  def unescapeXML(s: String): String = js.native
  def unescapeXMLText(s: String): String = js.native
}

