package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies some extended operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
@js.native
trait XWindow2 extends XWindow {
  
  /** returns the inner bounds of the window, also known as the client size. */
  var OutputSize: Size = js.native
  
  /** returns the inner bounds of the window, also known as the client size. */
  def getOutputSize(): Size = js.native
  
  /** returns the focus state of the window */
  def hasFocus(): Boolean = js.native
  
  /** returns the activation state of the window */
  def isActive(): Boolean = js.native
  
  /** returns the enabled state of the window */
  def isEnabled(): Boolean = js.native
  
  /** returns the visibility state of the window */
  def isVisible(): Boolean = js.native
  
  /**
    * sets the inner bounds of the window, also known as the client size
    * @param Size the inner width and height of the window.
    */
  def setOutputSize(Size: Size): Unit = js.native
}
object XWindow2 {
  
  @scala.inline
  def apply(
    OutputSize: Size,
    PosSize: Rectangle,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    dispose: () => Unit,
    getOutputSize: () => Size,
    getPosSize: () => Rectangle,
    hasFocus: () => Boolean,
    isActive: () => Boolean,
    isEnabled: () => Boolean,
    isVisible: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setOutputSize: Size => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setVisible: Boolean => Unit
  ): XWindow2 = {
    val __obj = js.Dynamic.literal(OutputSize = OutputSize.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), dispose = js.Any.fromFunction0(dispose), getOutputSize = js.Any.fromFunction0(getOutputSize), getPosSize = js.Any.fromFunction0(getPosSize), hasFocus = js.Any.fromFunction0(hasFocus), isActive = js.Any.fromFunction0(isActive), isEnabled = js.Any.fromFunction0(isEnabled), isVisible = js.Any.fromFunction0(isVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setOutputSize = js.Any.fromFunction1(setOutputSize), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[XWindow2]
  }
  
  @scala.inline
  implicit class XWindow2MutableBuilder[Self <: XWindow2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetOutputSize(value: () => Size): Self = StObject.set(x, "getOutputSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasFocus(value: () => Boolean): Self = StObject.set(x, "hasFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutputSize(value: Size): Self = StObject.set(x, "OutputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetOutputSize(value: Size => Unit): Self = StObject.set(x, "setOutputSize", js.Any.fromFunction1(value))
  }
}
