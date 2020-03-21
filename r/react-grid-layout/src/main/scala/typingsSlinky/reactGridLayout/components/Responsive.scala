package typingsSlinky.reactGridLayout.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactGridLayout.AnonE
import typingsSlinky.reactGridLayout.AnonH
import typingsSlinky.reactGridLayout.mod.Layout
import typingsSlinky.reactGridLayout.mod.Layouts
import typingsSlinky.reactGridLayout.mod.ResponsiveProps
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.horizontal
import typingsSlinky.reactGridLayout.reactGridLayoutStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Responsive
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactGridLayout.mod.Responsive] {
  @JSImport("react-grid-layout", "Responsive")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    autoSize: js.UndefOr[Boolean] = js.undefined,
    compactType: vertical | horizontal = null,
    containerPadding: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]]) = null,
    draggableCancel: String = null,
    draggableHandle: String = null,
    droppingItem: AnonH = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDroppable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    layouts: Layouts = null,
    margin: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]]) = null,
    maxRows: Int | Double = null,
    onBreakpointChange: (/* newBreakpoint */ String, /* newCols */ Double) => Unit = null,
    onDrag: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDrop: /* elemParams */ AnonE => Unit = null,
    onLayoutChange: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Unit = null,
    onResize: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onWidthChange: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Unit = null,
    preventCollision: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null,
    transformScale: Int | Double = null,
    useCSSTransforms: js.UndefOr[Boolean] = js.undefined,
    verticalCompact: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactGridLayout.mod.Responsive] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (compactType != null) __obj.updateDynamic("compactType")(compactType.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (draggableCancel != null) __obj.updateDynamic("draggableCancel")(draggableCancel.asInstanceOf[js.Any])
    if (draggableHandle != null) __obj.updateDynamic("draggableHandle")(draggableHandle.asInstanceOf[js.Any])
    if (droppingItem != null) __obj.updateDynamic("droppingItem")(droppingItem.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(isDroppable)) __obj.updateDynamic("isDroppable")(isDroppable.asInstanceOf[js.Any])
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable.asInstanceOf[js.Any])
    if (layouts != null) __obj.updateDynamic("layouts")(layouts.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (onBreakpointChange != null) __obj.updateDynamic("onBreakpointChange")(js.Any.fromFunction2(onBreakpointChange))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction6(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction6(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction6(onDragStop))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onLayoutChange != null) __obj.updateDynamic("onLayoutChange")(js.Any.fromFunction2(onLayoutChange))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction6(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction6(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction6(onResizeStop))
    if (onWidthChange != null) __obj.updateDynamic("onWidthChange")(js.Any.fromFunction4(onWidthChange))
    if (!js.isUndefined(preventCollision)) __obj.updateDynamic("preventCollision")(preventCollision.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (transformScale != null) __obj.updateDynamic("transformScale")(transformScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSSTransforms)) __obj.updateDynamic("useCSSTransforms")(useCSSTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCompact)) __obj.updateDynamic("verticalCompact")(verticalCompact.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactGridLayout.mod.Responsive] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactGridLayout.mod.Responsive](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ResponsiveProps
}

