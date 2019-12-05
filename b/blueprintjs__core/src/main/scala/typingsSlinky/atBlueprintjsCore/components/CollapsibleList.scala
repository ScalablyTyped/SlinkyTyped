package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsSlinky.atBlueprintjsCore.libEsmComponentsCollapsibleDashListCollapsibleListMod.ICollapsibleListProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsMenuMenuItemMod.IMenuItemProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CollapsibleList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.CollapsibleList] {
  @JSImport("@blueprintjs/core/lib/esm/components", "CollapsibleList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    dropdownTarget: typingsSlinky.react.reactMod._Global_.JSX.Element,
    visibleItemRenderer: (IMenuItemProps, Double) => typingsSlinky.react.reactMod._Global_.JSX.Element,
    collapseFrom: Boundary = null,
    dropdownProps: IPopoverProps = null,
    visibleItemClassName: String = null,
    visibleItemCount: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.CollapsibleList] = {
    val __obj = js.Dynamic.literal(dropdownTarget = dropdownTarget.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (dropdownProps != null) __obj.updateDynamic("dropdownProps")(dropdownProps.asInstanceOf[js.Any])
    if (visibleItemClassName != null) __obj.updateDynamic("visibleItemClassName")(visibleItemClassName.asInstanceOf[js.Any])
    if (visibleItemCount != null) __obj.updateDynamic("visibleItemCount")(visibleItemCount.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ICollapsibleListProps
}

