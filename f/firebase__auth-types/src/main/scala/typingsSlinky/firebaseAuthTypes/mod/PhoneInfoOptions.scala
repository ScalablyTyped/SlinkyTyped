package typingsSlinky.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions
  - typingsSlinky.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions
  - typingsSlinky.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends js.Object
object PhoneInfoOptions {
  
  @scala.inline
  def PhoneSingleFactorInfoOptions(phoneNumber: String): PhoneInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInfoOptions]
  }
  
  @scala.inline
  def PhoneMultiFactorEnrollInfoOptions(phoneNumber: String, session: MultiFactorSession): PhoneInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInfoOptions]
  }
  
  @scala.inline
  def PhoneMultiFactorSignInInfoOptions(session: MultiFactorSession): PhoneInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInfoOptions]
  }
}
