package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesOrganizationNodesOptions extends js.Object {
  /**
    * (Highcharts) The color of the auto generated node.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The color index of the auto generated node, especially for
    * use in styled mode.
    */
  var colorIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) An optional column index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Note that
    * this option name is counter intuitive in inverted charts, like for
    * example an organization chart rendered top down. In this case the
    * "columns" are horizontal.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Individual data label for each node. The options are the
    * same as the ones for series.organization.dataLabels.
    */
  var dataLabels: js.UndefOr[
    SeriesOrganizationDataLabelsOptionsObject | js.Array[SeriesOrganizationDataLabelsOptionsObject]
  ] = js.native
  /**
    * (Highcharts) The job description for the node card, will be inserted by
    * the default `dataLabel.nodeFormatter`.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The id of the auto-generated node, refering to the `from` or
    * `to` setting of the link.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts) An image for the node card, will be inserted by the default
    * `dataLabel.nodeFormatter`.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Layout for the node's children. If `hanging`, this node's
    * children will hang below their parent, allowing a tighter packing of
    * nodes in the diagram.
    */
  var layout: js.UndefOr[SeriesOrganizationNodesLayoutValue] = js.native
  /**
    * (Highcharts) An optional level index of where to place the node. The
    * default behaviour is to place it next to the preceding node. Alias of
    * `nodes.column`, but in inverted sankeys and org charts, the levels are
    * laid out as rows.
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The name to display for the node in data labels and
    * tooltips. Use this when the name is different from the `id`. Where the id
    * must be unique for each node, this is not necessary for the name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (Highcharts) In a horizontal layout, the vertical offset of a node in
    * terms of weight. Positive values shift the node downwards, negative shift
    * it upwards. In a vertical layout, like organization chart, the offset is
    * horizontal.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size plus `nodePadding`.
    */
  var offset: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts) The job title for the node card, will be inserted by the
    * default `dataLabel.nodeFormatter`.
    */
  var title: js.UndefOr[String] = js.native
}

object SeriesOrganizationNodesOptions {
  @scala.inline
  def apply(): SeriesOrganizationNodesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesOrganizationNodesOptions]
  }
  @scala.inline
  implicit class SeriesOrganizationNodesOptionsOps[Self <: SeriesOrganizationNodesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLabels(
      value: SeriesOrganizationDataLabelsOptionsObject | js.Array[SeriesOrganizationDataLabelsOptionsObject]
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: SeriesOrganizationNodesLayoutValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
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
    @scala.inline
    def withOffset(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

