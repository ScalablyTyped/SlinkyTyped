package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxRangeSelector extends BaseWidget {
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource = js.native
  /** @name dxRangeSelector.getValue() */
  def getValue(): js.Array[Double | String | js.Date] = js.native
  /** @name dxRangeSelector.render(skipChartAnimation) */
  def render(skipChartAnimation: Boolean): Unit = js.native
  /** @name dxRangeSelector.setValue(value) */
  def setValue(value: js.Array[Double | String | js.Date]): Unit = js.native
  def setValue(value: VizRange): Unit = js.native
}

