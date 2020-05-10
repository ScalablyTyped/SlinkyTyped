package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesMarkerDataLabelConnectorLine extends js.Object {
  /** Color of the connector.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Height of the connector.
    * @Default {null}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
    * @Default {line. See ConnectorLineType}
    */
  var `type`: js.UndefOr[Type | String] = js.native
  /** Width of the connector.
    * @Default {0.5}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesMarkerDataLabelConnectorLine {
  @scala.inline
  def apply(): SeriesMarkerDataLabelConnectorLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMarkerDataLabelConnectorLine]
  }
  @scala.inline
  implicit class SeriesMarkerDataLabelConnectorLineOps[Self <: SeriesMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

