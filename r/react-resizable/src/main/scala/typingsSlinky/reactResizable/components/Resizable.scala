package typingsSlinky.reactResizable.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactResizable.mod.Axis
import typingsSlinky.reactResizable.mod.ResizableProps
import typingsSlinky.reactResizable.mod.ResizeCallbackData
import typingsSlinky.reactResizable.mod.ResizeHandle
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizable
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactResizable.mod.Resizable] {
  @JSImport("react-resizable", "Resizable")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    height: Double,
    width: Double,
    axis: Axis = null,
    draggableOpts: js.Any = null,
    handle: TagMod[Any] | (js.Function1[/* resizeHandle */ ResizeHandle, TagMod[Any]]) = null,
    handleSize: js.Tuple2[Double, Double] = null,
    lockAspectRatio: js.UndefOr[Boolean] = js.undefined,
    maxConstraints: js.Tuple2[Double, Double] = null,
    minConstraints: js.Tuple2[Double, Double] = null,
    onResize: (/* e */ SyntheticEvent[Event_, org.scalajs.dom.raw.Element], /* data */ ResizeCallbackData) => _ = null,
    onResizeStart: (/* e */ SyntheticEvent[Event_, org.scalajs.dom.raw.Element], /* data */ ResizeCallbackData) => _ = null,
    onResizeStop: (/* e */ SyntheticEvent[Event_, org.scalajs.dom.raw.Element], /* data */ ResizeCallbackData) => _ = null,
    resizeHandles: js.Array[ResizeHandle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactResizable.mod.Resizable] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (draggableOpts != null) __obj.updateDynamic("draggableOpts")(draggableOpts.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (handleSize != null) __obj.updateDynamic("handleSize")(handleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(lockAspectRatio)) __obj.updateDynamic("lockAspectRatio")(lockAspectRatio.asInstanceOf[js.Any])
    if (maxConstraints != null) __obj.updateDynamic("maxConstraints")(maxConstraints.asInstanceOf[js.Any])
    if (minConstraints != null) __obj.updateDynamic("minConstraints")(minConstraints.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2(onResize))
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(js.Any.fromFunction2(onResizeStart))
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(js.Any.fromFunction2(onResizeStop))
    if (resizeHandles != null) __obj.updateDynamic("resizeHandles")(resizeHandles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ResizableProps
}

