package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetResource extends js.Object {
  // Indicates the visible name defined for the resource. Typically specified when the resource is created.
  var displayName: js.UndefOr[String] = js.native
  // When type is set to Group, this indicates the group type.
  var groupType: js.UndefOr[GroupType] = js.native
  // Indicates the unique ID of the resource.
  var id: js.UndefOr[String] = js.native
  // Indicates name, old value and new value of each attribute that changed. Property values depend on the operation type.
  var modifiedProperties: js.UndefOr[js.Array[ModifiedProperty]] = js.native
  // Describes the resource type. Example values include Application, Group, ServicePrincipal, and User.
  var `type`: js.UndefOr[String] = js.native
  // When type is set to User, this includes the user name that initiated the action; null for other types.
  var userPrincipalName: js.UndefOr[String] = js.native
}

object TargetResource {
  @scala.inline
  def apply(): TargetResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResource]
  }
  @scala.inline
  implicit class TargetResourceOps[Self <: TargetResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupType(value: GroupType): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedProperties(value: js.Array[ModifiedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrincipalName")(js.undefined)
        ret
    }
  }
  
}

