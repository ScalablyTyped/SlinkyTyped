package typingsSlinky.createHtmlElement.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlOptions extends js.Object {
  /**
  		HTML tag value in unescaped HTML.
  		*/
  var html: js.UndefOr[String] = js.native
}

object HtmlOptions {
  @scala.inline
  def apply(): HtmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlOptions]
  }
  @scala.inline
  implicit class HtmlOptionsOps[Self <: HtmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
  }
  
}

