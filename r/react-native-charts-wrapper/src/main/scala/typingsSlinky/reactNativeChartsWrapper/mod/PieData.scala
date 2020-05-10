package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieData extends js.Object {
  var dataSets: js.UndefOr[js.Array[PieDataset]] = js.native
}

object PieData {
  @scala.inline
  def apply(): PieData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieData]
  }
  @scala.inline
  implicit class PieDataOps[Self <: PieData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSets(value: js.Array[PieDataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSets")(js.undefined)
        ret
    }
  }
  
}

