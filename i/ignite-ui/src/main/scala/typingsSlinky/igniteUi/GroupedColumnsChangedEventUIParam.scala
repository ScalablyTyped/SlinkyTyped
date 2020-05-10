package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedColumnsChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the current child grid element, in case it's an hierarchical grid(not set if called from modal dialog).
  	 */
  var grid: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the current groupedColumns.
  	 */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets a reference to the current column's key that's being grouped(not set if called from modal dialog).
  	 */
  var key: js.UndefOr[String] = js.native
  /**
  	 * Gets a reference to the current layout object, if any(not set if called from modal dialog).
  	 */
  var layout: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets which user interaction triggers the event - possible options are dragAndDrop|modalDialog|sortStateChanged|removeButton|regroup.
  	 */
  var triggeredBy: js.UndefOr[String] = js.native
}

object GroupedColumnsChangedEventUIParam {
  @scala.inline
  def apply(): GroupedColumnsChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedColumnsChangedEventUIParam]
  }
  @scala.inline
  implicit class GroupedColumnsChangedEventUIParamOps[Self <: GroupedColumnsChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupedColumns(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
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
    def withTriggeredBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggeredBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggeredBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggeredBy")(js.undefined)
        ret
    }
  }
  
}

