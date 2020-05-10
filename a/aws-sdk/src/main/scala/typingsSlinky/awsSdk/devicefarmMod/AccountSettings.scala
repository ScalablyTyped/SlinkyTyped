package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountSettings extends js.Object {
  /**
    * The AWS account number specified in the AccountSettings container.
    */
  var awsAccountNumber: js.UndefOr[AWSAccountNumber] = js.native
  /**
    * The default number of minutes (at the account level) a test run executes before it times out. The default value is 150 minutes.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * The maximum number of minutes a test run executes before it times out.
    */
  var maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * The maximum number of device slots that the AWS account can purchase. Each maximum is expressed as an offering-id:number pair, where the offering-id represents one of the IDs returned by the ListOfferings command.
    */
  var maxSlots: js.UndefOr[MaxSlotMap] = js.native
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  /**
    * Information about an AWS account's usage of free trial device minutes.
    */
  var trialMinutes: js.UndefOr[TrialMinutes] = js.native
  /**
    * Returns the unmetered devices you have purchased or want to purchase.
    */
  var unmeteredDevices: js.UndefOr[PurchasedDevicesMap] = js.native
  /**
    * Returns the unmetered remote access devices you have purchased or want to purchase.
    */
  var unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap] = js.native
}

object AccountSettings {
  @scala.inline
  def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  @scala.inline
  implicit class AccountSettingsOps[Self <: AccountSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountNumber(value: AWSAccountNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultJobTimeoutMinutes(value: JobTimeoutMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultJobTimeoutMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultJobTimeoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultJobTimeoutMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxJobTimeoutMinutes(value: JobTimeoutMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxJobTimeoutMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxJobTimeoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxJobTimeoutMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSlots(value: MaxSlotMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSlots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSlots")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipAppResign(value: SkipAppResign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAppResign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipAppResign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipAppResign")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialMinutes(value: TrialMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trialMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmeteredDevices(value: PurchasedDevicesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmeteredDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmeteredDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmeteredDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmeteredRemoteAccessDevices(value: PurchasedDevicesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmeteredRemoteAccessDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmeteredRemoteAccessDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmeteredRemoteAccessDevices")(js.undefined)
        ret
    }
  }
  
}

