package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgChartSpec extends js.Object {
  var labels: js.UndefOr[ChartData] = js.native
  var nodeColor: js.UndefOr[Color] = js.native
  var nodeSize: js.UndefOr[String] = js.native
  var parentLabels: js.UndefOr[ChartData] = js.native
  var selectedNodeColor: js.UndefOr[Color] = js.native
  var tooltips: js.UndefOr[ChartData] = js.native
}

object OrgChartSpec {
  @scala.inline
  def apply(): OrgChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartSpec]
  }
  @scala.inline
  implicit class OrgChartSpecOps[Self <: OrgChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabels(value: ChartData): Self = {
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
    def withNodeColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLabels(value: ChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedNodeColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedNodeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltips(value: ChartData): Self = {
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

