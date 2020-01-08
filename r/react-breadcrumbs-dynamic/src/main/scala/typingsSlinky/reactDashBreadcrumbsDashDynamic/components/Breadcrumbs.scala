package typingsSlinky.reactDashBreadcrumbsDashDynamic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.BreadcrumbsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.Breadcrumbs
    ] {
  @JSImport("react-breadcrumbs-dynamic", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    container: String | org.scalajs.dom.raw.Element | js.Object = null,
    containerProps: js.Object = null,
    duplicateProps: js.Object = null,
    finalItem: String | org.scalajs.dom.raw.Element | js.Object = null,
    finalProps: js.Object = null,
    item: String | org.scalajs.dom.raw.Element | js.Object = null,
    renameProps: js.Object = null,
    separator: String | org.scalajs.dom.raw.Element | js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.Breadcrumbs
  ] = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (duplicateProps != null) __obj.updateDynamic("duplicateProps")(duplicateProps.asInstanceOf[js.Any])
    if (finalItem != null) __obj.updateDynamic("finalItem")(finalItem.asInstanceOf[js.Any])
    if (finalProps != null) __obj.updateDynamic("finalProps")(finalProps.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (renameProps != null) __obj.updateDynamic("renameProps")(renameProps.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.Breadcrumbs
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBreadcrumbsDashDynamic.reactDashBreadcrumbsDashDynamicMod.Breadcrumbs](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BreadcrumbsProps
}

