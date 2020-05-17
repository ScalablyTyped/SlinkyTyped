package typingsSlinky.reactAvatarEditor.mod

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarEditorProps extends js.Object {
  var border: js.UndefOr[Double | js.Array[Double]] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var color: js.UndefOr[js.Array[Double]] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var disableBoundaryChecks: js.UndefOr[Boolean] = js.native
  var disableDrop: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var image: String | File = js.native
  var onDropFile: js.UndefOr[js.Function1[/* event */ DragEvent, Unit]] = js.native
  var onImageChange: js.UndefOr[js.Function0[Unit]] = js.native
  var onImageReady: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadFailure: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onLoadSuccess: js.UndefOr[js.Function1[/* imgInfo */ ImageState, Unit]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onMouseUp: js.UndefOr[js.Function0[Unit]] = js.native
  var onPositionChange: js.UndefOr[js.Function1[/* position */ Position, Unit]] = js.native
  var position: js.UndefOr[Position] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AvatarEditorProps {
  @scala.inline
  def apply(image: String | File): AvatarEditorProps = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarEditorProps]
  }
  @scala.inline
  implicit class AvatarEditorPropsOps[Self <: AvatarEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageFile(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String | File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
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
    def withColor(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableBoundaryChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBoundaryChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableBoundaryChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBoundaryChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropFile(value: /* event */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnImageChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageReady(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImageReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadFailure(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadSuccess(value: /* imgInfo */ ImageState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPositionChange(value: /* position */ Position => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPositionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPositionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
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
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
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
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

