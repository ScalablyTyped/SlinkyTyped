package typingsSlinky.jasmineAjax

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxParamParser extends js.Object {
  def parse(paramString: String): js.Any = js.native
  def test(xhr: XMLHttpRequest): Boolean = js.native
}

object JasmineAjaxParamParser {
  @scala.inline
  def apply(parse: String => js.Any, test: XMLHttpRequest => Boolean): JasmineAjaxParamParser = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[JasmineAjaxParamParser]
  }
  @scala.inline
  implicit class JasmineAjaxParamParserOps[Self <: JasmineAjaxParamParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTest(value: XMLHttpRequest => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

