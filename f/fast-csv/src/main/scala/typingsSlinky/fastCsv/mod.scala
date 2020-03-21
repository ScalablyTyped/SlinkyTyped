package typingsSlinky.fastCsv

import typingsSlinky.fastCsv.csvFormatterStreamMod.default
import typingsSlinky.fastCsv.formatterOptionsMod.FormatterOptionsArgs
import typingsSlinky.fastCsv.parserMod.CsvParserStream
import typingsSlinky.fastCsv.parserOptionsMod.ParserOptionsArgs
import typingsSlinky.fastCsv.typesMod.Row
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def format(): default = js.native
  def format(options: FormatterOptionsArgs): default = js.native
  def fromPath(location: String): CsvParserStream = js.native
  def fromPath(location: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def fromStream(stream: ReadableStream): CsvParserStream = js.native
  def fromStream(stream: ReadableStream, options: ParserOptionsArgs): CsvParserStream = js.native
  def fromString(string: String): CsvParserStream = js.native
  def fromString(string: String, options: ParserOptionsArgs): CsvParserStream = js.native
  def parse(): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def parse(args: ParserOptionsArgs): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def parseFile(location: String): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def parseFile(location: String, options: ParserOptionsArgs): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def parseStream(stream: ReadableStream): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def parseStream(stream: ReadableStream, options: ParserOptionsArgs): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def parseString(string: String): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def parseString(string: String, options: ParserOptionsArgs): typingsSlinky.fastCsv.csvParserStreamMod.default = js.native
  def write(rows: js.Array[Row]): default = js.native
  def write(rows: js.Array[Row], options: FormatterOptionsArgs): default = js.native
  def writeToBuffer(rows: js.Array[Row]): js.Promise[Buffer] = js.native
  def writeToBuffer(rows: js.Array[Row], opts: FormatterOptionsArgs): js.Promise[Buffer] = js.native
  def writeToPath(path: String, rows: js.Array[Row]): WriteStream = js.native
  def writeToPath(path: String, rows: js.Array[Row], options: FormatterOptionsArgs): WriteStream = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row]): T = js.native
  def writeToStream[T /* <: WritableStream */](ws: T, rows: js.Array[Row], options: FormatterOptionsArgs): T = js.native
  def writeToString(rows: js.Array[Row]): js.Promise[String] = js.native
  def writeToString(rows: js.Array[Row], options: FormatterOptionsArgs): js.Promise[String] = js.native
}

