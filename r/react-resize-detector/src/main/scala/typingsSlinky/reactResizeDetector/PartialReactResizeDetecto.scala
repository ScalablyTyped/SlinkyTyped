package typingsSlinky.reactResizeDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-resize-detector.react-resize-detector.ReactResizeDetectorDimensions> */
@js.native
trait PartialReactResizeDetecto extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PartialReactResizeDetecto {
  @scala.inline
  def apply(): PartialReactResizeDetecto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReactResizeDetecto]
  }
  @scala.inline
  implicit class PartialReactResizeDetectoOps[Self <: PartialReactResizeDetecto] (val x: Self) extends AnyVal {
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
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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

