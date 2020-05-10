package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The entity that owns an Organization. The lifetime of the Organization and
  * all of its descendants are bound to the `OrganizationOwner`. If the
  * `OrganizationOwner` is deleted, the Organization and all its descendants
  * will be deleted.
  */
@js.native
trait SchemaOrganizationOwner extends js.Object {
  /**
    * The G Suite customer id used in the Directory API.
    */
  var directoryCustomerId: js.UndefOr[String] = js.native
}

object SchemaOrganizationOwner {
  @scala.inline
  def apply(): SchemaOrganizationOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationOwner]
  }
  @scala.inline
  implicit class SchemaOrganizationOwnerOps[Self <: SchemaOrganizationOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryCustomerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryCustomerId")(js.undefined)
        ret
    }
  }
  
}

