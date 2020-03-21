package typingsSlinky.fastCsv

import typingsSlinky.fastCsv.columnFormatterMod.default
import typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/column", JSImport.Namespace)
@js.native
object columnMod extends js.Object {
  @js.native
  class ColumnFormatter protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class ColumnParser protected ()
    extends typingsSlinky.fastCsv.columnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class NonQuotedColumnParser protected ()
    extends typingsSlinky.fastCsv.nonQuotedColumnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class QuotedColumnParser protected ()
    extends typingsSlinky.fastCsv.quotedColumnParserMod.default {
    def this(parserOptions: ParserOptions) = this()
  }
  
}

