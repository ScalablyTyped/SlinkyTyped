package typingsSlinky.fastDashCsv

import typingsSlinky.fastDashCsv.buildSrcParserCsvParserStreamMod.default
import typingsSlinky.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptionsArgs
import typingsSlinky.fastDashCsv.buildSrcParserTypesMod.RowTransformFunction
import typingsSlinky.fastDashCsv.buildSrcParserTypesMod.RowValidate
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser", JSImport.Namespace)
@js.native
object buildSrcParserMod extends js.Object {
  @js.native
  class CsvParserStream protected () extends default {
    def this(parserOptions: typingsSlinky.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typingsSlinky.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
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
}

