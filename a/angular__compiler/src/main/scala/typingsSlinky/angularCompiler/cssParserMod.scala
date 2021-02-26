package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.cssAstMod.CssStyleSheetAst
import typingsSlinky.angularCompiler.cssLexerMod.CssTokenType
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceFile
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssParserMod {
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "BlockType")
  @js.native
  object BlockType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularCompiler.cssAstMod.BlockType with Double] = js.native
    
    /* 1 */ val Charset: typingsSlinky.angularCompiler.cssAstMod.BlockType.Charset with Double = js.native
    
    /* 9 */ val Document: typingsSlinky.angularCompiler.cssAstMod.BlockType.Document with Double = js.native
    
    /* 7 */ val FontFace: typingsSlinky.angularCompiler.cssAstMod.BlockType.FontFace with Double = js.native
    
    /* 0 */ val Import: typingsSlinky.angularCompiler.cssAstMod.BlockType.Import with Double = js.native
    
    /* 4 */ val Keyframes: typingsSlinky.angularCompiler.cssAstMod.BlockType.Keyframes with Double = js.native
    
    /* 5 */ val MediaQuery: typingsSlinky.angularCompiler.cssAstMod.BlockType.MediaQuery with Double = js.native
    
    /* 2 */ val Namespace: typingsSlinky.angularCompiler.cssAstMod.BlockType.Namespace with Double = js.native
    
    /* 8 */ val Page: typingsSlinky.angularCompiler.cssAstMod.BlockType.Page with Double = js.native
    
    /* 6 */ val Selector: typingsSlinky.angularCompiler.cssAstMod.BlockType.Selector with Double = js.native
    
    /* 3 */ val Supports: typingsSlinky.angularCompiler.cssAstMod.BlockType.Supports with Double = js.native
    
    /* 11 */ val Unsupported: typingsSlinky.angularCompiler.cssAstMod.BlockType.Unsupported with Double = js.native
    
    /* 10 */ val Viewport: typingsSlinky.angularCompiler.cssAstMod.BlockType.Viewport with Double = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "CssParseError")
  @js.native
  class CssParseError protected () extends ParseError {
    def this(span: ParseSourceSpan, message: String) = this()
  }
  /* static members */
  object CssParseError {
    
    @JSImport("@angular/compiler/src/css_parser/css_parser", "CssParseError.create")
    @js.native
    def create(file: ParseSourceFile, offset: Double, line: Double, col: Double, length: Double, errMsg: String): CssParseError = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "CssParser")
  @js.native
  class CssParser () extends StObject {
    
    var _errors: js.Any = js.native
    
    var _file: js.Any = js.native
    
    var _lastToken: js.Any = js.native
    
    var _scanner: js.Any = js.native
    
    /**
      * @param css the CSS code that will be parsed
      * @param url the name of the CSS file containing the CSS source code
      */
    def parse(css: String, url: String): ParsedCssResult = js.native
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "CssToken")
  @js.native
  class CssToken protected ()
    extends typingsSlinky.angularCompiler.cssLexerMod.CssToken {
    def this(index: Double, column: Double, line: Double, `type`: CssTokenType, strValue: String) = this()
  }
  
  @JSImport("@angular/compiler/src/css_parser/css_parser", "ParsedCssResult")
  @js.native
  class ParsedCssResult protected () extends StObject {
    def this(errors: js.Array[CssParseError], ast: CssStyleSheetAst) = this()
    
    var ast: CssStyleSheetAst = js.native
    
    var errors: js.Array[CssParseError] = js.native
  }
}
