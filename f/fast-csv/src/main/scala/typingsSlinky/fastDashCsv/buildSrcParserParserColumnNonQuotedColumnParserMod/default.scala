package typingsSlinky.fastDashCsv.buildSrcParserParserColumnNonQuotedColumnParserMod

import typingsSlinky.fastDashCsv.buildSrcParserParserOptionsMod.ParserOptions
import typingsSlinky.fastDashCsv.buildSrcParserParserScannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/parser/column/NonQuotedColumnParser", JSImport.Default)
@js.native
class default protected () extends NonQuotedColumnParser {
  def this(parserOptions: ParserOptions) = this()
  /* CompleteClass */
  override val columnFormatter: js.Any = js.native
  /* CompleteClass */
  override val parserOptions: js.Any = js.native
  /* CompleteClass */
  override def parse(scanner: Scanner): String | Null = js.native
}

