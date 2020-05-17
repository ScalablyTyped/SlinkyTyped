package typingsSlinky.d3pie.d3pie

import typingsSlinky.d3pie.anon.CanvasHeight
import typingsSlinky.d3pie.anon.CanvasPadding
import typingsSlinky.d3pie.anon.Content
import typingsSlinky.d3pie.anon.Formatter
import typingsSlinky.d3pie.anon.HighlightLuminosity
import typingsSlinky.d3pie.anon.Location
import typingsSlinky.d3pie.anon.OnClickSegment
import typingsSlinky.d3pie.anon.PlaceholderParser
import typingsSlinky.d3pie.anon.locationleftID3PieTextOpt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ID3PieOptions extends js.Object {
  var callbacks: js.UndefOr[OnClickSegment] = js.native
  var data: Content = js.native
  var effects: js.UndefOr[HighlightLuminosity] = js.native
  var footer: js.UndefOr[locationleftID3PieTextOpt] = js.native
  var header: js.UndefOr[Location] = js.native
  var labels: js.UndefOr[Formatter] = js.native
  var misc: js.UndefOr[CanvasPadding] = js.native
  var size: js.UndefOr[CanvasHeight] = js.native
  var tooltips: js.UndefOr[PlaceholderParser] = js.native
}

object ID3PieOptions {
  @scala.inline
  def apply(data: Content): ID3PieOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ID3PieOptions]
  }
  @scala.inline
  implicit class ID3PieOptionsOps[Self <: ID3PieOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbacks(value: OnClickSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withEffects(value: HighlightLuminosity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: locationleftID3PieTextOpt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Formatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMisc(value: CanvasPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMisc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misc")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: CanvasHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltips(value: PlaceholderParser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.undefined)
        ret
    }
  }
  
}

