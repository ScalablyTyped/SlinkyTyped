package typingsSlinky.reactDashIntl.libComponentsProviderMod

import typingsSlinky.reactDashIntl.libTypesMod.IntlConfig
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultFormats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultLocale
import typingsSlinky.reactDashIntl.reactDashIntlStrings.formats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.messages
import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
import typingsSlinky.reactDashIntl.reactDashIntlStrings.textComponent
import typingsSlinky.reactDashIntl.reactDashIntlStrings.timeZone
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/provider", JSImport.Default)
@js.native
class default () extends IntlProvider

/* static members */
@JSImport("react-intl/lib/components/provider", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: State): Partial[State] | Null = js.native
}

