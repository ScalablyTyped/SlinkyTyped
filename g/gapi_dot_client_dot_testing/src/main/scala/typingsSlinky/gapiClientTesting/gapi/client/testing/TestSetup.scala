package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSetup extends js.Object {
  /**
    * The device will be logged in on this account for the duration of the test.
    * Optional
    */
  var account: js.UndefOr[Account] = js.native
  /**
    * The directories on the device to upload to GCS at the end of the test;
    * they must be absolute, whitelisted paths.
    * Refer to RegularFile for whitelisted paths.
    * Optional
    */
  var directoriesToPull: js.UndefOr[js.Array[String]] = js.native
  /**
    * Environment variables to set for the test (only applicable for
    * instrumentation tests).
    */
  var environmentVariables: js.UndefOr[js.Array[EnvironmentVariable]] = js.native
  /** Optional */
  var filesToPush: js.UndefOr[js.Array[DeviceFile]] = js.native
  /**
    * The network traffic profile used for running the test.
    * Optional
    */
  var networkProfile: js.UndefOr[String] = js.native
}

object TestSetup {
  @scala.inline
  def apply(): TestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSetup]
  }
  @scala.inline
  implicit class TestSetupOps[Self <: TestSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoriesToPull(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoriesToPull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoriesToPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoriesToPull")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentVariables(value: js.Array[EnvironmentVariable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesToPush(value: js.Array[DeviceFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesToPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesToPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesToPush")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfile")(js.undefined)
        ret
    }
  }
  
}

