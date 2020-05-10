package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdministratorWebTokenSpecPlaySearch extends js.Object {
  /**
    * Allow access to the iframe in approve mode. Default is false.
    */
  var approveApps: js.UndefOr[Boolean] = js.native
  /**
    * Whether the managed Play Search apps page is displayed. Default is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaAdministratorWebTokenSpecPlaySearch {
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpecPlaySearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpecPlaySearch]
  }
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecPlaySearchOps[Self <: SchemaAdministratorWebTokenSpecPlaySearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproveApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproveApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approveApps")(js.undefined)
        ret
    }
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

