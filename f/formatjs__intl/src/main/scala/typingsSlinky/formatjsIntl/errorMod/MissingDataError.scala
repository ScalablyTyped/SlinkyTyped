package typingsSlinky.formatjsIntl.errorMod

import typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_DATA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/error", "MissingDataError")
@js.native
class MissingDataError protected () extends IntlError[MISSING_DATA] {
  def this(message: String) = this()
  def this(message: String, exception: js.Error) = this()
}
