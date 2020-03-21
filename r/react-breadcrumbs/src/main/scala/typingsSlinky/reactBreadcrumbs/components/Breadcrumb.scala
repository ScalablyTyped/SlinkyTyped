package typingsSlinky.reactBreadcrumbs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactBreadcrumbs.AnonTitle
import typingsSlinky.reactBreadcrumbs.mod.BreadcrumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBreadcrumbs.mod.Breadcrumb] {
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: hidden */
  def apply(
    data: LocationDescriptor[LocationState] with AnonTitle,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBreadcrumbs.mod.Breadcrumb] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbProps
}

