package typingsSlinky.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distUtilsFormattingMod {
  import typingsSlinky.flatpickr.distTypesGlobalsMod._Global_.Date
  import typingsSlinky.flatpickr.distTypesLocaleMod.Locale
  import typingsSlinky.flatpickr.distTypesOptionsMod.ParsedOptions
  import typingsSlinky.std.Record

  type Formats = Record[
    token, 
    js.Function3[/* date */ Date, /* locale */ Locale, /* options */ ParsedOptions, String | Double]
  ]
  type RevFormat = Record[String, RevFormatFn]
  type RevFormatFn = js.Function3[/* date */ Date, /* data */ String, /* locale */ Locale, js.UndefOr[Date | Unit]]
  type TokenRegex = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in flatpickr.flatpickr/dist/utils/formatting.token ]: string}
    */ typingsSlinky.flatpickr.flatpickrStrings.TokenRegex with js.Any
}
