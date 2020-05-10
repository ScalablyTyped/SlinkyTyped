package typingsSlinky.chartmogulNode.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursor extends js.Object {
  var current_page: js.UndefOr[Double] = js.native
  var has_more: js.UndefOr[Boolean] = js.native
  var page: js.UndefOr[Double] = js.native
  var per_page: js.UndefOr[Double] = js.native
  var total_pages: js.UndefOr[Double] = js.native
}

object Cursor {
  @scala.inline
  def apply(): Cursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cursor]
  }
  @scala.inline
  implicit class CursorOps[Self <: Cursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_page")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_more(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_more: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPer_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPer_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_pages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_pages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_pages")(js.undefined)
        ret
    }
  }
  
}

