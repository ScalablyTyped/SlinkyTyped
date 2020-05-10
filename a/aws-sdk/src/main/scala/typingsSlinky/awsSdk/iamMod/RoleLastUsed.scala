package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleLastUsed extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format that the role was last used. This field is null if the role has not been used within the IAM tracking period. For more information about the tracking period, see Regions Where Data Is Tracked in the IAM User Guide. 
    */
  var LastUsedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the AWS Region in which the role was last used.
    */
  var Region: js.UndefOr[stringType] = js.native
}

object RoleLastUsed {
  @scala.inline
  def apply(): RoleLastUsed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleLastUsed]
  }
  @scala.inline
  implicit class RoleLastUsedOps[Self <: RoleLastUsed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastUsedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUsedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUsedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUsedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: stringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
  }
  
}

