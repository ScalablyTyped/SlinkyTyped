package typingsSlinky.chaiHtml.mod.global.Chai

import typingsSlinky.chaiHtml.mod.ChaiHtml.HtmlAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  var html: HtmlAssertion = js.native
}

object Assertion {
  @scala.inline
  def apply(html: HtmlAssertion): Assertion = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertion]
  }
  @scala.inline
  implicit class AssertionOps[Self <: Assertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: HtmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

