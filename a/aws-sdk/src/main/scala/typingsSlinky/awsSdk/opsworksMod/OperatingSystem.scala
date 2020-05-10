package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystem extends js.Object {
  /**
    * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
    */
  var ConfigurationManagers: js.UndefOr[OperatingSystemConfigurationManagers] = js.native
  /**
    * The ID of a supported operating system, such as Amazon Linux 2018.03.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The name of the operating system, such as Amazon Linux 2018.03.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A short name for the operating system manufacturer.
    */
  var ReportedName: js.UndefOr[String] = js.native
  /**
    * The version of the operating system, including the release and edition, if applicable.
    */
  var ReportedVersion: js.UndefOr[String] = js.native
  /**
    * Indicates that an operating system is not supported for new instances.
    */
  var Supported: js.UndefOr[Boolean] = js.native
  /**
    * The type of a supported operating system, either Linux or Windows.
    */
  var Type: js.UndefOr[String] = js.native
}

object OperatingSystem {
  @scala.inline
  def apply(): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystem]
  }
  @scala.inline
  implicit class OperatingSystemOps[Self <: OperatingSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationManagers(value: OperatingSystemConfigurationManagers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationManagers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationManagers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationManagers")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedName")(js.undefined)
        ret
    }
    @scala.inline
    def withReportedVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Supported")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

