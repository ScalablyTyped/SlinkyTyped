package typingsSlinky.nivoVoronoi.mod

import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.bounds
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.cells
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.links
import typingsSlinky.nivoVoronoi.nivoVoronoiStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiProps extends js.Object {
  var cellLineColor: js.UndefOr[String] = js.native
  var cellLineWidth: js.UndefOr[Double] = js.native
  var data: js.Array[VoronoiDatum] = js.native
  var enableCells: js.UndefOr[Boolean] = js.native
  var enableLinks: js.UndefOr[Boolean] = js.native
  var enablePoints: js.UndefOr[Boolean] = js.native
  var layers: js.UndefOr[js.Array[links | cells | points | bounds | VoronoiCustomLayer]] = js.native
  var linkLineColor: js.UndefOr[String] = js.native
  var linkLineWidth: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Box] = js.native
  var pointColor: js.UndefOr[String] = js.native
  var pointSize: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var xDomain: js.UndefOr[VoronoiDomain] = js.native
  var yDomain: js.UndefOr[VoronoiDomain] = js.native
}

object VoronoiProps {
  @scala.inline
  def apply(data: js.Array[VoronoiDatum]): VoronoiProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiProps]
  }
  @scala.inline
  implicit class VoronoiPropsOps[Self <: VoronoiProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[VoronoiDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCellLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCells")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePoints")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[links | cells | points | bounds | VoronoiCustomLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPointColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withXDomain(value: VoronoiDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withYDomain(value: VoronoiDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yDomain")(js.undefined)
        ret
    }
  }
  
}

