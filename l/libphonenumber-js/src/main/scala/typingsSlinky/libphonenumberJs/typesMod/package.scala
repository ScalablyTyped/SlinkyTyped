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
}
