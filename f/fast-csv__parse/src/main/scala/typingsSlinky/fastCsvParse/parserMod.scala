package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsvParse.scannerMod.ScannerArgs
import typingsSlinky.fastCsvParse.tokenMod.TokenArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse/build/src/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class ColumnParser protected ()
    extends typingsSlinky.fastCsvParse.columnMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class NonQuotedColumnParser protected ()
    extends typingsSlinky.fastCsvParse.columnMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class Parser protected ()
    extends typingsSlinky.fastCsvParse.parserParserMod.Parser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class QuotedColumnParser protected ()
    extends typingsSlinky.fastCsvParse.columnMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typingsSlinky.fastCsvParse.rowParserMod.RowParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class Scanner protected ()
    extends typingsSlinky.fastCsvParse.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typingsSlinky.fastCsvParse.tokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  
  /* static members */
  @js.native
  object Parser extends js.Object {
    var removeBOM: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Token extends js.Object {
    def isTokenCarriageReturn(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenComment(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenDelimiter(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenEscapeCharacter(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenQuote(token: typingsSlinky.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenRowDelimiter(token: typingsSlinky.fastCsvParse.tokenMod.Token): Boolean = js.native
  }
  
}

