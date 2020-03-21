package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.overflowListMod.IOverflowListProps
import typingsSlinky.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverflowList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.OverflowList[js.Any]] {
  @JSImport("@blueprintjs/core", "OverflowList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Array[T] => TagMod[Any],
    visibleItemRenderer: (T, Double) => ReactChild,
    collapseFrom: Boundary = null,
    minVisibleItems: Int | Double = null,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    onOverflow: /* overflowItems */ js.Array[T] => Unit = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.OverflowList[js.Any]] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], overflowRenderer = js.Any.fromFunction1(overflowRenderer), visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    if (onOverflow != null) __obj.updateDynamic("onOverflow")(js.Any.fromFunction1(onOverflow))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.blueprintjsCore.mod.OverflowList[js.Any]]]
  }
  type Props = IOverflowListProps[js.Any]
}

