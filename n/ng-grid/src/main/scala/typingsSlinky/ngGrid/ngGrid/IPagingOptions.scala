package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[Double] = js.native
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[Double] = js.native
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[js.Array[Double]] = js.native
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[Double] = js.native
}

object IPagingOptions {
  @scala.inline
  def apply(): IPagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagingOptions]
  }
  @scala.inline
  implicit class IPagingOptionsOps[Self <: IPagingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalServerItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalServerItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalServerItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalServerItems")(js.undefined)
        ret
    }
  }
  
}

