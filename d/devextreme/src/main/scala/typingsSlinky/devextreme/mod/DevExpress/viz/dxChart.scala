package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChart extends BaseChart {
  
  /** @name dxChart.getArgumentAxis() */
  def getArgumentAxis(): chartAxisObject = js.native
  
  /** @name dxChart.getValueAxis() */
  def getValueAxis(): chartAxisObject = js.native
  /** @name dxChart.getValueAxis(name) */
  def getValueAxis(name: String): chartAxisObject = js.native
  
  /** @name dxChart.resetVisualRange() */
  def resetVisualRange(): Unit = js.native
  
  def zoomArgument(startValue: String, endValue: String): Unit = js.native
  def zoomArgument(startValue: String, endValue: Double): Unit = js.native
  def zoomArgument(startValue: String, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: Double, endValue: String): Unit = js.native
  /** @name dxChart.zoomArgument(startValue,endValue) */
  def zoomArgument(startValue: Double, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Double, endValue: js.Date): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: String): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: Double): Unit = js.native
  def zoomArgument(startValue: js.Date, endValue: js.Date): Unit = js.native
}
