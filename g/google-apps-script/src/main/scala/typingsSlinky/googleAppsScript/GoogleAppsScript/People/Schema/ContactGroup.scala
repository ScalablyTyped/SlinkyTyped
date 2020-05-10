package typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroup extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var formattedName: js.UndefOr[String] = js.native
  var groupType: js.UndefOr[String] = js.native
  var memberCount: js.UndefOr[Double] = js.native
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.native
  var metadata: js.UndefOr[ContactGroupMetadata] = js.native
  var name: js.UndefOr[String] = js.native
  var resourceName: js.UndefOr[String] = js.native
}

object ContactGroup {
  @scala.inline
  def apply(): ContactGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroup]
  }
  @scala.inline
  implicit class ContactGroupOps[Self <: ContactGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedName")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupType")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberResourceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberResourceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberResourceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberResourceNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: ContactGroupMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
  }
  
}

