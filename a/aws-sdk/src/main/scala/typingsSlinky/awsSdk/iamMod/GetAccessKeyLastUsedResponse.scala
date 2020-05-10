package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessKeyLastUsedResponse extends js.Object {
  /**
    * Contains information about the last time the access key was used.
    */
  var AccessKeyLastUsed: js.UndefOr[typingsSlinky.awsSdk.iamMod.AccessKeyLastUsed] = js.native
  /**
    * The name of the AWS IAM user that owns this access key. 
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object GetAccessKeyLastUsedResponse {
  @scala.inline
  def apply(): GetAccessKeyLastUsedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyLastUsedResponse]
  }
  @scala.inline
  implicit class GetAccessKeyLastUsedResponseOps[Self <: GetAccessKeyLastUsedResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyLastUsed(value: AccessKeyLastUsed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyLastUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyLastUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyLastUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: existingUserNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

