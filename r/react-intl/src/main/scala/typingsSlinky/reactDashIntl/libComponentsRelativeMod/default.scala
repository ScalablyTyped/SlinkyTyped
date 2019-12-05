package typingsSlinky.reactDashIntl.libComponentsRelativeMod

import typingsSlinky.reactDashIntl.reactDashIntlStrings.unit
import typingsSlinky.reactDashIntl.reactDashIntlStrings.value
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/relative", JSImport.Default)
@js.native
class default protected () extends FormattedRelativeTime {
  def this(props: Props) = this()
}

/* static members */
@JSImport("react-intl/lib/components/relative", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Pick[Props, unit | value] = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: Props, state: State): Partial[State] | Null = js.native
}

