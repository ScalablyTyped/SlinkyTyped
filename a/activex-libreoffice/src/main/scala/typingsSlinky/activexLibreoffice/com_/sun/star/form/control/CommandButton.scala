package typingsSlinky.activexLibreoffice.com_.sun.star.form.control

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typingsSlinky.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XActionListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XButton
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControl
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XGraphics
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XLayoutConstrains
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XToolkit
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XView
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typingsSlinky.activexLibreoffice.com_.sun.star.form.XApproveActionBroadcaster
import typingsSlinky.activexLibreoffice.com_.sun.star.form.XApproveActionListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a button control.
  *
  * The model of the control has to support the {@link com.sun.star.form.component.CommandButton} service.
  *
  * The control is clickable, the action taken upon clicking depends on the settings of the model the control belongs to.
  * @see com.sun.star.awt.UnoControl
  * @see com.sun.star.awt.UnoControlModel
  * @see com.sun.star.form.component.CommandButton.ButtonType
  */
@js.native
trait CommandButton
  extends XControl
     with XWindow
     with XView
     with XAccessible
     with XButton
     with XLayoutConstrains
     with XApproveActionBroadcaster
object CommandButton {
  
  @scala.inline
  def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Graphics: XGraphics,
    MinimumSize: Size,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    PreferredSize: Size,
    Size: Size,
    View: XView,
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    addApproveActionListener: XApproveActionListener => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    calcAdjustedSize: Size => Size,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispose: () => Unit,
    draw: (Double, Double) => Unit,
    getAccessibleContext: () => XAccessibleContext,
    getContext: () => XInterface,
    getGraphics: () => XGraphics,
    getMinimumSize: () => Size,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getPreferredSize: () => Size,
    getSize: () => Size,
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    removeApproveActionListener: XApproveActionListener => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setActionCommand: String => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setGraphics: XGraphics => Boolean,
    setLabel: String => Unit,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit
  ): CommandButton = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), addApproveActionListener = js.Any.fromFunction1(addApproveActionListener), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), removeApproveActionListener = js.Any.fromFunction1(removeApproveActionListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setActionCommand = js.Any.fromFunction1(setActionCommand), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1(setLabel), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
    __obj.asInstanceOf[CommandButton]
  }
}
