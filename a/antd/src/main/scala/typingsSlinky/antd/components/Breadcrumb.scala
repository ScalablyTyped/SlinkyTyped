package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.Route
import typingsSlinky.antd.breadcrumbItemMod.BreadcrumbItemProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  object Item {
    
    @JSImport("antd", "Breadcrumb.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_BreadcrumbItemProps_2017195058 = new SharedBuilder_BreadcrumbItemProps_2017195058(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BreadcrumbItemProps): SharedBuilder_BreadcrumbItemProps_2017195058 = new SharedBuilder_BreadcrumbItemProps_2017195058(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Separator {
    
    @JSImport("antd", "Breadcrumb.Separator")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Separator.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Breadcrumb")
  @js.native
  val component: js.Object = js.native
  
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
    def routes(value: js.Array[Route]): this.type = set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def routesVarargs(value: Route*): this.type = set("routes", js.Array(value :_*))
    
    @scala.inline
    def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separatorReactElement(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
