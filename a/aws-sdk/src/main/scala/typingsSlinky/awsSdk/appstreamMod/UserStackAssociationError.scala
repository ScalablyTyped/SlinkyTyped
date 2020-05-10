package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStackAssociationError extends js.Object {
  /**
    * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.native
  /**
    * The error message for the error that is returned when a user can’t be associated with or disassociated from a stack.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * Information about the user and associated stack.
    */
  var UserStackAssociation: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.UserStackAssociation] = js.native
}

object UserStackAssociationError {
  @scala.inline
  def apply(): UserStackAssociationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserStackAssociationError]
  }
  @scala.inline
  implicit class UserStackAssociationErrorOps[Self <: UserStackAssociationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: UserStackAssociationErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStackAssociation(value: UserStackAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStackAssociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStackAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStackAssociation")(js.undefined)
        ret
    }
  }
  
}

