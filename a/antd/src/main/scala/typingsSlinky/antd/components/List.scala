package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.listItemMod.ListItemMetaProps
import typingsSlinky.antd.listItemMod.ListItemProps
import typingsSlinky.antd.listMod.ListGridType
import typingsSlinky.antd.listMod.ListItemLayout
import typingsSlinky.antd.listMod.ListLocale
import typingsSlinky.antd.listMod.ListProps
import typingsSlinky.antd.listMod.ListSize
import typingsSlinky.antd.paginationPaginationMod.PaginationConfig
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSImport("antd", "List")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataSourceVarargs(value: T*): this.type = set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def dataSource(value: js.Array[T]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def grid(value: ListGridType): this.type = set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemLayout(value: ListItemLayout): this.type = set("itemLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadMoreReactElement(value: ReactElement): this.type = set("loadMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadMore(value: ReactElement): this.type = set("loadMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean | SpinProps): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: ListLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pagination(value: PaginationConfig | `false`): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderItem(value: (T, /* index */ Double) => ReactElement): this.type = set("renderItem", js.Any.fromFunction2(value))
    
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
  
  @scala.inline
  def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ListProps[T]]))
  }
  
  implicit def make[T](companion: List.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  object Item {
    
    @JSImport("antd", "List.Item")
    @js.native
    object component extends js.Object
    
    def withProps(p: ListItemProps): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Item.type): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, js.Dictionary.empty))()
    
    object Meta {
      
      @JSImport("antd", "List.Item.Meta")
      @js.native
      object component extends js.Object
      
      def withProps(p: ListItemMetaProps): SharedBuilder_ListItemMetaProps1028006195 = new SharedBuilder_ListItemMetaProps1028006195(js.Array(this.component, p.asInstanceOf[js.Any]))
      
      implicit def make(companion: Meta.type): SharedBuilder_ListItemMetaProps1028006195 = new SharedBuilder_ListItemMetaProps1028006195(js.Array(this.component, js.Dictionary.empty))()
    }
  }
}
