package typingsSlinky.gapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIssue extends js.Object {
  /** Describes a blocked resource issue. */
  var blockedResource: js.UndefOr[BlockedResource] = js.native
}

object ResourceIssue {
  @scala.inline
  def apply(): ResourceIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIssue]
  }
  @scala.inline
  implicit class ResourceIssueOps[Self <: ResourceIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockedResource(value: BlockedResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedResource")(js.undefined)
        ret
    }
  }
  
}

