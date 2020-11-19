package typingsSlinky.antd.countdownMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.statisticUtilsMod.FormatConfig
import typingsSlinky.antd.statisticUtilsMod.countdownValueType
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Countdown
  extends Component[CountdownProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MCountdown(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCountdown(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCountdown(): Unit = js.native
  
  var countdownId: js.UndefOr[Double] = js.native
  
  def formatCountdown(value: countdownValueType, config: FormatConfig): String = js.native
  
  def startTimer(): Unit = js.native
  
  def stopTimer(): Unit = js.native
  
  def syncTimer(): Unit = js.native
  
  def valueRender(node: ReactElement): ReactElement = js.native
}
