package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XMenuBar
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides function to update a menu bar for inplace editing.
  * @deprecated Deprecated
  * @since OOo 2.0
  */
@js.native
trait XMenuBarAcceptor extends XInterface {
  /**
    * update menu bar according to the current frame mode. This is used in inplace editing mode where we have to merge our own menu into the container
    * applications menu.
    * @param xMenuBar the menu bar that should be merged with current one.
    */
  def updateMenuBar(xMenuBar: js.Array[XMenuBar]): Unit = js.native
}

object XMenuBarAcceptor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateMenuBar: js.Array[XMenuBar] => Unit
  ): XMenuBarAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateMenuBar = js.Any.fromFunction1(updateMenuBar))
    __obj.asInstanceOf[XMenuBarAcceptor]
  }
  @scala.inline
  implicit class XMenuBarAcceptorOps[Self <: XMenuBarAcceptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdateMenuBar(value: js.Array[XMenuBar] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMenuBar")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

