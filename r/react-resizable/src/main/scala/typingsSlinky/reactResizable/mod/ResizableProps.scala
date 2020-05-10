package typingsSlinky.reactResizable.mod

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableProps extends js.Object {
  var axis: js.UndefOr[Axis] = js.native
  var className: js.UndefOr[String] = js.native
  var draggableOpts: js.UndefOr[js.Any] = js.native
  var handle: js.UndefOr[TagMod[Any] | (js.Function1[/* resizeHandle */ ResizeHandle, TagMod[Any]])] = js.native
  var handleSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var height: Double = js.native
  var lockAspectRatio: js.UndefOr[Boolean] = js.native
  var maxConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var minConstraints: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var onResize: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Event_, Element], /* data */ ResizeCallbackData, _]
  ] = js.native
  var onResizeStart: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Event_, Element], /* data */ ResizeCallbackData, _]
  ] = js.native
  var onResizeStop: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[Event_, Element], /* data */ ResizeCallbackData, _]
  ] = js.native
  var resizeHandles: js.UndefOr[js.Array[ResizeHandle]] = js.native
  var width: Double = js.native
}

object ResizableProps {
  @scala.inline
  def apply(height: Double, width: Double): ResizableProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableProps]
  }
  @scala.inline
  implicit class ResizablePropsOps[Self <: ResizableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxis(value: Axis): Self = {
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableOpts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggableOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleFunction1(value: /* resizeHandle */ ResizeHandle => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandle(value: TagMod[Any] | (js.Function1[/* resizeHandle */ ResizeHandle, TagMod[Any]])): Self = {
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
    def withHandleSize(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConstraints(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withMinConstraints(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: (/* e */ SyntheticEvent[Event_, Element], /* data */ ResizeCallbackData) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStart(value: (/* e */ SyntheticEvent[Event_, Element], /* data */ ResizeCallbackData) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStop(value: (/* e */ SyntheticEvent[Event_, Element], /* data */ ResizeCallbackData) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandles(value: js.Array[ResizeHandle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandles")(js.undefined)
        ret
    }
  }
  
}

