package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesNetworkgraphDataLabelsFormatterContextObject extends DataLabelsFormatterContextObject {
  /**
    * The color of the node.
    */
  var color: ColorString = js.native
  /**
    * The ID of the node.
    */
  var key: String = js.native
}

object SeriesNetworkgraphDataLabelsFormatterContextObject {
  @scala.inline
  def apply(color: ColorString, key: String, point: Point, series: Series, x: Double): SeriesNetworkgraphDataLabelsFormatterContextObject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesNetworkgraphDataLabelsFormatterContextObject]
  }
  @scala.inline
  implicit class SeriesNetworkgraphDataLabelsFormatterContextObjectOps[Self <: SeriesNetworkgraphDataLabelsFormatterContextObject] (val x: Self) extends AnyVal {
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
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

