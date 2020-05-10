package typingsSlinky.rcPagination.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationData extends js.Object {
  var className: String = js.native
  var current: Double = js.native
  var defaultCurrent: Double = js.native
  var defaultPageSize: Double = js.native
  var hideOnSinglePage: Boolean = js.native
  var jumpNextIcon: ReactComponentClass[js.Object] | TagMod[Any] = js.native
  var jumpPrevIcon: ReactComponentClass[js.Object] | TagMod[Any] = js.native
  var locale: js.Object = js.native
  var nextIcon: ReactComponentClass[js.Object] | TagMod[Any] = js.native
  var pageSize: Double = js.native
  var pageSizeOptions: js.Array[String] = js.native
  var prefixCls: String = js.native
  var prevIcon: ReactComponentClass[js.Object] | TagMod[Any] = js.native
  var selectComponentClass: ReactComponentClass[js.Object] = js.native
  var selectPrefixCls: String = js.native
  var showLessItems: Boolean = js.native
  var showPrevNextJumpers: Boolean = js.native
  var showQuickJumper: Boolean | js.Object = js.native
  var showSizeChanger: Boolean = js.native
  var showTitle: Boolean = js.native
  var style: CSSProperties = js.native
  var total: Double = js.native
}

object PaginationData {
  @scala.inline
  def apply(
    className: String,
    current: Double,
    defaultCurrent: Double,
    defaultPageSize: Double,
    hideOnSinglePage: Boolean,
    locale: js.Object,
    pageSize: Double,
    pageSizeOptions: js.Array[String],
    prefixCls: String,
    selectComponentClass: ReactComponentClass[js.Object],
    selectPrefixCls: String,
    showLessItems: Boolean,
    showPrevNextJumpers: Boolean,
    showQuickJumper: Boolean | js.Object,
    showSizeChanger: Boolean,
    showTitle: Boolean,
    style: CSSProperties,
    total: Double
  ): PaginationData = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationData]
  }
  @scala.inline
  implicit class PaginationDataOps[Self <: PaginationData] (val x: Self) extends AnyVal {
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
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideOnSinglePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnSinglePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSizeOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSizeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectComponentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowLessItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLessItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPrevNextJumpers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrevNextJumpers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowQuickJumper(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showQuickJumper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowSizeChanger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSizeChanger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
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
  }
  
}

