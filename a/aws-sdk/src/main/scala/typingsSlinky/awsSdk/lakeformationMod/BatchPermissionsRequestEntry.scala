package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPermissionsRequestEntry extends js.Object {
  /**
    * A unique identifier for the batch permissions request entry.
    */
  var Id: Identifier = js.native
  /**
    * The permissions to be granted.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  /**
    * Indicates if the option to pass permissions is granted.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  /**
    * The principal to be granted a permission.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
  /**
    * The resource to which the principal is to be granted a permission.
    */
  var Resource: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.Resource] = js.native
}

object BatchPermissionsRequestEntry {
  @scala.inline
  def apply(Id: Identifier): BatchPermissionsRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPermissionsRequestEntry]
  }
  @scala.inline
  implicit class BatchPermissionsRequestEntryOps[Self <: BatchPermissionsRequestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: PermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissionsWithGrantOption(value: PermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsWithGrantOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionsWithGrantOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionsWithGrantOption")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipal(value: DataLakePrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
        ret
    }
  }
  
}

