package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extended clipboard interface.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
@js.native
trait XClipboardEx extends XClipboard {
  /**
    * To determine the supported rendering capabilities of the clipboard instance.
    * @returns A set of flags describing the rendering capabilities of the clipboard instance.
    * @see RenderingCapabilities
    */
  val RenderingCapabilities: Double = js.native
  /**
    * To determine the supported rendering capabilities of the clipboard instance.
    * @returns A set of flags describing the rendering capabilities of the clipboard instance.
    * @see RenderingCapabilities
    */
  def getRenderingCapabilities(): Double = js.native
}

object XClipboardEx {
  @scala.inline
  def apply(
    Contents: XTransferable,
    Name: String,
    RenderingCapabilities: Double,
    acquire: () => Unit,
    getContents: () => XTransferable,
    getName: () => String,
    getRenderingCapabilities: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setContents: (XTransferable, XClipboardOwner) => Unit
  ): XClipboardEx = {
    val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), getRenderingCapabilities = js.Any.fromFunction0(getRenderingCapabilities), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContents = js.Any.fromFunction2(setContents))
    __obj.asInstanceOf[XClipboardEx]
  }
  @scala.inline
  implicit class XClipboardExOps[Self <: XClipboardEx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderingCapabilities(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RenderingCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRenderingCapabilities(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderingCapabilities")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

