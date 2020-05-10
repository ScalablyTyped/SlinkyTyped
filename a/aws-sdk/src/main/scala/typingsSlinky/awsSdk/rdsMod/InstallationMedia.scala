package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationMedia extends js.Object {
  /**
    * The custom Availability Zone (AZ) that contains the installation media.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The DB engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The path to the installation medium for the DB engine.
    */
  var EngineInstallationMediaPath: js.UndefOr[String] = js.native
  /**
    * The engine version of the DB engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * If an installation media failure occurred, the cause of the failure.
    */
  var FailureCause: js.UndefOr[InstallationMediaFailureCause] = js.native
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: js.UndefOr[String] = js.native
  /**
    * The path to the installation medium for the operating system associated with the DB engine.
    */
  var OSInstallationMediaPath: js.UndefOr[String] = js.native
  /**
    * The status of the installation medium.
    */
  var Status: js.UndefOr[String] = js.native
}

object InstallationMedia {
  @scala.inline
  def apply(): InstallationMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMedia]
  }
  @scala.inline
  implicit class InstallationMediaOps[Self <: InstallationMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAvailabilityZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAvailabilityZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAvailabilityZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineInstallationMediaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineInstallationMediaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineInstallationMediaPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineInstallationMediaPath")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCause(value: InstallationMediaFailureCause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCause")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallationMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallationMediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallationMediaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallationMediaId")(js.undefined)
        ret
    }
    @scala.inline
    def withOSInstallationMediaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OSInstallationMediaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOSInstallationMediaPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OSInstallationMediaPath")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

