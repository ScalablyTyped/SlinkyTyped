package typingsSlinky.reactBreadcrumbsDynamic.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BreadcrumbsItem {
  
  @scala.inline
  def apply(to: String): Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem](js.Array(this.component, __props.asInstanceOf[BreadcrumbsItemProps]))
  }
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BreadcrumbsItemProps): Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem] = new Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem](js.Array(this.component, p.asInstanceOf[js.Any]))
}
