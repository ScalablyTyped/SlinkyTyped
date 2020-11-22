package typingsSlinky.fastCsv

import typingsSlinky.fastCsvFormat.formatterOptionsMod.FormatterOptionsArgs
import typingsSlinky.fastCsvFormat.typesMod.Row
import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-csv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def format[I /* <: Row */, O /* <: Row */](): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  def format[I /* <: Row */, O /* <: Row */](options: FormatterOptionsArgs[I, O]): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  def parse[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parse[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](args: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def parseFile[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](location: String): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseFile[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](location: String, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def parseStream[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](stream: ReadableStream): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseStream[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](stream: ReadableStream, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def parseString[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](string: String): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  def parseString[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */](string: String, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  def write[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): typingsSlinky.fastCsvFormat.csvFormatterStreamMod.CsvFormatterStream[I, O] = js.native
  
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[Buffer] = js.native
  def writeToBuffer[I /* <: Row */, O /* <: Row */](rows: js.Array[I], opts: FormatterOptionsArgs[I, O]): js.Promise[Buffer] = js.native
  
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I]): WriteStream = js.native
  def writeToPath[I /* <: Row */, O /* <: Row */](path: String, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): WriteStream = js.native
  
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I]): T = js.native
  def writeToStream[T /* <: WritableStream */, I /* <: Row */, O /* <: Row */](ws: T, rows: js.Array[I], options: FormatterOptionsArgs[I, O]): T = js.native
  
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I]): js.Promise[String] = js.native
  def writeToString[I /* <: Row */, O /* <: Row */](rows: js.Array[I], options: FormatterOptionsArgs[I, O]): js.Promise[String] = js.native
  
  @js.native
  class CsvFormatterStream[I /* <: Row */, O /* <: Row */] protected ()
    extends typingsSlinky.fastCsvFormat.mod.CsvFormatterStream[I, O] {
    def this(formatterOptions: typingsSlinky.fastCsvFormat.formatterOptionsMod.FormatterOptions[I, O]) = this()
  }
  
  @js.native
  class CsvParserStream[I /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */, O /* <: typingsSlinky.fastCsvParse.typesMod.Row[_] */] protected ()
    extends typingsSlinky.fastCsvParse.mod.CsvParserStream[I, O] {
    def this(parserOptions: typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions) = this()
  }
  /* static members */
  @js.native
  object CsvParserStream extends js.Object {
    
    var wrapDoneCallback: js.Any = js.native
  }
  
  @js.native
  class FormatterOptions[I /* <: Row */, O /* <: Row */] ()
    extends typingsSlinky.fastCsvFormat.mod.FormatterOptions[I, O] {
    def this(opts: FormatterOptionsArgs[I, O]) = this()
  }
  
  @js.native
  class ParserOptions ()
    extends typingsSlinky.fastCsvParse.mod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
}
