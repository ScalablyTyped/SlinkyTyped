package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryChannelStatus extends js.Object {
  /**
    * A list that contains the status of the delivery of the configuration history to the specified Amazon S3 bucket.
    */
  var configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.native
  /**
    * A list containing the status of the delivery of the snapshot to the specified Amazon S3 bucket.
    */
  var configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.native
  /**
    * A list containing the status of the delivery of the configuration stream notification to the specified Amazon SNS topic.
    */
  var configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.native
  /**
    * The name of the delivery channel.
    */
  var name: js.UndefOr[String] = js.native
}

object DeliveryChannelStatus {
  @scala.inline
  def apply(): DeliveryChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryChannelStatus]
  }
  @scala.inline
  implicit class DeliveryChannelStatusOps[Self <: DeliveryChannelStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigHistoryDeliveryInfo(value: ConfigExportDeliveryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configHistoryDeliveryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigHistoryDeliveryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configHistoryDeliveryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigSnapshotDeliveryInfo(value: ConfigExportDeliveryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSnapshotDeliveryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigSnapshotDeliveryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSnapshotDeliveryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigStreamDeliveryInfo(value: ConfigStreamDeliveryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configStreamDeliveryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigStreamDeliveryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configStreamDeliveryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

