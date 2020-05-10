package typingsSlinky.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryChannelSnapshotDeliveryProperties extends js.Object {
  /**
    * - The frequency with which AWS Config recurringly delivers configuration snapshots.
    * e.g. `One_Hour` or `Three_Hours`.
    * Valid values are listed [here](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html#API_ConfigSnapshotDeliveryProperties_Contents).
    */
  var deliveryFrequency: js.UndefOr[String] = js.native
}

object DeliveryChannelSnapshotDeliveryProperties {
  @scala.inline
  def apply(): DeliveryChannelSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryChannelSnapshotDeliveryProperties]
  }
  @scala.inline
  implicit class DeliveryChannelSnapshotDeliveryPropertiesOps[Self <: DeliveryChannelSnapshotDeliveryProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryFrequency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryFrequency")(js.undefined)
        ret
    }
  }
  
}

