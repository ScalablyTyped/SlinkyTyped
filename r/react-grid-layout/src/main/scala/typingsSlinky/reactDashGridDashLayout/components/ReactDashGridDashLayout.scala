package typingsSlinky.reactDashGridDashLayout.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashGridDashLayout.Anon_H
import typingsSlinky.reactDashGridDashLayout.reactDashGridDashLayoutMod.Layout
import typingsSlinky.reactDashGridDashLayout.reactDashGridDashLayoutMod.ReactGridLayoutProps
import typingsSlinky.reactDashGridDashLayout.reactDashGridDashLayoutMod.^
import typingsSlinky.reactDashGridDashLayout.reactDashGridDashLayoutStrings.horizontal
import typingsSlinky.reactDashGridDashLayout.reactDashGridDashLayoutStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashGridDashLayout
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-grid-layout", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, cols, onDrop */
  def apply(
    autoSize: js.UndefOr[Boolean] = js.undefined,
    compactType: vertical | horizontal = null,
    containerPadding: js.Tuple2[Double, Double] = null,
    draggableCancel: String = null,
    draggableHandle: String = null,
    droppingItem: Anon_H = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isDroppable: js.UndefOr[Boolean] = js.undefined,
    isResizable: js.UndefOr[Boolean] = js.undefined,
    layout: js.Array[Layout] = null,
    margin: js.Tuple2[Double, Double] = null,
    maxRows: Int | Double = null,
    onDrag: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onDragStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onLayoutChange: /* layout */ js.Array[Layout] => Unit = null,
    onResize: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStart: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    onResizeStop: (/* layout */ js.Array[Layout], /* oldItem */ Layout, /* newItem */ Layout, /* placeholder */ Layout, /* event */ MouseEvent, /* element */ HTMLElement) => Unit = null,
    preventCollision: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null,
    style: CSSProperties = null,
    transformScale: Int | Double = null,
    useCSSTransforms: js.UndefOr[Boolean] = js.undefined,
    verticalCompact: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
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
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction6(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction6(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction6(onDragStop))
    if (onLayoutChange != null) __obj.updateDynamic("onLayoutChange")(js.Any.fromFunction1(onLayoutChange))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction6(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction6(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction6(onResizeStop))
    if (!js.isUndefined(preventCollision)) __obj.updateDynamic("preventCollision")(preventCollision.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transformScale != null) __obj.updateDynamic("transformScale")(transformScale.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSSTransforms)) __obj.updateDynamic("useCSSTransforms")(useCSSTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalCompact)) __obj.updateDynamic("verticalCompact")(verticalCompact.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashGridDashLayout.reactDashGridDashLayoutMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactGridLayoutProps
}

