package typingsSlinky.reactDashDraggableDashList.components

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDraggableDashList.reactDashDraggableDashListMod.TemplateProps
import typingsSlinky.reactDashDraggableDashList.reactDashDraggableDashListMod.default
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashDraggableDashList
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any, js.Any, js.Any]] {
  @JSImport("react-draggable-list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[I, C, T /* <: ReactComponentClass[Partial[TemplateProps[I, C]]] */](
    itemKey: String | (js.Function1[I, String]),
    list: js.Array[I],
    template: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], T],
    autoScrollMaxSpeed: Int | Double = null,
    autoScrollRegionSize: Int | Double = null,
    commonProps: C = null,
    constrainDrag: js.UndefOr[Boolean] = js.undefined,
    container: () => js.UndefOr[HTMLElement | Null] = null,
    onMoveEnd: (/* newList */ js.Array[I], I, /* oldIndex */ Double, /* newIndex */ Double) => Unit = null,
    padding: Int | Double = null,
    springConfig: js.Object = null,
    unsetZIndex: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any, js.Any, js.Any]] = {
    val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (autoScrollMaxSpeed != null) __obj.updateDynamic("autoScrollMaxSpeed")(autoScrollMaxSpeed.asInstanceOf[js.Any])
    if (autoScrollRegionSize != null) __obj.updateDynamic("autoScrollRegionSize")(autoScrollRegionSize.asInstanceOf[js.Any])
    if (commonProps != null) __obj.updateDynamic("commonProps")(commonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainDrag)) __obj.updateDynamic("constrainDrag")(constrainDrag.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(js.Any.fromFunction0(container))
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction4(onMoveEnd))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(unsetZIndex)) __obj.updateDynamic("unsetZIndex")(unsetZIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashDraggableDashList.reactDashDraggableDashListMod.default[js.Any, js.Any, js.Any]]]
  }
  type Props = typingsSlinky.reactDashDraggableDashList.reactDashDraggableDashListMod.Props[js.Any, js.Any, js.Any]
}

