package typingsSlinky.googleDashLibphonenumber.libphonenumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneNumberFormat extends js.Object

@JSGlobal("libphonenumber.PhoneNumberFormat")
@js.native
object PhoneNumberFormat extends js.Object {
  @js.native
  sealed trait E164 extends PhoneNumberFormat
  
  @js.native
  sealed trait INTERNATIONAL extends PhoneNumberFormat
  
  @js.native
  sealed trait NATIONAL extends PhoneNumberFormat
  
  @js.native
  sealed trait RFC3966 extends PhoneNumberFormat
  
  /* 0 */ val E164: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.E164 with Double = js.native
  /* 1 */ val INTERNATIONAL: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL with Double = js.native
  /* 2 */ val NATIONAL: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL with Double = js.native
  /* 3 */ val RFC3966: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneNumberFormat with Double] = js.native
}

