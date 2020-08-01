package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.Route
import typingsSlinky.antd.breadcrumbItemMod.BreadcrumbItemProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb {
  @JSImport("antd/lib/breadcrumb", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def itemRender(
      value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactElement
    ): this.type = set("itemRender", js.Any.fromFunction4(value))
    @scala.inline
    def params(value: js.Any): this.type = set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def routesVarargs(value: Route*): this.type = set("routes", js.Array(value :_*))
    @scala.inline
    def routes(value: js.Array[Route]): this.type = set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def separatorReactElement(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Item {
    @JSImport("antd/lib/breadcrumb", "default.Item")
    @js.native
    object component extends js.Object
    
    def withProps(p: BreadcrumbItemProps): SharedBuilder_BreadcrumbItemProps_2017195058 = new SharedBuilder_BreadcrumbItemProps_2017195058(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Item.type): SharedBuilder_BreadcrumbItemProps_2017195058 = new SharedBuilder_BreadcrumbItemProps_2017195058(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Separator {
    @JSImport("antd/lib/breadcrumb", "default.Separator")
    @js.native
    object component extends js.Object
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Separator.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
}

