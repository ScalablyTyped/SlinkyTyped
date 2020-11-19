package typingsSlinky.activexLibreoffice.com_.sun.star.report

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XStatusIndicator
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a {@link XReportEngine} which allows the creation of OpenDocument files.
  *
  * The following events are supported by the report engine. OnPageStarted Is fired when a new page started. OnReportStarted Is fired when a new report
  * started. OnGroupStarted Is fired when a new group started. OnGroupEnded Is fired when the group ended. OnReportEnded Is fired when the report ended.
  * OnPageEnded Is fired when the page ended.
  * @see com.sun.star.document.OfficeDocument
  */
@js.native
trait XReportEngine
  extends XComponent
     with XPropertySet {
  
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: XConnection = js.native
  
  /**
    * defines the maximum number of rows which should be fetched for the report. If the limit is exceeded, the excess rows are silently dropped. ;  There is
    * no limitation, if set to zero.
    */
  var MaxRows: Double = js.native
  
  /** specifies the report definition object which is used to create the resulting report. */
  var ReportDefinition: XReportDefinition = js.native
  
  /** specifies the status indicator which shows the progress of the report generation process. */
  var StatusIndicator: XStatusIndicator = js.native
  
  /**
    * creates a report document.
    * @returns The URL where the new document is located.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` .
    */
  def createDocument(): URL = js.native
  
  /**
    * creates a report document.
    * @param frame The frame must have a controller set. This controller will be set at the model.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` . OJ: Has to be discussed if this method is useful.
    */
  def createDocumentAlive(frame: XFrame): XModel = js.native
  
  /**
    * creates a report document.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    * @throws com::sun::star::lang::IllegalArgumentException If the report definition was not set or is `NULL` .
    */
  def createDocumentModel(): XModel = js.native
  
  /**
    * allows to interrupt the creation process of the report document.
    * @throws com::sun::star::lang::DisposedException If the report engine is already disposed.
    */
  def interrupt(): Unit = js.native
}
object XReportEngine {
  
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    MaxRows: Double,
    PropertySetInfo: XPropertySetInfo,
    ReportDefinition: XReportDefinition,
    StatusIndicator: XStatusIndicator,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDocument: () => URL,
    createDocumentAlive: XFrame => XModel,
    createDocumentModel: () => XModel,
    dispose: () => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    interrupt: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XReportEngine = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReportDefinition = ReportDefinition.asInstanceOf[js.Any], StatusIndicator = StatusIndicator.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDocument = js.Any.fromFunction0(createDocument), createDocumentAlive = js.Any.fromFunction1(createDocumentAlive), createDocumentModel = js.Any.fromFunction0(createDocumentModel), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), interrupt = js.Any.fromFunction0(interrupt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XReportEngine]
  }
  
  @scala.inline
  implicit class XReportEngineOps[Self <: XReportEngine] (val x: Self) extends AnyVal {
    
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
    def setActiveConnection(value: XConnection): Self = this.set("ActiveConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("MaxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportDefinition(value: XReportDefinition): Self = this.set("ReportDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusIndicator(value: XStatusIndicator): Self = this.set("StatusIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDocument(value: () => URL): Self = this.set("createDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateDocumentAlive(value: XFrame => XModel): Self = this.set("createDocumentAlive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDocumentModel(value: () => XModel): Self = this.set("createDocumentModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInterrupt(value: () => Unit): Self = this.set("interrupt", js.Any.fromFunction0(value))
  }
}
