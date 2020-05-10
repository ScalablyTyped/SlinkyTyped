package typingsSlinky.backbonePaginator.mod

import typingsSlinky.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageableParseLinksOptions extends js.Object {
  var xhr: js.UndefOr[JQueryXHR] = js.native
}

object PageableParseLinksOptions {
  @scala.inline
  def apply(): PageableParseLinksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableParseLinksOptions]
  }
  @scala.inline
  implicit class PageableParseLinksOptionsOps[Self <: PageableParseLinksOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXhr(value: JQueryXHR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.undefined)
        ret
    }
  }
  
}

