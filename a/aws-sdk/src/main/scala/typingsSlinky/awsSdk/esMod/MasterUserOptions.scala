package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasterUserOptions extends js.Object {
  /**
    * ARN for the master user (if IAM is enabled).
    */
  var MasterUserARN: js.UndefOr[ARN] = js.native
  /**
    * The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserName: js.UndefOr[Username] = js.native
  /**
    * The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserPassword: js.UndefOr[Password] = js.native
}

object MasterUserOptions {
  @scala.inline
  def apply(): MasterUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterUserOptions]
  }
  @scala.inline
  implicit class MasterUserOptionsOps[Self <: MasterUserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMasterUserARN(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUserARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserARN")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUserName(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserName")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUserPassword(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUserPassword")(js.undefined)
        ret
    }
  }
  
}

