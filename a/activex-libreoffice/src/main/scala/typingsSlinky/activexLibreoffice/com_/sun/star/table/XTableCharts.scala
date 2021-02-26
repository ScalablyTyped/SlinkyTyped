package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access charts via name and to insert and remove charts.
  * @see com.sun.star.table.TableCharts
  */
@js.native
trait XTableCharts extends XNameAccess {
  
  /**
    * creates a chart and adds it to the collection.
    * @param aName is the name of the chart. This name is used to reference the chart in the collection.
    * @param aRect contains the rectangular location of the chart within the table (in 1/100th mm).
    * @param aRanges all cell ranges containing the source data of the chart.
    * @param bColumnHeaders if set to `TRUE` , the topmost row of the source data will be used to set labels for the category axis or the legend.
    * @param bRowHeaders if set to `TRUE` , the leftmost column of the source data will be used to set labels for the category axis or the legend.
    */
  def addNewByName(
    aName: String,
    aRect: Rectangle,
    aRanges: SeqEquiv[CellRangeAddress],
    bColumnHeaders: Boolean,
    bRowHeaders: Boolean
  ): Unit = js.native
  
  /**
    * removes a chart from the collection.
    * @param aName is the name of the chart to remove.
    */
  def removeByName(aName: String): Unit = js.native
}
object XTableCharts {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addNewByName: (String, Rectangle, SeqEquiv[CellRangeAddress], Boolean, Boolean) => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XTableCharts = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNewByName = js.Any.fromFunction5(addNewByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[XTableCharts]
  }
  
  @scala.inline
  implicit class XTableChartsMutableBuilder[Self <: XTableCharts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNewByName(value: (String, Rectangle, SeqEquiv[CellRangeAddress], Boolean, Boolean) => Unit): Self = StObject.set(x, "addNewByName", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = StObject.set(x, "removeByName", js.Any.fromFunction1(value))
  }
}
