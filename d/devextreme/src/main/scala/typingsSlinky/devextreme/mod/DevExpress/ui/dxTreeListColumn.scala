package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ColumnColumnIndexComponent
import typingsSlinky.devextreme.anon.DisplayValueOldValue
import typingsSlinky.devextreme.anon.DisplayValueRow
import typingsSlinky.devextreme.devextremeStrings.adaptive
import typingsSlinky.devextreme.devextremeStrings.add
import typingsSlinky.devextreme.devextremeStrings.buttons
import typingsSlinky.devextreme.devextremeStrings.cancel
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.edit
import typingsSlinky.devextreme.devextremeStrings.save
import typingsSlinky.devextreme.devextremeStrings.undelete
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeListColumn extends GridBaseColumn {
  /** Allows you to customize buttons in the editing column or create a custom command column. Applies only if the column's type is "buttons". */
  var buttons: js.UndefOr[
    js.Array[add | cancel | delete | edit | save | undelete | dxTreeListColumnButton]
  ] = js.native
  /** Specifies a custom template for data cells. */
  var cellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueOldValue, _])
  ] = js.native
  /** Configures columns. */
  var columns: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.native
  /** Specifies a custom template for data cells in editing state. */
  var editCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueRow, _])
  ] = js.native
  /** Specifies a custom template for column headers. */
  var headerCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndexComponent, _])
  ] = js.native
  /** Specifies the command column that this object customizes. */
  var `type`: js.UndefOr[adaptive | buttons] = js.native
}

object dxTreeListColumn {
  @scala.inline
  def apply(): dxTreeListColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListColumn]
  }
  @scala.inline
  implicit class dxTreeListColumnOps[Self <: dxTreeListColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[add | cancel | delete | edit | save | undelete | dxTreeListColumnButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ DisplayValueOldValue) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueOldValue, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[dxTreeListColumn | String]): Self = {
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
    def withEditCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ DisplayValueRow) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEditCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ DisplayValueRow, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellTemplateFunction2(value: (/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndexComponent) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeaderCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndexComponent, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: adaptive | buttons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

