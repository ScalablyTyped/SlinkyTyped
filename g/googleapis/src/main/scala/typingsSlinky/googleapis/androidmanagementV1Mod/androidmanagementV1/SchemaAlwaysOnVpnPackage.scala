package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for an always-on VPN connection.
  */
@js.native
trait SchemaAlwaysOnVpnPackage extends js.Object {
  /**
    * Disallows networking when the VPN is not connected.
    */
  var lockdownEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The package name of the VPN app.
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaAlwaysOnVpnPackage {
  @scala.inline
  def apply(): SchemaAlwaysOnVpnPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlwaysOnVpnPackage]
  }
  @scala.inline
  implicit class SchemaAlwaysOnVpnPackageOps[Self <: SchemaAlwaysOnVpnPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLockdownEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockdownEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockdownEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockdownEnabled")(js.undefined)
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

