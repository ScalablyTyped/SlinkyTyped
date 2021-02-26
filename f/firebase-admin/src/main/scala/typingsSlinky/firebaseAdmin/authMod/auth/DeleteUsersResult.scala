package typingsSlinky.firebaseAdmin.authMod.auth

import typingsSlinky.firebaseAdmin.firebaseNamespaceApiMod.FirebaseArrayIndexError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of the
  * {@link auth.Auth.deleteUsers `deleteUsers()`}
  * API.
  */
@js.native
trait DeleteUsersResult extends StObject {
  
  /**
    * A list of `FirebaseArrayIndexError` instances describing the errors that
    * were encountered during the deletion. Length of this list is equal to
    * the return value of [`failureCount`](#failureCount).
    */
  var errors: js.Array[FirebaseArrayIndexError] = js.native
  
  /**
    * The number of user records that failed to be deleted (possibly zero).
    */
  var failureCount: Double = js.native
  
  /**
    * The number of users that were deleted successfully (possibly zero).
    * Users that did not exist prior to calling `deleteUsers()` are
    * considered to be successfully deleted.
    */
  var successCount: Double = js.native
}
object DeleteUsersResult {
  
  @scala.inline
  def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): DeleteUsersResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsersResult]
  }
  
  @scala.inline
  implicit class DeleteUsersResultMutableBuilder[Self <: DeleteUsersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[FirebaseArrayIndexError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: FirebaseArrayIndexError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
  }
}
