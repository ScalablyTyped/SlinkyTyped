package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesSankeyDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * The format string specifying what to show for _nodes_ in the sankey
    * diagram. By default the `nodeFormatter` returns `{point.name}`.
    */
  var nodeFormat: js.UndefOr[String] = js.native
  /**
    * Callback to format data labels for _nodes_ in the sankey diagram. The
    * `nodeFormat` option takes precedence over the `nodeFormatter`.
    */
  var nodeFormatter: js.UndefOr[SeriesSankeyDataLabelsFormatterCallbackFunction] = js.native
}

object SeriesSankeyDataLabelsOptionsObject {
  @scala.inline
  def apply(): SeriesSankeyDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSankeyDataLabelsOptionsObject]
  }
  @scala.inline
  implicit class SeriesSankeyDataLabelsOptionsObjectOps[Self <: SeriesSankeyDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeFormatter(value: SeriesSankeyDataLabelsFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFormatter")(js.undefined)
        ret
    }
  }
  
}

