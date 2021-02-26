package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.GoButton
import typingsSlinky.antd.antdStrings.`jump-next`
import typingsSlinky.antd.antdStrings.`jump-prev`
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.next
import typingsSlinky.antd.antdStrings.page
import typingsSlinky.antd.antdStrings.prev
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.paginationPaginationMod.PaginationProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @JSImport("antd", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultCurrent(value: Double): this.type = set("defaultCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultPageSize(value: Double): this.type = set("defaultPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideOnSinglePage(value: Boolean): this.type = set("hideOnSinglePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemRender(
      value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ ReactElement) => ReactElement
    ): this.type = set("itemRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def locale(value: js.Object): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def onShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): this.type = set("onShowSizeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageSizeOptions(value: js.Array[String]): this.type = set("pageSizeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageSizeOptionsVarargs(value: String*): this.type = set("pageSizeOptions", js.Array(value :_*))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectPrefixCls(value: String): this.type = set("selectPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showLessItems(value: Boolean): this.type = set("showLessItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showQuickJumper(value: Boolean | GoButton): this.type = set("showQuickJumper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSizeChanger(value: Boolean): this.type = set("showSizeChanger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTitle(value: Boolean): this.type = set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactElement): this.type = set("showTotal", js.Any.fromFunction2(value))
    
    @scala.inline
    def simple(value: Boolean): this.type = set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def total(value: Double): this.type = set("total", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pagination.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
