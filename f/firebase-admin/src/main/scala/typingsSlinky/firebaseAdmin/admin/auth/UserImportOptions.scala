package typingsSlinky.firebaseAdmin.admin.auth

import typingsSlinky.firebaseAdmin.AnonAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the user import options needed for
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#importUsers `importUsers()`} method. This is used to
  * provide the password hashing algorithm information.
  */
@js.native
trait UserImportOptions extends js.Object {
  /**
    * The password hashing information.
    */
  var hash: AnonAlgorithm = js.native
}

object UserImportOptions {
  @scala.inline
  def apply(hash: AnonAlgorithm): UserImportOptions = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportOptions]
  }
  @scala.inline
  implicit class UserImportOptionsOps[Self <: UserImportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: AnonAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

