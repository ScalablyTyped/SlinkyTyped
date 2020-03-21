package typingsSlinky.libphonenumberJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CarrierCode = java.lang.String
  type CountryCallingCode = java.lang.String
  type CountryCallingCodes = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.libphonenumberJs.typesMod.CountryCode]]
  type E164Number = java.lang.String
  type Extension = java.lang.String
  type FormatExtension = js.Function3[
    /* formattedNumber */ java.lang.String, 
    /* extension */ typingsSlinky.libphonenumberJs.typesMod.Extension, 
    /* metadata */ typingsSlinky.libphonenumberJs.typesMod.Metadata, 
    java.lang.String
  ]
  type NationalNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.PREMIUM_RATE
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.TOLL_FREE
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.SHARED_COST
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.VOIP
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.PERSONAL_NUMBER
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.PAGER
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.UAN
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.VOICEMAIL
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE_OR_MOBILE
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE
    - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.MOBILE
  */
  type NumberType = js.UndefOr[typingsSlinky.libphonenumberJs.typesMod._NumberType]
}
