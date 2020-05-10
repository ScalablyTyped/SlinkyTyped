package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigSnapshotDeliveryProperties extends js.Object {
  /**
    * The frequency with which AWS Config delivers configuration snapshots.
    */
  var deliveryFrequency: js.UndefOr[MaximumExecutionFrequency] = js.native
}

object ConfigSnapshotDeliveryProperties {
  @scala.inline
  def apply(): ConfigSnapshotDeliveryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigSnapshotDeliveryProperties]
  }
  @scala.inline
  implicit class ConfigSnapshotDeliveryPropertiesOps[Self <: ConfigSnapshotDeliveryProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliveryFrequency(value: MaximumExecutionFrequency): Self = {
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

