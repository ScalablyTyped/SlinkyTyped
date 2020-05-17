package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
@js.native
trait XDatabaseAccessListener extends XEventListener {
  def approveConnectionClosing(event: EventObject): Boolean = js.native
  def connectionChanged(event: EventObject): Unit = js.native
  def connectionClosing(event: EventObject): Unit = js.native
}

object XDatabaseAccessListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveConnectionClosing: EventObject => Boolean,
    connectionChanged: EventObject => Unit,
    connectionClosing: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDatabaseAccessListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveConnectionClosing = js.Any.fromFunction1(approveConnectionClosing), connectionChanged = js.Any.fromFunction1(connectionChanged), connectionClosing = js.Any.fromFunction1(connectionClosing), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDatabaseAccessListener]
  }
  @scala.inline
  implicit class XDatabaseAccessListenerOps[Self <: XDatabaseAccessListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproveConnectionClosing(value: EventObject => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveConnectionClosing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnectionChanged(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnectionClosing(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionClosing")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

