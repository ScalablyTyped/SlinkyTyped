package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSizeChangingEventUIParam extends js.Object {
  /**
  	 * Gets the current page size.
  	 */
  var currentPageSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets the new page size.
  	 */
  var newPageSize: js.UndefOr[Double] = js.native
  /**
  	 * Gets reference to GridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object PageSizeChangingEventUIParam {
  @scala.inline
  def apply(): PageSizeChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSizeChangingEventUIParam]
  }
  @scala.inline
  implicit class PageSizeChangingEventUIParamOps[Self <: PageSizeChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

