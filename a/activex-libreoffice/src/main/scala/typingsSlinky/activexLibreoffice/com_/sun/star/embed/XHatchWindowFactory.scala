package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates a hatch window implementation. */
@js.native
trait XHatchWindowFactory extends XInterface {
  /**
    * creates a new hatch window instance.
    * @param xParent the parent window the hatch window should be created in
    * @param aBounds position and size of the hatch window
    * @param aSize border and handler squares size
    * @returns a new hatch window
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    */
  def createHatchWindowInstance(xParent: XWindowPeer, aBounds: Rectangle, aSize: Size): XHatchWindow = js.native
}

object XHatchWindowFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createHatchWindowInstance: (XWindowPeer, Rectangle, Size) => XHatchWindow,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHatchWindowFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createHatchWindowInstance = js.Any.fromFunction3(createHatchWindowInstance), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHatchWindowFactory]
  }
  @scala.inline
  implicit class XHatchWindowFactoryOps[Self <: XHatchWindowFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateHatchWindowInstance(value: (XWindowPeer, Rectangle, Size) => XHatchWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createHatchWindowInstance")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

