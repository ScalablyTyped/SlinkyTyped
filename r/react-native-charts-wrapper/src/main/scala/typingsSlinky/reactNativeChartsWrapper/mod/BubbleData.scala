package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleData extends js.Object {
  var dataSets: js.UndefOr[js.Array[BubbleDataset]] = js.native
}

object BubbleData {
  @scala.inline
  def apply(): BubbleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleData]
  }
  @scala.inline
  implicit class BubbleDataOps[Self <: BubbleData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSets(value: js.Array[BubbleDataset]): Self = {
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

