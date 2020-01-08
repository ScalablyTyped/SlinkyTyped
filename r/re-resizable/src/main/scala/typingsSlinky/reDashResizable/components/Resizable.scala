package typingsSlinky.reDashResizable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reDashResizable.Anon_X
import typingsSlinky.reDashResizable.libResizerMod.Direction
import typingsSlinky.reDashResizable.reDashResizableMod.Enable
import typingsSlinky.reDashResizable.reDashResizableMod.HandleClassName
import typingsSlinky.reDashResizable.reDashResizableMod.HandleComponent
import typingsSlinky.reDashResizable.reDashResizableMod.HandleStyles
import typingsSlinky.reDashResizable.reDashResizableMod.NumberSize
import typingsSlinky.reDashResizable.reDashResizableMod.ResizableProps
import typingsSlinky.reDashResizable.reDashResizableMod.Size
import typingsSlinky.reDashResizable.reDashResizableStrings.parent
import typingsSlinky.reDashResizable.reDashResizableStrings.window
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reDashResizable.reDashResizableMod.Resizable] {
  @JSImport("re-resizable", "Resizable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    bounds: parent | window | HTMLElement = null,
    defaultSize: Size = null,
    enable: Enable = null,
    grid: js.Tuple2[Double, Double] = null,
    handleClasses: HandleClassName = null,
    handleComponent: HandleComponent = null,
    handleStyles: HandleStyles = null,
    handleWrapperClass: String = null,
    handleWrapperStyle: CSSProperties = null,
    lockAspectRatio: Boolean | Double = null,
    lockAspectRatioExtraHeight: Int | Double = null,
    lockAspectRatioExtraWidth: Int | Double = null,
    maxHeight: String | Double = null,
    maxWidth: String | Double = null,
    minHeight: String | Double = null,
    minWidth: String | Double = null,
    onResize: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit = null,
    onResizeStart: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction, /* elementRef */ HTMLDivElement) => Unit | Boolean = null,
    onResizeStop: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit = null,
    resizeRatio: Int | Double = null,
    scale: Int | Double = null,
    size: Size = null,
    snap: Anon_X = null,
    snapGap: Int | Double = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reDashResizable.reDashResizableMod.Resizable] = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handleClasses != null) __obj.updateDynamic("handleClasses")(handleClasses.asInstanceOf[js.Any])
    if (handleComponent != null) __obj.updateDynamic("handleComponent")(handleComponent.asInstanceOf[js.Any])
    if (handleStyles != null) __obj.updateDynamic("handleStyles")(handleStyles.asInstanceOf[js.Any])
    if (handleWrapperClass != null) __obj.updateDynamic("handleWrapperClass")(handleWrapperClass.asInstanceOf[js.Any])
    if (handleWrapperStyle != null) __obj.updateDynamic("handleWrapperStyle")(handleWrapperStyle.asInstanceOf[js.Any])
    if (lockAspectRatio != null) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (lockAspectRatioExtraHeight != null) __obj.updateDynamic("lockAspectRatioExtraHeight")(lockAspectRatioExtraHeight.asInstanceOf[js.Any])
    if (lockAspectRatioExtraWidth != null) __obj.updateDynamic("lockAspectRatioExtraWidth")(lockAspectRatioExtraWidth.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction4(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction3(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction4(onResizeStop))
    if (resizeRatio != null) __obj.updateDynamic("resizeRatio")(resizeRatio.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snapGap != null) __obj.updateDynamic("snapGap")(snapGap.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reDashResizable.reDashResizableMod.Resizable] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reDashResizable.reDashResizableMod.Resizable](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ResizableProps
}

