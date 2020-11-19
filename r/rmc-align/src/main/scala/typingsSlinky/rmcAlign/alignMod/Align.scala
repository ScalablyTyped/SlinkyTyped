package typingsSlinky.rmcAlign.alignMod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align
  extends Component[IAlignProps, js.Any, js.Any] {
  
  var bufferMonitor: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MAlign(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAlign(prevProps: js.Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAlign(): Unit = js.native
  
  def forceAlign(): Unit = js.native
  
  var resizeHandler: js.Any = js.native
  
  def startMonitorWindowResize(): Unit = js.native
  
  def stopMonitorWindowResize(): Unit = js.native
}
