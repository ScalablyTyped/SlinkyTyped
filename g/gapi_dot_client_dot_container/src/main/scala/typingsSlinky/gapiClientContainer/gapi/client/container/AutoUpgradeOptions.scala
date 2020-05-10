package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoUpgradeOptions extends js.Object {
  /**
    * [Output only] This field is set when upgrades are about to commence
    * with the approximate start time for the upgrades, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var autoUpgradeStartTime: js.UndefOr[String] = js.native
  /**
    * [Output only] This field is set when upgrades are about to commence
    * with the description of the upgrade.
    */
  var description: js.UndefOr[String] = js.native
}

object AutoUpgradeOptions {
  @scala.inline
  def apply(): AutoUpgradeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoUpgradeOptions]
  }
  @scala.inline
  implicit class AutoUpgradeOptionsOps[Self <: AutoUpgradeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpgradeStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpgradeStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpgradeStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpgradeStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

