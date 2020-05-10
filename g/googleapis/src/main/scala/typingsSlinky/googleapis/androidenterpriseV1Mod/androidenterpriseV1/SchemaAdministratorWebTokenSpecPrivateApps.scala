package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdministratorWebTokenSpecPrivateApps extends js.Object {
  /**
    * Whether the Private Apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAdministratorWebTokenSpecPrivateApps {
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpecPrivateApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecPrivateApps]
  }
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecPrivateAppsOps[Self <: SchemaAdministratorWebTokenSpecPrivateApps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

