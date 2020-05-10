package typingsSlinky.pulumiAws.outputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupUser extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the iam user.
    */
  var arn: String = js.native
  /**
    * The path to the iam user.
    */
  var path: String = js.native
  /**
    * The stable and unique string identifying the iam user.
    */
  var userId: String = js.native
  /**
    * The name of the iam user.
    */
  var userName: String = js.native
}

object GetGroupUser {
  @scala.inline
  def apply(arn: String, path: String, userId: String, userName: String): GetGroupUser = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupUser]
  }
  @scala.inline
  implicit class GetGroupUserOps[Self <: GetGroupUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

