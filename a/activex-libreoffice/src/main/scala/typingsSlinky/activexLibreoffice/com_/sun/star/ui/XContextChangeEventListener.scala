package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XContextChangeEventListener extends XEventListener {
  def notifyContextChangeEvent(event: ContextChangeEventObject): Unit = js.native
}

object XContextChangeEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyContextChangeEvent: ContextChangeEventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContextChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyContextChangeEvent = js.Any.fromFunction1(notifyContextChangeEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContextChangeEventListener]
  }
  @scala.inline
  implicit class XContextChangeEventListenerOps[Self <: XContextChangeEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyContextChangeEvent(value: ContextChangeEventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyContextChangeEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

