package typingsSlinky.fastDashCsv.buildSrcParserParserColumnColumnParserMod

import typingsSlinky.fastDashCsv.buildSrcParserParserScannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnParser extends js.Object {
  val nonQuotedColumnParser: typingsSlinky.fastDashCsv.buildSrcParserParserColumnNonQuotedColumnParserMod.default
  val parserOptions: js.Any
  val quotedColumnParser: typingsSlinky.fastDashCsv.buildSrcParserParserColumnQuotedColumnParserMod.default
  def parse(scanner: Scanner): String | Null
}

object ColumnParser {
  @scala.inline
  def apply(
    nonQuotedColumnParser: typingsSlinky.fastDashCsv.buildSrcParserParserColumnNonQuotedColumnParserMod.default,
    parse: Scanner => String | Null,
    parserOptions: js.Any,
    quotedColumnParser: typingsSlinky.fastDashCsv.buildSrcParserParserColumnQuotedColumnParserMod.default
  ): ColumnParser = {
    val __obj = js.Dynamic.literal(nonQuotedColumnParser = nonQuotedColumnParser.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any], quotedColumnParser = quotedColumnParser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnParser]
  }
}

