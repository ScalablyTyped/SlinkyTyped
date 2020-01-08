package typingsSlinky.reactDashSortableDashPane.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashMotion.reactDashMotionMod.SpringHelperConfig
import typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.PaneKey
import typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.PaneResizeDirection
import typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.PaneSize
import typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.SortablePaneProps
import typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneStrings.horizontal
import typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SortablePane
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.SortablePane
    ] {
  @JSImport("react-sortable-pane", "SortablePane")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    defaultOrder: js.Array[String] = null,
    direction: horizontal | vertical = null,
    disableEffect: js.UndefOr[Boolean] = js.undefined,
    dragHandleClassName: String = null,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    onDragStart: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Unit = null,
    onDragStop: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Unit = null,
    onOrderChange: /* order */ js.Array[String] => Unit = null,
    onResize: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit = null,
    onResizeStart: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Unit = null,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit = null,
    order: js.Array[String] = null,
    springConfig: SpringHelperConfig = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.SortablePane
  ] = {
    val __obj = js.Dynamic.literal()
    if (defaultOrder != null) __obj.updateDynamic("defaultOrder")(defaultOrder.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEffect)) __obj.updateDynamic("disableEffect")(disableEffect.asInstanceOf[js.Any])
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction3(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction4(onDragStop))
    if (onOrderChange != null) __obj.updateDynamic("onOrderChange")(js.Any.fromFunction1(onOrderChange))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction5(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction5(onResizeStop))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.SortablePane
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSortableDashPane.reactDashSortableDashPaneMod.SortablePane](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SortablePaneProps
}

