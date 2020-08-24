package typingsSlinky.rcPagination.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPagination.mod.PaginationProps
import typingsSlinky.rcPagination.mod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcPagination {
  @JSImport("rc-pagination", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultCurrent(value: Double): this.type = set("defaultCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultPageSize(value: Double): this.type = set("defaultPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def hideOnSinglePage(value: Boolean): this.type = set("hideOnSinglePage", value.asInstanceOf[js.Any])
    @scala.inline
    def itemRender(value: (/* page */ Double, /* type */ String, /* element */ ReactElement) => ReactElement): this.type = set("itemRender", js.Any.fromFunction3(value))
    @scala.inline
    def jumpNextIconReactElement(value: ReactElement): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def jumpNextIconFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def jumpNextIconComponentClass(value: ReactComponentClass[js.Object]): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def jumpNextIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("jumpNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def jumpPrevIconReactElement(value: ReactElement): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def jumpPrevIconFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def jumpPrevIconComponentClass(value: ReactComponentClass[js.Object]): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def jumpPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("jumpPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: js.Object): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def nextIconReactElement(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def nextIconFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def nextIconComponentClass(value: ReactComponentClass[js.Object]): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def nextIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: (/* page */ Double, /* pageSize */ Double) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): this.type = set("onShowSizeChange", js.Any.fromFunction2(value))
    @scala.inline
    def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def pageSizeOptionsVarargs(value: String*): this.type = set("pageSizeOptions", js.Array(value :_*))
    @scala.inline
    def pageSizeOptions(value: js.Array[String]): this.type = set("pageSizeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def prevIconReactElement(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def prevIconFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def prevIconComponentClass(value: ReactComponentClass[js.Object]): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def prevIcon(value: ReactComponentClass[js.Object] | ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def selectComponentClassFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("selectComponentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def selectComponentClassComponentClass(value: ReactComponentClass[js.Object]): this.type = set("selectComponentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def selectComponentClass(value: ReactComponentClass[js.Object]): this.type = set("selectComponentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def selectPrefixCls(value: String): this.type = set("selectPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def showLessItems(value: Boolean): this.type = set("showLessItems", value.asInstanceOf[js.Any])
    @scala.inline
    def showPrevNextJumpers(value: Boolean): this.type = set("showPrevNextJumpers", value.asInstanceOf[js.Any])
    @scala.inline
    def showQuickJumper(value: Boolean | js.Object): this.type = set("showQuickJumper", value.asInstanceOf[js.Any])
    @scala.inline
    def showSizeChanger(value: Boolean): this.type = set("showSizeChanger", value.asInstanceOf[js.Any])
    @scala.inline
    def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def showTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactElement): this.type = set("showTotal", js.Any.fromFunction2(value))
    @scala.inline
    def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def total(value: Double): this.type = set("total", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcPagination.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

