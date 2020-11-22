package typingsSlinky.formatjsIntlDatetimeformat

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions
import typingsSlinky.formatjsIntlDatetimeformat.coreMod.DateTimeFormatConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-datetimeformat/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  
  @js.native
  class DateTimeFormat ()
    extends typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions) = this()
    def this(locales: String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: DateTimeFormatOptions) = this()
  }
  @js.native
  object DateTimeFormat extends TopLevel[DateTimeFormatConstructor]
}
