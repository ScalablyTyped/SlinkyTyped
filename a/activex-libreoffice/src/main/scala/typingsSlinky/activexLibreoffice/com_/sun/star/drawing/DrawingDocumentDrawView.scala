package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsSlinky.activexLibreoffice.com_.sun.star.form.XForm
import typingsSlinky.activexLibreoffice.com_.sun.star.form.runtime.XFormController
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.Controller
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.XContextMenuInterceptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XFormLayerAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This component integrates a view to a {@link DrawPages} or {@link MasterPage} from a {@link DrawingDocument} . */
@js.native
trait DrawingDocumentDrawView
  extends Controller
     with XWindow
     with XFormLayerAccess
     with XDrawView
     with XPropertySet {
  
  /** If the view is in layer mode, the user can modify the layer of the model of this view in the user interface. */
  var IsLayerMode: Boolean = js.native
  
  /** If the view is in master page mode, the view shows the master pages of this model. */
  var IsMasterPageMode: Boolean = js.native
  
  /**
    * defines the offset from the top left position of the displayed page to the top left position of the view area in 100th/mm.
    * @since OOo 1.1.2
    */
  var ViewOffset: Point = js.native
  
  /** This is the area that is currently visible. */
  var VisibleArea: Rectangle = js.native
  
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType Note: After setting other types then {@link com.sun.star.view.DocumentZoomType.BY_VALUE} , implementations may
    * @since OOo 1.1.2
    */
  var ZoomType: Double = js.native
  
  /**
    * Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} .
    * @since OOo 1.1.2
    */
  var ZoomValue: Double = js.native
}
object DrawingDocumentDrawView {
  
  @scala.inline
  def apply(
    CurrentPage: XDrawPage,
    Frame: XFrame,
    IsLayerMode: Boolean,
    IsMasterPageMode: Boolean,
    Model: XModel,
    PosSize: Rectangle,
    PropertySetInfo: XPropertySetInfo,
    Selection: js.Any,
    Transferable: XTransferable,
    ViewData: js.Any,
    ViewOffset: Point,
    VisibleArea: Rectangle,
    ZoomType: Double,
    ZoomValue: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseClickHandler: XMouseClickHandler => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    addWindowListener: XWindowListener => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    dispose: () => Unit,
    getControl: XControlModel => XControl,
    getCurrentPage: () => XDrawPage,
    getFormController: XForm => XFormController,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getPosSize: () => Rectangle,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSelection: () => js.Any,
    getTransferable: () => XTransferable,
    getViewData: () => js.Any,
    insertTransferable: XTransferable => Unit,
    isFormDesignMode: () => Boolean,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Unit,
    release: () => Unit,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseClickHandler: XMouseClickHandler => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    removeWindowListener: XWindowListener => Unit,
    restoreViewData: js.Any => Unit,
    select: js.Any => Boolean,
    setCurrentPage: XDrawPage => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setFormDesignMode: Boolean => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setVisible: Boolean => Unit,
    suspend: Boolean => Boolean
  ): DrawingDocumentDrawView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], IsLayerMode = IsLayerMode.asInstanceOf[js.Any], IsMasterPageMode = IsMasterPageMode.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], ViewOffset = ViewOffset.asInstanceOf[js.Any], VisibleArea = VisibleArea.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), addWindowListener = js.Any.fromFunction1(addWindowListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getControl = js.Any.fromFunction1(getControl), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getFormController = js.Any.fromFunction1(getFormController), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getPosSize = js.Any.fromFunction0(getPosSize), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = js.Any.fromFunction0(getSelection), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), insertTransferable = js.Any.fromFunction1(insertTransferable), isFormDesignMode = js.Any.fromFunction0(isFormDesignMode), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setCurrentPage = js.Any.fromFunction1(setCurrentPage), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setFormDesignMode = js.Any.fromFunction1(setFormDesignMode), setPosSize = js.Any.fromFunction5(setPosSize), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setVisible = js.Any.fromFunction1(setVisible), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[DrawingDocumentDrawView]
  }
  
  @scala.inline
  implicit class DrawingDocumentDrawViewMutableBuilder[Self <: DrawingDocumentDrawView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLayerMode(value: Boolean): Self = StObject.set(x, "IsLayerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMasterPageMode(value: Boolean): Self = StObject.set(x, "IsMasterPageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOffset(value: Point): Self = StObject.set(x, "ViewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleArea(value: Rectangle): Self = StObject.set(x, "VisibleArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomType(value: Double): Self = StObject.set(x, "ZoomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomValue(value: Double): Self = StObject.set(x, "ZoomValue", value.asInstanceOf[js.Any])
  }
}
