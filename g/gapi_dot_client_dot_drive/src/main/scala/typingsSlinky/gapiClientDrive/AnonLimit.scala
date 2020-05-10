package typingsSlinky.gapiClientDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLimit extends js.Object {
  /** The usage limit, if applicable. This will not be present if the user has unlimited storage. */
  var limit: js.UndefOr[String] = js.native
  /** The total usage across all services. */
  var usage: js.UndefOr[String] = js.native
  /** The usage by all files in Google Drive. */
  var usageInDrive: js.UndefOr[String] = js.native
  /** The usage by trashed files in Google Drive. */
  var usageInDriveTrash: js.UndefOr[String] = js.native
}

object AnonLimit {
  @scala.inline
  def apply(): AnonLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLimit]
  }
  @scala.inline
  implicit class AnonLimitOps[Self <: AnonLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageInDrive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageInDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageInDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageInDrive")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageInDriveTrash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageInDriveTrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageInDriveTrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageInDriveTrash")(js.undefined)
        ret
    }
  }
  
}

