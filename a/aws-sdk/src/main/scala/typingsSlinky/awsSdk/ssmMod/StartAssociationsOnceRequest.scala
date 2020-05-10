package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAssociationsOnceRequest extends js.Object {
  /**
    * The association IDs that you want to run immediately and only one time.
    */
  var AssociationIds: AssociationIdList = js.native
}

object StartAssociationsOnceRequest {
  @scala.inline
  def apply(AssociationIds: AssociationIdList): StartAssociationsOnceRequest = {
    val __obj = js.Dynamic.literal(AssociationIds = AssociationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssociationsOnceRequest]
  }
  @scala.inline
  implicit class StartAssociationsOnceRequestOps[Self <: StartAssociationsOnceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationIds(value: AssociationIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

