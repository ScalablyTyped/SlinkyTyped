package typingsSlinky.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The information required to verify the ownership of a phone number. The
  * information that's required depends on whether you are doing single-factor
  * sign-in, multi-factor enrollment or multi-factor sign-in.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.mod.firebase.auth.PhoneSingleFactorInfoOptions
  - typingsSlinky.firebase.mod.firebase.auth.PhoneMultiFactorEnrollInfoOptions
  - typingsSlinky.firebase.mod.firebase.auth.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends StObject
object PhoneInfoOptions {
  
  @scala.inline
  def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): typingsSlinky.firebase.mod.firebase.auth.PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebase.mod.firebase.auth.PhoneMultiFactorEnrollInfoOptions]
  }
  
  @scala.inline
  def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): typingsSlinky.firebase.mod.firebase.auth.PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebase.mod.firebase.auth.PhoneMultiFactorSignInInfoOptions]
  }
  
  @scala.inline
  def PhoneSingleFactorInfoOptions(phoneNumber: String): typingsSlinky.firebase.mod.firebase.auth.PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.firebase.mod.firebase.auth.PhoneSingleFactorInfoOptions]
  }
}
