package typingsSlinky.reactDraggable.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import typingsSlinky.reactDraggable.reactDraggableStrings.both
import typingsSlinky.reactDraggable.reactDraggableStrings.none
import typingsSlinky.reactDraggable.reactDraggableStrings.x
import typingsSlinky.reactDraggable.reactDraggableStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProps extends DraggableCoreProps {
  var axis: both | x | y | none = js.native
  var bounds: DraggableBounds | String | `false` = js.native
  var defaultClassName: String = js.native
  var defaultClassNameDragged: String = js.native
  var defaultClassNameDragging: String = js.native
  var defaultPosition: ControlPosition = js.native
  var position: ControlPosition = js.native
  var positionOffset: PositionOffsetControlPosition = js.native
}

object DraggableProps {
  @scala.inline
  def apply(
    allowAnyClick: Boolean,
    axis: both | x | y | none,
    bounds: DraggableBounds | String | `false`,
    cancel: String,
    defaultClassName: String,
    defaultClassNameDragged: String,
    defaultClassNameDragging: String,
    defaultPosition: ControlPosition,
    disabled: Boolean,
    enableUserSelectHack: Boolean,
    grid: js.Tuple2[Double, Double],
    handle: String,
    offsetParent: HTMLElement,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onMouseDown: MouseEvent => Unit,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    position: ControlPosition,
    positionOffset: PositionOffsetControlPosition,
    scale: Double
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], defaultClassName = defaultClassName.asInstanceOf[js.Any], defaultClassNameDragged = defaultClassNameDragged.asInstanceOf[js.Any], defaultClassNameDragging = defaultClassNameDragging.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1(onMouseDown), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), position = position.asInstanceOf[js.Any], positionOffset = positionOffset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
  @scala.inline
  implicit class DraggablePropsOps[Self <: DraggableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: both | typingsSlinky.reactDraggable.reactDraggableStrings.x | y | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: DraggableBounds | String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultClassNameDragged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassNameDragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultClassNameDragging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassNameDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionOffset(value: PositionOffsetControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

