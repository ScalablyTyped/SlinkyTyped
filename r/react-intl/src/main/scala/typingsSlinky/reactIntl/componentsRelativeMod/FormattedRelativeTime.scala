package typingsSlinky.reactIntl.componentsRelativeMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactIntl.anon.PartialStateCurrentValueInSeconds
import typingsSlinky.reactIntl.anon.PickPropsunitvalue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl/src/components/relative", "FormattedRelativeTime")
@js.native
class FormattedRelativeTime protected ()
  extends Component[Props, State, js.Any] {
  def this(props: Props) = this()
  
  var _updateTimer: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MFormattedRelativeTime(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormattedRelativeTime(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MFormattedRelativeTime(): Unit = js.native
  
  def scheduleNextUpdate(hasUpdateIntervalInSecondsUnit: Props, hasCurrentValueInSeconds: State): Unit = js.native
}
/* static members */
@JSImport("react-intl/src/components/relative", "FormattedRelativeTime")
@js.native
object FormattedRelativeTime extends js.Object {
  
  var defaultProps: PickPropsunitvalue = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
}
