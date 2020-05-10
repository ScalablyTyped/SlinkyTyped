package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroup extends js.Object {
  /**
    * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the
    * resource. Used for web cache validation.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Output only. The name translated and formatted in the viewer's account locale
    * or the `Accept-Language` HTTP header locale for system groups names.
    * Group names set by the owner are the same as name.
    */
  var formattedName: js.UndefOr[String] = js.native
  /** Output only. The contact group type. */
  var groupType: js.UndefOr[String] = js.native
  /**
    * Output only. The total number of contacts in the group irrespective of max members in
    * specified in the request.
    */
  var memberCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The list of contact person resource names that are members of the contact
    * group. The field is not populated for LIST requests and can only be updated
    * through the
    * [ModifyContactGroupMembers](/people/api/rest/v1/contactgroups/members/modify).
    */
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.native
  /** Output only. Metadata about the contact group. */
  var metadata: js.UndefOr[ContactGroupMetadata] = js.native
  /**
    * The contact group name set by the group owner or a system provided name
    * for system groups.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of `contactGroups/{contact_group_id}`.
    */
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

