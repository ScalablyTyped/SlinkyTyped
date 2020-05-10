package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextRowRenderedEventUIParam extends js.Object {
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
  /**
  	 * Gets array of the parent rows(of the ui.dataRow). If the dataRow is null(for instance filter is applied and no records are shown) then it is empty array. Otherwise it contains all ancestors ordered by level(including the current dataRow) - the first item is root level, the last array item is the current ui.dataRow
  	 */
  var parentRows: js.UndefOr[js.Array[_]] = js.native
}

object ContextRowRenderedEventUIParam {
  @scala.inline
  def apply(): ContextRowRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRowRenderedEventUIParam]
  }
  @scala.inline
  implicit class ContextRowRenderedEventUIParamOps[Self <: ContextRowRenderedEventUIParam] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withParentRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRows")(js.undefined)
        ret
    }
  }
  
}

