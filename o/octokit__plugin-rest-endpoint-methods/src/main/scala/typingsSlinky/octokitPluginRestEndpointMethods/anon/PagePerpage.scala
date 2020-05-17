package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagePerpage extends js.Object {
  var page: Type = js.native
  var per_page: Type = js.native
}

object PagePerpage {
  @scala.inline
  def apply(page: Type, per_page: Type): PagePerpage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePerpage]
  }
  @scala.inline
  implicit class PagePerpageOps[Self <: PagePerpage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

