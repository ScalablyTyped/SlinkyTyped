package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The permission setting of an object.
  */
@js.native
trait SchemaPermission extends js.Object {
  /**
    * If true, the item can be discovered (e.g. in the user&#39;s &quot;Shared
    * with me&quot; collection) without needing a link to the item.
    */
  var allowDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * If set, this permission applies to anyone, even logged out users.
    */
  var anyone: js.UndefOr[SchemaAnyone] = js.native
  /**
    * The domain to whom this permission applies.
    */
  var domain: js.UndefOr[SchemaDomain] = js.native
  /**
    * The group to whom this permission applies.
    */
  var group: js.UndefOr[SchemaGroup] = js.native
  /**
    * Indicates the &lt;a
    * href=&quot;/drive/web/manage-sharing#roles&quot;&gt;Google Drive
    * permissions role&lt;/a&gt;. The role determines a user&#39;s ability to
    * read, write, and comment on items.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The user to whom this permission applies.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}

object SchemaPermission {
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  @scala.inline
  implicit class SchemaPermissionOps[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withAnyone(value: SchemaAnyone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyone")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: SchemaDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: SchemaGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

