package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.cesium.AnonLowFrameRateMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerformanceWatchdog")
@js.native
class PerformanceWatchdog () extends js.Object {
  def this(options: AnonLowFrameRateMessage) = this()
  var container: Element = js.native
  var viewModel: PerformanceWatchdogViewModel = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

