package typingsSlinky.knockoutKogrid.kg

import typingsSlinky.knockout.KnockoutObservable
import typingsSlinky.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[KnockoutObservable[Double]] = js.native
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[KnockoutObservable[Double]] = js.native
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[KnockoutObservableArray[Double]] = js.native
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[KnockoutObservable[Double]] = js.native
}

object PagingOptions {
  @scala.inline
  def apply(): PagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagingOptions]
  }
  @scala.inline
  implicit class PagingOptionsOps[Self <: PagingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPage(value: KnockoutObservable[Double]): Self = {
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
    def withPageSize(value: KnockoutObservable[Double]): Self = {
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
    def withPageSizes(value: KnockoutObservableArray[Double]): Self = {
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
    def withTotalServerItems(value: KnockoutObservable[Double]): Self = {
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

