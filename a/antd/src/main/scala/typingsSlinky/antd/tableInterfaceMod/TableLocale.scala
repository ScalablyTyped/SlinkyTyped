package typingsSlinky.antd.tableInterfaceMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableLocale extends js.Object {
  var collapse: js.UndefOr[String] = js.native
  var emptyText: js.UndefOr[TagMod[Any] | js.Function0[TagMod[Any]]] = js.native
  var expand: js.UndefOr[String] = js.native
  var filterConfirm: js.UndefOr[TagMod[Any]] = js.native
  var filterReset: js.UndefOr[TagMod[Any]] = js.native
  var filterTitle: js.UndefOr[String] = js.native
  var selectAll: js.UndefOr[TagMod[Any]] = js.native
  var selectInvert: js.UndefOr[TagMod[Any]] = js.native
  var selectionAll: js.UndefOr[TagMod[Any]] = js.native
  var sortTitle: js.UndefOr[String] = js.native
}

object TableLocale {
  @scala.inline
  def apply(): TableLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableLocale]
  }
  @scala.inline
  implicit class TableLocaleOps[Self <: TableLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyTextFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmptyText(value: TagMod[Any] | js.Function0[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterConfirmReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterConfirm(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterConfirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterResetReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterReset(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterReset")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAll(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectInvertReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectInvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectInvert(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectInvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectInvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectInvert")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionAllReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionAll(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionAll")(js.undefined)
        ret
    }
    @scala.inline
    def withSortTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortTitle")(js.undefined)
        ret
    }
  }
  
}

