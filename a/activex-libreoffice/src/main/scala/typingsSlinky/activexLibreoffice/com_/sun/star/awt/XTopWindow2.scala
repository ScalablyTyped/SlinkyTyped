package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends {@link XTopWindow} with additional functionality */
@js.native
trait XTopWindow2 extends XTopWindow {
  /**
    * controls on which display the window is shown.
    *
    * When retrieving this property, in case the window is positioned on multiple displays, the number returned will be of the display containing the upper
    * left pixel of the frame area (that is of the client area on system decorated windows, or the frame area of undecorated resp. owner decorated windows).
    * @see com.sun.star.awt.DisplayAccess
    * @see com.sun.star.awt.DisplayInfo
    * @throws com::sun::star::lang::IndexOutOfBoundsException if you attempt to set this property to a value which does not correspond to the number of an exis
    */
  var Display: Double = js.native
  /** controls whether the window is currently maximized */
  var IsMaximized: Boolean = js.native
  /** controls whether the window is currently minimized */
  var IsMinimized: Boolean = js.native
}

object XTopWindow2 {
  @scala.inline
  def apply(
    Display: Double,
    IsMaximized: Boolean,
    IsMinimized: Boolean,
    acquire: () => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    setMenuBar: XMenuBar => Unit,
    toBack: () => Unit,
    toFront: () => Unit
  ): XTopWindow2 = {
    val __obj = js.Dynamic.literal(Display = Display.asInstanceOf[js.Any], IsMaximized = IsMaximized.asInstanceOf[js.Any], IsMinimized = IsMinimized.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), setMenuBar = js.Any.fromFunction1(setMenuBar), toBack = js.Any.fromFunction0(toBack), toFront = js.Any.fromFunction0(toFront))
    __obj.asInstanceOf[XTopWindow2]
  }
  @scala.inline
  implicit class XTopWindow2Ops[Self <: XTopWindow2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMaximized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMaximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMinimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMinimized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

