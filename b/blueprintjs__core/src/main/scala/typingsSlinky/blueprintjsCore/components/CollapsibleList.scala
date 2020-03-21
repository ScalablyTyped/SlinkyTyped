package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.collapsibleListMod.ICollapsibleListProps
import typingsSlinky.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CollapsibleList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.CollapsibleList] {
  @JSImport("@blueprintjs/core", "CollapsibleList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    dropdownTarget: ReactElement,
    visibleItemRenderer: (IMenuItemProps, Double) => ReactElement,
    collapseFrom: Boundary = null,
    dropdownProps: IPopoverProps = null,
    visibleItemClassName: String = null,
    visibleItemCount: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.CollapsibleList] = {
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

