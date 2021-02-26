package typingsSlinky.reactBreadcrumbs.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBreadcrumbs.mod.BreadcrumbsProps
import typingsSlinky.reactBreadcrumbs.mod.Crumbs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  @JSImport("react-breadcrumbs", "Breadcrumbs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBreadcrumbs.mod.Breadcrumbs] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separatorReactElement(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrumbs(value: /* crumbs */ Crumbs => ReactElement): this.type = set("setCrumbs", js.Any.fromFunction1(value))
    
    @scala.inline
    def wrapper(value: ReactComponentClass[js.Object]): this.type = set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperComponentClass(value: ReactComponentClass[js.Object]): this.type = set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("wrapper", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumbs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
