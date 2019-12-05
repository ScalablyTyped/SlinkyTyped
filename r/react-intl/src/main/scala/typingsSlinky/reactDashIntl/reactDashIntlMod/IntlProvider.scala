package typingsSlinky.reactDashIntl.reactDashIntlMod

import typingsSlinky.react.reactMod.Component
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

@JSImport("react-intl", "IntlProvider")
@js.native
class IntlProvider ()
  extends Component[OptionalIntlConfig, State, js.Any] {
  var cache: js.Any = js.native
}

/* static members */
@JSImport("react-intl", "IntlProvider")
@js.native
object IntlProvider extends js.Object {
  var defaultProps: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: State): Partial[State] | Null = js.native
}

