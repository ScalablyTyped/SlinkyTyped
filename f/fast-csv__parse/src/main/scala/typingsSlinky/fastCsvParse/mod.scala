package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typingsSlinky.fastCsvParse.typesMod.Row
import typingsSlinky.fastCsvParse.typesMod.RowTransformFunction
import typingsSlinky.fastCsvParse.typesMod.RowValidate
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CsvParserStream[I /* <: Row[_] */, O /* <: Row[_] */] protected ()
    extends typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] {
    def this(parserOptions: typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  def isSyncTransform[I /* <: Row[_] */, O /* <: Row[_] */](transform: RowTransformFunction[I, O]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean = js.native
  def isSyncValidate[R /* <: Row[_] */](validate: RowValidate[R]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean = js.native
  def parse[I /* <: Row[_] */, O /* <: Row[_] */](): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parse[I /* <: Row[_] */, O /* <: Row[_] */](args: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseFile[I /* <: Row[_] */, O /* <: Row[_] */](location: String): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseFile[I /* <: Row[_] */, O /* <: Row[_] */](location: String, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseStream[I /* <: Row[_] */, O /* <: Row[_] */](stream: ReadableStream): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseStream[I /* <: Row[_] */, O /* <: Row[_] */](stream: ReadableStream, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseString[I /* <: Row[_] */, O /* <: Row[_] */](string: String): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseString[I /* <: Row[_] */, O /* <: Row[_] */](string: String, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
}

