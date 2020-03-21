package typingsSlinky.reactBootstrap.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrap.breadcrumbItemMod.BreadcrumbItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BreadcrumbItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrap.mod.BreadcrumbItem] {
  @JSImport("react-bootstrap", "BreadcrumbItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: href, target */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.BreadcrumbItem] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.BreadcrumbItem] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactBootstrap.mod.BreadcrumbItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BreadcrumbItemProps
}

