package typingsSlinky.antd.paginationPaginationMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.GoButton
import typingsSlinky.antd.antdStrings.`jump-next`
import typingsSlinky.antd.antdStrings.`jump-prev`
import typingsSlinky.antd.antdStrings.next
import typingsSlinky.antd.antdStrings.page
import typingsSlinky.antd.antdStrings.prev
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var current: js.UndefOr[Double] = js.native
  var defaultCurrent: js.UndefOr[Double] = js.native
  var defaultPageSize: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var hideOnSinglePage: js.UndefOr[Boolean] = js.native
  var itemRender: js.UndefOr[
    js.Function3[
      /* page */ Double, 
      /* type */ page | prev | next | `jump-prev` | `jump-next`, 
      /* originalElement */ ReactElement, 
      TagMod[Any]
    ]
  ] = js.native
  var locale: js.UndefOr[js.Object] = js.native
  var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ js.UndefOr[Double], Unit]] = js.native
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageSizeOptions: js.UndefOr[js.Array[String]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var selectPrefixCls: js.UndefOr[String] = js.native
  var showLessItems: js.UndefOr[Boolean] = js.native
  var showQuickJumper: js.UndefOr[Boolean | GoButton] = js.native
  var showSizeChanger: js.UndefOr[Boolean] = js.native
  var showTotal: js.UndefOr[
    js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], TagMod[Any]]
  ] = js.native
  var simple: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var total: js.UndefOr[Double] = js.native
}

object PaginationProps {
  @scala.inline
  def apply(): PaginationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPageSize")(js.undefined)
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
    def withHideOnSinglePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnSinglePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnSinglePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnSinglePage")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRender(
      value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ ReactElement) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutItemRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRender")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowSizeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShowSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSizeOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSizeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLessItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLessItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLessItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLessItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowQuickJumper(value: Boolean | GoButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showQuickJumper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowQuickJumper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showQuickJumper")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSizeChanger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSizeChanger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSizeChanger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSizeChanger")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShowTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

