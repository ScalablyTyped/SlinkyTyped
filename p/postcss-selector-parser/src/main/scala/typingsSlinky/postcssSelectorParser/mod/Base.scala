package typingsSlinky.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.`class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base[Value /* <: js.UndefOr[String] */, ParentType /* <: js.UndefOr[Container[String]] */] extends js.Object {
  
  /**
    * Some non-standard syntax doesn't follow normal escaping rules for css.
    * This allows non standard syntax to be appended to an existing property
    * by specifying the escaped value. By specifying the escaped value,
    * illegal characters are allowed to be directly inserted into css output.
    * @param {string} name the property to set
    * @param {any} value the unescaped value of the property
    * @param {string} valueEscaped optional. the escaped value of the property.
    */
  def appendToPropertyAndEscape(name: String, value: js.Any, valueEscaped: String): Unit = js.native
  
  def clone(opts: StringDictionary[js.Any]): Node = js.native
  
  /**
    * Return whether this node includes the character at the position of the given line and column.
    * Returns undefined if the nodes lack sufficient source metadata to determine the position.
    * @param line 1-index based line number relative to the start of the selector.
    * @param column 1-index based column number relative to the start of the selector.
    */
  def isAtPosition(line: Double, column: Double): js.UndefOr[Boolean] = js.native
  
  def next(): Node = js.native
  
  var parent: ParentType = js.native
  
  def prev(): Node = js.native
  
  var rawSpaceAfter: String = js.native
  
  var rawSpaceBefore: String = js.native
  
  def remove(): Node = js.native
  
  def replaceWith(nodes: Node*): Node = js.native
  
  /**
    * Some non-standard syntax doesn't follow normal escaping rules for css,
    * this allows the escaped value to be specified directly, allowing illegal characters to be
    * directly inserted into css output.
    * @param name the property to set
    * @param value the unescaped value of the property
    * @param valueEscaped optional. the escaped value of the property.
    */
  def setPropertyAndEscape(name: String, value: js.Any, valueEscaped: String): Unit = js.native
  
  /**
    * When you want a value to passed through to CSS directly. This method
    * deletes the corresponding raw value causing the stringifier to fallback
    * to the unescaped value.
    * @param name the property to set.
    * @param value The value that is both escaped and unescaped.
    */
  def setPropertyWithoutEscape(name: String, value: js.Any): Unit = js.native
  
  var source: js.UndefOr[NodeSource] = js.native
  
  var sourceIndex: Double = js.native
  
  var spaces: Spaces = js.native
  
  var `type`: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.tag | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.string | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.selector | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.root | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.nesting | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.id | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.universal = js.native
  
  var value: Value = js.native
}
object Base {
  
  @scala.inline
  def apply[Value /* <: js.UndefOr[String] */, ParentType /* <: js.UndefOr[Container[String]] */](
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone: StringDictionary[js.Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    next: () => Node,
    parent: ParentType,
    prev: () => Node,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: () => Node,
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, js.Any, String) => Unit,
    setPropertyWithoutEscape: (String, js.Any) => Unit,
    sourceIndex: Double,
    spaces: Spaces,
    `type`: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.tag | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.string | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.selector | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.root | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.nesting | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.id | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.universal,
    value: Value
  ): Base[Value, ParentType] = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), clone = js.Any.fromFunction1(clone), isAtPosition = js.Any.fromFunction2(isAtPosition), next = js.Any.fromFunction0(next), parent = parent.asInstanceOf[js.Any], prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[Value, ParentType]]
  }
  
  @scala.inline
  implicit class BaseOps[Self <: Base[_, _], Value /* <: js.UndefOr[String] */, ParentType /* <: js.UndefOr[Container[String]] */] (val x: Self with (Base[Value, ParentType])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppendToPropertyAndEscape(value: (String, js.Any, String) => Unit): Self = this.set("appendToPropertyAndEscape", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClone(value: StringDictionary[js.Any] => Node): Self = this.set("clone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAtPosition(value: (Double, Double) => js.UndefOr[Boolean]): Self = this.set("isAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNext(value: () => Node): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: ParentType): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: () => Node): Self = this.set("prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRawSpaceAfter(value: String): Self = this.set("rawSpaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawSpaceBefore(value: String): Self = this.set("rawSpaceBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Node): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node => Node): Self = this.set("replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertyAndEscape(value: (String, js.Any, String) => Unit): Self = this.set("setPropertyAndEscape", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetPropertyWithoutEscape(value: (String, js.Any) => Unit): Self = this.set("setPropertyWithoutEscape", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaces(value: Spaces): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.tag | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.string | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.selector | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.root | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.pseudo | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.nesting | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.id | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.comment | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.combinator | `class` | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute | typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.universal
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: NodeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
