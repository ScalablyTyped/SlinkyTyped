package typingsSlinky.bingmaps.Microsoft.Maps.Traffic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITrafficOptions extends js.Object {
  /** Displays the traffic flow layer. */
  var flowVisible: js.UndefOr[Boolean] = js.native
  /** Displays all traffic incidents. */
  var incidentsVisible: js.UndefOr[Boolean] = js.native
  /** Displays the traffic legend. */
  var legendVisible: js.UndefOr[Boolean] = js.native
  /**
    * Sets the opacity of the traffic flow tile layer. Must be a number between 0 and 1. The default is 1 unless the map
    * mode is set to lite, in which case the default is set to 0.7.
    */
  var opacity: js.UndefOr[Double] = js.native
}

object ITrafficOptions {
  @scala.inline
  def apply(): ITrafficOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrafficOptions]
  }
  @scala.inline
  implicit class ITrafficOptionsOps[Self <: ITrafficOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIncidentsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidentsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncidentsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidentsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

