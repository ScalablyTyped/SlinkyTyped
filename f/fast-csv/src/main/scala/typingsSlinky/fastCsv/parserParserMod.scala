package typingsSlinky.fastCsv

import typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsv.parserParserParserMod.default
import typingsSlinky.fastCsv.scannerMod.ScannerArgs
import typingsSlinky.fastCsv.tokenMod.TokenArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser", JSImport.Namespace)
@js.native
object parserParserMod extends js.Object {
  @js.native
  class Parser protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typingsSlinky.fastCsv.rowParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class Scanner protected ()
    extends typingsSlinky.fastCsv.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typingsSlinky.fastCsv.tokenMod.Token {
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
    def isTokenCarriageReturn(token: typingsSlinky.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenComment(token: typingsSlinky.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenDelimiter(token: typingsSlinky.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenEscapeCharacter(token: typingsSlinky.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenQuote(token: typingsSlinky.fastCsv.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    def isTokenRowDelimiter(token: typingsSlinky.fastCsv.tokenMod.Token): Boolean = js.native
  }
  
}

