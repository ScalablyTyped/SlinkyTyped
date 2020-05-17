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

@js.native
trait TransferListProps extends js.Object {
  var checkedKeys: js.Array[String] = js.native
  var dataSource: js.Array[TransferItem] = js.native
  var direction: TransferDirection = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ TransferItem, Boolean]] = js.native
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, TagMod[Any]]] = js.native
  var itemUnit: String = js.native
  var itemsUnit: String = js.native
  var notFoundContent: TagMod[Any] = js.native
  var prefixCls: String = js.native
  var render: js.UndefOr[js.Function1[/* item */ TransferItem, RenderResult]] = js.native
  var renderList: js.UndefOr[RenderListFunction] = js.native
  var searchPlaceholder: String = js.native
  var selectAllLabel: js.UndefOr[SelectAllLabel] = js.native
  var showSearch: js.UndefOr[Boolean] = js.native
  var showSelectAll: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var titleText: String = js.native
  def handleClear(): Unit = js.native
  def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def onItemSelect(key: String, check: Boolean): Unit = js.native
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit = js.native
  def onScroll(e: SyntheticUIEvent[HTMLUListElement]): Unit = js.native
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
    def withCheckedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[TransferItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: TransferDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleFilter(value: ChangeEvent[HTMLInputElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItemUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnItemSelect(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnItemSelectAll(value: (js.Array[String], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelectAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnScroll(value: SyntheticUIEvent[HTMLUListElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOption(value: (/* filterText */ String, /* item */ TransferItem) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilterOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: /* props */ TransferListProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFoundContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* item */ TransferItem => RenderResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderList(value: /* props */ TransferListBodyProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderList")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllLabelFunction1(value: /* info */ SelectedCount => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectAllLabel(value: SelectAllLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSelectAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

