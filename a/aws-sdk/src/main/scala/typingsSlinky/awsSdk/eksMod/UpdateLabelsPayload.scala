package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLabelsPayload extends js.Object {
  /**
    * Kubernetes labels to be added or updated.
    */
  var addOrUpdateLabels: js.UndefOr[labelsMap] = js.native
  /**
    * Kubernetes labels to be removed.
    */
  var removeLabels: js.UndefOr[labelsKeyList] = js.native
}

object UpdateLabelsPayload {
  @scala.inline
  def apply(): UpdateLabelsPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLabelsPayload]
  }
  @scala.inline
  implicit class UpdateLabelsPayloadOps[Self <: UpdateLabelsPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOrUpdateLabels(value: labelsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOrUpdateLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOrUpdateLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveLabels(value: labelsKeyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabels")(js.undefined)
        ret
    }
  }
  
}

