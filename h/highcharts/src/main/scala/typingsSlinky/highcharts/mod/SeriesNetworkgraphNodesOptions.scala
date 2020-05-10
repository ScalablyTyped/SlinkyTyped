package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesNetworkgraphNodesOptions extends js.Object {
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Individual data label for each node. The options are the
    * same as the ones for series.networkgraph.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesNetworkgraphDataLabelsOptionsObject | js.Array[SeriesNetworkgraphDataLabelsOptionsObject]
  ] = js.native
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Mass of the node. By default, each node has mass equal to
    * it's marker radius . Mass is used to determine how two connected nodes
    * should affect each other:
    *
    * Attractive force is multiplied by the ratio of two connected nodes; if a
    * big node has weights twice as the small one, then the small one will move
    * towards the big one twice faster than the big one to the small one .
    */
  var mass: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.native
}

object SeriesNetworkgraphNodesOptions {
  @scala.inline
  def apply(): SeriesNetworkgraphNodesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesNetworkgraphNodesOptions]
  }
  @scala.inline
  implicit class SeriesNetworkgraphNodesOptionsOps[Self <: SeriesNetworkgraphNodesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLabels(
      value: SeriesNetworkgraphDataLabelsOptionsObject | js.Array[SeriesNetworkgraphDataLabelsOptionsObject]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mass")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

