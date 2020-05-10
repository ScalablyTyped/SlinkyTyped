package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLabelsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * Flag to request removal of all labels from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.native
  /**
    * List of labels to delete from the resource.
    */
  var Labels: js.UndefOr[SharedLabels] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}

object DeleteLabelsRequest {
  @scala.inline
  def apply(ResourceId: ResourceIdType): DeleteLabelsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLabelsRequest]
  }
  @scala.inline
  implicit class DeleteLabelsRequestOps[Self <: DeleteLabelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticationToken(value: AuthenticationHeaderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAll(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAll")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: SharedLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(js.undefined)
        ret
    }
  }
  
}

