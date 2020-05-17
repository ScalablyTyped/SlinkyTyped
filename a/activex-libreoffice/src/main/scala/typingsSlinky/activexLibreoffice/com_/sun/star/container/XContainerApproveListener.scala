package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.com_.sun.star.util.XVeto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is notified to approve changes which happen to the content of a generic container
  * @see XContainerApproveBroadcaster
  */
@js.native
trait XContainerApproveListener extends js.Object {
  /**
    * is called for the listener to approve an insertion into the container
    * @returns an instance implementing the {@link com.sun.star.util.XVeto} interface, if the insertion is vetoed, `NULL` otherwise.
    */
  def approveInsertElement(Event: ContainerEvent): XVeto = js.native
  /**
    * is called for the listener to approve a removal of an element from the container
    * @returns an instance implementing the {@link com.sun.star.util.XVeto} interface, if the removal is vetoed, `NULL` otherwise.
    */
  def approveRemoveElement(Event: ContainerEvent): XVeto = js.native
  /**
    * is called for the listener to approve a replacement inside the container
    * @returns an instance implementing the {@link com.sun.star.util.XVeto} interface, if the replacement is vetoed, `NULL` otherwise.
    */
  def approveReplaceElement(Event: ContainerEvent): XVeto = js.native
}

object XContainerApproveListener {
  @scala.inline
  def apply(
    approveInsertElement: ContainerEvent => XVeto,
    approveRemoveElement: ContainerEvent => XVeto,
    approveReplaceElement: ContainerEvent => XVeto
  ): XContainerApproveListener = {
    val __obj = js.Dynamic.literal(approveInsertElement = js.Any.fromFunction1(approveInsertElement), approveRemoveElement = js.Any.fromFunction1(approveRemoveElement), approveReplaceElement = js.Any.fromFunction1(approveReplaceElement))
    __obj.asInstanceOf[XContainerApproveListener]
  }
  @scala.inline
  implicit class XContainerApproveListenerOps[Self <: XContainerApproveListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproveInsertElement(value: ContainerEvent => XVeto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveInsertElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApproveRemoveElement(value: ContainerEvent => XVeto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveRemoveElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApproveReplaceElement(value: ContainerEvent => XVeto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveReplaceElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

