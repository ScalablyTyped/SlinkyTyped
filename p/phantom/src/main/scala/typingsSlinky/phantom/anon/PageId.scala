package typingsSlinky.phantom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageId extends js.Object {
  var pageId: String = js.native
}

object PageId {
  @scala.inline
  def apply(pageId: String): PageId = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageId]
  }
  @scala.inline
  implicit class PageIdOps[Self <: PageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

