package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XDrawPageSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XController
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the service for a chart document.
  *
  * A chart document consists of a reference to the data source, the diagram and some additional elements like a main title, a sub-title or a legend.
  * @see Diagram
  * @see ChartLegend
  * @see ChartTitle
  * @see ChartDataArray
  */
@js.native
trait ChartDocument
  extends XChartDocument
     with UserDefinedAttributesSupplier
     with XPropertySet
     with XDrawPageSupplier {
  
  /** determines if the legend is shown or hidden. */
  var HasLegend: Boolean = js.native
  
  /** determines if the main title is shown or hidden. */
  var HasMainTitle: Boolean = js.native
  
  /** determines if the subtitle is shown or hidden. */
  var HasSubTitle: Boolean = js.native
}
object ChartDocument {
  
  @scala.inline
  def apply(
    Area: XPropertySet,
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Data: XChartData,
    Diagram: XDiagram,
    DrawPage: XDrawPage,
    HasLegend: Boolean,
    HasMainTitle: Boolean,
    HasSubTitle: Boolean,
    Legend: XShape,
    PropertySetInfo: XPropertySetInfo,
    SubTitle: XShape,
    Title: XShape,
    URL: String,
    UserDefinedAttributes: XNameContainer,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attachData: XChartData => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Unit,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    getArea: () => XPropertySet,
    getArgs: () => SafeArray[PropertyValue],
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getData: () => XChartData,
    getDiagram: () => XDiagram,
    getDrawPage: () => XDrawPage,
    getLegend: () => XShape,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSubTitle: () => XShape,
    getTitle: () => XShape,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setCurrentController: XController => Unit,
    setDiagram: XDiagram => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    unlockControllers: () => Unit
  ): ChartDocument = {
    val __obj = js.Dynamic.literal(Area = Area.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Diagram = Diagram.asInstanceOf[js.Any], DrawPage = DrawPage.asInstanceOf[js.Any], HasLegend = HasLegend.asInstanceOf[js.Any], HasMainTitle = HasMainTitle.asInstanceOf[js.Any], HasSubTitle = HasSubTitle.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SubTitle = SubTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachData = js.Any.fromFunction1(attachData), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArea = js.Any.fromFunction0(getArea), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getData = js.Any.fromFunction0(getData), getDiagram = js.Any.fromFunction0(getDiagram), getDrawPage = js.Any.fromFunction0(getDrawPage), getLegend = js.Any.fromFunction0(getLegend), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubTitle = js.Any.fromFunction0(getSubTitle), getTitle = js.Any.fromFunction0(getTitle), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setDiagram = js.Any.fromFunction1(setDiagram), setPropertyValue = js.Any.fromFunction2(setPropertyValue), unlockControllers = js.Any.fromFunction0(unlockControllers))
    __obj.asInstanceOf[ChartDocument]
  }
  
  @scala.inline
  implicit class ChartDocumentMutableBuilder[Self <: ChartDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasLegend(value: Boolean): Self = StObject.set(x, "HasLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMainTitle(value: Boolean): Self = StObject.set(x, "HasMainTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSubTitle(value: Boolean): Self = StObject.set(x, "HasSubTitle", value.asInstanceOf[js.Any])
  }
}
