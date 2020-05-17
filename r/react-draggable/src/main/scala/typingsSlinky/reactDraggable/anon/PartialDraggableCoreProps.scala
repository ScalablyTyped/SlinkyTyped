package typingsSlinky.reactDraggable.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.reactDraggable.mod.DraggableData
import typingsSlinky.reactDraggable.mod.DraggableEvent
import typingsSlinky.reactDraggable.mod.DraggableEventHandler
import typingsSlinky.reactDraggable.reactDraggableBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-draggable.react-draggable.DraggableCoreProps> */
@js.native
trait PartialDraggableCoreProps extends js.Object {
  var allowAnyClick: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enableUserSelectHack: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var handle: js.UndefOr[String] = js.native
  var offsetParent: js.UndefOr[HTMLElement] = js.native
  var onDrag: js.UndefOr[DraggableEventHandler] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
  var onStart: js.UndefOr[DraggableEventHandler] = js.native
  var onStop: js.UndefOr[DraggableEventHandler] = js.native
  var scale: js.UndefOr[Double] = js.native
}

object PartialDraggableCoreProps {
  @scala.inline
  def apply(): PartialDraggableCoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDraggableCoreProps]
  }
  @scala.inline
  implicit class PartialDraggableCorePropsOps[Self <: PartialDraggableCoreProps] (val x: Self) extends AnyVal {
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

