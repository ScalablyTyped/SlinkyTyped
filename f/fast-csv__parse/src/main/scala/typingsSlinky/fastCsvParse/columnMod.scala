package typingsSlinky.fastCsvParse

import typingsSlinky.fastCsvParse.parserOptionsMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "ColumnFormatter")
  @js.native
  class ColumnFormatter protected ()
    extends typingsSlinky.fastCsvParse.columnFormatterMod.ColumnFormatter {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "ColumnParser")
  @js.native
  class ColumnParser protected ()
    extends typingsSlinky.fastCsvParse.columnParserMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "NonQuotedColumnParser")
  @js.native
  class NonQuotedColumnParser protected ()
    extends typingsSlinky.fastCsvParse.nonQuotedColumnParserMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser/column", "QuotedColumnParser")
  @js.native
  class QuotedColumnParser protected ()
    extends typingsSlinky.fastCsvParse.quotedColumnParserMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
}
