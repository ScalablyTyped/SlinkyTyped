package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the possibility of reviving an event before changing the content of a row set. */
@js.native
trait XRowSetApproveBroadcaster extends XInterface {
  /** adds the specified listener to receive the events "approveCursorMove", "approveRowChange", and "appproveRowSetChange". */
  def addRowSetApproveListener(listener: XRowSetApproveListener): Unit = js.native
  /** removes the specified listener. */
  def removeRowSetApproveListener(listener: XRowSetApproveListener): Unit = js.native
}

object XRowSetApproveBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addRowSetApproveListener: XRowSetApproveListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRowSetApproveListener: XRowSetApproveListener => Unit
  ): XRowSetApproveBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener))
    __obj.asInstanceOf[XRowSetApproveBroadcaster]
  }
  @scala.inline
  implicit class XRowSetApproveBroadcasterOps[Self <: XRowSetApproveBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRowSetApproveListener(value: XRowSetApproveListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowSetApproveListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveRowSetApproveListener(value: XRowSetApproveListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRowSetApproveListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

