package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowsChangeListener
  * @since OOo 3.3
  */
@js.native
trait XRowsChangeBroadcaster extends js.Object {
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowsChangeListener(listener: XRowsChangeListener): Unit = js.native
  /** removes a previously added listener. */
  def removeRowsChangeListener(listener: XRowsChangeListener): Unit = js.native
}

object XRowsChangeBroadcaster {
  @scala.inline
  def apply(
    addRowsChangeListener: XRowsChangeListener => Unit,
    removeRowsChangeListener: XRowsChangeListener => Unit
  ): XRowsChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowsChangeListener = js.Any.fromFunction1(addRowsChangeListener), removeRowsChangeListener = js.Any.fromFunction1(removeRowsChangeListener))
    __obj.asInstanceOf[XRowsChangeBroadcaster]
  }
  @scala.inline
  implicit class XRowsChangeBroadcasterOps[Self <: XRowsChangeBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRowsChangeListener(value: XRowsChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowsChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveRowsChangeListener(value: XRowsChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRowsChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

