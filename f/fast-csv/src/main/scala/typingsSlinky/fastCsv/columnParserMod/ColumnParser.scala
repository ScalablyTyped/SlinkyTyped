package typingsSlinky.fastCsv.columnParserMod

import typingsSlinky.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnParser extends js.Object {
  val nonQuotedColumnParser: typingsSlinky.fastCsv.nonQuotedColumnParserMod.default = js.native
  val parserOptions: js.Any = js.native
  val quotedColumnParser: typingsSlinky.fastCsv.quotedColumnParserMod.default = js.native
  def parse(scanner: Scanner): String | Null = js.native
}

object ColumnParser {
  @scala.inline
  def apply(
    nonQuotedColumnParser: typingsSlinky.fastCsv.nonQuotedColumnParserMod.default,
    parse: Scanner => String | Null,
    parserOptions: js.Any,
    quotedColumnParser: typingsSlinky.fastCsv.quotedColumnParserMod.default
  ): ColumnParser = {
    val __obj = js.Dynamic.literal(nonQuotedColumnParser = nonQuotedColumnParser.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any], quotedColumnParser = quotedColumnParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnParser]
  }
  @scala.inline
  implicit class ColumnParserOps[Self <: ColumnParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonQuotedColumnParser(value: typingsSlinky.fastCsv.nonQuotedColumnParserMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonQuotedColumnParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: Scanner => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParserOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotedColumnParser(value: typingsSlinky.fastCsv.quotedColumnParserMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotedColumnParser")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

