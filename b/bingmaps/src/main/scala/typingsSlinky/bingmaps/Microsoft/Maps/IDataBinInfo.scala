package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataBinInfo extends js.Object {
  /* An array of all the pushpins that are in the data bin. */
  var containedPushpins: js.Array[Pushpin] = js.native
  /* A set of calculated metric values determined using the aggregationProperty value of all the pushpins contained in the data bin. */
  var metrics: IDataBinMetrics = js.native
}

object IDataBinInfo {
  @scala.inline
  def apply(containedPushpins: js.Array[Pushpin], metrics: IDataBinMetrics): IDataBinInfo = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataBinInfo]
  }
  @scala.inline
  implicit class IDataBinInfoOps[Self <: IDataBinInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainedPushpins(value: js.Array[Pushpin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containedPushpins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: IDataBinMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

