package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionConfiguration extends js.Object {
  /**
    * True if account cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var accountsCleanup: js.UndefOr[AccountsCleanup] = js.native
  /**
    * True if app package cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.native
  /**
    * The number of minutes a test run executes before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  /**
    * Set to true to enable video capture. Otherwise, set to false. The default is true.
    */
  var videoCapture: js.UndefOr[VideoCapture] = js.native
}

object ExecutionConfiguration {
  @scala.inline
  def apply(): ExecutionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionConfiguration]
  }
  @scala.inline
  implicit class ExecutionConfigurationOps[Self <: ExecutionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountsCleanup(value: AccountsCleanup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountsCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountsCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountsCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withAppPackagesCleanup(value: AppPackagesCleanup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackagesCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPackagesCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackagesCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTimeoutMinutes(value: JobTimeoutMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTimeoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTimeoutMinutes")(js.undefined)
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
    def withVideoCapture(value: VideoCapture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCapture")(js.undefined)
        ret
    }
  }
  
}

