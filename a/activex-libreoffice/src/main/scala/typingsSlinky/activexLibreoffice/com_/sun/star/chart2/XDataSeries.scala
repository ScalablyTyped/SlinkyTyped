package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A data series represents the object that has all the knowledge to be rendered as a visual data series. */
@js.native
trait XDataSeries extends XInterface {
  
  /**
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    * @returns the element at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    */
  def getDataPointByIndex(nIndex: Double): XPropertySet = js.native
  
  /** all data point formatting are cleared */
  def resetAllDataPoints(): Unit = js.native
  
  /**
    * the formatting of the specified data point is cleared
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    */
  def resetDataPoint(nIndex: Double): Unit = js.native
}
object XDataSeries {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDataPointByIndex: Double => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resetAllDataPoints: () => Unit,
    resetDataPoint: Double => Unit
  ): XDataSeries = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDataPointByIndex = js.Any.fromFunction1(getDataPointByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetAllDataPoints = js.Any.fromFunction0(resetAllDataPoints), resetDataPoint = js.Any.fromFunction1(resetDataPoint))
    __obj.asInstanceOf[XDataSeries]
  }
  
  @scala.inline
  implicit class XDataSeriesMutableBuilder[Self <: XDataSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataPointByIndex(value: Double => XPropertySet): Self = StObject.set(x, "getDataPointByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetAllDataPoints(value: () => Unit): Self = StObject.set(x, "resetAllDataPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetDataPoint(value: Double => Unit): Self = StObject.set(x, "resetDataPoint", js.Any.fromFunction1(value))
  }
}
