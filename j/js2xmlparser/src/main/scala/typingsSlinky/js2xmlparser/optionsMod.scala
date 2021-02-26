package typingsSlinky.js2xmlparser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("js2xmlparser/lib/options", "DeclarationOptions")
  @js.native
  class DeclarationOptions () extends IDeclarationOptions {
    def this(declarationOptions: IDeclarationOptions) = this()
    
    @JSName("include")
    var include_DeclarationOptions: Boolean = js.native
  }
  
  @JSImport("js2xmlparser/lib/options", "DtdOptions")
  @js.native
  class DtdOptions protected () extends IDtdOptions {
    def this(validation: Boolean) = this()
    def this(validation: Boolean, dtdOptions: IDtdOptions) = this()
    
    @JSName("include")
    var include_DtdOptions: Boolean = js.native
  }
  
  @JSImport("js2xmlparser/lib/options", "FormatOptions")
  @js.native
  class FormatOptions () extends IFormatOptions {
    def this(formatOptions: IFormatOptions) = this()
  }
  
  @JSImport("js2xmlparser/lib/options", "Options")
  @js.native
  class Options () extends IOptions {
    def this(options: IOptions) = this()
    
    @JSName("aliasString")
    var aliasString_Options: String = js.native
    
    @JSName("attributeString")
    var attributeString_Options: String = js.native
    
    @JSName("cdataInvalidChars")
    var cdataInvalidChars_Options: Boolean = js.native
    
    @JSName("cdataKeys")
    var cdataKeys_Options: js.Array[String] = js.native
    
    @JSName("declaration")
    var declaration_Options: DeclarationOptions = js.native
    
    @JSName("dtd")
    var dtd_Options: DtdOptions = js.native
    
    @JSName("format")
    var format_Options: FormatOptions = js.native
    
    @JSName("replaceInvalidChars")
    var replaceInvalidChars_Options: Boolean = js.native
    
    @JSName("typeHandlers")
    var typeHandlers_Options: TypeHandlers = js.native
    
    @JSName("useSelfClosingTagIfEmpty")
    var useSelfClosingTagIfEmpty_Options: Boolean = js.native
    
    @JSName("validation")
    var validation_Options: Boolean = js.native
    
    @JSName("valueString")
    var valueString_Options: String = js.native
    
    @JSName("wrapHandlers")
    var wrapHandlers_Options: WrapHandlers = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSImport("js2xmlparser/lib/options", "TypeHandlers")
  @js.native
  class TypeHandlers () extends ITypeHandlers {
    def this(typeHandlers: ITypeHandlers) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSImport("js2xmlparser/lib/options", "WrapHandlers")
  @js.native
  class WrapHandlers () extends IWrapHandlers {
    def this(wrapHandlers: IWrapHandlers) = this()
  }
  
  @js.native
  trait IDeclarationOptions extends StObject {
    
    /**
      * The encoding attribute to be included in the declaration. If defined,
      * this value must be a valid encoding. By default, no encoding attribute
      * is included.
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * Whether to include a declaration in the generated XML. By default,
      * one is included.
      */
    var include: js.UndefOr[Boolean] = js.native
    
    /**
      * The value of the standalone attribute to be included in the declaration.
      * If defined, this value must be "yes" or "no". By default, no standalone
      * attribute is included.
      */
    var standalone: js.UndefOr[String] = js.native
    
    /**
      * The XML version to be included in the declaration. If defined, this
      * value must be a valid XML version number. Defaults to "1.0".
      */
    var version: js.UndefOr[String] = js.native
  }
  object IDeclarationOptions {
    
    @scala.inline
    def apply(): IDeclarationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDeclarationOptions]
    }
    
    @scala.inline
    implicit class IDeclarationOptionsMutableBuilder[Self <: IDeclarationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait IDtdOptions extends StObject {
    
    /**
      * Whether to include a DTD in the generated XML. By default, no DTD is
      * included.
      */
    var include: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of the DTD. This value cannot be left undefined if `include`
      * is true.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The public identifier of the DTD, excluding quotation marks. If a public
      * identifier is provided, a system identifier must be provided as well.
      * By default, no public identifier is included.
      */
    var pubId: js.UndefOr[String] = js.native
    
    /**
      * The system identifier of the DTD, excluding quotation marks. By default,
      * no system identifier is included.
      */
    var sysId: js.UndefOr[String] = js.native
  }
  object IDtdOptions {
    
    @scala.inline
    def apply(): IDtdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDtdOptions]
    }
    
    @scala.inline
    implicit class IDtdOptionsMutableBuilder[Self <: IDtdOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPubId(value: String): Self = StObject.set(x, "pubId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubIdUndefined: Self = StObject.set(x, "pubId", js.undefined)
      
      @scala.inline
      def setSysId(value: String): Self = StObject.set(x, "sysId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSysIdUndefined: Self = StObject.set(x, "sysId", js.undefined)
    }
  }
  
  @js.native
  trait IFormatOptions extends StObject {
    
    /**
      * Whether double quotes or single quotes should be used in XML attributes.
      * By default, single quotes are used.
      */
    var doubleQuotes: js.UndefOr[Boolean] = js.native
    
    /**
      * The indent string used for pretty-printing. The default indent string is
      * four spaces.
      */
    var indent: js.UndefOr[String] = js.native
    
    /**
      * The newline string used for pretty-printing. The default newline string
      * is "\n".
      */
    var newline: js.UndefOr[String] = js.native
    
    /**
      * Whether pretty-printing is enabled. By default, pretty-printing is
      * enabled.
      */
    var pretty: js.UndefOr[Boolean] = js.native
  }
  object IFormatOptions {
    
    @scala.inline
    def apply(): IFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFormatOptions]
    }
    
    @scala.inline
    implicit class IFormatOptionsMutableBuilder[Self <: IFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoubleQuotes(value: Boolean): Self = StObject.set(x, "doubleQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoubleQuotesUndefined: Self = StObject.set(x, "doubleQuotes", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
  
  @js.native
  trait IOptions extends StObject {
    
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
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliasString(value: String): Self = StObject.set(x, "aliasString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasStringUndefined: Self = StObject.set(x, "aliasString", js.undefined)
      
      @scala.inline
      def setAttributeString(value: String): Self = StObject.set(x, "attributeString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeStringUndefined: Self = StObject.set(x, "attributeString", js.undefined)
      
      @scala.inline
      def setCdataInvalidChars(value: Boolean): Self = StObject.set(x, "cdataInvalidChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdataInvalidCharsUndefined: Self = StObject.set(x, "cdataInvalidChars", js.undefined)
      
      @scala.inline
      def setCdataKeys(value: js.Array[String]): Self = StObject.set(x, "cdataKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdataKeysUndefined: Self = StObject.set(x, "cdataKeys", js.undefined)
      
      @scala.inline
      def setCdataKeysVarargs(value: String*): Self = StObject.set(x, "cdataKeys", js.Array(value :_*))
      
      @scala.inline
      def setDeclaration(value: IDeclarationOptions): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      @scala.inline
      def setDtd(value: IDtdOptions): Self = StObject.set(x, "dtd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtdUndefined: Self = StObject.set(x, "dtd", js.undefined)
      
      @scala.inline
      def setFormat(value: IFormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setReplaceInvalidChars(value: Boolean): Self = StObject.set(x, "replaceInvalidChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsUndefined: Self = StObject.set(x, "replaceInvalidChars", js.undefined)
      
      @scala.inline
      def setTypeHandlers(value: ITypeHandlers): Self = StObject.set(x, "typeHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeHandlersUndefined: Self = StObject.set(x, "typeHandlers", js.undefined)
      
      @scala.inline
      def setUseSelfClosingTagIfEmpty(value: Boolean): Self = StObject.set(x, "useSelfClosingTagIfEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSelfClosingTagIfEmptyUndefined: Self = StObject.set(x, "useSelfClosingTagIfEmpty", js.undefined)
      
      @scala.inline
      def setValidation(value: Boolean): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
      
      @scala.inline
      def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
      
      @scala.inline
      def setWrapHandlers(value: IWrapHandlers): Self = StObject.set(x, "wrapHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapHandlersUndefined: Self = StObject.set(x, "wrapHandlers", js.undefined)
    }
  }
  
  type ITypeHandlers = /**
    * Mapping between the type of a value in an object to a function taking
    * this value and returning a replacement value.
    */
  StringDictionary[js.Function1[/* value */ js.Any, js.Any]]
  
  type IWrapHandlers = /**
    * Mapping between the string version of a key in an object or map with a
    * value that is an array or set to a function taking the string version
    * of that key, as well as that array or set.
    *
    * This function returns either a string that will become the name for each
    * XML element for each item in the array or set, or `null` to indicate that
    * wrapping should not occur.
    */
  StringDictionary[js.Function2[/* key */ String, /* value */ js.Any, String | Null]]
}
