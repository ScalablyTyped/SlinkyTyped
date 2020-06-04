package typingsSlinky.antd.transferListMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticUIEvent
import typingsSlinky.antd.anon.SelectedCount
import typingsSlinky.antd.renderListBodyMod.TransferListBodyProps
import typingsSlinky.antd.transferMod.RenderResult
import typingsSlinky.antd.transferMod.SelectAllLabel
import typingsSlinky.antd.transferMod.TransferDirection
import typingsSlinky.antd.transferMod.TransferItem
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListProps extends js.Object {
  var checkedKeys: js.Array[String]
  var dataSource: js.Array[TransferItem]
  var direction: TransferDirection
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, TagMod[Any]]] = js.undefined
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: TagMod[Any]
  var prefixCls: String
  var render: js.UndefOr[js.Function1[/* item */ TransferItem, RenderResult]] = js.undefined
  var renderList: js.UndefOr[RenderListFunction] = js.undefined
  var searchPlaceholder: String
  var selectAllLabel: js.UndefOr[SelectAllLabel] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var titleText: String
  def handleClear(): Unit
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit
  def onItemSelect(key: String, check: Boolean): Unit
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
  def onScroll(e: SyntheticUIEvent[HTMLUListElement]): Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[String],
    dataSource: js.Array[TransferItem],
    direction: TransferDirection,
    handleClear: () => Unit,
    handleFilter: ChangeEvent[HTMLInputElement] => Unit,
    itemUnit: String,
    itemsUnit: String,
    onItemSelect: (String, Boolean) => Unit,
    onItemSelectAll: (js.Array[String], Boolean) => Unit,
    onScroll: SyntheticUIEvent[HTMLUListElement] => Unit,
    prefixCls: String,
    searchPlaceholder: String,
    titleText: String
  ): TransferListProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = js.Any.fromFunction1(onScroll), prefixCls = prefixCls.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListProps]
  }
  @scala.inline
  implicit class TransferListPropsOps[Self <: TransferListProps] (val x: Self) extends AnyVal {
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
    def setCheckedKeys(value: js.Array[String]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSource(value: js.Array[TransferItem]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: TransferDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleClear(value: () => Unit): Self = this.set("handleClear", js.Any.fromFunction0(value))
    @scala.inline
    def setHandleFilter(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("handleFilter", js.Any.fromFunction1(value))
    @scala.inline
    def setItemUnit(value: String): Self = this.set("itemUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsUnit(value: String): Self = this.set("itemsUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnItemSelect(value: (String, Boolean) => Unit): Self = this.set("onItemSelect", js.Any.fromFunction2(value))
    @scala.inline
    def setOnItemSelectAll(value: (js.Array[String], Boolean) => Unit): Self = this.set("onItemSelectAll", js.Any.fromFunction2(value))
    @scala.inline
    def setOnScroll(value: SyntheticUIEvent[HTMLUListElement] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFilterOption(value: (/* filterText */ String, /* item */ TransferItem) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    @scala.inline
    def setFooter(value: /* props */ TransferListProps => TagMod[Any]): Self = this.set("footer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setNotFoundContent(value: TagMod[Any]): Self = this.set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundContent: Self = this.set("notFoundContent", js.undefined)
    @scala.inline
    def setRender(value: /* item */ TransferItem => RenderResult): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setRenderList(value: /* props */ TransferListBodyProps => TagMod[Any]): Self = this.set("renderList", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderList: Self = this.set("renderList", js.undefined)
    @scala.inline
    def setSelectAllLabelReactElement(value: ReactElement): Self = this.set("selectAllLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectAllLabelFunction1(value: /* info */ SelectedCount => TagMod[Any]): Self = this.set("selectAllLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectAllLabel(value: SelectAllLabel): Self = this.set("selectAllLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllLabel: Self = this.set("selectAllLabel", js.undefined)
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    @scala.inline
    def setShowSelectAll(value: Boolean): Self = this.set("showSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSelectAll: Self = this.set("showSelectAll", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

