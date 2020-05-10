package typingsSlinky.fastCsv.rowParserMod

import typingsSlinky.fastCsv.parserTypesMod.RowArray
import typingsSlinky.fastCsv.scannerMod.Scanner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowParser extends js.Object {
  val columnParser: js.Any = js.native
  var getStartToken: js.Any = js.native
  val parserOptions: js.Any = js.native
  var shouldSkipColumnParse: js.Any = js.native
  def parse(scanner: Scanner): RowArray | Null = js.native
}

object RowParser {
  @scala.inline
  def apply(
    columnParser: js.Any,
    getStartToken: js.Any,
    parse: Scanner => RowArray | Null,
    parserOptions: js.Any,
    shouldSkipColumnParse: js.Any
  ): RowParser = {
    val __obj = js.Dynamic.literal(columnParser = columnParser.asInstanceOf[js.Any], getStartToken = getStartToken.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parserOptions = parserOptions.asInstanceOf[js.Any], shouldSkipColumnParse = shouldSkipColumnParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowParser]
  }
  @scala.inline
  implicit class RowParserOps[Self <: RowParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnParser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetStartToken(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStartToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: Scanner => RowArray | Null): Self = {
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
    def withShouldSkipColumnParse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSkipColumnParse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

