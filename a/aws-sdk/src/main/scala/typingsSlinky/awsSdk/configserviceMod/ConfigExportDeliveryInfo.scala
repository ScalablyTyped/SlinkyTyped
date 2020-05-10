package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigExportDeliveryInfo extends js.Object {
  /**
    * The time of the last attempted delivery.
    */
  var lastAttemptTime: js.UndefOr[js.Date] = js.native
  /**
    * The error code from the last attempted delivery.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message from the last attempted delivery.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  /**
    * Status of the last attempted delivery.
    */
  var lastStatus: js.UndefOr[DeliveryStatus] = js.native
  /**
    * The time of the last successful delivery.
    */
  var lastSuccessfulTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that the next delivery occurs.
    */
  var nextDeliveryTime: js.UndefOr[js.Date] = js.native
}

object ConfigExportDeliveryInfo {
  @scala.inline
  def apply(): ConfigExportDeliveryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigExportDeliveryInfo]
  }
  @scala.inline
  implicit class ConfigExportDeliveryInfoOps[Self <: ConfigExportDeliveryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastAttemptTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAttemptTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAttemptTime")(js.undefined)
        ret
    }
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
    def withLastSuccessfulTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNextDeliveryTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDeliveryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextDeliveryTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDeliveryTime")(js.undefined)
        ret
    }
  }
  
}

