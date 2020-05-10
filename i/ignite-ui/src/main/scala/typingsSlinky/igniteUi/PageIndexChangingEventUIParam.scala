package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageIndexChangingEventUIParam extends js.Object {
  /**
  	 * Gets current page index.
  	 */
  var currentPageIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets new page index.
  	 */
  var newPageIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets reference to GridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object PageIndexChangingEventUIParam {
  @scala.inline
  def apply(): PageIndexChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIndexChangingEventUIParam]
  }
  @scala.inline
  implicit class PageIndexChangingEventUIParamOps[Self <: PageIndexChangingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPageIndex")(js.undefined)
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

