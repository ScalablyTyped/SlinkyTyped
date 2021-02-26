package typingsSlinky.nodeHtmlParser

import typingsSlinky.nodeHtmlParser.anon.HTMLElementvalidboolean
import typingsSlinky.nodeHtmlParser.anon.PartialOptions
import typingsSlinky.nodeHtmlParser.anon.PartialOptionsnoFixfalse
import typingsSlinky.nodeHtmlParser.anon.PartialOptionsnoFixtrue
import typingsSlinky.nodeHtmlParser.anon.Valid
import typingsSlinky.nodeHtmlParser.commentMod.default
import typingsSlinky.nodeHtmlParser.htmlMod.KeyAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String, options: PartialOptions): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default(data: String, options: PartialOptionsnoFixtrue): (typingsSlinky.nodeHtmlParser.htmlMod.HTMLElement | typingsSlinky.nodeHtmlParser.textMod.default) with Valid = js.native
  
  @JSImport("node-html-parser", "CommentNode")
  @js.native
  class CommentNode protected () extends default {
    def this(rawText: String) = this()
  }
  
  @JSImport("node-html-parser", "HTMLElement")
  @js.native
  class HTMLElement protected ()
    extends typingsSlinky.nodeHtmlParser.htmlMod.default {
    /**
      * Creates an instance of HTMLElement.
      * @param keyAttrs	id and class attribute
      * @param [rawAttrs]	attributes in string
      *
      * @memberof HTMLElement
      */
    def this(tagName: String, keyAttrs: KeyAttributes) = this()
    def this(tagName: String, keyAttrs: KeyAttributes, rawAttrs: String) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: js.UndefOr[scala.Nothing],
      parentNode: typingsSlinky.nodeHtmlParser.nodeMod.default
    ) = this()
    def this(
      tagName: String,
      keyAttrs: KeyAttributes,
      rawAttrs: String,
      parentNode: typingsSlinky.nodeHtmlParser.nodeMod.default
    ) = this()
  }
  
  @JSImport("node-html-parser", "Node")
  @js.native
  abstract class Node ()
    extends typingsSlinky.nodeHtmlParser.nodeMod.default
  
  @JSImport("node-html-parser", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.nodeHtmlParser.typeMod.NodeType with Double] = js.native
    
    /* 8 */ val COMMENT_NODE: typingsSlinky.nodeHtmlParser.typeMod.NodeType.COMMENT_NODE with Double = js.native
    
    /* 1 */ val ELEMENT_NODE: typingsSlinky.nodeHtmlParser.typeMod.NodeType.ELEMENT_NODE with Double = js.native
    
    /* 3 */ val TEXT_NODE: typingsSlinky.nodeHtmlParser.typeMod.NodeType.TEXT_NODE with Double = js.native
  }
  
  @JSImport("node-html-parser", "TextNode")
  @js.native
  class TextNode protected ()
    extends typingsSlinky.nodeHtmlParser.textMod.default {
    def this(rawText: String) = this()
  }
  
  @JSImport("node-html-parser", JSImport.Default)
  @js.native
  def default_Intersection(data: String): (typingsSlinky.nodeHtmlParser.htmlMod.HTMLElement | typingsSlinky.nodeHtmlParser.textMod.default) with Valid = js.native
  
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String, options: PartialOptions): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse(data: String, options: PartialOptionsnoFixtrue): (typingsSlinky.nodeHtmlParser.htmlMod.HTMLElement | typingsSlinky.nodeHtmlParser.textMod.default) with Valid = js.native
  @JSImport("node-html-parser", "parse")
  @js.native
  def parse_Intersection(data: String): (typingsSlinky.nodeHtmlParser.htmlMod.HTMLElement | typingsSlinky.nodeHtmlParser.textMod.default) with Valid = js.native
}
