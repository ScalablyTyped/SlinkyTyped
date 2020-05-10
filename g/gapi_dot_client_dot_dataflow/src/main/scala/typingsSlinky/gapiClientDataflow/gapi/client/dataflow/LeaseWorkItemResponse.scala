package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaseWorkItemResponse extends js.Object {
  /** A list of the leased WorkItems. */
  var workItems: js.UndefOr[js.Array[WorkItem]] = js.native
}

object LeaseWorkItemResponse {
  @scala.inline
  def apply(): LeaseWorkItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseWorkItemResponse]
  }
  @scala.inline
  implicit class LeaseWorkItemResponseOps[Self <: LeaseWorkItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkItems(value: js.Array[WorkItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(js.undefined)
        ret
    }
  }
  
}

