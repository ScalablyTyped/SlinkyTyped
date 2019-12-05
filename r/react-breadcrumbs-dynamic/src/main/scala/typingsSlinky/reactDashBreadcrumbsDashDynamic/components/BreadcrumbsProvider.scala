package typingsSlinky.reactDashBreadcrumbsDashDynamic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.BreadcrumbsProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbsProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.BreadcrumbsProvider
    ] {
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    shouldBreadcrumbsUpdate: /* repeated */ js.Any => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.BreadcrumbsProvider
  ] = {
    val __obj = js.Dynamic.literal()
    if (shouldBreadcrumbsUpdate != null) __obj.updateDynamic("shouldBreadcrumbsUpdate")(js.Any.fromFunction1(shouldBreadcrumbsUpdate))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbsProviderProps
}

