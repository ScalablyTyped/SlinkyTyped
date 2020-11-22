package typingsSlinky.firebase.mod.firebase.auth

import typingsSlinky.firebase.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response from {@link firebase.auth.Auth.checkActionCode}.
  */
@js.native
trait ActionCodeInfo extends js.Object {
  
  /**
    * The data associated with the action code.
    *
    * For the `PASSWORD_RESET`, `VERIFY_EMAIL`, and `RECOVER_EMAIL` actions, this object
    * contains an `email` field with the address the email was sent to.
    *
    * For the RECOVER_EMAIL action, which allows a user to undo an email address
    * change, this object also contains a `previousEmail` field with the user account's
    * current email address. After the action completes, the user's email address will
    * revert to the value in the `email` field from the value in `previousEmail` field.
    *
    * For the VERIFY_AND_CHANGE_EMAIL action, which allows a user to verify the email
    * before updating it, this object contains a `previousEmail` field with the user
    * account's email address before updating. After the action completes, the user's
    * email address will be updated to the value in the `email` field from the value
    * in `previousEmail` field.
    *
    * For the REVERT_SECOND_FACTOR_ADDITION action, which allows a user to unenroll
    * a newly added second factor, this object contains a `multiFactorInfo` field with
    * the information about the second factor. For phone second factor, the
    * `multiFactorInfo` is a {@link firebase.auth.Auth.PhoneMultiFactorInfo} object,
    * which contains the phone number.
    */
  var data: Email = js.native
  
  /**
    * The type of operation that generated the action code. This could be:
    * <ul>
    * <li>`EMAIL_SIGNIN`: email sign in code generated via
    *     {@link firebase.auth.Auth.sendSignInLinkToEmail}.</li>
    * <li>`PASSWORD_RESET`: password reset code generated via
    *     {@link firebase.auth.Auth.sendPasswordResetEmail}.</li>
    * <li>`RECOVER_EMAIL`: email change revocation code generated via
    *     {@link firebase.User.updateEmail}.</li>
    * <li>`REVERT_SECOND_FACTOR_ADDITION`: revert second factor addition
    *     code generated via
    *     {@link firebase.User.MultiFactorUser.enroll}.</li>
    * <li>`VERIFY_AND_CHANGE_EMAIL`: verify and change email code generated
    *     via {@link firebase.User.verifyBeforeUpdateEmail}.</li>
    * <li>`VERIFY_EMAIL`: email verification code generated via
    *     {@link firebase.User.sendEmailVerification}.</li>
    * </ul>
    */
  var operation: String = js.native
}
@JSImport("firebase", "firebase.auth.ActionCodeInfo")
@js.native
object ActionCodeInfo extends js.Object {
  
  type Operation = String
}
