package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemConfigurationManager extends js.Object {
  /**
    * The name of the configuration manager, which is Chef.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The versions of the configuration manager that are supported by an operating system.
    */
  var Version: js.UndefOr[String] = js.native
}

object OperatingSystemConfigurationManager {
  @scala.inline
  def apply(): OperatingSystemConfigurationManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemConfigurationManager]
  }
  @scala.inline
  implicit class OperatingSystemConfigurationManagerOps[Self <: OperatingSystemConfigurationManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

