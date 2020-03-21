package typingsSlinky.reactDraggable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDraggable.PartialDraggableProps
import typingsSlinky.reactDraggable.mod.ControlPosition
import typingsSlinky.reactDraggable.mod.DraggableBounds
import typingsSlinky.reactDraggable.mod.DraggableData
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.mod.PositionOffsetControlPosition
import typingsSlinky.reactDraggable.mod.default
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import typingsSlinky.reactDraggable.reactDraggableStrings.both
import typingsSlinky.reactDraggable.reactDraggableStrings.none
import typingsSlinky.reactDraggable.reactDraggableStrings.x
import typingsSlinky.reactDraggable.reactDraggableStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDraggable
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-draggable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    allowAnyClick: js.UndefOr[Boolean] = js.undefined,
    axis: both | x | y | none = null,
    bounds: DraggableBounds | String | `false` = null,
    cancel: String = null,
    defaultClassName: String = null,
    defaultClassNameDragged: String = null,
    defaultClassNameDragging: String = null,
    defaultPosition: ControlPosition = null,
    enableUserSelectHack: js.UndefOr[Boolean] = js.undefined,
    grid: js.Tuple2[Double, Double] = null,
    handle: String = null,
    offsetParent: HTMLElement = null,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onMouseDown: /* e */ MouseEvent => Unit = null,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false` = null,
    position: ControlPosition = null,
    positionOffset: PositionOffsetControlPosition = null,
    scale: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAnyClick)) __obj.updateDynamic("allowAnyClick")(allowAnyClick.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (defaultClassName != null) __obj.updateDynamic("defaultClassName")(defaultClassName.asInstanceOf[js.Any])
    if (defaultClassNameDragged != null) __obj.updateDynamic("defaultClassNameDragged")(defaultClassNameDragged.asInstanceOf[js.Any])
    if (defaultClassNameDragging != null) __obj.updateDynamic("defaultClassNameDragging")(defaultClassNameDragging.asInstanceOf[js.Any])
    if (defaultPosition != null) __obj.updateDynamic("defaultPosition")(defaultPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUserSelectHack)) __obj.updateDynamic("enableUserSelectHack")(enableUserSelectHack.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction2(onDrag))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction2(onStop))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionOffset != null) __obj.updateDynamic("positionOffset")(positionOffset.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDraggable.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PartialDraggableProps
}

