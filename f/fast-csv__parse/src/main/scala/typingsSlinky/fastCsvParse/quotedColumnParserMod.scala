package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import typingsSlinky.fastCsvParse.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fast-csv/parse/build/src/parser/column/QuotedColumnParser", JSImport.Namespace)
@js.native
object quotedColumnParserMod extends js.Object {
  
  @js.native
  class QuotedColumnParser protected () extends js.Object {
    def this(parserOptions: ParserOptions) = this()
    
    var checkForMalformedColumn: js.Any = js.native
    
    val columnFormatter: js.Any = js.native
    
    var gatherDataBetweenQuotes: js.Any = js.native
    
    def parse(scanner: Scanner): String | Null = js.native
    
    val parserOptions: js.Any = js.native
  }
}
