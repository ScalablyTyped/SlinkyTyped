package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to modify an existing contact group&#39;s members. Contacts can
  * be removed from any group but they can only be added to a user group or
  * myContacts or starred system groups.
  */
@js.native
trait SchemaModifyContactGroupMembersRequest extends js.Object {
  /**
    * The resource names of the contact people to add in the form of in the
    * form `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource names of the contact people to remove in the form of in the
    * form of `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyContactGroupMembersRequest {
  @scala.inline
  def apply(): SchemaModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyContactGroupMembersRequest]
  }
  @scala.inline
  implicit class SchemaModifyContactGroupMembersRequestOps[Self <: SchemaModifyContactGroupMembersRequest] (val x: Self) extends AnyVal {
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

