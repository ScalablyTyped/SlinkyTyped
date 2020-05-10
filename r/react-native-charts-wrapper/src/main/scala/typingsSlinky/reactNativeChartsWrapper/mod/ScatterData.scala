package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterData extends js.Object {
  var dataSets: js.Array[ScatterDataset] = js.native
}

object ScatterData {
  @scala.inline
  def apply(dataSets: js.Array[ScatterDataset]): ScatterData = {
    val __obj = js.Dynamic.literal(dataSets = dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterData]
  }
  @scala.inline
  implicit class ScatterDataOps[Self <: ScatterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSets(value: js.Array[ScatterDataset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

