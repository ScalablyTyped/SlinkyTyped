package typingsSlinky.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a user to be looked up.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAdmin.authMod.auth.UidIdentifier
  - typingsSlinky.firebaseAdmin.authMod.auth.EmailIdentifier
  - typingsSlinky.firebaseAdmin.authMod.auth.PhoneIdentifier
  - typingsSlinky.firebaseAdmin.authMod.auth.ProviderIdentifier
*/
trait UserIdentifier extends StObject
object UserIdentifier {
  
  @scala.inline
  def EmailIdentifier(email: String): typingsSlinky.firebaseAdmin.authMod.auth.EmailIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebaseAdmin.authMod.auth.EmailIdentifier]
  }
  
  @scala.inline
  def PhoneIdentifier(phoneNumber: String): typingsSlinky.firebaseAdmin.authMod.auth.PhoneIdentifier = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebaseAdmin.authMod.auth.PhoneIdentifier]
  }
  
  @scala.inline
  def ProviderIdentifier(providerId: String, providerUid: String): typingsSlinky.firebaseAdmin.authMod.auth.ProviderIdentifier = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], providerUid = providerUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebaseAdmin.authMod.auth.ProviderIdentifier]
  }
  
  @scala.inline
  def UidIdentifier(uid: String): typingsSlinky.firebaseAdmin.authMod.auth.UidIdentifier = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebaseAdmin.authMod.auth.UidIdentifier]
  }
}
