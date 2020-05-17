package typingsSlinky.jointjs.mod.linkTools.Anchor

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.jointjs.mod.anchors.AnchorJSON
import typingsSlinky.jointjs.mod.attributes.NativeSVGAttributes
import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.LinkView
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.dia.ToolView
import typingsSlinky.jointjs.mod.linkTools.AnchorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.jointjs.mod.dia.ToolView.Options {
  var anchor: js.UndefOr[AnchorCallback[AnchorJSON]] = js.native
  var areaPadding: js.UndefOr[Double] = js.native
  var customAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.native
  var defaultAnchorAttributes: js.UndefOr[NativeSVGAttributes] = js.native
  var redundancyRemoval: js.UndefOr[Boolean] = js.native
  var restrictArea: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[AnchorCallback[Point]] = js.native
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
      value: (/* coords */ typingsSlinky.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => AnchorJSON
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
    def withAreaPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAnchorAttributes(value: NativeSVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAnchorAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAnchorAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAnchorAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAnchorAttributes(value: NativeSVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAnchorAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAnchorAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAnchorAttributes")(js.undefined)
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
    def withRestrictArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(
      value: (/* coords */ typingsSlinky.jointjs.mod.g.Point, /* view */ CellView, /* magnet */ SVGElement, /* type */ String, /* linkView */ LinkView, /* toolView */ ToolView) => Point
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
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

