package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to fill out a cell range automatically with values based on a start value, step count and fill mode.
  * @see com.sun.star.sheet.SheetCellRange
  */
@js.native
trait XCellSeries extends XInterface {
  
  /**
    * fills all cells in the range in a way that is specified by the first cell(s) in the range.
    * @param nFillDirection specifies the direction to fill the rows/columns of the range.
    * @param nSourceCount contains the number of cells in each row/column used to constitute the fill algorithm.
    */
  def fillAuto(nFillDirection: FillDirection, nSourceCount: Double): Unit = js.native
  
  /**
    * fills all cells in the range based on the specified settings.
    * @param nFillDirection specifies the direction to fill the rows/columns of the range.
    * @param nFillMode specifies the type of the series.
    * @param nFillDateMode specifies the calculation mode for date values.
    * @param fStep contains the value used to increase/decrease the series values.
    * @param fEndValue contains the threshold value on which the calculation of the current series stops.
    */
  def fillSeries(
    nFillDirection: FillDirection,
    nFillMode: FillMode,
    nFillDateMode: FillDateMode,
    fStep: Double,
    fEndValue: Double
  ): Unit = js.native
}
object XCellSeries {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    fillAuto: (FillDirection, Double) => Unit,
    fillSeries: (FillDirection, FillMode, FillDateMode, Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellSeries = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fillAuto = js.Any.fromFunction2(fillAuto), fillSeries = js.Any.fromFunction5(fillSeries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellSeries]
  }
  
  @scala.inline
  implicit class XCellSeriesOps[Self <: XCellSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFillAuto(value: (FillDirection, Double) => Unit): Self = this.set("fillAuto", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFillSeries(value: (FillDirection, FillMode, FillDateMode, Double, Double) => Unit): Self = this.set("fillSeries", js.Any.fromFunction5(value))
  }
}
