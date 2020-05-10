package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2PackageEntitlement extends js.Object {
  /**
    * List of entitlements for a given app
    */
  var entitlements: js.UndefOr[js.Array[GoogleActionsV2Entitlement]] = js.native
  /**
    * Should match the package name in action package
    */
  var packageName: js.UndefOr[String] = js.native
}

object GoogleActionsV2PackageEntitlement {
  @scala.inline
  def apply(): GoogleActionsV2PackageEntitlement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2PackageEntitlement]
  }
  @scala.inline
  implicit class GoogleActionsV2PackageEntitlementOps[Self <: GoogleActionsV2PackageEntitlement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntitlements(value: js.Array[GoogleActionsV2Entitlement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
  }
  
}

