package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zoom extends js.Object {
  /** Used to zoom-in or zoom-out the diagram based on the point.
    */
  var focusPoint: js.UndefOr[ConnectorsSourcePoint] = js.native
  /** Used to zoom-in or zoom-out the diagram.
    */
  var zoomCommand: js.UndefOr[ZoomCommand] = js.native
  /** Used to increase the zoom-in or zoom-out based on the zoom factor value.
    */
  var zoomFactor: js.UndefOr[Double] = js.native
}

object Zoom {
  @scala.inline
  def apply(): Zoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zoom]
  }
  @scala.inline
  implicit class ZoomOps[Self <: Zoom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusPoint(value: ConnectorsSourcePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomCommand(value: ZoomCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
  }
  
}

