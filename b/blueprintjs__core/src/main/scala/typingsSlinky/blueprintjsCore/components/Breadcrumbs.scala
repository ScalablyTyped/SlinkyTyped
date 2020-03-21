package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.PartialIOverflowListProps
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsSlinky.blueprintjsCore.breadcrumbsMod.IBreadcrumbsProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.Breadcrumbs] {
  @JSImport("@blueprintjs/core", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    items: js.Array[IBreadcrumbProps],
    breadcrumbRenderer: /* props */ IBreadcrumbProps => ReactElement = null,
    collapseFrom: Boundary = null,
    currentBreadcrumbRenderer: /* props */ IBreadcrumbProps => ReactElement = null,
    minVisibleItems: Int | Double = null,
    overflowListProps: PartialIOverflowListProps = null,
    popoverProps: IPopoverProps = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Breadcrumbs] = {
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

