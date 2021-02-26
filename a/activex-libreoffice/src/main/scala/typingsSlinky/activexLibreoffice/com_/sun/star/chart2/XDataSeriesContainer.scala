package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDataSeriesContainer extends XInterface {
  
  /** retrieve all data series */
  var DataSeries: SafeArray[XDataSeries] = js.native
  
  /**
    * add a data series to the data series container
    * @throws IllegalArgumentException If the given data series is already contained in the data series container.
    */
  def addDataSeries(aDataSeries: XDataSeries): Unit = js.native
  
  /** retrieve all data series */
  def getDataSeries(): SafeArray[XDataSeries] = js.native
  
  /** removes one data series from the data series container. */
  def removeDataSeries(aDataSeries: XDataSeries): Unit = js.native
  
  /** set all data series */
  def setDataSeries(aDataSeries: SeqEquiv[XDataSeries]): Unit = js.native
}
object XDataSeriesContainer {
  
  @scala.inline
  def apply(
    DataSeries: SafeArray[XDataSeries],
    acquire: () => Unit,
    addDataSeries: XDataSeries => Unit,
    getDataSeries: () => SafeArray[XDataSeries],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDataSeries: XDataSeries => Unit,
    setDataSeries: SeqEquiv[XDataSeries] => Unit
  ): XDataSeriesContainer = {
    val __obj = js.Dynamic.literal(DataSeries = DataSeries.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDataSeries = js.Any.fromFunction1(addDataSeries), getDataSeries = js.Any.fromFunction0(getDataSeries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataSeries = js.Any.fromFunction1(removeDataSeries), setDataSeries = js.Any.fromFunction1(setDataSeries))
    __obj.asInstanceOf[XDataSeriesContainer]
  }
  
  @scala.inline
  implicit class XDataSeriesContainerMutableBuilder[Self <: XDataSeriesContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDataSeries(value: XDataSeries => Unit): Self = StObject.set(x, "addDataSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataSeries(value: SafeArray[XDataSeries]): Self = StObject.set(x, "DataSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataSeries(value: () => SafeArray[XDataSeries]): Self = StObject.set(x, "getDataSeries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveDataSeries(value: XDataSeries => Unit): Self = StObject.set(x, "removeDataSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDataSeries(value: SeqEquiv[XDataSeries] => Unit): Self = StObject.set(x, "setDataSeries", js.Any.fromFunction1(value))
  }
}
