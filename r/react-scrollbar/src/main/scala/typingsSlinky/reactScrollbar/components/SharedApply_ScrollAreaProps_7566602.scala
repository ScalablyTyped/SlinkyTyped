package typingsSlinky.reactScrollbar.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactScrollbar.AnonContainerHeight
import typingsSlinky.reactScrollbar.ScrollAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ScrollAreaProps_7566602[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    contentWindow: js.Any = null,
    focusableTabIndex: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    horizontalContainerStyle: CSSProperties = null,
    horizontalScrollbarStyle: CSSProperties = null,
    minScrollSize: Int | Double = null,
    onScroll: /* value */ AnonContainerHeight => Unit = null,
    ownerDocument: js.Any = null,
    smoothScrolling: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    stopScrollPropagation: js.UndefOr[Boolean] = js.undefined,
    swapWheelAxes: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    verticalContainerStyle: CSSProperties = null,
    verticalScrollbarStyle: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentWindow != null) __obj.updateDynamic("contentWindow")(contentWindow.asInstanceOf[js.Any])
    if (focusableTabIndex != null) __obj.updateDynamic("focusableTabIndex")(focusableTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (horizontalContainerStyle != null) __obj.updateDynamic("horizontalContainerStyle")(horizontalContainerStyle.asInstanceOf[js.Any])
    if (horizontalScrollbarStyle != null) __obj.updateDynamic("horizontalScrollbarStyle")(horizontalScrollbarStyle.asInstanceOf[js.Any])
    if (minScrollSize != null) __obj.updateDynamic("minScrollSize")(minScrollSize.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(stopScrollPropagation)) __obj.updateDynamic("stopScrollPropagation")(stopScrollPropagation.asInstanceOf[js.Any])
    if (!js.isUndefined(swapWheelAxes)) __obj.updateDynamic("swapWheelAxes")(swapWheelAxes.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (verticalContainerStyle != null) __obj.updateDynamic("verticalContainerStyle")(verticalContainerStyle.asInstanceOf[js.Any])
    if (verticalScrollbarStyle != null) __obj.updateDynamic("verticalScrollbarStyle")(verticalScrollbarStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScrollAreaProps
}

