package typingsSlinky.activexLibreoffice.com_.sun.star.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows containers to implement a vetoing mechanism for insertion, removal, and replacement of their elements. */
@js.native
trait XContainerApproveBroadcaster extends js.Object {
  /** adds a listener which can veto changes in the container's content */
  def addContainerApproveListener(Listener: XContainerApproveListener): Unit = js.native
  /** removes a previously added listener */
  def removeContainerApproveListener(Listener: XContainerApproveListener): Unit = js.native
}

object XContainerApproveBroadcaster {
  @scala.inline
  def apply(
    addContainerApproveListener: XContainerApproveListener => Unit,
    removeContainerApproveListener: XContainerApproveListener => Unit
  ): XContainerApproveBroadcaster = {
    val __obj = js.Dynamic.literal(addContainerApproveListener = js.Any.fromFunction1(addContainerApproveListener), removeContainerApproveListener = js.Any.fromFunction1(removeContainerApproveListener))
    __obj.asInstanceOf[XContainerApproveBroadcaster]
  }
  @scala.inline
  implicit class XContainerApproveBroadcasterOps[Self <: XContainerApproveBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddContainerApproveListener(value: XContainerApproveListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addContainerApproveListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveContainerApproveListener(value: XContainerApproveListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContainerApproveListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

