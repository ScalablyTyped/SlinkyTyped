package typingsSlinky.reactDraggable.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactDraggable.mod.ControlPosition
import typingsSlinky.reactDraggable.mod.DraggableBounds
import typingsSlinky.reactDraggable.mod.DraggableData
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.mod.DraggableEventHandler
import typingsSlinky.reactDraggable.mod.PositionOffsetControlPosition
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import typingsSlinky.reactDraggable.reactDraggableStrings.both
import typingsSlinky.reactDraggable.reactDraggableStrings.none
import typingsSlinky.reactDraggable.reactDraggableStrings.x
import typingsSlinky.reactDraggable.reactDraggableStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-draggable.react-draggable.DraggableProps> */
@js.native
trait PartialDraggableProps extends js.Object {
  var allowAnyClick: js.UndefOr[Boolean] = js.native
  var axis: js.UndefOr[both | x | y | none] = js.native
  var bounds: js.UndefOr[DraggableBounds | String | `false`] = js.native
  var cancel: js.UndefOr[String] = js.native
  var defaultClassName: js.UndefOr[String] = js.native
  var defaultClassNameDragged: js.UndefOr[String] = js.native
  var defaultClassNameDragging: js.UndefOr[String] = js.native
  var defaultPosition: js.UndefOr[ControlPosition] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enableUserSelectHack: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var handle: js.UndefOr[String] = js.native
  var offsetParent: js.UndefOr[HTMLElement] = js.native
  var onDrag: js.UndefOr[DraggableEventHandler] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onStart: js.UndefOr[DraggableEventHandler] = js.native
  var onStop: js.UndefOr[DraggableEventHandler] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var positionOffset: js.UndefOr[PositionOffsetControlPosition] = js.native
  var scale: js.UndefOr[Double] = js.native
}

object PartialDraggableProps {
  @scala.inline
  def apply(): PartialDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDraggableProps]
  }
  @scala.inline
  implicit class PartialDraggablePropsOps[Self <: PartialDraggableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAnyClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAnyClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAnyClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAnyClick")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: both | typingsSlinky.reactDraggable.reactDraggableStrings.x | y | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: DraggableBounds | String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClassNameDragged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassNameDragged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClassNameDragged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassNameDragged")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClassNameDragging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassNameDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClassNameDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClassNameDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUserSelectHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUserSelectHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUserSelectHack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUserSelectHack")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetParent(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* e */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionOffset(value: PositionOffsetControlPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

