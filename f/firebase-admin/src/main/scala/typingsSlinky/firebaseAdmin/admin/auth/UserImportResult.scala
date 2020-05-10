package typingsSlinky.firebaseAdmin.admin.auth

import typingsSlinky.firebaseAdmin.admin.FirebaseArrayIndexError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the response from the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#importUsers `importUsers()`} method for batch
  * importing users to Firebase Auth.
  */
@js.native
trait UserImportResult extends js.Object {
  /**
    * An array of errors corresponding to the provided users to import. The
    * length of this array is equal to [`failureCount`](#failureCount).
    */
  var errors: js.Array[FirebaseArrayIndexError] = js.native
  /**
    * The number of user records that failed to import to Firebase Auth.
    */
  var failureCount: Double = js.native
  /**
    * The number of user records that successfully imported to Firebase Auth.
    */
  var successCount: Double = js.native
}

object UserImportResult {
  @scala.inline
  def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): UserImportResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportResult]
  }
  @scala.inline
  implicit class UserImportResultOps[Self <: UserImportResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[FirebaseArrayIndexError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

