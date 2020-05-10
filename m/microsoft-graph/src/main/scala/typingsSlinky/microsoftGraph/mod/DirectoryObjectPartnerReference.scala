package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryObjectPartnerReference extends DirectoryObject {
  // Description of the object returned. Read-only.
  var description: js.UndefOr[String] = js.native
  // Name of directory object being returned, like group or application. Read-only.
  var displayName: js.UndefOr[String] = js.native
  // The tenant identifier for the partner tenant. Read-only.
  var externalPartnerTenantId: js.UndefOr[String] = js.native
  // The type of the referenced object in the partner tenant. Read-only.
  var objectType: js.UndefOr[String] = js.native
}

object DirectoryObjectPartnerReference {
  @scala.inline
  def apply(): DirectoryObjectPartnerReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryObjectPartnerReference]
  }
  @scala.inline
  implicit class DirectoryObjectPartnerReferenceOps[Self <: DirectoryObjectPartnerReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
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
    def withExternalPartnerTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPartnerTenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalPartnerTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPartnerTenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
  }
  
}

