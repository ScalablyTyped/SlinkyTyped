package typingsSlinky.fastCsv

import typingsSlinky.fastCsv.csvParserStreamMod.default
import typingsSlinky.fastCsv.parserOptionsMod.ParserOptionsArgs
import typingsSlinky.fastCsv.parserTypesMod.RowTransformFunction
import typingsSlinky.fastCsv.parserTypesMod.RowValidate
import typingsSlinky.fastCsv.scannerMod.ScannerArgs
import typingsSlinky.fastCsv.tokenMod.TokenArgs
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class CsvParserStream protected () extends default {
    def this(parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class HeaderTransformer protected ()
    extends typingsSlinky.fastCsv.transformsMod.HeaderTransformer {
    def this(parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class Parser protected ()
    extends typingsSlinky.fastCsv.parserParserMod.Parser {
    def this(parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typingsSlinky.fastCsv.parserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  @js.native
  class RowParser protected ()
    extends typingsSlinky.fastCsv.parserParserMod.RowParser {
    def this(parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class RowTransformerValidator ()
    extends typingsSlinky.fastCsv.transformsMod.RowTransformerValidator
  
  @js.native
  class Scanner protected ()
    extends typingsSlinky.fastCsv.parserParserMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @js.native
  class Token protected ()
    extends typingsSlinky.fastCsv.parserParserMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  
  def isSyncTransform(transform: RowTransformFunction): /* is fast-csv.fast-csv/build/src/parser/types.SyncRowTransform */ Boolean = js.native
  def isSyncValidate(validate: RowValidate): /* is fast-csv.fast-csv/build/src/parser/types.SyncRowValidate */ Boolean = js.native
  def parse(): default = js.native
  def parse(args: ParserOptionsArgs): default = js.native
  def parseFile(location: String): default = js.native
  def parseFile(location: String, options: ParserOptionsArgs): default = js.native
  def parseStream(stream: ReadableStream): default = js.native
  def parseStream(stream: ReadableStream, options: ParserOptionsArgs): default = js.native
  def parseString(string: String): default = js.native
  def parseString(string: String, options: ParserOptionsArgs): default = js.native
  /* static members */
  @js.native
  object Parser extends js.Object {
    var removeBOM: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object RowTransformerValidator extends js.Object {
    var createTransform: js.Any = js.native
    var createValidator: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Token extends js.Object {
    def isTokenCarriageReturn(
      token: typingsSlinky.fastCsv.tokenMod.Token,
      parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenComment(
      token: typingsSlinky.fastCsv.tokenMod.Token,
      parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenDelimiter(
      token: typingsSlinky.fastCsv.tokenMod.Token,
      parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenEscapeCharacter(
      token: typingsSlinky.fastCsv.tokenMod.Token,
      parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenQuote(
      token: typingsSlinky.fastCsv.tokenMod.Token,
      parserOptions: typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
    ): Boolean = js.native
    def isTokenRowDelimiter(token: typingsSlinky.fastCsv.tokenMod.Token): Boolean = js.native
  }
  
}

