package typingsSlinky.openlayers.mod.olx.control

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var delta: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var target: js.UndefOr[Element] = js.native
  var zoomInLabel: js.UndefOr[String | Node] = js.native
  var zoomInTipLabel: js.UndefOr[String] = js.native
  var zoomOutLabel: js.UndefOr[String | Node] = js.native
  var zoomOutTipLabel: js.UndefOr[String] = js.native
}

object ZoomOptions {
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomInLabelNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomInLabel(value: String | Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomInLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomInTipLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInTipLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomInTipLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInTipLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOutLabelNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomOutLabel(value: String | Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOutTipLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutTipLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOutTipLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutTipLabel")(js.undefined)
        ret
    }
  }
  
}

