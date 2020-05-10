package typingsSlinky.rcPagination.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<rc-pagination.rc-pagination.PaginationData> */
@js.native
trait PaginationProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var current: js.UndefOr[Double] = js.native
  var defaultCurrent: js.UndefOr[Double] = js.native
  var defaultPageSize: js.UndefOr[Double] = js.native
  var hideOnSinglePage: js.UndefOr[Boolean] = js.native
  var itemRender: js.UndefOr[
    js.Function3[/* page */ Double, /* type */ String, /* element */ TagMod[Any], TagMod[Any]]
  ] = js.native
  var jumpNextIcon: js.UndefOr[ReactComponentClass[js.Object] | TagMod[Any]] = js.native
  var jumpPrevIcon: js.UndefOr[ReactComponentClass[js.Object] | TagMod[Any]] = js.native
  var locale: js.UndefOr[js.Object] = js.native
  var nextIcon: js.UndefOr[ReactComponentClass[js.Object] | TagMod[Any]] = js.native
  var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.native
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageSizeOptions: js.UndefOr[js.Array[String]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var prevIcon: js.UndefOr[ReactComponentClass[js.Object] | TagMod[Any]] = js.native
  var selectComponentClass: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var selectPrefixCls: js.UndefOr[String] = js.native
  var showLessItems: js.UndefOr[Boolean] = js.native
  var showPrevNextJumpers: js.UndefOr[Boolean] = js.native
  var showQuickJumper: js.UndefOr[Boolean | js.Object] = js.native
  var showSizeChanger: js.UndefOr[Boolean] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var showTotal: js.UndefOr[
    js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], TagMod[Any]]
  ] = js.native
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
    def withItemRender(value: (/* page */ Double, /* type */ String, /* element */ TagMod[Any]) => TagMod[Any]): Self = {
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
    def withJumpNextIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJumpNextIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJumpNextIconComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJumpNextIcon(value: ReactComponentClass[js.Object] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpNextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJumpNextIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpNextIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withJumpPrevIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJumpPrevIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJumpPrevIconComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJumpPrevIcon(value: ReactComponentClass[js.Object] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpPrevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJumpPrevIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpPrevIcon")(js.undefined)
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
    def withNextIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextIconComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextIcon(value: ReactComponentClass[js.Object] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* page */ Double, /* pageSize */ Double) => Unit): Self = {
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
    def withPrevIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevIconComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevIcon(value: ReactComponentClass[js.Object] | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectComponentClassFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectComponentClassComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectComponentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponentClass")(js.undefined)
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
    def withShowPrevNextJumpers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevNextJumpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPrevNextJumpers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevNextJumpers")(js.undefined)
        ret
    }
    @scala.inline
    def withShowQuickJumper(value: Boolean | js.Object): Self = {
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
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
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

