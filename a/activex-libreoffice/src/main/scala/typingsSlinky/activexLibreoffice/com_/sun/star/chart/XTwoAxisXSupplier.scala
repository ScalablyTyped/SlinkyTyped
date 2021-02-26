package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to both the primary and the secondary **x** -axis of a chart.
  * @see XDiagram
  */
@js.native
trait XTwoAxisXSupplier extends XAxisXSupplier {
  
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val SecondaryXAxis: XPropertySet = js.native
  
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getSecondaryXAxis(): XPropertySet = js.native
}
object XTwoAxisXSupplier {
  
  @scala.inline
  def apply(
    SecondaryXAxis: XPropertySet,
    XAxis: XPropertySet,
    XAxisTitle: XShape,
    XHelpGrid: XPropertySet,
    XMainGrid: XPropertySet,
    acquire: () => Unit,
    getSecondaryXAxis: () => XPropertySet,
    getXAxis: () => XPropertySet,
    getXAxisTitle: () => XShape,
    getXHelpGrid: () => XPropertySet,
    getXMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTwoAxisXSupplier = {
    val __obj = js.Dynamic.literal(SecondaryXAxis = SecondaryXAxis.asInstanceOf[js.Any], XAxis = XAxis.asInstanceOf[js.Any], XAxisTitle = XAxisTitle.asInstanceOf[js.Any], XHelpGrid = XHelpGrid.asInstanceOf[js.Any], XMainGrid = XMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondaryXAxis = js.Any.fromFunction0(getSecondaryXAxis), getXAxis = js.Any.fromFunction0(getXAxis), getXAxisTitle = js.Any.fromFunction0(getXAxisTitle), getXHelpGrid = js.Any.fromFunction0(getXHelpGrid), getXMainGrid = js.Any.fromFunction0(getXMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTwoAxisXSupplier]
  }
  
  @scala.inline
  implicit class XTwoAxisXSupplierMutableBuilder[Self <: XTwoAxisXSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSecondaryXAxis(value: () => XPropertySet): Self = StObject.set(x, "getSecondaryXAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSecondaryXAxis(value: XPropertySet): Self = StObject.set(x, "SecondaryXAxis", value.asInstanceOf[js.Any])
  }
}
