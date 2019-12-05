package typingsSlinky.reactDashIntl

import slinky.core.TagMod
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
    values: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(values : std.Array<string | react.react.ReactNode>, opts ? : react-intl.react-intl/lib/types.FormatListOptions): react.react.ReactNode>[0] */ js.Any
  ): String | TagMod[Any] = js.native
  def formatList(
    hasLocaleOnError: Pick[IntlConfig, locale | onError],
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofClassIntlListFormat], default],
    values: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(values : std.Array<string | react.react.ReactNode>, opts ? : react-intl.react-intl/lib/types.FormatListOptions): react.react.ReactNode>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(values : std.Array<string | react.react.ReactNode>, opts ? : react-intl.react-intl/lib/types.FormatListOptions): react.react.ReactNode>[1] */ js.Any
  ): String | TagMod[Any] = js.native
}

