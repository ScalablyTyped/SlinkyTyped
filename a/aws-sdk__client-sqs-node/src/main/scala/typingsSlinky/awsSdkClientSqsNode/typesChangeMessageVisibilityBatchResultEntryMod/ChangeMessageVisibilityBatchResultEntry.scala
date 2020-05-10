package typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMessageVisibilityBatchResultEntry extends js.Object {
  /**
    * <p>Represents a message whose visibility timeout has been changed successfully.</p>
    */
  var Id: String = js.native
}

object ChangeMessageVisibilityBatchResultEntry {
  @scala.inline
  def apply(Id: String): ChangeMessageVisibilityBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResultEntry]
  }
  @scala.inline
  implicit class ChangeMessageVisibilityBatchResultEntryOps[Self <: ChangeMessageVisibilityBatchResultEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

