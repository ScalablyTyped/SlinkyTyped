package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagePaginatorState extends PaginatorState {
  var page: Double = js.native
  var page_size: js.UndefOr[Double] = js.native
}

object PagePaginatorState {
  @scala.inline
  def apply(done: Boolean, loaded: Double, page: Double): PagePaginatorState = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePaginatorState]
  }
  @scala.inline
  implicit class PagePaginatorStateOps[Self <: PagePaginatorState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(js.undefined)
        ret
    }
  }
  
}

