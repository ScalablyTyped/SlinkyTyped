package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageResource extends js.Object {
  var lang: js.UndefOr[IPageLangItems] = js.native
  var selectedLang: js.UndefOr[String] = js.native
}

object IPageResource {
  @scala.inline
  def apply(): IPageResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageResource]
  }
  @scala.inline
  implicit class IPageResourceOps[Self <: IPageResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: IPageLangItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLang")(js.undefined)
        ret
    }
  }
  
}

