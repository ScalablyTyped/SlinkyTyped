package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxRangeSelector extends BaseWidget {
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Gets the currently selected range. */
  def getValue(): js.Array[Double | String | js.Date] = js.native
  /** Redraws the widget. */
  def render(skipChartAnimation: Boolean): Unit = js.native
  /** Sets the selected range. */
  def setValue(value: js.Array[Double | String | Date]): Unit = js.native
  def setValue(value: VizRange): Unit = js.native
}

