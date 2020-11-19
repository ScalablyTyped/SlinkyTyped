package typingsSlinky.activexLibreoffice.com_.sun.star.presentation

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XUserInputInterception
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferableSupplier
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XController
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XModel
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.XContextMenuInterception
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.XContextMenuInterceptor
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component integrates an outline view to a presentation document into the desktop.
  *
  * In an outline view, the textual contents of presentation text objects from all presentation pages are presented as a continuous outline text.
  * @since OOo 1.1.2
  */
@js.native
trait OutlineView
  extends XController
     with XDispatchProvider
     with XContextMenuInterception
     with XUserInputInterception
     with XSelectionSupplier
     with XTransferableSupplier
     with XWindow
     with XPropertySet {
  
  /** This is the area that is currently visible. */
  var VisibleArea: Rectangle = js.native
}
object OutlineView {
  
  @scala.inline
  def apply(
    Frame: XFrame,
    Model: XModel,
    PosSize: Rectangle,
    PropertySetInfo: XPropertySetInfo,
    Selection: js.Any,
    Transferable: XTransferable,
    ViewData: js.Any,
    VisibleArea: Rectangle,
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
    getFrame: () => XFrame,
    getModel: () => XModel,
    getPosSize: () => Rectangle,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSelection: () => js.Any,
    getTransferable: () => XTransferable,
    getViewData: () => js.Any,
    insertTransferable: XTransferable => Unit,
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
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setVisible: Boolean => Unit,
    suspend: Boolean => Boolean
  ): OutlineView = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], VisibleArea = VisibleArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), addWindowListener = js.Any.fromFunction1(addWindowListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getPosSize = js.Any.fromFunction0(getPosSize), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = js.Any.fromFunction0(getSelection), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPosSize = js.Any.fromFunction5(setPosSize), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setVisible = js.Any.fromFunction1(setVisible), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[OutlineView]
  }
  
  @scala.inline
  implicit class OutlineViewOps[Self <: OutlineView] (val x: Self) extends AnyVal {
    
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
    def setVisibleArea(value: Rectangle): Self = this.set("VisibleArea", value.asInstanceOf[js.Any])
  }
}
