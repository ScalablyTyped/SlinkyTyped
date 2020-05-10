package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPointsMarkerDataLabelConnectorLine extends js.Object {
  /** Specifies when the connector has to be drawn as Bezier curve or straight line. This is applicable only for Pie and Doughnut chart types.
    * @Default {line. See ConnectorLineType}
    */
  var `type`: js.UndefOr[ConnectorLineType | String] = js.native
  /** Width of the connector.
    * @Default {0.5}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesPointsMarkerDataLabelConnectorLine {
  @scala.inline
  def apply(): SeriesPointsMarkerDataLabelConnectorLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPointsMarkerDataLabelConnectorLine]
  }
  @scala.inline
  implicit class SeriesPointsMarkerDataLabelConnectorLineOps[Self <: SeriesPointsMarkerDataLabelConnectorLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ConnectorLineType | String): Self = {
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

