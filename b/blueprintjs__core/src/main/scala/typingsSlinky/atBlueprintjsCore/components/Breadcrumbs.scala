package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsSlinky.atBlueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.IBreadcrumbProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbsMod.IBreadcrumbsProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsOverflowDashListOverflowListMod.IOverflowListProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Breadcrumbs] {
  @JSImport("@blueprintjs/core/lib/esm/components", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    items: js.Array[IBreadcrumbProps],
    breadcrumbRenderer: /* props */ IBreadcrumbProps => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    collapseFrom: Boundary = null,
    currentBreadcrumbRenderer: /* props */ IBreadcrumbProps => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    minVisibleItems: Int | Double = null,
    overflowListProps: Partial[IOverflowListProps[IBreadcrumbProps]] = null,
    popoverProps: IPopoverProps = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Breadcrumbs] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (breadcrumbRenderer != null) __obj.updateDynamic("breadcrumbRenderer")(js.Any.fromFunction1(breadcrumbRenderer))
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (currentBreadcrumbRenderer != null) __obj.updateDynamic("currentBreadcrumbRenderer")(js.Any.fromFunction1(currentBreadcrumbRenderer))
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (overflowListProps != null) __obj.updateDynamic("overflowListProps")(overflowListProps.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IBreadcrumbsProps
}

