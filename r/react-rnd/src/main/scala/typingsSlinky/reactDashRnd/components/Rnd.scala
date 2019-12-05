package typingsSlinky.reactDashRnd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reDashResizable.reDashResizableMod.ResizeDirection
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashDraggable.reactDashDraggableMod.DraggableData
import typingsSlinky.reactDashDraggable.reactDashDraggableMod.DraggableEvent
import typingsSlinky.reactDashDraggable.reactDashDraggableNumbers.`false`
import typingsSlinky.reactDashRnd.Anon_X
import typingsSlinky.reactDashRnd.reactDashRndMod.Grid
import typingsSlinky.reactDashRnd.reactDashRndMod.HandleClasses
import typingsSlinky.reactDashRnd.reactDashRndMod.HandleComponent
import typingsSlinky.reactDashRnd.reactDashRndMod.HandleStyles
import typingsSlinky.reactDashRnd.reactDashRndMod.Position
import typingsSlinky.reactDashRnd.reactDashRndMod.ResizableDelta
import typingsSlinky.reactDashRnd.reactDashRndMod.ResizeEnable
import typingsSlinky.reactDashRnd.reactDashRndMod.Size
import typingsSlinky.reactDashRnd.reactDashRndStrings.both
import typingsSlinky.reactDashRnd.reactDashRndStrings.none
import typingsSlinky.reactDashRnd.reactDashRndStrings.x
import typingsSlinky.reactDashRnd.reactDashRndStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rnd
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRnd.reactDashRndMod.Rnd] {
  @JSImport("react-rnd", "Rnd")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onMouseDown, onMouseUp */
  def apply(
    bounds: String = null,
    cancel: String = null,
    default: Anon_X with Size = null,
    disableDragging: js.UndefOr[Boolean] = js.undefined,
    dragAxis: x | y | both | none = null,
    dragGrid: Grid = null,
    dragHandleClassName: String = null,
    enableResizing: ResizeEnable = null,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    lockAspectRatio: Boolean | Double = null,
    lockAspectRatioExtraHeight: Int | Double = null,
    lockAspectRatioExtraWidth: Int | Double = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    minHeight: Double | String = null,
    minWidth: Double | String = null,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onDragStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onDragStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit = null,
    onResizeStart: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Unit = null,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit = null,
    position: Anon_X = null,
    resizeGrid: Grid = null,
    resizeHandleClasses: HandleClasses = null,
    resizeHandleComponent: HandleComponent = null,
    resizeHandleStyles: HandleStyles = null,
    resizeHandleWrapperClass: String = null,
    resizeHandleWrapperStyle: CSSProperties = null,
    scale: Int | Double = null,
    size: Size = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashRnd.reactDashRndMod.Rnd] = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDragging)) __obj.updateDynamic("disableDragging")(disableDragging.asInstanceOf[js.Any])
    if (dragAxis != null) __obj.updateDynamic("dragAxis")(dragAxis.asInstanceOf[js.Any])
    if (dragGrid != null) __obj.updateDynamic("dragGrid")(dragGrid.asInstanceOf[js.Any])
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName.asInstanceOf[js.Any])
    if (enableResizing != null) __obj.updateDynamic("enableResizing")(enableResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (lockAspectRatio != null) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (lockAspectRatioExtraHeight != null) __obj.updateDynamic("lockAspectRatioExtraHeight")(lockAspectRatioExtraHeight.asInstanceOf[js.Any])
    if (lockAspectRatioExtraWidth != null) __obj.updateDynamic("lockAspectRatioExtraWidth")(lockAspectRatioExtraWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2(onDrag))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2(onDragStart))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction2(onDragStop))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction5(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction5(onResizeStop))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (resizeGrid != null) __obj.updateDynamic("resizeGrid")(resizeGrid.asInstanceOf[js.Any])
    if (resizeHandleClasses != null) __obj.updateDynamic("resizeHandleClasses")(resizeHandleClasses.asInstanceOf[js.Any])
    if (resizeHandleComponent != null) __obj.updateDynamic("resizeHandleComponent")(resizeHandleComponent.asInstanceOf[js.Any])
    if (resizeHandleStyles != null) __obj.updateDynamic("resizeHandleStyles")(resizeHandleStyles.asInstanceOf[js.Any])
    if (resizeHandleWrapperClass != null) __obj.updateDynamic("resizeHandleWrapperClass")(resizeHandleWrapperClass.asInstanceOf[js.Any])
    if (resizeHandleWrapperStyle != null) __obj.updateDynamic("resizeHandleWrapperStyle")(resizeHandleWrapperStyle.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashRnd.reactDashRndMod.Props
}

