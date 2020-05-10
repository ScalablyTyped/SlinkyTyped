package typingsSlinky.reactBreadcrumbsDynamic.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbsItem {
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: BreadcrumbsItemProps): Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem] = new Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(to: String): Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem] = {
    val __props = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem](js.Array(this.component, __props.asInstanceOf[BreadcrumbsItemProps]))
  }
}

