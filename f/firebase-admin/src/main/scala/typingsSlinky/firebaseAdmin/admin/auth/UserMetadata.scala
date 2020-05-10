package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's metadata.
  */
@js.native
trait UserMetadata extends js.Object {
  /**
    * The date the user was created, formatted as a UTC string.
    *
    */
  var creationTime: String = js.native
  /**
    * The date the user last signed in, formatted as a UTC string.
    */
  var lastSignInTime: String = js.native
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
}

object UserMetadata {
  @scala.inline
  def apply(creationTime: String, lastSignInTime: String, toJSON: () => js.Object): UserMetadata = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], lastSignInTime = lastSignInTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[UserMetadata]
  }
  @scala.inline
  implicit class UserMetadataOps[Self <: UserMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSignInTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSignInTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

