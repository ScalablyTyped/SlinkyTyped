package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssociationStatusRequest extends js.Object {
  /**
    * The association status.
    */
  var AssociationStatus: typingsSlinky.awsSdk.ssmMod.AssociationStatus = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsSlinky.awsSdk.ssmMod.InstanceId = js.native
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN = js.native
}

object UpdateAssociationStatusRequest {
  @scala.inline
  def apply(AssociationStatus: AssociationStatus, InstanceId: InstanceId, Name: DocumentARN): UpdateAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssociationStatusRequest]
  }
  @scala.inline
  implicit class UpdateAssociationStatusRequestOps[Self <: UpdateAssociationStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationStatus(value: AssociationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: DocumentARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

