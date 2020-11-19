package typingsSlinky.postcssSelectorParser.mod

import typingsSlinky.postcssSelectorParser.anon.Before
import typingsSlinky.postcssSelectorParser.anon.Insensitive
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings._empty
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attributeNS
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.i
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.insensitive
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.namespace
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.ns
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.operator
import typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute_
  extends Namespace[js.UndefOr[String]] {
  
  var attribute: String = js.native
  
  /**
    * Returns the attribute's value quoted such that it would be legal to use
    * in the value of a css file. The original value's quotation setting
    * used for stringification is left unchanged. See `setValue(value, options)`
    * if you want to control the quote settings of a new value for the attribute or
    * `set quoteMark(mark)` if you want to change the quote settings of the current
    * value.
    *
    * You can also change the quotation used for the current value by setting quoteMark.
    **/
  def getQuotedValue(): String = js.native
  def getQuotedValue(options: SmartQuoteMarkOptions): String = js.native
  
  var insensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * The case insensitivity flag or an empty string depending on whether this
    * attribute is case insensitive.
    */
  val insensitiveFlag: i | _empty = js.native
  
  @JSName("offsetOf")
  def offsetOf_attribute(part: typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute): Double = js.native
  @JSName("offsetOf")
  def offsetOf_attributeNS(part: attributeNS): Double = js.native
  @JSName("offsetOf")
  def offsetOf_insensitive(part: insensitive): Double = js.native
  @JSName("offsetOf")
  def offsetOf_namespace(part: namespace): Double = js.native
  /**
    * returns the offset of the attribute part specified relative to the
    * start of the node of the output string.
    *
    * * "ns" - alias for "namespace"
    * * "namespace" - the namespace if it exists.
    * * "attribute" - the attribute name
    * * "attributeNS" - the start of the attribute or its namespace
    * * "operator" - the match operator of the attribute
    * * "value" - The value (string or identifier)
    * * "insensitive" - the case insensitivity flag;
    * @param part One of the possible values inside an attribute.
    * @returns -1 if the name is invalid or the value doesn't exist in this attribute.
    */
  @JSName("offsetOf")
  def offsetOf_ns(part: ns): Double = js.native
  @JSName("offsetOf")
  def offsetOf_operator(part: operator): Double = js.native
  @JSName("offsetOf")
  def offsetOf_value(part: value): Double = js.native
  
  var operator: js.UndefOr[AttributeOperator] = js.native
  
  /**
    * Selects the preferred quote mark based on the options and the current quote mark value.
    * If you want the quote mark to depend on the attribute value, call `smartQuoteMark(opts)`
    * instead.
    */
  def preferredQuoteMark(options: PreferredQuoteMarkOptions): QuoteMark = js.native
  
  /**
    * The attribute name after having been qualified with a namespace.
    */
  val qualifiedAttribute: String = js.native
  
  var quoteMark: QuoteMark = js.native
  
  var quoted: js.UndefOr[Boolean] = js.native
  
  var raws: Insensitive = js.native
  
  /**
    * Set the unescaped value with the specified quotation options. The value
    * provided must not include any wrapping quote marks -- those quotes will
    * be interpreted as part of the value and escaped accordingly.
    * @param value
    */
  def setValue(value: String): Unit = js.native
  def setValue(value: String, options: SmartQuoteMarkOptions): Unit = js.native
  
  /**
    * Intelligently select a quoteMark value based on the value's contents. If
    * the value is a legal CSS ident, it will not be quoted. Otherwise a quote
    * mark will be picked that minimizes the number of escapes.
    *
    * If there's no clear winner, the quote mark from these options is used,
    * then the source quote mark (this is inverted if `preferCurrentQuoteMark` is
    * true). If the quoteMark is unspecified, a double quote is used.
    **/
  def smartQuoteMark(options: PreferredQuoteMarkOptions): QuoteMark = js.native
  
  @JSName("spaces")
  var spaces_Attribute_ : Before = js.native
  
  @JSName("type")
  var type_Attribute_ : typingsSlinky.postcssSelectorParser.postcssSelectorParserStrings.attribute = js.native
}
