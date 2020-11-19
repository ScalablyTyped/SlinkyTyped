package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.anon.LowFrameRateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerformanceWatchdog")
@js.native
class PerformanceWatchdog () extends js.Object {
  def this(options: LowFrameRateMessage) = this()
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var viewModel: PerformanceWatchdogViewModel = js.native
}
