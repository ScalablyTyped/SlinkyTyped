package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowSetChangeListener
  * @since OOo 3.2
  */
@js.native
trait XRowSetChangeBroadcaster extends js.Object {
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowSetChangeListener(iListener: XRowSetChangeListener): Unit = js.native
  /** removes a previously added listener. */
  def removeRowSetChangeListener(iListener: XRowSetChangeListener): Unit = js.native
}

object XRowSetChangeBroadcaster {
  @scala.inline
  def apply(
    addRowSetChangeListener: XRowSetChangeListener => Unit,
    removeRowSetChangeListener: XRowSetChangeListener => Unit
  ): XRowSetChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowSetChangeListener = js.Any.fromFunction1(addRowSetChangeListener), removeRowSetChangeListener = js.Any.fromFunction1(removeRowSetChangeListener))
    __obj.asInstanceOf[XRowSetChangeBroadcaster]
  }
  @scala.inline
  implicit class XRowSetChangeBroadcasterOps[Self <: XRowSetChangeBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRowSetChangeListener(value: XRowSetChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowSetChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveRowSetChangeListener(value: XRowSetChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRowSetChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

