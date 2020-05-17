package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a factory interface for the window toolkit.
  *
  * This is similar to the abstract window toolkit (AWT) in Java.
  */
@js.native
trait XToolkit extends XInterface {
  /** returns the desktop window. */
  val DesktopWindow: XWindowPeer = js.native
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  val WorkArea: Rectangle = js.native
  /** creates a region. */
  def createRegion(): XRegion = js.native
  /** creates a virtual device that is compatible with the screen. */
  def createScreenCompatibleDevice(Width: Double, Height: Double): XDevice = js.native
  /** creates a new window using the given descriptor. */
  def createWindow(Descriptor: WindowDescriptor): XWindowPeer = js.native
  /** returns a sequence of windows which are newly created using the given descriptors. */
  def createWindows(Descriptors: SeqEquiv[WindowDescriptor]): SafeArray[XWindowPeer] = js.native
  /** returns the desktop window. */
  def getDesktopWindow(): XWindowPeer = js.native
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  def getWorkArea(): Rectangle = js.native
}

object XToolkit {
  @scala.inline
  def apply(
    DesktopWindow: XWindowPeer,
    WorkArea: Rectangle,
    acquire: () => Unit,
    createRegion: () => XRegion,
    createScreenCompatibleDevice: (Double, Double) => XDevice,
    createWindow: WindowDescriptor => XWindowPeer,
    createWindows: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer],
    getDesktopWindow: () => XWindowPeer,
    getWorkArea: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XToolkit = {
    val __obj = js.Dynamic.literal(DesktopWindow = DesktopWindow.asInstanceOf[js.Any], WorkArea = WorkArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createRegion = js.Any.fromFunction0(createRegion), createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), getDesktopWindow = js.Any.fromFunction0(getDesktopWindow), getWorkArea = js.Any.fromFunction0(getWorkArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XToolkit]
  }
  @scala.inline
  implicit class XToolkitOps[Self <: XToolkit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktopWindow(value: XWindowPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesktopWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkArea(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateRegion(value: () => XRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRegion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateScreenCompatibleDevice(value: (Double, Double) => XDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createScreenCompatibleDevice")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateWindow(value: WindowDescriptor => XWindowPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateWindows(value: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWindows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDesktopWindow(value: () => XWindowPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDesktopWindow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWorkArea(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWorkArea")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

