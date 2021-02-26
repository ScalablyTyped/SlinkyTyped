package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsvParse.scannerMod.ScannerArgs
import typingsSlinky.fastCsvParse.tokenMod.TokenArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser", "ColumnParser")
  @js.native
  class ColumnParser protected ()
    extends typingsSlinky.fastCsvParse.columnMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "NonQuotedColumnParser")
  @js.native
  class NonQuotedColumnParser protected ()
    extends typingsSlinky.fastCsvParse.columnMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Parser")
  @js.native
  class Parser protected ()
    extends typingsSlinky.fastCsvParse.parserParserMod.Parser {
    def this(parserOptions: ParserOptions) = this()
  }
  /* static members */
  object Parser {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser.removeBOM")
    @js.native
    def removeBOM: js.Any = js.native
    @scala.inline
    def removeBOM_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "QuotedColumnParser")
  @js.native
  class QuotedColumnParser protected ()
    extends typingsSlinky.fastCsvParse.columnMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "RowParser")
  @js.native
  class RowParser protected ()
    extends typingsSlinky.fastCsvParse.rowParserMod.RowParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Scanner")
  @js.native
  class Scanner protected ()
    extends typingsSlinky.fastCsvParse.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Token")
  @js.native
  class Token protected ()
    extends typingsSlinky.fastCsvParse.tokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  /* static members */
  object Token {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenCarriageReturn")
    @js.native
    def isTokenCarriageReturn(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenComment")
    @js.native
    def isTokenComment(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenDelimiter")
    @js.native
    def isTokenDelimiter(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenEscapeCharacter")
    @js.native
    def isTokenEscapeCharacter(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenQuote")
    @js.native
    def isTokenQuote(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenRowDelimiter")
    @js.native
    def isTokenRowDelimiter(token: typingsSlinky.fastCsvParse.tokenMod.Token): Boolean = js.native
  }
}
