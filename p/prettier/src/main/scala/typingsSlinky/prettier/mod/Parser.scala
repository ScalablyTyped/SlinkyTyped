package typingsSlinky.prettier.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  var astFormat: String = js.native
  var hasPragma: js.UndefOr[js.Function1[/* text */ String, Boolean]] = js.native
  var preprocess: js.UndefOr[js.Function2[/* text */ String, /* options */ ParserOptions, String]] = js.native
  def locEnd(node: js.Any): Double = js.native
  def locStart(node: js.Any): Double = js.native
  def parse(text: String, parsers: StringDictionary[Parser], options: ParserOptions): AST = js.native
}

object Parser {
  @scala.inline
  def apply(
    astFormat: String,
    locEnd: js.Any => Double,
    locStart: js.Any => Double,
    parse: (String, StringDictionary[Parser], ParserOptions) => AST
  ): Parser = {
    val __obj = js.Dynamic.literal(astFormat = astFormat.asInstanceOf[js.Any], locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), parse = js.Any.fromFunction3(parse))
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAstFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocEnd(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocStart(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: (String, StringDictionary[Parser], ParserOptions) => AST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHasPragma(value: /* text */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPragma")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasPragma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPragma")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(value: (/* text */ String, /* options */ ParserOptions) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
  }
  
}

