package typingsSlinky.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  /**
    * If an object or map contains a key that, when converted to a string,
    * is equal to the value of `aliasString`, then the name of the XML element
    * containing the object will be replaced with the value associated with
    * said key.
    *
    * For example, if `aliasString` is `"="`, then the following object:
    * ```javascript
    * {
    *     "abc": {
    *         "=": "def"
    *         "#": "ghi"
    *     }
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <def>ghi</def>
    * </root>
    * ```
    *
    * The default alias string is `"="`.
    */
  var aliasString: js.UndefOr[String] = js.native
  /**
    * If an object or map contains a key that, when converted to a string,
    * begins with the value of `attributeString`, then the value mapped by
    * said key will be interpreted as attributes for the XML element for that
    * object.
    *
    * The keys of the value of `attributeString` are interpreted as attribute
    * names, while the values mapping to those keys are interpreted as
    * attribute values.
    *
    * For example, if `attributeString` is `"@"`, then the following object:
    * ```javascript
    * {
    *     "abc": {
    *         "@1": {
    *             "ghi": "jkl",
    *             "mno": "pqr"
    *         },
    *         "stu": "vwx",
    *         "@2": {
    *             "yza": "bcd"
    *         },
    *     }
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <abc ghi='jkl' mno='pqr' yza='bcd'>
    *         <stu>vwx</stu>
    *     </abc>
    * </root>
    * ```
    *
    * The default attribute string is `"@"`.
    */
  var attributeString: js.UndefOr[String] = js.native
  /**
    * Whether to enclose any text containing the characters `<` or `&`
    * in CDATA sections. If this is false, these characters shall be replaced
    * with XML escape characters instead.
    *
    * By default, this is disabled.
    */
  var cdataInvalidChars: js.UndefOr[Boolean] = js.native
  /**
    * If an object or map contains a key that, when converted to a string, is
    * equal to an item in `cdataKeys`, then the value mapped by said key will
    * be enclosed in a CDATA section.
    *
    * For example, if `cdataKeys` is:
    * ```javascript
    * [
    *     "abc"
    * ]
    * ```
    * then the following object:
    * ```javascript
    * {
    *     "abc": "def&",
    *     "ghi": "jkl",
    *     "mno": "pqr<"
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <abc><![CDATA[def&]]></ghi>
    *     <ghi>jlk</ghi>
    *     <mno>pqr&lt;</mno>
    * </root>
    * ```
    *
    * If `cdataKeys` has a key named `"*"`, then that entry will match all
    * keys.
    *
    * By default, this is an empty array.
    */
  var cdataKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * The options associated with the XML declaration.
    */
  var declaration: js.UndefOr[IDeclarationOptions] = js.native
  /**
    * The options associated with the XML document type definition.
    */
  var dtd: js.UndefOr[IDtdOptions] = js.native
  /**
    * The options associated with the formatting of the XML document.
    */
  var format: js.UndefOr[IFormatOptions] = js.native
  /**
    * Whether to replace any characters that are not valid in XML in particular
    * contexts with the Unicode replacement character, U+FFFD.
    *
    * At present this is limited to attribute names and values; element names
    * and character data; CDATA sections; and comments. This may be extended
    * in future.
    *
    * By default, this is disabled.
    */
  var replaceInvalidChars: js.UndefOr[Boolean] = js.native
  /**
    * If a value has a type (as defined by calling `Object.prototype.toString`
    * on the value) equal to a key in `typeHandlers`, then said value will be
    * replaced by the return value of the function mapped to by the key in
    * `typeHandlers`. This function is called with the value as a parameter.
    *
    * If one of these functions returns the sole instance of {@link Absent},
    * then the value will be suppressed from the XML output altogether.
    *
    * For example, if `typeHandlers` is:
    * ```javascript
    * {
    *     "[object Date]": function(value) {
    *         return value.getYear();
    *     },
    *     "[object Null]": function(value) {
    *         return Absent.instance;
    *     }
    * }
    * ```
    * then the following object:
    * ```javascript
    * {
    *     "abc": new Date(2012, 10, 31),
    *     "def": null
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <abc>2012</abc>
    * </root>
    * ```
    *
    * If `typeHandlers` has a key named `"*"`, then that entry will match all
    * values, unless there is a more specific entry.
    *
    * Note that normal parsing still occurs for the value returned by the
    * function; it is not directly converted to a string.
    *
    * The default value is an empty object.
    */
  var typeHandlers: js.UndefOr[ITypeHandlers] = js.native
  /**
    * Whether to use a self-closing tag for empty elements.
    *
    * For example, the following element will be used:
    * ```xml
    * <element/>
    * ```
    * instead of:
    * ```xml
    * <element></element>
    * ```
    *
    * By default, this is enabled.
    */
  var useSelfClosingTagIfEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Whether to throw an exception if basic XML validation fails while
    * building the document.
    *
    * By default, this is enabled.
    */
  var validation: js.UndefOr[Boolean] = js.native
  /**
    * If an object or map contains a key that, when converted to a string,
    * begins with the value of `valueString`, then the value mapped by said key
    * will be represented as bare text within the XML element for that object.
    *
    * For example, if `valueString` is `"#"`, then the following object:
    * ```javascript
    * new Map([
    *     ["#1", "abc"],
    *     ["def", "ghi"],
    *     ["#2", "jkl"]
    * ])
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     abc
    *     <def>ghi</def>
    *     jkl
    * </root>
    * ```
    *
    * The default value is `"#"`.
    */
  var valueString: js.UndefOr[String] = js.native
  /**
    * If an object or map contains a key that, when converted to a string, is
    * equal to a key in `wrapHandlers`, and the key in said object or map maps
    * to an array or set, then all items in the array or set will be wrapped
    * in an XML element with the same name as the key.
    *
    * The key in `wrapHandlers` must map to a function that is called with the
    * key name, as well as the array or set, as parameters. This function must
    * return a string or value that can be converted to a string, which will
    * become the name for each XML element for each item in the array or set.
    * Alternatively, this function may return `null` to indicate that no
    * wrapping should occur.
    *
    * For example, if `wrapHandlers` is:
    * ```javascript
    * {
    *     "abc": function(key, value) {
    *         return "def";
    *     }
    * }
    * ```
    * then the following object:
    * ```javascript
    * {
    *     "ghi": "jkl",
    *     "mno": {
    *         "pqr": ["s", "t"]
    *     },
    *     "uvw": {
    *         "abc": ["x", "y"]
    *     }
    * }
    * ```
    * will result in the following XML for a root element named `"root"`:
    * ```xml
    * <root>
    *     <ghi>jkl</ghi>
    *     <mno>
    *         <pqr>s</pqr>
    *         <pqr>t</pqr>
    *     </mno>
    *     <uwv>
    *         <abc>
    *             <def>x</def>
    *             <def>y</def>
    *         </abc>
    *     </uwv>
    * </root>
    * ```
    *
    * If `wrapHandlers` has a key named `"*"`, then that entry will
    * match all arrays and sets, unless there is a more specific entry.
    *
    * The default value is an empty object.
    */
  var wrapHandlers: js.UndefOr[IWrapHandlers] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliasString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasString")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeString")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataInvalidChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataInvalidChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdataInvalidChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataInvalidChars")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdataKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDeclaration(value: IDeclarationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("declaration")(js.undefined)
        ret
    }
    @scala.inline
    def withDtd(value: IDtdOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtd")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: IFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceInvalidChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceInvalidChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceInvalidChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceInvalidChars")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeHandlers(value: ITypeHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSelfClosingTagIfEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSelfClosingTagIfEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSelfClosingTagIfEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSelfClosingTagIfEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
    @scala.inline
    def withValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapHandlers(value: IWrapHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapHandlers")(js.undefined)
        ret
    }
  }
  
}

