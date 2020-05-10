package typingsSlinky.fastCsv.parserParserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  var parseRow: js.Any = js.native
  var parseWithComments: js.Any = js.native
  var parseWithoutComments: js.Any = js.native
  val parserOptions: js.Any = js.native
  val rowParser: js.Any = js.native
  def parse(line: String, hasMoreData: Boolean): ParseResult = js.native
}

object Parser {
  @scala.inline
  def apply(
    parse: (String, Boolean) => ParseResult,
    parseRow: js.Any,
    parseWithComments: js.Any,
    parseWithoutComments: js.Any,
    parserOptions: js.Any,
    rowParser: js.Any
  ): Parser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), parseRow = parseRow.asInstanceOf[js.Any], parseWithComments = parseWithComments.asInstanceOf[js.Any], parseWithoutComments = parseWithoutComments.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], rowParser = rowParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: (String, Boolean) => ParseResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParseRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseWithComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseWithComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseWithoutComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseWithoutComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowParser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowParser")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

