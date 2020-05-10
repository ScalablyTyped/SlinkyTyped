package typingsSlinky.fastCsv.nonQuotedColumnParserMod

import typingsSlinky.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonQuotedColumnParser extends js.Object {
  val columnFormatter: js.Any = js.native
  val parserOptions: js.Any = js.native
  def parse(scanner: Scanner): String | Null = js.native
}

object NonQuotedColumnParser {
  @scala.inline
  def apply(columnFormatter: js.Any, parse: Scanner => String | Null, parserOptions: js.Any): NonQuotedColumnParser = {
    val __obj = js.Dynamic.literal(columnFormatter = columnFormatter.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonQuotedColumnParser]
  }
  @scala.inline
  implicit class NonQuotedColumnParserOps[Self <: NonQuotedColumnParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFormatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFormatter")(value.asInstanceOf[js.Any])
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
  }
  
}

