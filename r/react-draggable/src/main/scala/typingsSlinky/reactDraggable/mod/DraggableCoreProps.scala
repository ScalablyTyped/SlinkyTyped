package typingsSlinky.reactDraggable.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableCoreProps extends js.Object {
  var allowAnyClick: Boolean = js.native
  var cancel: String = js.native
  var disabled: Boolean = js.native
  var enableUserSelectHack: Boolean = js.native
  var grid: js.Tuple2[Double, Double] = js.native
  var handle: String = js.native
  var offsetParent: HTMLElement = js.native
  var onDrag: DraggableEventHandler = js.native
  var onStart: DraggableEventHandler = js.native
  var onStop: DraggableEventHandler = js.native
  var scale: Double = js.native
  def onMouseDown(e: MouseEvent): Unit = js.native
}

object DraggableCoreProps {
  @scala.inline
  def apply(
    allowAnyClick: Boolean,
    cancel: String,
    disabled: Boolean,
    enableUserSelectHack: Boolean,
    grid: js.Tuple2[Double, Double],
    handle: String,
    offsetParent: HTMLElement,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onMouseDown: MouseEvent => Unit,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    scale: Double
  ): DraggableCoreProps = {
    val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1(onMouseDown), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableCoreProps]
  }
  @scala.inline
  implicit class DraggableCorePropsOps[Self <: DraggableCoreProps] (val x: Self) extends AnyVal {
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
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableUserSelectHack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUserSelectHack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetParent(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnMouseDown(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

