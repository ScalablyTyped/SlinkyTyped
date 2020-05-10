package typingsSlinky.dygraphs.dygraphs

import typingsSlinky.dygraphs.Dygraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendData extends js.Object {
  /**
    * Dygraph object for this graph
    */
  var dygraph: Dygraph = js.native
  /**
    * Series data for the highlighted points
    */
  var series: js.Array[SeriesLegendData] = js.native
  /**
    * x value of highlighted points
    */
  var x: Double = js.native
  /**
    * Generated HTML for x value
    */
  var xHTML: String = js.native
}

object LegendData {
  @scala.inline
  def apply(dygraph: Dygraph, series: js.Array[SeriesLegendData], x: Double, xHTML: String): LegendData = {
    val __obj = js.Dynamic.literal(dygraph = dygraph.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xHTML = xHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendData]
  }
  @scala.inline
  implicit class LegendDataOps[Self <: LegendData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDygraph(value: Dygraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dygraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[SeriesLegendData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xHTML")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

