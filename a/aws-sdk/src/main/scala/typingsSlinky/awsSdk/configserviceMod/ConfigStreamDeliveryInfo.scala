package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigStreamDeliveryInfo extends js.Object {
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  /**
    * Status of the last attempted delivery.  Note Providing an SNS topic on a DeliveryChannel for AWS Config is optional. If the SNS delivery is turned off, the last status will be Not_Applicable.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.native
  /**
    * The time from the last status change.
    */
  var lastStatusChangeTime: js.UndefOr[js.Date] = js.native
}

object ConfigStreamDeliveryInfo {
  @scala.inline
  def apply(): ConfigStreamDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigStreamDeliveryInfo]
  }
  @scala.inline
  implicit class ConfigStreamDeliveryInfoOps[Self <: ConfigStreamDeliveryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatus(value: DeliveryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStatusChangeTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChangeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatusChangeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStatusChangeTime")(js.undefined)
        ret
    }
  }
  
}

