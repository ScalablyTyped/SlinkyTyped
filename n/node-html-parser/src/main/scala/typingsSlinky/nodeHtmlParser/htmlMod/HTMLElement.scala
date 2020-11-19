package typingsSlinky.nodeHtmlParser.htmlMod

import typingsSlinky.nodeHtmlParser.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends Node {
  
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
  
  /**
    * Get escpaed (as-it) text value of current node and its children.
    * @return {string} text content
    */
  @JSName("rawText")
  def rawText_MHTMLElement: String = js.native
  
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
  
  var tagName: String = js.native
  
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
