package typingsSlinky.jointjs.mod.linkTools.Segments

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.anchors.AnchorJSON
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.LinkView
import typingsSlinky.jointjs.mod.dia.ToolView
import typingsSlinky.jointjs.mod.g.Point
import typingsSlinky.jointjs.mod.linkTools.AnchorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
  var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.native
  var handleClass: js.UndefOr[js.Any] = js.native
  var redundancyRemoval: js.UndefOr[Boolean] = js.native
  var segmentLengthThreshold: js.UndefOr[Double] = js.native
  var snapHandle: js.UndefOr[Boolean] = js.native
  var snapRadius: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(
      value: (/* coords */ Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRedundancyRemoval(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundancyRemoval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedundancyRemoval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundancyRemoval")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentLengthThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentLengthThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentLengthThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentLengthThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapRadius")(js.undefined)
        ret
    }
  }
  
}

