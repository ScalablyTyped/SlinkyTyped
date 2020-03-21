package typingsSlinky.reactBreadcrumbsDynamic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbsItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem] {
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(to: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsItem] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BreadcrumbsItemProps
}

