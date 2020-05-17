package typingsSlinky.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The information required to verify the ownership of a phone number. The
  * information that's required depends on whether you are doing single-factor
  * sign-in, multi-factor enrollment or multi-factor sign-in.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebase.mod.auth.PhoneSingleFactorInfoOptions
  - typingsSlinky.firebase.mod.auth.PhoneMultiFactorEnrollInfoOptions
  - typingsSlinky.firebase.mod.auth.PhoneMultiFactorSignInInfoOptions
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

