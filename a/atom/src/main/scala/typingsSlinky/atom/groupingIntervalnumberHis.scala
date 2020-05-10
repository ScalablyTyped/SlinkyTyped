package typingsSlinky.atom

import typingsSlinky.atom.mod.MarkerLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  groupingInterval ? :number} & atom.atom.HistoryTransactionOptions */
@js.native
trait groupingIntervalnumberHis extends js.Object {
  var groupingInterval: js.UndefOr[Double] = js.native
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.native
}

object groupingIntervalnumberHis {
  @scala.inline
  def apply(): groupingIntervalnumberHis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[groupingIntervalnumberHis]
  }
  @scala.inline
  implicit class groupingIntervalnumberHisOps[Self <: groupingIntervalnumberHis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionsMarkerLayer(value: MarkerLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionsMarkerLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionsMarkerLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionsMarkerLayer")(js.undefined)
        ret
    }
  }
  
}

