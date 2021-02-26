package typingsSlinky.nodeHtmlParser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeHtmlParser.anon.HTMLElementvalidboolean
import typingsSlinky.nodeHtmlParser.anon.PartialOptions
import typingsSlinky.nodeHtmlParser.anon.PartialOptionsnoFixfalse
import typingsSlinky.nodeHtmlParser.anon.PartialOptionsnoFixtrue
import typingsSlinky.nodeHtmlParser.anon.Valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("node-html-parser/dist/nodes/html", JSImport.Default)
  @js.native
  class default protected () extends HTMLElement {
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
  
  @JSImport("node-html-parser/dist/nodes/html", "parse")
  @js.native
  def parse(data: String): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser/dist/nodes/html", "parse")
  @js.native
  def parse(data: String, options: PartialOptions): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser/dist/nodes/html", "parse")
  @js.native
  def parse(data: String, options: PartialOptionsnoFixfalse): HTMLElementvalidboolean = js.native
  @JSImport("node-html-parser/dist/nodes/html", "parse")
  @js.native
  def parse(data: String, options: PartialOptionsnoFixtrue): (HTMLElement | typingsSlinky.nodeHtmlParser.textMod.default) with Valid = js.native
  @JSImport("node-html-parser/dist/nodes/html", "parse")
  @js.native
  def parse_Intersection(data: String): (HTMLElement | typingsSlinky.nodeHtmlParser.textMod.default) with Valid = js.native
  
  type Attributes = StringDictionary[String]
  
  @js.native
  trait HTMLElement
    extends typingsSlinky.nodeHtmlParser.nodeMod.default {
    
    var _attrs: js.Any = js.native
    
    var _rawAttrs: js.Any = js.native
    
    /**
      * Append a child node to childNodes
      * @param  {Node} node node to append
      * @return {Node}      node appended
      */
    def appendChild[T /* <: typingsSlinky.nodeHtmlParser.nodeMod.default */](node: T): T = js.native
    
    /**
      * Get attributes
      * @return {Object} parsed and unescaped attributes
      */
    def attributes: Attributes = js.native
    
    var classNames: js.Array[String] = js.native
    
    /**
      * Exchanges given child with new child
      * @param {HTMLElement} oldNode     node to exchange
      * @param {HTMLElement} newNode     new node
      */
    def exchangeChild(
      oldNode: typingsSlinky.nodeHtmlParser.nodeMod.default,
      newNode: typingsSlinky.nodeHtmlParser.nodeMod.default
    ): Unit = js.native
    
    /**
      * Get first child node
      * @return {Node} first child node
      */
    def firstChild: typingsSlinky.nodeHtmlParser.nodeMod.default = js.native
    
    /**
      * Get an attribute
      * @return {string} value of the attribute
      */
    def getAttribute(key: String): js.UndefOr[String] = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    var id: String = js.native
    
    def innerHTML: String = js.native
    
    def insertAdjacentHTML(where: InsertPosition, html: String): Unit = js.native
    
    /**
      * Get last child node
      * @return {Node} last child node
      */
    def lastChild: typingsSlinky.nodeHtmlParser.nodeMod.default = js.native
    
    def nextElementSibling: HTMLElement = js.native
    
    def nextSibling: typingsSlinky.nodeHtmlParser.nodeMod.default = js.native
    
    def outerHTML: String = js.native
    
    var parentNode: typingsSlinky.nodeHtmlParser.nodeMod.default = js.native
    
    /**
      * Query CSS Selector to find matching node.
      * @param  {string}         selector Simplified CSS selector
      * @param  {Matcher}        selector A Matcher instance
      * @return {HTMLElement}    matching node
      */
    def querySelector(selector: String): HTMLElement = js.native
    def querySelector(selector: typingsSlinky.nodeHtmlParser.matcherMod.default): HTMLElement = js.native
    
    /**
      * Query CSS selector to find matching nodes.
      * @param  {string}         selector Simplified CSS selector
      * @param  {Matcher}        selector A Matcher instance
      * @return {HTMLElement[]}  matching elements
      */
    def querySelectorAll(selector: String): js.Array[HTMLElement] = js.native
    def querySelectorAll(selector: typingsSlinky.nodeHtmlParser.matcherMod.default): js.Array[HTMLElement] = js.native
    
    /**
      * Get escaped (as-it) attributes
      * @return {Object} parsed attributes
      */
    def rawAttributes: RawAttributes = js.native
    
    var rawAttrs: js.Any = js.native
    
    var rawTagName: String = js.native
    
    /**
      * Get escpaed (as-it) text value of current node and its children.
      * @return {string} text content
      */
    @JSName("rawText")
    def rawText_MHTMLElement: String = js.native
    
    /**
      * Remove current element
      */
    def remove(): Unit = js.native
    
    def removeAttribute(key: String): Unit = js.native
    
    /**
      * Remove Child element from childNodes array
      * @param {HTMLElement} node     node to remove
      */
    def removeChild(node: typingsSlinky.nodeHtmlParser.nodeMod.default): Unit = js.native
    
    /**
      * Remove whitespaces in this sub tree.
      * @return {HTMLElement} pointer to this
      */
    def removeWhitespace(): this.type = js.native
    
    /**
      * Set an attribute value to the HTMLElement
      * @param {string} key The attribute name
      * @param {string} value The value to set, or null / undefined to remove an attribute
      */
    def setAttribute(key: String, value: String): Unit = js.native
    
    /**
      * Replace all the attributes of the HTMLElement by the provided attributes
      * @param {Attributes} attributes the new attribute set
      */
    def setAttributes(attributes: Attributes): Unit = js.native
    
    def set_content(content: String): Unit = js.native
    def set_content(content: String, options: Options): Unit = js.native
    def set_content(content: js.Array[typingsSlinky.nodeHtmlParser.nodeMod.default]): Unit = js.native
    def set_content(content: js.Array[typingsSlinky.nodeHtmlParser.nodeMod.default], options: Options): Unit = js.native
    def set_content(content: typingsSlinky.nodeHtmlParser.nodeMod.default): Unit = js.native
    def set_content(content: typingsSlinky.nodeHtmlParser.nodeMod.default, options: Options): Unit = js.native
    
    /**
      * Get DOM structure
      * @return {string} strucutre
      */
    def structure: String = js.native
    
    /**
      * Get structured Text (with '\n' etc.)
      * @return {string} structured text
      */
    def structuredText: String = js.native
    
    def tagName: String = js.native
    
    /**
      * Get unescaped text value of current node and its children.
      * @return {string} text content
      */
    @JSName("text")
    def text_MHTMLElement: String = js.native
    
    /**
      * Trim element from right (in block) after seeing pattern in a TextNode.
      * @param  {RegExp} pattern pattern to find
      * @return {HTMLElement}    reference to current node
      */
    def trimRight(pattern: js.RegExp): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.beforebegin
    - typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.afterbegin
    - typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.beforeend
    - typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.afterend
  */
  trait InsertPosition extends StObject
  object InsertPosition {
    
    @scala.inline
    def afterbegin: typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.afterbegin = "afterbegin".asInstanceOf[typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.afterbegin]
    
    @scala.inline
    def afterend: typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.afterend = "afterend".asInstanceOf[typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.afterend]
    
    @scala.inline
    def beforebegin: typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.beforebegin = "beforebegin".asInstanceOf[typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.beforebegin]
    
    @scala.inline
    def beforeend: typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.beforeend = "beforeend".asInstanceOf[typingsSlinky.nodeHtmlParser.nodeHtmlParserStrings.beforeend]
  }
  
  @js.native
  trait KeyAttributes extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
  }
  object KeyAttributes {
    
    @scala.inline
    def apply(): KeyAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyAttributes]
    }
    
    @scala.inline
    implicit class KeyAttributesMutableBuilder[Self <: KeyAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var blockTextElements: StringDictionary[Boolean] = js.native
    
    var comment: Boolean = js.native
    
    var lowerCaseTagName: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(blockTextElements: StringDictionary[Boolean], comment: Boolean, lowerCaseTagName: Boolean): Options = {
      val __obj = js.Dynamic.literal(blockTextElements = blockTextElements.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], lowerCaseTagName = lowerCaseTagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockTextElements(value: StringDictionary[Boolean]): Self = StObject.set(x, "blockTextElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseTagName(value: Boolean): Self = StObject.set(x, "lowerCaseTagName", value.asInstanceOf[js.Any])
    }
  }
  
  type RawAttributes = StringDictionary[String]
}
