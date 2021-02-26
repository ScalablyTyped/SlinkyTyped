package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XDataProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XController
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XChartDocument extends XModel {
  
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  var ChartTypeManager: XChartTypeManager = js.native
  
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  val DataProvider: XDataProvider = js.native
  
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  var FirstDiagram: XDiagram = js.native
  
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  val PageBackground: XPropertySet = js.native
  
  /** Creates a default chart type for a brand-new chart object. */
  def createDefaultChart(): Unit = js.native
  
  /**
    * creates an internal com::sun::star::chart2::XDataProvider that is handled by the chart document itself.
    *
    * When the model is stored, the data provider will also be stored in a sub-storage.
    * @param bCloneExistingData if `TRUE` and a data provider was previously attached, its referred data will be copied to the new internal data provider. Not
    * @throws com::sun::star::util:CloseVetoException If the new data provider could not be created due to a failed removal of the former data provider.
    */
  def createInternalDataProvider(bCloneExistingData: Boolean): Unit = js.native
  
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def getChartTypeManager(): XChartTypeManager = js.native
  
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  def getDataProvider(): XDataProvider = js.native
  
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def getFirstDiagram(): XDiagram = js.native
  
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  def getPageBackground(): XPropertySet = js.native
  
  /** @returns `TRUE` if the data provider set at the chart document is an internal one.  This is the case directly after {@link createInternalDataProvider()} h */
  def hasInternalDataProvider(): Boolean = js.native
  
  /** Returns true if the chart is based on OpenGL */
  def isOpenGLChart(): Boolean = js.native
  
  /** sets a new component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def setChartTypeManager(xNewManager: XChartTypeManager): Unit = js.native
  
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name setDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def setFirstDiagram(xDiagram: XDiagram): Unit = js.native
}
object XChartDocument {
  
  @scala.inline
  def apply(
    Args: SafeArray[PropertyValue],
    ChartTypeManager: XChartTypeManager,
    CurrentController: XController,
    CurrentSelection: XInterface,
    DataProvider: XDataProvider,
    FirstDiagram: XDiagram,
    PageBackground: XPropertySet,
    URL: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Unit,
    createDefaultChart: () => Unit,
    createInternalDataProvider: Boolean => Unit,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    getArgs: () => SafeArray[PropertyValue],
    getChartTypeManager: () => XChartTypeManager,
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getDataProvider: () => XDataProvider,
    getFirstDiagram: () => XDiagram,
    getPageBackground: () => XPropertySet,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    hasInternalDataProvider: () => Boolean,
    isOpenGLChart: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setChartTypeManager: XChartTypeManager => Unit,
    setCurrentController: XController => Unit,
    setFirstDiagram: XDiagram => Unit,
    unlockControllers: () => Unit
  ): XChartDocument = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], ChartTypeManager = ChartTypeManager.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], DataProvider = DataProvider.asInstanceOf[js.Any], FirstDiagram = FirstDiagram.asInstanceOf[js.Any], PageBackground = PageBackground.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), createDefaultChart = js.Any.fromFunction0(createDefaultChart), createInternalDataProvider = js.Any.fromFunction1(createInternalDataProvider), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getChartTypeManager = js.Any.fromFunction0(getChartTypeManager), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDataProvider = js.Any.fromFunction0(getDataProvider), getFirstDiagram = js.Any.fromFunction0(getFirstDiagram), getPageBackground = js.Any.fromFunction0(getPageBackground), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), hasInternalDataProvider = js.Any.fromFunction0(hasInternalDataProvider), isOpenGLChart = js.Any.fromFunction0(isOpenGLChart), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setChartTypeManager = js.Any.fromFunction1(setChartTypeManager), setCurrentController = js.Any.fromFunction1(setCurrentController), setFirstDiagram = js.Any.fromFunction1(setFirstDiagram), unlockControllers = js.Any.fromFunction0(unlockControllers))
    __obj.asInstanceOf[XChartDocument]
  }
  
  @scala.inline
  implicit class XChartDocumentMutableBuilder[Self <: XChartDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartTypeManager(value: XChartTypeManager): Self = StObject.set(x, "ChartTypeManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDefaultChart(value: () => Unit): Self = StObject.set(x, "createDefaultChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateInternalDataProvider(value: Boolean => Unit): Self = StObject.set(x, "createInternalDataProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataProvider(value: XDataProvider): Self = StObject.set(x, "DataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDiagram(value: XDiagram): Self = StObject.set(x, "FirstDiagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChartTypeManager(value: () => XChartTypeManager): Self = StObject.set(x, "getChartTypeManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDataProvider(value: () => XDataProvider): Self = StObject.set(x, "getDataProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstDiagram(value: () => XDiagram): Self = StObject.set(x, "getFirstDiagram", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageBackground(value: () => XPropertySet): Self = StObject.set(x, "getPageBackground", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasInternalDataProvider(value: () => Boolean): Self = StObject.set(x, "hasInternalDataProvider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpenGLChart(value: () => Boolean): Self = StObject.set(x, "isOpenGLChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPageBackground(value: XPropertySet): Self = StObject.set(x, "PageBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetChartTypeManager(value: XChartTypeManager => Unit): Self = StObject.set(x, "setChartTypeManager", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFirstDiagram(value: XDiagram => Unit): Self = StObject.set(x, "setFirstDiagram", js.Any.fromFunction1(value))
  }
}
