package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XWindow2Ops[Self <: XWindow2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOutputSize(value: () => Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutputSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasFocus(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOutputSize(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOutputSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

