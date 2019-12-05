package typingsSlinky.fastDashCsv.buildSrcParserParserColumnColumnParserMod

import typingsSlinky.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import typingsSlinky.fastDashCsv.buildSrcParserParserScannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/column/ColumnParser", JSImport.Default)
@js.native
class default protected () extends ColumnParser {
  def this(parserOptions: ParserOptions) = this()
  /* CompleteClass */
  override val nonQuotedColumnParser: typingsSlinky.fastDashCsv.buildSrcParserParserColumnNonQuotedColumnParserMod.default = js.native
  /* CompleteClass */
  override val parserOptions: js.Any = js.native
  /* CompleteClass */
  override val quotedColumnParser: typingsSlinky.fastDashCsv.buildSrcParserParserColumnQuotedColumnParserMod.default = js.native
  /* CompleteClass */
  override def parse(scanner: Scanner): String | Null = js.native
}

