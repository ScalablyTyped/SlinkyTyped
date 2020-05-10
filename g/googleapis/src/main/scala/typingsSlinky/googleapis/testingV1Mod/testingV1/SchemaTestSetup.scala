package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how to set up the Android device prior to running the
  * test.
  */
@js.native
trait SchemaTestSetup extends js.Object {
  /**
    * The device will be logged in on this account for the duration of the
    * test.
    */
  var account: js.UndefOr[SchemaAccount] = js.native
  /**
    * APKs to install in addition to those being directly tested. Currently
    * capped at 100.
    */
  var additionalApks: js.UndefOr[js.Array[SchemaApk]] = js.native
  /**
    * List of directories on the device to upload to GCS at the end of the
    * test; they must be absolute paths under /sdcard or /data/local/tmp. Path
    * names are restricted to characters a-z A-Z 0-9 _ - . + and /  Note: The
    * paths /sdcard and /data will be made available and treated as implicit
    * path substitutions. E.g. if /sdcard on a particular device does not map
    * to external storage, the system will replace it with the external storage
    * path prefix for that device.
    */
  var directoriesToPull: js.UndefOr[js.Array[String]] = js.native
  /**
    * Environment variables to set for the test (only applicable for
    * instrumentation tests).
    */
  var environmentVariables: js.UndefOr[js.Array[SchemaEnvironmentVariable]] = js.native
  /**
    * List of files to push to the device before starting the test.
    */
  var filesToPush: js.UndefOr[js.Array[SchemaDeviceFile]] = js.native
  /**
    * The network traffic profile used for running the test. Available network
    * profiles can be queried by using the NETWORK_CONFIGURATION environment
    * type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.native
}

object SchemaTestSetup {
  @scala.inline
  def apply(): SchemaTestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestSetup]
  }
  @scala.inline
  implicit class SchemaTestSetupOps[Self <: SchemaTestSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: SchemaAccount): Self = {
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
    def withAdditionalApks(value: js.Array[SchemaApk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalApks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalApks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalApks")(js.undefined)
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
    def withEnvironmentVariables(value: js.Array[SchemaEnvironmentVariable]): Self = {
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
    def withFilesToPush(value: js.Array[SchemaDeviceFile]): Self = {
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

