package typingsSlinky.cliHighlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("cli-highlight/dist/theme", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: Theme = js.native
  
  @JSImport("cli-highlight/dist/theme", "fromJson")
  @js.native
  def fromJson(json: JsonTheme): Theme = js.native
  
  @JSImport("cli-highlight/dist/theme", "parse")
  @js.native
  def parse(json: String): Theme = js.native
  
  @JSImport("cli-highlight/dist/theme", "plain")
  @js.native
  def plain(codePart: String): String = js.native
  
  @JSImport("cli-highlight/dist/theme", "stringify")
  @js.native
  def stringify(theme: Theme): String = js.native
  
  @JSImport("cli-highlight/dist/theme", "toJson")
  @js.native
  def toJson(theme: Theme): JsonTheme = js.native
  
  type JsonTheme = Tokens[Style | js.Array[Style]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cliHighlight.cliHighlightStrings.reset
    - typingsSlinky.cliHighlight.cliHighlightStrings.bold
    - typingsSlinky.cliHighlight.cliHighlightStrings.dim
    - typingsSlinky.cliHighlight.cliHighlightStrings.italic
    - typingsSlinky.cliHighlight.cliHighlightStrings.underline
    - typingsSlinky.cliHighlight.cliHighlightStrings.inverse
    - typingsSlinky.cliHighlight.cliHighlightStrings.hidden
    - typingsSlinky.cliHighlight.cliHighlightStrings.strikethrough
    - typingsSlinky.cliHighlight.cliHighlightStrings.black
    - typingsSlinky.cliHighlight.cliHighlightStrings.red
    - typingsSlinky.cliHighlight.cliHighlightStrings.green
    - typingsSlinky.cliHighlight.cliHighlightStrings.yellow
    - typingsSlinky.cliHighlight.cliHighlightStrings.blue
    - typingsSlinky.cliHighlight.cliHighlightStrings.magenta
    - typingsSlinky.cliHighlight.cliHighlightStrings.cyan
    - typingsSlinky.cliHighlight.cliHighlightStrings.white
    - typingsSlinky.cliHighlight.cliHighlightStrings.gray
    - typingsSlinky.cliHighlight.cliHighlightStrings.bgBlack
    - typingsSlinky.cliHighlight.cliHighlightStrings.bgRed
    - typingsSlinky.cliHighlight.cliHighlightStrings.bgGreen
    - typingsSlinky.cliHighlight.cliHighlightStrings.bgYellow
    - typingsSlinky.cliHighlight.cliHighlightStrings.bgBlue
    - typingsSlinky.cliHighlight.cliHighlightStrings.bgMagenta
    - typingsSlinky.cliHighlight.cliHighlightStrings.bgCyan
    - typingsSlinky.cliHighlight.cliHighlightStrings.plain
  */
  trait Style extends StObject
  object Style {
    
    @scala.inline
    def bgBlack: typingsSlinky.cliHighlight.cliHighlightStrings.bgBlack = "bgBlack".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bgBlack]
    
    @scala.inline
    def bgBlue: typingsSlinky.cliHighlight.cliHighlightStrings.bgBlue = "bgBlue".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bgBlue]
    
    @scala.inline
    def bgCyan: typingsSlinky.cliHighlight.cliHighlightStrings.bgCyan = "bgCyan".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bgCyan]
    
    @scala.inline
    def bgGreen: typingsSlinky.cliHighlight.cliHighlightStrings.bgGreen = "bgGreen".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bgGreen]
    
    @scala.inline
    def bgMagenta: typingsSlinky.cliHighlight.cliHighlightStrings.bgMagenta = "bgMagenta".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bgMagenta]
    
    @scala.inline
    def bgRed: typingsSlinky.cliHighlight.cliHighlightStrings.bgRed = "bgRed".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bgRed]
    
    @scala.inline
    def bgYellow: typingsSlinky.cliHighlight.cliHighlightStrings.bgYellow = "bgYellow".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bgYellow]
    
    @scala.inline
    def black: typingsSlinky.cliHighlight.cliHighlightStrings.black = "black".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.black]
    
    @scala.inline
    def blue: typingsSlinky.cliHighlight.cliHighlightStrings.blue = "blue".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.blue]
    
    @scala.inline
    def bold: typingsSlinky.cliHighlight.cliHighlightStrings.bold = "bold".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.bold]
    
    @scala.inline
    def cyan: typingsSlinky.cliHighlight.cliHighlightStrings.cyan = "cyan".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.cyan]
    
    @scala.inline
    def dim: typingsSlinky.cliHighlight.cliHighlightStrings.dim = "dim".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.dim]
    
    @scala.inline
    def gray: typingsSlinky.cliHighlight.cliHighlightStrings.gray = "gray".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.gray]
    
    @scala.inline
    def green: typingsSlinky.cliHighlight.cliHighlightStrings.green = "green".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.green]
    
    @scala.inline
    def hidden: typingsSlinky.cliHighlight.cliHighlightStrings.hidden = "hidden".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.hidden]
    
    @scala.inline
    def inverse: typingsSlinky.cliHighlight.cliHighlightStrings.inverse = "inverse".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.inverse]
    
    @scala.inline
    def italic: typingsSlinky.cliHighlight.cliHighlightStrings.italic = "italic".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.italic]
    
    @scala.inline
    def magenta: typingsSlinky.cliHighlight.cliHighlightStrings.magenta = "magenta".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.magenta]
    
    @scala.inline
    def plain: typingsSlinky.cliHighlight.cliHighlightStrings.plain = "plain".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.plain]
    
    @scala.inline
    def red: typingsSlinky.cliHighlight.cliHighlightStrings.red = "red".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.red]
    
    @scala.inline
    def reset: typingsSlinky.cliHighlight.cliHighlightStrings.reset = "reset".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.reset]
    
    @scala.inline
    def strikethrough: typingsSlinky.cliHighlight.cliHighlightStrings.strikethrough = "strikethrough".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.strikethrough]
    
    @scala.inline
    def underline: typingsSlinky.cliHighlight.cliHighlightStrings.underline = "underline".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.underline]
    
    @scala.inline
    def white: typingsSlinky.cliHighlight.cliHighlightStrings.white = "white".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.white]
    
    @scala.inline
    def yellow: typingsSlinky.cliHighlight.cliHighlightStrings.yellow = "yellow".asInstanceOf[typingsSlinky.cliHighlight.cliHighlightStrings.yellow]
  }
  
  @js.native
  trait Theme
    extends Tokens[js.Function1[/* codePart */ String, String]] {
    
    /**
      * things not matched by any token
      */
    var default: js.UndefOr[js.Function1[/* codePart */ String, String]] = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(): Theme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: /* codePart */ String => String): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  @js.native
  trait Tokens[T] extends StObject {
    
    /**
      * added or changed line in a diff
      */
    var addition: js.UndefOr[T] = js.native
    
    /**
      * name of an attribute with no language defined semantics (keys in JSON, setting names in .ini), also sub-attribute within another highlighted object, like XML tag
      */
    var attr: js.UndefOr[T] = js.native
    
    /**
      * name of an attribute followed by a structured value part, like CSS properties
      */
    var attribute: js.UndefOr[T] = js.native
    
    /**
      * built-in or library object (constant, class, function)
      */
    var built_in: js.UndefOr[T] = js.native
    
    /**
      * s-expression name from the language standard library
      */
    var `builtin-name`: js.UndefOr[T] = js.native
    
    /**
      * list item bullet in text markup
      */
    var bullet: js.UndefOr[T] = js.native
    
    /**
      * class or class-level declaration (interfaces, traits, modules, etc)
      */
    var `class`: js.UndefOr[T] = js.native
    
    /**
      * code block in text markup
      */
    var code: js.UndefOr[T] = js.native
    
    /**
      * comment
      */
    var comment: js.UndefOr[T] = js.native
    
    /**
      * deleted line in a diff
      */
    var deletion: js.UndefOr[T] = js.native
    
    /**
      * documentation markup within comments
      */
    var doctag: js.UndefOr[T] = js.native
    
    /**
      * emphasis in text markup
      */
    var emphasis: js.UndefOr[T] = js.native
    
    /**
      * mathematical formula in text markup
      */
    var formula: js.UndefOr[T] = js.native
    
    /**
      * function or method declaration
      */
    var function: js.UndefOr[T] = js.native
    
    /**
      * keyword in a regular Algol-style language
      */
    var keyword: js.UndefOr[T] = js.native
    
    /**
      * hyperlink in text markup
      */
    var link: js.UndefOr[T] = js.native
    
    /**
      * special identifier for a built-in value ("true", "false", "null")
      */
    var literal: js.UndefOr[T] = js.native
    
    /**
      * flags, modifiers, annotations, processing instructions, preprocessor directive, etc
      */
    var meta: js.UndefOr[T] = js.native
    
    /**
      * keyword or built-in within meta construct
      */
    var `meta-keyword`: js.UndefOr[T] = js.native
    
    /**
      * string within meta construct
      */
    var `meta-string`: js.UndefOr[T] = js.native
    
    /**
      * name of an XML tag, the first word in an s-expression
      */
    var name: js.UndefOr[T] = js.native
    
    /**
      * number, including units and modifiers, if any.
      */
    var number: js.UndefOr[T] = js.native
    
    /**
      * block of function arguments (parameters) at the place of declaration
      */
    var params: js.UndefOr[T] = js.native
    
    /**
      * quotation in text markup
      */
    var quote: js.UndefOr[T] = js.native
    
    /**
      * literal regular expression
      */
    var regexp: js.UndefOr[T] = js.native
    
    /**
      * heading of a section in a config file, heading in text markup
      */
    var section: js.UndefOr[T] = js.native
    
    /**
      * [attr] selector in CSS
      */
    var `selector-attr`: js.UndefOr[T] = js.native
    
    /**
      * .class selector in CSS
      */
    var `selector-class`: js.UndefOr[T] = js.native
    
    /**
      * #id selector in CSS
      */
    var `selector-id`: js.UndefOr[T] = js.native
    
    /**
      * :pseudo selector in CSS
      */
    var `selector-pseudo`: js.UndefOr[T] = js.native
    
    /**
      * tag selector in CSS
      */
    var `selector-tag`: js.UndefOr[T] = js.native
    
    /**
      * literal string, character
      */
    var string: js.UndefOr[T] = js.native
    
    /**
      * strong emphasis in text markup
      */
    var strong: js.UndefOr[T] = js.native
    
    /**
      * parsed section inside a literal string
      */
    var subst: js.UndefOr[T] = js.native
    
    /**
      * symbolic constant, interned string, goto label
      */
    var symbol: js.UndefOr[T] = js.native
    
    /**
      * XML/HTML tag
      */
    var tag: js.UndefOr[T] = js.native
    
    /**
      * tag of a template language
      */
    var `template-tag`: js.UndefOr[T] = js.native
    
    /**
      * variable in a template language
      */
    var `template-variable`: js.UndefOr[T] = js.native
    
    /**
      * name of a class or a function at the place of declaration
      */
    var title: js.UndefOr[T] = js.native
    
    /**
      * user-defined type in a language with first-class syntactically significant types, like Haskell
      */
    var `type`: js.UndefOr[T] = js.native
    
    /**
      * variable in a config or a template file, environment var expansion in a script
      */
    var variable: js.UndefOr[T] = js.native
  }
  object Tokens {
    
    @scala.inline
    def apply[T](): Tokens[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tokens[T]]
    }
    
    @scala.inline
    implicit class TokensMutableBuilder[Self <: Tokens[_], T] (val x: Self with Tokens[T]) extends AnyVal {
      
      @scala.inline
      def setAddition(value: T): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionUndefined: Self = StObject.set(x, "addition", js.undefined)
      
      @scala.inline
      def setAttr(value: T): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      @scala.inline
      def setAttribute(value: T): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setBuilt_in(value: T): Self = StObject.set(x, "built_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilt_inUndefined: Self = StObject.set(x, "built_in", js.undefined)
      
      @scala.inline
      def `setBuiltin-name`(value: T): Self = StObject.set(x, "builtin-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBuiltin-nameUndefined`: Self = StObject.set(x, "builtin-name", js.undefined)
      
      @scala.inline
      def setBullet(value: T): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      @scala.inline
      def setClass(value: T): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setCode(value: T): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setComment(value: T): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDeletion(value: T): Self = StObject.set(x, "deletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionUndefined: Self = StObject.set(x, "deletion", js.undefined)
      
      @scala.inline
      def setDoctag(value: T): Self = StObject.set(x, "doctag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctagUndefined: Self = StObject.set(x, "doctag", js.undefined)
      
      @scala.inline
      def setEmphasis(value: T): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      @scala.inline
      def setFormula(value: T): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
      
      @scala.inline
      def setFunction(value: T): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setKeyword(value: T): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      @scala.inline
      def setLink(value: T): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setLiteral(value: T): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      @scala.inline
      def setMeta(value: T): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMeta-keyword`(value: T): Self = StObject.set(x, "meta-keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMeta-keywordUndefined`: Self = StObject.set(x, "meta-keyword", js.undefined)
      
      @scala.inline
      def `setMeta-string`(value: T): Self = StObject.set(x, "meta-string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMeta-stringUndefined`: Self = StObject.set(x, "meta-string", js.undefined)
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumber(value: T): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuote(value: T): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRegexp(value: T): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      @scala.inline
      def setSection(value: T): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      @scala.inline
      def `setSelector-attr`(value: T): Self = StObject.set(x, "selector-attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSelector-attrUndefined`: Self = StObject.set(x, "selector-attr", js.undefined)
      
      @scala.inline
      def `setSelector-class`(value: T): Self = StObject.set(x, "selector-class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSelector-classUndefined`: Self = StObject.set(x, "selector-class", js.undefined)
      
      @scala.inline
      def `setSelector-id`(value: T): Self = StObject.set(x, "selector-id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSelector-idUndefined`: Self = StObject.set(x, "selector-id", js.undefined)
      
      @scala.inline
      def `setSelector-pseudo`(value: T): Self = StObject.set(x, "selector-pseudo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSelector-pseudoUndefined`: Self = StObject.set(x, "selector-pseudo", js.undefined)
      
      @scala.inline
      def `setSelector-tag`(value: T): Self = StObject.set(x, "selector-tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSelector-tagUndefined`: Self = StObject.set(x, "selector-tag", js.undefined)
      
      @scala.inline
      def setString(value: T): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStrong(value: T): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setSubst(value: T): Self = StObject.set(x, "subst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstUndefined: Self = StObject.set(x, "subst", js.undefined)
      
      @scala.inline
      def setSymbol(value: T): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setTag(value: T): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def `setTemplate-tag`(value: T): Self = StObject.set(x, "template-tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTemplate-tagUndefined`: Self = StObject.set(x, "template-tag", js.undefined)
      
      @scala.inline
      def `setTemplate-variable`(value: T): Self = StObject.set(x, "template-variable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTemplate-variableUndefined`: Self = StObject.set(x, "template-variable", js.undefined)
      
      @scala.inline
      def setTitle(value: T): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVariable(value: T): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    }
  }
}
