package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesNetworkgraphDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * Callback JavaScript function to format the data label for a node. Note
    * that if a `format` is defined, the format takes precedence and the
    * formatter is ignored.
    */
  @JSName("formatter")
  var formatter_SeriesNetworkgraphDataLabelsOptionsObject: js.UndefOr[SeriesNetworkgraphDataLabelsFormatterCallbackFunction] = js.native
  /**
    * The format string specifying what to show for _links_ in the
    * networkgraph. (Default: `undefined`)
    */
  var linkFormat: js.UndefOr[String] = js.native
  /**
    * Callback to format data labels for _links_ in the sankey diagram. The
    * `linkFormat` option takes precedence over the `linkFormatter`.
    */
  var linkFormatter: js.UndefOr[SeriesNetworkgraphDataLabelsFormatterCallbackFunction] = js.native
  /**
    * Options for a _link_ label text which should follow link connection.
    * Border and background are disabled for a label that follows a path.
    * **Note:** Only SVG-based renderer supports this option. Setting `useHTML`
    * to true will disable this option.
    */
  var linkTextPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.native
}

object SeriesNetworkgraphDataLabelsOptionsObject {
  @scala.inline
  def apply(): SeriesNetworkgraphDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesNetworkgraphDataLabelsOptionsObject]
  }
  @scala.inline
  implicit class SeriesNetworkgraphDataLabelsOptionsObjectOps[Self <: SeriesNetworkgraphDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatter(value: SeriesNetworkgraphDataLabelsFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkFormatter(value: SeriesNetworkgraphDataLabelsFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTextPath(value: DataLabelsTextPathOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTextPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkTextPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTextPath")(js.undefined)
        ret
    }
  }
  
}

