package typingsSlinky.antd.listMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.paginationPaginationMod.PaginationConfig
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps[T] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var extra: js.UndefOr[ReactElement] = js.undefined
  var footer: js.UndefOr[ReactElement] = js.undefined
  var grid: js.UndefOr[ListGridType] = js.undefined
  var header: js.UndefOr[ReactElement] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemLayout: js.UndefOr[ListItemLayout] = js.undefined
  var loadMore: js.UndefOr[ReactElement] = js.undefined
  var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
  var locale: js.UndefOr[ListLocale] = js.undefined
  var pagination: js.UndefOr[PaginationConfig | `false`] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, ReactElement]] = js.undefined
  var rowKey: js.UndefOr[(js.Function1[/* item */ T, String]) | String] = js.undefined
  var size: js.UndefOr[ListSize] = js.undefined
  var split: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ListProps {
  @scala.inline
  def apply[T](): ListProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProps[T]]
  }
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps[_], T] (val x: Self with ListProps[T]) extends AnyVal {
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDataSource(value: js.Array[T]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setGrid(value: ListGridType): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemLayout(value: ListItemLayout): Self = this.set("itemLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemLayout: Self = this.set("itemLayout", js.undefined)
    @scala.inline
    def setLoadMoreReactElement(value: ReactElement): Self = this.set("loadMore", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadMore(value: ReactElement): Self = this.set("loadMore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMore: Self = this.set("loadMore", js.undefined)
    @scala.inline
    def setLoading(value: Boolean | SpinProps): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLocale(value: ListLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPagination(value: PaginationConfig | `false`): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderItem(value: (/* item */ T, /* index */ Double) => ReactElement): Self = this.set("renderItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    @scala.inline
    def setRowKeyFunction1(value: /* item */ T => String): Self = this.set("rowKey", js.Any.fromFunction1(value))
    @scala.inline
    def setRowKey(value: (js.Function1[/* item */ T, String]) | String): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    @scala.inline
    def setSize(value: ListSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSplit(value: Boolean): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

