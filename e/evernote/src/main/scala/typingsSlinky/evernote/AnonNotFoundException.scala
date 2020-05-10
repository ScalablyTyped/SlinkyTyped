package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Errors.EDAMNotFoundException
import typingsSlinky.evernote.mod.Errors.EDAMUserException
import typingsSlinky.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotFoundException extends js.Object {
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  var userException: js.UndefOr[EDAMUserException] = js.native
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}

object AnonNotFoundException {
  @scala.inline
  def apply(): AnonNotFoundException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNotFoundException]
  }
  @scala.inline
  implicit class AnonNotFoundExceptionOps[Self <: AnonNotFoundException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotFoundException(value: EDAMNotFoundException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundException")(js.undefined)
        ret
    }
    @scala.inline
    def withUserException(value: EDAMUserException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userException")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIdentity(value: UserIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIdentity")(js.undefined)
        ret
    }
  }
  
}

