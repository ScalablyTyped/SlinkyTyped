package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomedOutEventArgs extends js.Object {
  /** Event parameters from map
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
  /** Returns zoom level value for which the map is zoomed.
    */
  var zoomLevel: js.UndefOr[js.Any] = js.native
}

object ZoomedOutEventArgs {
  @scala.inline
  def apply(): ZoomedOutEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomedOutEventArgs]
  }
  @scala.inline
  implicit class ZoomedOutEventArgsOps[Self <: ZoomedOutEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomLevel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(js.undefined)
        ret
    }
  }
  
}

