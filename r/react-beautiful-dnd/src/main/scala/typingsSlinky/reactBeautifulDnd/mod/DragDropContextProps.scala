package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropContextProps extends js.Object {
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.native
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.native
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.native
  var sensors: js.UndefOr[js.Array[Sensor]] = js.native
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit = js.native
}

object DragDropContextProps {
  @scala.inline
  def apply(onDragEnd: (DropResult, ResponderProvided) => Unit): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[DragDropContextProps]
  }
  @scala.inline
  implicit class DragDropContextPropsOps[Self <: DragDropContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDragEnd(value: (DropResult, ResponderProvided) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeDragStart(value: /* initial */ DragStart => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragUpdate(value: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSensors(value: js.Array[Sensor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensors")(js.undefined)
        ret
    }
  }
  
}

