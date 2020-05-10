package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdministratorWebTokenSpec extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#administratorWebTokenSpec". */
  var kind: js.UndefOr[String] = js.native
  /** The URI of the parent frame hosting the iframe. To prevent XSS, the iframe may not be hosted at other URIs. This URI must be https. */
  var parent: js.UndefOr[String] = js.native
  /**
    * The list of permissions the admin is granted within the iframe. The admin will only be allowed to view an iframe if they have all of the permissions
    * associated with it. The only valid value is "approveApps" that will allow the admin to access the iframe in "approve" mode.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
}

object AdministratorWebTokenSpec {
  @scala.inline
  def apply(): AdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpec]
  }
  @scala.inline
  implicit class AdministratorWebTokenSpecOps[Self <: AdministratorWebTokenSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPermission(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(js.undefined)
        ret
    }
  }
  
}

