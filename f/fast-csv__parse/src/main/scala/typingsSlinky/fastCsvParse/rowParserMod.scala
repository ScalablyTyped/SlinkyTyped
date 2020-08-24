package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsvParse.scannerMod.Scanner
import typingsSlinky.fastCsvParse.typesMod.RowArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse/build/src/parser/RowParser", JSImport.Namespace)
@js.native
object rowParserMod extends js.Object {
  @js.native
  class RowParser protected () extends js.Object {
    def this(parserOptions: ParserOptions) = this()
    val columnParser: js.Any = js.native
    var getStartToken: js.Any = js.native
    val parserOptions: js.Any = js.native
    var shouldSkipColumnParse: js.Any = js.native
    def parse(scanner: Scanner): RowArray[_] | Null = js.native
  }
  
}

