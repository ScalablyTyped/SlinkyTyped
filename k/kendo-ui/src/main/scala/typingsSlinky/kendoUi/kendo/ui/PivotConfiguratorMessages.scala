package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotConfiguratorMessages extends js.Object {
  var columns: js.UndefOr[String] = js.native
  var columnsLabel: js.UndefOr[String] = js.native
  var fieldMenu: js.UndefOr[PivotConfiguratorMessagesFieldMenu] = js.native
  var fieldsLabel: js.UndefOr[String] = js.native
  var measures: js.UndefOr[String] = js.native
  var measuresLabel: js.UndefOr[String] = js.native
  var rows: js.UndefOr[String] = js.native
  var rowsLabel: js.UndefOr[String] = js.native
}

object PivotConfiguratorMessages {
  @scala.inline
  def apply(): PivotConfiguratorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorMessages]
  }
  @scala.inline
  implicit class PivotConfiguratorMessagesOps[Self <: PivotConfiguratorMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnsLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnsLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldMenu(value: PivotConfiguratorMessagesFieldMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldsLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldsLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measures")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasuresLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measuresLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasuresLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measuresLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsLabel")(js.undefined)
        ret
    }
  }
  
}

