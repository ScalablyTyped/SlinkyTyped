package typingsSlinky.reactBreadcrumbsDynamic.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BreadcrumbsProvider {
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsProvider] {
    
    @scala.inline
    def shouldBreadcrumbsUpdate(value: /* repeated */ js.Any => _): this.type = set("shouldBreadcrumbsUpdate", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: BreadcrumbsProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbsProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
