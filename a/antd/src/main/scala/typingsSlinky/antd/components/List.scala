package typingsSlinky.antd.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.listMod.ListGridType
import typingsSlinky.antd.listMod.ListItemLayout
import typingsSlinky.antd.listMod.ListLocale
import typingsSlinky.antd.listMod.ListProps
import typingsSlinky.antd.listMod.ListSize
import typingsSlinky.antd.listMod.default
import typingsSlinky.antd.paginationPaginationMod.PaginationConfig
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("antd/lib/list", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def dataSource(value: js.Array[T]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: TagMod[Any]): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: TagMod[Any]): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: ListGridType): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: TagMod[Any]): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def itemLayout(value: ListItemLayout): this.type = set("itemLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def loadMoreReactElement(value: ReactElement): this.type = set("loadMore", value.asInstanceOf[js.Any])
    @scala.inline
    def loadMore(value: TagMod[Any]): this.type = set("loadMore", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean | SpinProps): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: ListLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def pagination(value: PaginationConfig | `false`): this.type = set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def renderItem(value: (T, /* index */ Double) => TagMod[Any]): this.type = set("renderItem", js.Any.fromFunction2(value))
    @scala.inline
    def rowKeyFunction1(value: T => String): this.type = set("rowKey", js.Any.fromFunction1(value))
    @scala.inline
    def rowKey(value: (js.Function1[T, String]) | String): this.type = set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: ListSize): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def split(value: Boolean): this.type = set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ListProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: List.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

