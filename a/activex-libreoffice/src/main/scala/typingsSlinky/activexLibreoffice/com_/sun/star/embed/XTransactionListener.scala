package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events when a transacted object is committed or reverted. */
@js.native
trait XTransactionListener extends XEventListener {
  /** is called after the object is committed. */
  def commited(aEvent: EventObject): Unit = js.native
  /** is called just before the object is committed. */
  def preCommit(aEvent: EventObject): Unit = js.native
  /** is called just before the object is reverted. */
  def preRevert(aEvent: EventObject): Unit = js.native
  /** is called after the object is reverted. */
  def reverted(aEvent: EventObject): Unit = js.native
}

object XTransactionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    commited: EventObject => Unit,
    disposing: EventObject => Unit,
    preCommit: EventObject => Unit,
    preRevert: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reverted: EventObject => Unit
  ): XTransactionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commited = js.Any.fromFunction1(commited), disposing = js.Any.fromFunction1(disposing), preCommit = js.Any.fromFunction1(preCommit), preRevert = js.Any.fromFunction1(preRevert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reverted = js.Any.fromFunction1(reverted))
    __obj.asInstanceOf[XTransactionListener]
  }
  @scala.inline
  implicit class XTransactionListenerOps[Self <: XTransactionListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommited(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreCommit(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCommit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreRevert(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRevert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReverted(value: EventObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverted")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

