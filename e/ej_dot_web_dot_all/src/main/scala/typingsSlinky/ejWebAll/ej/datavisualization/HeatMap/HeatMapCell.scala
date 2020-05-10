package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatMapCell extends js.Object {
  /** Specifies whether the cell color can be visible or not.
    * @Default {true}
    */
  var showColor: js.UndefOr[Boolean] = js.native
  /** Specifies whether the cell content can be visible or not.
    * @Default {ej.HeatMap.CellVisibility.Visible}
    */
  var showContent: js.UndefOr[CellVisibility | String] = js.native
}

object HeatMapCell {
  @scala.inline
  def apply(): HeatMapCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapCell]
  }
  @scala.inline
  implicit class HeatMapCellOps[Self <: HeatMapCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShowContent(value: CellVisibility | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(js.undefined)
        ret
    }
  }
  
}

