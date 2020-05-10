package typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyContactGroupMembersRequest extends js.Object {
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.native
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.native
}

object ModifyContactGroupMembersRequest {
  @scala.inline
  def apply(): ModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyContactGroupMembersRequest]
  }
  @scala.inline
  implicit class ModifyContactGroupMembersRequestOps[Self <: ModifyContactGroupMembersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceNamesToAdd(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNamesToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceNamesToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNamesToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceNamesToRemove(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNamesToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceNamesToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNamesToRemove")(js.undefined)
        ret
    }
  }
  
}

