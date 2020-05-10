package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrosshairMarkerBorder extends js.Object {
  /** Border width of the marker.
    * @Default {3}
    */
  var width: js.UndefOr[Double] = js.native
}

object CrosshairMarkerBorder {
  @scala.inline
  def apply(): CrosshairMarkerBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairMarkerBorder]
  }
  @scala.inline
  implicit class CrosshairMarkerBorderOps[Self <: CrosshairMarkerBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

