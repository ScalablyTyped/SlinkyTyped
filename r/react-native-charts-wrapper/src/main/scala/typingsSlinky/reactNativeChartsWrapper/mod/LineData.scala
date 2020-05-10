package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineData extends js.Object {
  var dataSets: js.UndefOr[js.Array[LineDataset]] = js.native
}

object LineData {
  @scala.inline
  def apply(): LineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineData]
  }
  @scala.inline
  implicit class LineDataOps[Self <: LineData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSets(value: js.Array[LineDataset]): Self = {
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

