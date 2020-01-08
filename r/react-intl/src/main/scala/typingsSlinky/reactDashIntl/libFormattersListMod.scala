package typingsSlinky.reactDashIntl

import typingsSlinky.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.default
import typingsSlinky.reactDashIntl.libTypesMod.IntlConfig
import typingsSlinky.reactDashIntl.reactDashIntlStrings.locale
import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/list", JSImport.Namespace)
@js.native
object libFormattersListMod extends js.Object {
  def formatList(
    hasLocaleOnError: Pick[IntlConfig, locale | onError],
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofClassIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.Fn_Opts>[1] */ js.Any
  ): String = js.native
}

