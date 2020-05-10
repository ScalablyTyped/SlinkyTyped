package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProfileRequest extends js.Object {
  /**
    * The ARN of the room profile to delete. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
}

object DeleteProfileRequest {
  @scala.inline
  def apply(): DeleteProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProfileRequest]
  }
  @scala.inline
  implicit class DeleteProfileRequestOps[Self <: DeleteProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfileArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfileArn")(js.undefined)
        ret
    }
  }
  
}

