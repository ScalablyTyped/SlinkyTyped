package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroupMetadata extends js.Object {
  /**
    * Output only. True if the contact group resource has been deleted. Populated only for
    * [`ListContactGroups`](/people/api/rest/v1/contactgroups/list) requests
    * that include a sync token.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /** Output only. The time the group was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}

object ContactGroupMetadata {
  @scala.inline
  def apply(): ContactGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupMetadata]
  }
  @scala.inline
  implicit class ContactGroupMetadataOps[Self <: ContactGroupMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

