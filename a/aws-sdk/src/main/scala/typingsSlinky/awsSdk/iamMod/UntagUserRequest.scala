package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagUserRequest extends js.Object {
  /**
    * A list of key names as a simple array of strings. The tags with matching keys are removed from the specified user.
    */
  var TagKeys: tagKeyListType = js.native
  /**
    * The name of the IAM user from which you want to remove tags. This parameter accepts (through its regex pattern) a string of characters that consist of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@-
    */
  var UserName: existingUserNameType = js.native
}

object UntagUserRequest {
  @scala.inline
  def apply(TagKeys: tagKeyListType, UserName: existingUserNameType): UntagUserRequest = {
    val __obj = js.Dynamic.literal(TagKeys = TagKeys.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagUserRequest]
  }
  @scala.inline
  implicit class UntagUserRequestOps[Self <: UntagUserRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagKeys(value: tagKeyListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: existingUserNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

