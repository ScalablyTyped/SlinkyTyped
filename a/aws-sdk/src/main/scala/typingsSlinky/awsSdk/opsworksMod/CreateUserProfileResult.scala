package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserProfileResult extends js.Object {
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.native
}

object CreateUserProfileResult {
  @scala.inline
  def apply(): CreateUserProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserProfileResult]
  }
  @scala.inline
  implicit class CreateUserProfileResultOps[Self <: CreateUserProfileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamUserArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamUserArn")(js.undefined)
        ret
    }
  }
  
}

