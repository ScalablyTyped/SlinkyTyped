package typingsSlinky.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseAuthTypes.mod.PhoneSingleFactorInfoOptions
  - typingsSlinky.firebaseAuthTypes.mod.PhoneMultiFactorEnrollInfoOptions
  - typingsSlinky.firebaseAuthTypes.mod.PhoneMultiFactorSignInInfoOptions
*/
trait PhoneInfoOptions extends js.Object

object PhoneInfoOptions {
  @scala.inline
  implicit def apply(value: PhoneMultiFactorEnrollInfoOptions): PhoneInfoOptions = value.asInstanceOf[PhoneInfoOptions]
  @scala.inline
  implicit def apply(value: PhoneMultiFactorSignInInfoOptions): PhoneInfoOptions = value.asInstanceOf[PhoneInfoOptions]
  @scala.inline
  implicit def apply(value: PhoneSingleFactorInfoOptions): PhoneInfoOptions = value.asInstanceOf[PhoneInfoOptions]
}

