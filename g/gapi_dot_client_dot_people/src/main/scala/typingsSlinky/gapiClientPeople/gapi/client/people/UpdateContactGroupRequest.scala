package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContactGroupRequest extends js.Object {
  /** Required. The contact group to update. */
  var contactGroup: js.UndefOr[ContactGroup] = js.native
}

object UpdateContactGroupRequest {
  @scala.inline
  def apply(): UpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContactGroupRequest]
  }
  @scala.inline
  implicit class UpdateContactGroupRequestOps[Self <: UpdateContactGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactGroup(value: ContactGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroup")(js.undefined)
        ret
    }
  }
  
}

