package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.antd.breadcrumbBreadcrumbMod.Route
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
}

