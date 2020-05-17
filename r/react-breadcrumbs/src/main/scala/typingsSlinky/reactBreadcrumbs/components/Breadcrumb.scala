package typingsSlinky.reactBreadcrumbs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactBreadcrumbs.anon.Title
import typingsSlinky.reactBreadcrumbs.mod.BreadcrumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb {
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBreadcrumbs.mod.Breadcrumb] {
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: LocationDescriptor[LocationState] with Title): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BreadcrumbProps]))
  }
}

