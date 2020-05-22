package typingsSlinky.antd.tableInterfaceMod

import slinky.core.TagMod
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
  def apply(
    cancelSort: String = null,
    collapse: String = null,
    emptyText: TagMod[Any] | js.Function0[TagMod[Any]] = null,
    expand: String = null,
    filterConfirm: TagMod[Any] = null,
    filterReset: TagMod[Any] = null,
    filterTitle: String = null,
    selectAll: TagMod[Any] = null,
    selectInvert: TagMod[Any] = null,
    selectionAll: TagMod[Any] = null,
    sortTitle: String = null,
    triggerAsc: String = null,
    triggerDesc: String = null
  ): TableLocale = {
    val __obj = js.Dynamic.literal()
    if (cancelSort != null) __obj.updateDynamic("cancelSort")(cancelSort.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (filterConfirm != null) __obj.updateDynamic("filterConfirm")(filterConfirm.asInstanceOf[js.Any])
    if (filterReset != null) __obj.updateDynamic("filterReset")(filterReset.asInstanceOf[js.Any])
    if (filterTitle != null) __obj.updateDynamic("filterTitle")(filterTitle.asInstanceOf[js.Any])
    if (selectAll != null) __obj.updateDynamic("selectAll")(selectAll.asInstanceOf[js.Any])
    if (selectInvert != null) __obj.updateDynamic("selectInvert")(selectInvert.asInstanceOf[js.Any])
    if (selectionAll != null) __obj.updateDynamic("selectionAll")(selectionAll.asInstanceOf[js.Any])
    if (sortTitle != null) __obj.updateDynamic("sortTitle")(sortTitle.asInstanceOf[js.Any])
    if (triggerAsc != null) __obj.updateDynamic("triggerAsc")(triggerAsc.asInstanceOf[js.Any])
    if (triggerDesc != null) __obj.updateDynamic("triggerDesc")(triggerDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableLocale]
  }
}

