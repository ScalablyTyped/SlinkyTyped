package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewOptions extends js.Object {
  var altTemplate: js.UndefOr[js.Function] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[js.Function1[/* e */ ListViewCancelEvent, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var edit: js.UndefOr[js.Function1[/* e */ ListViewEditEvent, Unit]] = js.native
  var editTemplate: js.UndefOr[js.Function] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var name: js.UndefOr[String] = js.native
  var navigatable: js.UndefOr[Boolean] = js.native
  var remove: js.UndefOr[js.Function1[/* e */ ListViewRemoveEvent, Unit]] = js.native
  var save: js.UndefOr[js.Function1[/* e */ ListViewSaveEvent, Unit]] = js.native
  var scrollable: js.UndefOr[Boolean | String] = js.native
  var selectable: js.UndefOr[Boolean | String] = js.native
  var template: js.UndefOr[js.Function] = js.native
}

object ListViewOptions {
  @scala.inline
  def apply(): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewOptions]
  }
  @scala.inline
  implicit class ListViewOptionsOps[Self <: ListViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltTemplate(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBind")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* e */ ListViewCancelEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ListViewEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinding(value: /* e */ ListViewEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBound(value: /* e */ ListViewEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any | DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: /* e */ ListViewEditEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEditTemplate(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatable")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* e */ ListViewRemoveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: /* e */ ListViewSaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollable(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

