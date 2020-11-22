package typingsSlinky.antdMobileRn.progressIndexNativeMod

import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.mod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress
  extends Component[ProgressProps, js.Any, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MProgress(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MProgress(nextProps: ProgressProps): Unit = js.native
  
  def getWidth(): Double = js.native
  def getWidth(percent: Double): Double = js.native
  
  def normalPercent(): js.Any = js.native
  def normalPercent(percent: Double): js.Any = js.native
  
  def onLayout(e: SyntheticEvent[NodeHandle, Layout]): Unit = js.native
}
