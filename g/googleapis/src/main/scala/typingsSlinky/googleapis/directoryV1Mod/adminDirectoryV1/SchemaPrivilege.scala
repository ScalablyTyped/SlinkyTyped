package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for privilege resource in Directory API.
  */
@js.native
trait SchemaPrivilege extends js.Object {
  /**
    * A list of child privileges. Privileges for a service form a tree. Each
    * privilege can have a list of child privileges; this list is empty for a
    * leaf privilege.
    */
  var childPrivileges: js.UndefOr[js.Array[SchemaPrivilege]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * If the privilege can be restricted to an organization unit.
    */
  var isOuScopable: js.UndefOr[Boolean] = js.native
  /**
    * The type of the API resource. This is always admin#directory#privilege.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the privilege.
    */
  var privilegeName: js.UndefOr[String] = js.native
  /**
    * The obfuscated ID of the service this privilege is for.
    */
  var serviceId: js.UndefOr[String] = js.native
  /**
    * The name of the service this privilege is for.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object SchemaPrivilege {
  @scala.inline
  def apply(): SchemaPrivilege = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivilege]
  }
  @scala.inline
  implicit class SchemaPrivilegeOps[Self <: SchemaPrivilege] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildPrivileges(value: js.Array[SchemaPrivilege]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPrivileges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildPrivileges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childPrivileges")(js.undefined)
        ret
    }
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
    def withIsOuScopable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOuScopable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOuScopable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOuScopable")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivilegeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivilegeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privilegeName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
  }
  
}

