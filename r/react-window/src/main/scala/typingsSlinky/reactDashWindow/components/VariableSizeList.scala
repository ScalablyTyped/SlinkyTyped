package typingsSlinky.reactDashWindow.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashWindow.reactDashWindowMod.CSSDirection
import typingsSlinky.reactDashWindow.reactDashWindowMod.Direction
import typingsSlinky.reactDashWindow.reactDashWindowMod.Layout
import typingsSlinky.reactDashWindow.reactDashWindowMod.ListOnItemsRenderedProps
import typingsSlinky.reactDashWindow.reactDashWindowMod.ReactElementType
import typingsSlinky.reactDashWindow.reactDashWindowMod.VariableSizeListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VariableSizeList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashWindow.reactDashWindowMod.VariableSizeList] {
  @JSImport("react-window", "VariableSizeList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, height, onScroll, width */
  def apply(
    itemCount: Double,
    itemSize: Double => Double,
    direction: CSSDirection | Direction = null,
    estimatedItemSize: Int | Double = null,
    initialScrollOffset: Int | Double = null,
    innerElementType: ReactElementType = null,
    innerRef: Ref[_] = null,
    innerTagName: String = null,
    itemData: js.Any = null,
    itemKey: (/* index */ Double, /* data */ js.Any) => Key = null,
    layout: Layout = null,
    onItemsRendered: /* props */ ListOnItemsRenderedProps => _ = null,
    outerElementType: ReactElementType = null,
    outerRef: Ref[_] = null,
    outerTagName: String = null,
    overscanCount: Int | Double = null,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashWindow.reactDashWindowMod.VariableSizeList] = {
    val __obj = js.Dynamic.literal(itemCount = itemCount.asInstanceOf[js.Any], itemSize = js.Any.fromFunction1(itemSize))
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (estimatedItemSize != null) __obj.updateDynamic("estimatedItemSize")(estimatedItemSize.asInstanceOf[js.Any])
    if (initialScrollOffset != null) __obj.updateDynamic("initialScrollOffset")(initialScrollOffset.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemKey != null) __obj.updateDynamic("itemKey")(js.Any.fromFunction2(itemKey))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onItemsRendered != null) __obj.updateDynamic("onItemsRendered")(js.Any.fromFunction1(onItemsRendered))
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (overscanCount != null) __obj.updateDynamic("overscanCount")(overscanCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = VariableSizeListProps
}

