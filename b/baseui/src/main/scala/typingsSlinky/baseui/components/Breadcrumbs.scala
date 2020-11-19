package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.breadcrumbsMod.BreadcrumbsOverrides
import typingsSlinky.baseui.breadcrumbsMod.BreadcrumbsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  @JSImport("baseui/breadcrumbs", "Breadcrumbs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: BreadcrumbsOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTrailingSeparator(value: Boolean): this.type = set("showTrailingSeparator", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Breadcrumbs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
