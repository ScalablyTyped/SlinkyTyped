package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Easier access to the different axes within a chart.
  * @since OOo 3.4
  */
@js.native
trait XAxisSupplier extends XInterface {
  
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the primary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getAxis(nDimensionIndex: Double): XAxis = js.native
  
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the secondary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getSecondaryAxis(nDimensionIndex: Double): XAxis = js.native
}
object XAxisSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAxis: Double => XAxis,
    getSecondaryAxis: Double => XAxis,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxisSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAxis = js.Any.fromFunction1(getAxis), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxisSupplier]
  }
  
  @scala.inline
  implicit class XAxisSupplierMutableBuilder[Self <: XAxisSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAxis(value: Double => XAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSecondaryAxis(value: Double => XAxis): Self = StObject.set(x, "getSecondaryAxis", js.Any.fromFunction1(value))
  }
}
