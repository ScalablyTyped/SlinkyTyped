package typingsSlinky.reactDashBreadcrumbs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.LocationDescriptor
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashBreadcrumbs.Anon_Title
import typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.BreadcrumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.Breadcrumb] {
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: hidden */
  def apply(
    data: LocationDescriptor[LocationState] with Anon_Title,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.Breadcrumb] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbProps
}

