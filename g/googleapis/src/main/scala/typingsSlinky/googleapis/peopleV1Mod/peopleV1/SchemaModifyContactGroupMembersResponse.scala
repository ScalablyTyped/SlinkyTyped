package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a modify contact group members request.
  */
@js.native
trait SchemaModifyContactGroupMembersResponse extends js.Object {
  /**
    * The contact people resource names that were not found.
    */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyContactGroupMembersResponse {
  @scala.inline
  def apply(): SchemaModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyContactGroupMembersResponse]
  }
  @scala.inline
  implicit class SchemaModifyContactGroupMembersResponseOps[Self <: SchemaModifyContactGroupMembersResponse] (val x: Self) extends AnyVal {
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

