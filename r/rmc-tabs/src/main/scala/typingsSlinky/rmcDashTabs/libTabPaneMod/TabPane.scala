package typingsSlinky.rmcDashTabs.libTabPaneMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.reactMod.Component
import typingsSlinky.rmcDashTabs.Anon_Children
import typingsSlinky.rmcDashTabs.Anon_FixX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/TabPane", "TabPane")
@js.native
class TabPane ()
  extends Component[PropsType, js.Object, js.Any] {
  var layout: HTMLDivElement = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabPane(nextProps: PropsType with Anon_Children): Unit = js.native
  def setLayout(div: HTMLDivElement): Unit = js.native
}

/* static members */
@JSImport("rmc-tabs/lib/TabPane", "TabPane")
@js.native
object TabPane extends js.Object {
  var defaultProps: Anon_FixX = js.native
}

