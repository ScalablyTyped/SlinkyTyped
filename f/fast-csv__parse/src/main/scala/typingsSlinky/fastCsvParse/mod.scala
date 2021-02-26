package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptionsArgs
import typingsSlinky.fastCsvParse.typesMod.Row
import typingsSlinky.fastCsvParse.typesMod.RowTransformFunction
import typingsSlinky.fastCsvParse.typesMod.RowValidate
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fast-csv/parse", "CsvParserStream")
  @js.native
  class CsvParserStream[I /* <: Row[_] */, O /* <: Row[_] */] protected ()
    extends typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] {
    def this(parserOptions: typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions) = this()
  }
  /* static members */
  object CsvParserStream {
    
    @JSImport("@fast-csv/parse", "CsvParserStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse", "CsvParserStream.wrapDoneCallback")
    @js.native
    def wrapDoneCallback: js.Any = js.native
    @scala.inline
    def wrapDoneCallback_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapDoneCallback")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fast-csv/parse", "ParserOptions")
  @js.native
  class ParserOptions ()
    extends typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions {
    def this(opts: ParserOptionsArgs) = this()
  }
  
  @JSImport("@fast-csv/parse", "isSyncTransform")
  @js.native
  def isSyncTransform[I /* <: Row[_] */, O /* <: Row[_] */](transform: RowTransformFunction[I, O]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowTransform<I, O> */ Boolean = js.native
  
  @JSImport("@fast-csv/parse", "isSyncValidate")
  @js.native
  def isSyncValidate[R /* <: Row[_] */](validate: RowValidate[R]): /* is @fast-csv/parse.@fast-csv/parse/build/src/types.SyncRowValidate<R> */ Boolean = js.native
  
  @JSImport("@fast-csv/parse", "parse")
  @js.native
  def parse[I /* <: Row[_] */, O /* <: Row[_] */](): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("@fast-csv/parse", "parse")
  @js.native
  def parse[I /* <: Row[_] */, O /* <: Row[_] */](args: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  @JSImport("@fast-csv/parse", "parseFile")
  @js.native
  def parseFile[I /* <: Row[_] */, O /* <: Row[_] */](location: String): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("@fast-csv/parse", "parseFile")
  @js.native
  def parseFile[I /* <: Row[_] */, O /* <: Row[_] */](location: String, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  @JSImport("@fast-csv/parse", "parseStream")
  @js.native
  def parseStream[I /* <: Row[_] */, O /* <: Row[_] */](stream: ReadableStream): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("@fast-csv/parse", "parseStream")
  @js.native
  def parseStream[I /* <: Row[_] */, O /* <: Row[_] */](stream: ReadableStream, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  
  @JSImport("@fast-csv/parse", "parseString")
  @js.native
  def parseString[I /* <: Row[_] */, O /* <: Row[_] */](string: String): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
  @JSImport("@fast-csv/parse", "parseString")
  @js.native
  def parseString[I /* <: Row[_] */, O /* <: Row[_] */](string: String, options: ParserOptionsArgs): typingsSlinky.fastCsvParse.csvParserStreamMod.CsvParserStream[I, O] = js.native
}
