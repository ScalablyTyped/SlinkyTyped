package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Errors.EDAMNotFoundException
import typingsSlinky.evernote.mod.Errors.EDAMUserException
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityID extends js.Object {
  var identityID: js.UndefOr[typingsSlinky.evernote.mod.Types.IdentityID] = js.native
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  var userException: js.UndefOr[EDAMUserException] = js.native
  var userID: js.UndefOr[UserID] = js.native
}

object IdentityID {
  @scala.inline
  def apply(): IdentityID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityID]
  }
  @scala.inline
  implicit class IdentityIDOps[Self <: IdentityID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityID(value: typingsSlinky.evernote.mod.Types.IdentityID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityID")(js.undefined)
        ret
    }
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
    def withUserID(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userID")(js.undefined)
        ret
    }
  }
  
}

