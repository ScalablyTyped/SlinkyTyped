package typingsSlinky.antd.tableInterfaceMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableLocale extends js.Object {
  var cancelSort: js.UndefOr[String] = js.undefined
  var collapse: js.UndefOr[String] = js.undefined
  var emptyText: js.UndefOr[TagMod[Any] | js.Function0[TagMod[Any]]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var filterConfirm: js.UndefOr[TagMod[Any]] = js.undefined
  var filterReset: js.UndefOr[TagMod[Any]] = js.undefined
  var filterTitle: js.UndefOr[String] = js.undefined
  var selectAll: js.UndefOr[TagMod[Any]] = js.undefined
  var selectInvert: js.UndefOr[TagMod[Any]] = js.undefined
  var selectionAll: js.UndefOr[TagMod[Any]] = js.undefined
  var sortTitle: js.UndefOr[String] = js.undefined
  var triggerAsc: js.UndefOr[String] = js.undefined
  var triggerDesc: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancelSort(value: String): Self = this.set("cancelSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelSort: Self = this.set("cancelSort", js.undefined)
    @scala.inline
    def setCollapse(value: String): Self = this.set("collapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setEmptyTextReactElement(value: ReactElement): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptyTextFunction0(value: () => TagMod[Any]): Self = this.set("emptyText", js.Any.fromFunction0(value))
    @scala.inline
    def setEmptyText(value: TagMod[Any] | js.Function0[TagMod[Any]]): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    @scala.inline
    def setExpand(value: String): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setFilterConfirmReactElement(value: ReactElement): Self = this.set("filterConfirm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterConfirm(value: TagMod[Any]): Self = this.set("filterConfirm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterConfirm: Self = this.set("filterConfirm", js.undefined)
    @scala.inline
    def setFilterResetReactElement(value: ReactElement): Self = this.set("filterReset", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterReset(value: TagMod[Any]): Self = this.set("filterReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterReset: Self = this.set("filterReset", js.undefined)
    @scala.inline
    def setFilterTitle(value: String): Self = this.set("filterTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTitle: Self = this.set("filterTitle", js.undefined)
    @scala.inline
    def setSelectAllReactElement(value: ReactElement): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectAll(value: TagMod[Any]): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    @scala.inline
    def setSelectInvertReactElement(value: ReactElement): Self = this.set("selectInvert", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectInvert(value: TagMod[Any]): Self = this.set("selectInvert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectInvert: Self = this.set("selectInvert", js.undefined)
    @scala.inline
    def setSelectionAllReactElement(value: ReactElement): Self = this.set("selectionAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionAll(value: TagMod[Any]): Self = this.set("selectionAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionAll: Self = this.set("selectionAll", js.undefined)
    @scala.inline
    def setSortTitle(value: String): Self = this.set("sortTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortTitle: Self = this.set("sortTitle", js.undefined)
    @scala.inline
    def setTriggerAsc(value: String): Self = this.set("triggerAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerAsc: Self = this.set("triggerAsc", js.undefined)
    @scala.inline
    def setTriggerDesc(value: String): Self = this.set("triggerDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerDesc: Self = this.set("triggerDesc", js.undefined)
  }
  
}

