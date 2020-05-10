package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A &lt;a href=&quot;/chart/interactive/docs/gallery/piechart&quot;&gt;pie
  * chart&lt;/a&gt;.
  */
@js.native
trait SchemaPieChartSpec extends js.Object {
  /**
    * The data that covers the domain of the pie chart.
    */
  var domain: js.UndefOr[SchemaChartData] = js.native
  /**
    * Where the legend of the pie chart should be drawn.
    */
  var legendPosition: js.UndefOr[String] = js.native
  /**
    * The size of the hole in the pie chart.
    */
  var pieHole: js.UndefOr[Double] = js.native
  /**
    * The data that covers the one and only series of the pie chart.
    */
  var series: js.UndefOr[SchemaChartData] = js.native
  /**
    * True if the pie is three dimensional.
    */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}

object SchemaPieChartSpec {
  @scala.inline
  def apply(): SchemaPieChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPieChartSpec]
  }
  @scala.inline
  implicit class SchemaPieChartSpecOps[Self <: SchemaPieChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: SchemaChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPieHole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieHole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieHole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieHole")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: SchemaChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withThreeDimensional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDimensional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreeDimensional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeDimensional")(js.undefined)
        ret
    }
  }
  
}

