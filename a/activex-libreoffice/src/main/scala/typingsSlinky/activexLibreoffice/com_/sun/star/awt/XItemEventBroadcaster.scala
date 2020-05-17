package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** registers item listeners at controls like the com::sun::star::awt::Roadmap */
@js.native
trait XItemEventBroadcaster extends XInterface {
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
}

object XItemEventBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit
  ): XItemEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener))
    __obj.asInstanceOf[XItemEventBroadcaster]
  }
  @scala.inline
  implicit class XItemEventBroadcasterOps[Self <: XItemEventBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddItemListener(value: XItemListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItemListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveItemListener(value: XItemListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItemListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

