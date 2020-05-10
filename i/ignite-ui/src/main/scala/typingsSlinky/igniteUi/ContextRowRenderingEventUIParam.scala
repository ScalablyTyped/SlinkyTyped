package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextRowRenderingEventUIParam extends js.Object {
  /**
  	 * Gets the current context row mode.
  	 */
  var contextRowMode: js.UndefOr[String] = js.native
  /**
  	 * Gets current page index.
  	 */
  var currentPageIndex: js.UndefOr[Double] = js.native
  /**
  	 * Gets reference to the first data row. Null if there are no records.
  	 */
  var dataRow: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to igTreeGridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ContextRowRenderingEventUIParam {
  @scala.inline
  def apply(): ContextRowRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRowRenderingEventUIParam]
  }
  @scala.inline
  implicit class ContextRowRenderingEventUIParamOps[Self <: ContextRowRenderingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextRowMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextRowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextRowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextRowMode")(js.undefined)
        ret
    }
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
    def withDataRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRow")(js.undefined)
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

