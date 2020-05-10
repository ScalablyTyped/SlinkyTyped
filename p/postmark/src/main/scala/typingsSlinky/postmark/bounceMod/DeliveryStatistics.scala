package typingsSlinky.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryStatistics extends js.Object {
  var Bounces: js.Array[BounceMetric] = js.native
  var InactiveMails: Double = js.native
}

object DeliveryStatistics {
  @scala.inline
  def apply(Bounces: js.Array[BounceMetric], InactiveMails: Double): DeliveryStatistics = {
    val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], InactiveMails = InactiveMails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStatistics]
  }
  @scala.inline
  implicit class DeliveryStatisticsOps[Self <: DeliveryStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounces(value: js.Array[BounceMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveMails(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InactiveMails")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

