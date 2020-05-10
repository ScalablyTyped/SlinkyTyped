package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageIndexChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to GridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the current page index.
  	 */
  var pageIndex: js.UndefOr[Double] = js.native
}

object PageIndexChangedEventUIParam {
  @scala.inline
  def apply(): PageIndexChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageIndexChangedEventUIParam]
  }
  @scala.inline
  implicit class PageIndexChangedEventUIParamOps[Self <: PageIndexChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(js.undefined)
        ret
    }
  }
  
}

