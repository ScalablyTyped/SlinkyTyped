package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxRangeSelector extends BaseWidget {
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:dxRangeSelector.getValue()]
    */
  def getValue(): js.Array[Double | String | js.Date] = js.native
  
  /**
    * [descr:dxRangeSelector.render(skipChartAnimation)]
    */
  def render(skipChartAnimation: Boolean): Unit = js.native
  
  /**
    * [descr:dxRangeSelector.setValue(value)]
    */
  def setValue(value: js.Array[Double | String | js.Date]): Unit = js.native
  def setValue(value: VizRange): Unit = js.native
}
