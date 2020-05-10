package typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyContactGroupMembersResponse extends js.Object {
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}

object ModifyContactGroupMembersResponse {
  @scala.inline
  def apply(): ModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyContactGroupMembersResponse]
  }
  @scala.inline
  implicit class ModifyContactGroupMembersResponseOps[Self <: ModifyContactGroupMembersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotFoundResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundResourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFoundResourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundResourceNames")(js.undefined)
        ret
    }
  }
  
}

