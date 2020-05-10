package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelChangeSetResponse extends js.Object {
  /**
    * The ARN associated with the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
}

object CancelChangeSetResponse {
  @scala.inline
  def apply(): CancelChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelChangeSetResponse]
  }
  @scala.inline
  implicit class CancelChangeSetResponseOps[Self <: CancelChangeSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSetArn(value: ARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetArn")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetId")(js.undefined)
        ret
    }
  }
  
}

